package PvpChannels;

import java.util.ArrayList;

import Abstractions.CombativeCharacter;
import Enums.FightType;
import Enums.PlayerState;
import GameObjects.GPersonnage;
import GameObjects.Fights.GFight;
import Interfaces.IObject;
import Misc.Utils;
import PvpChannels.ChannelEnums.ChannelFightType;
import PvpChannels.ChannelEnums.ChannelLootType;
import PvpChannels.ChannelEnums.ChannelRoundType;
import PvpChannels.ChannelEnums.ChannelStateType;

public class Channel extends GFight{


	public static short[] defaultParamsAndConditions = {
			0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,  //toutes les classes: 1=peut entrer, 0=non
			0, 200, //level minimum / maximum pour entrer
			0, //GMLevel requit.
			0,//Temps après le début du combat à  partir duquel on bloque les entrées(joignements)
			0,127,//nbr de personne connectés sur le nb de personne maximum connectables. (Surtout FreeForAll)
			2, 1//Nbr de Teams à remplir et Nbr de perso par Team à remplir (seulement en TeamDeathMatch)
	};
	
	
	
	public String name = "";
	public String password = "";
	public GPersonnage host = null;
	public ChannelFightType fightType = null;
	public ChannelRoundType roundType = null;
	public ChannelLootType lootDistributionType = null;
	//0 = false, 1 = true
	public short[] paramsAndConditions = null;
	public long timeStarted = 0;
	
	
	
	
	/**
	 * TODO: Channel.createNew    (PvpChannel)
	 * @param params
	 * @return
	 */
	public static Channel createNew(GPersonnage host, String[] params){
		Channel c = new Channel();
		c.host = host;
		c.name = params[0];
		c.password = params[1];
		c.fightType = ChannelFightType.valueOf(params[2]);//exemple de params[2] = "TeamDeathMatch"
		c.roundType = ChannelRoundType.valueOf(params[3]);//exemple de params[3] = "Lives"
		c.lootDistributionType = ChannelLootType.valueOf(params[4]);//exemple de params[4] = "LastAlive"
		if(params[5].equals("default")){
			System.arraycopy(defaultParamsAndConditions, 0, c.paramsAndConditions, 0, 0);
		}else{
			short[] par = new short[params.length-6];
			for(int i = par.length-1; i >= 0; i--){
				try{
					par[i] = Short.parseShort(params[i]);
				}catch(Exception e){
					par[i] = defaultParamsAndConditions[i+6];
				}
			}
			c.paramsAndConditions = par;
		}
		return c;
	}
	
	/**
	 * Tente de modifier un des paramètres/conditions.
	 * @param index - Index dans l'array short[] du param/condition. 
	 * @param value - Valeur en String
	 * @return - False si c'est considéré une tentative de cheat/hack.. True si la valeur a bien été mise.
	 */
	public boolean modifyParam(byte index, String value){
		if(state != ChannelStateType.Preparing.get()){
			return false;
		}
		if(index > 100){
			switch(index){
				case 0:
					if(value.length() >= 4){//Faut que le nom soit de minimum 4 characteres de long
						name = value; 
						return true;
					}break;
				case 1:
					if(value.length() >= 4){//Faut que le password soit de minimum 4 characteres de long
						password = value; 
						return true;
					}break;
				case 2:
					if(ChannelFightType.valueOf(value) != null){
						fightType = ChannelFightType.valueOf(value);
						return true;
					}break;
				case 3:
					if(ChannelFightType.valueOf(value) != null){
						roundType = ChannelRoundType.valueOf(value);
						return true;
					}break;
				case 4:
					if(ChannelFightType.valueOf(value) != null){
						lootDistributionType = ChannelLootType.valueOf(value);
						return true;
					}break;
				case 5:
					if(value.equals("default")){
						System.arraycopy(defaultParamsAndConditions, 0, paramsAndConditions, 0, 0);
						return true;
					}break;
			}
		}
		if(index >= paramsAndConditions.length-1){
			return false;
		}
		if((paramsAndConditions[index]+"").equals(value)){
			return false;//Return false si le param était déjà identique à la nouvelle valeur 
			//					(donc tentative de hack/cheat)
		}
		if(Utils.isParsableInteger(value) == false){
			return false; //Si la str4ing ne représente pas un bon nombre, (donc tentative de hack/cheat)
		}
		paramsAndConditions[index] = Short.parseShort(value);
		return true;
	}
	
	/**
	 * TODO: Channel.launchRound
	 * @return - True si le démarrage du combat a marché. False sinon (ex un perso qui n'est pas ready)
	 */
	public boolean launchRound(GPersonnage starter){
		if(starter.getID() != host.getID()){
			return false;
		}
		ArrayList<ArrayList<CombativeCharacter>> copy = new ArrayList<ArrayList<CombativeCharacter>>(teams);
		//J'fais une copie pour éviter que les gens changent d'état en même temps qu'on essaye de démarrer
		//		et que ca fasse bug.
		if(canLaunchRound(copy) == false){
			return false;
		}
		timeStarted = System.currentTimeMillis();
		this.state = ChannelStateType.Active.get();
		for(ArrayList<CombativeCharacter> team : copy){
			for(CombativeCharacter p : team){
				for(int i = p.getStates().size()-1; i >= 0; i--){
					if(p.getStates().get(i) == PlayerState.InPvpChannelReady){
						p.getStates().set(i, PlayerState.InPvpChannelCombating);
						//send packets
					}
				}
			}
		}
		//send packets
		return true;
	}
	
	/**
	 * TODO: Channel.canLaunchRound
	 * @return
	 */
	public boolean canLaunchRound(ArrayList<ArrayList<CombativeCharacter>> copy){
		if(state != ChannelStateType.Preparing.get()){
			return false;
		}
		for(ArrayList<CombativeCharacter> team : copy){
			for(CombativeCharacter p : team){
				for(PlayerState state : p.getStates()){
					if(state != PlayerState.InPvpChannelReady){
						return false;//vérifie que tout le monde soit prêt
					}
				}
			}
		}
		switch(fightType){
			case TeamDeathMatch:
				if(copy.size() != paramsAndConditions[18]){
					return false;//Si le nombre de teams n'est pas respecté
				}
				for(ArrayList<CombativeCharacter> team : copy){
					if(team.size() != paramsAndConditions[19]){
						return false;//Si les nombre de perso par team n'est pas respecté
					}
				}
				break;
			case FreeForAll:
				if(paramsAndConditions[16] < 2){
					return false;//Si y'a moins de 2 personnages dans le freeforall (donc il est seul)
				}
				break;
		}
		return true;
	}
	
	
	
	/**
	 * Vérifie si un personnage a le droit de rejoinre un channel.
	 * @param p - Le perso en question
	 * @param o - Le mot de passe pour entrer dans le channel. S'il n'y en a pas, mettre -> ("")
	 * @return - S'il peut joindre ou pas.
	 */
	public boolean canJoin(GPersonnage p, IObject motDePasse){
		if
		(
		  (paramsAndConditions[p.getClassID()-1] == 0) ||//Si le classe du perso a le droit d'entrer là
		  (paramsAndConditions[12] > p.getLevel()) ||
		  (paramsAndConditions[13] < p.getLevel()) ||
		  (paramsAndConditions[14] > p.getAccount().getGM()) ||
		  (paramsAndConditions[15] > (System.currentTimeMillis() - timeStarted)) ||//À  cb de temps à partir du début on bloque les entrées
		  (paramsAndConditions[16] - paramsAndConditions[17]  == 0) ||//si le max de perso est rempli (24/24)
		  (password.equals(motDePasse) == false)
		)
		{
			return false;
		}
		
		return true;
	}
	
	
	/**
	 * TODO: Channel.quit
	 * @return
	 */
	public boolean quit(GPersonnage p){
		/*
		 * todo: partie quit lorsque le combat n'est pas encore actif (preparing state)
		 * ---------
		 * todo: partie abandon lorsque le combat est déjà actif
		 */
		return true;
	}
	
	/**
	 * TODO: Channel.join
	 * @return
	 */
	public boolean join(GPersonnage p){
		/*
		 * todo: partie join lorsque le combat n'est pas encore actif (preparing state)
		 *   -> p.setState(InPvpChannelPreparing)
		 * ---------
		 * todo: partie join lorsque le combat est déjà  actif  (genre freeForAll de temps sans conditions)
		 *   -> p.setState(InPvpChannelCombating)
		 */
		return true;
	}
	
	@Override
	/**
	 * Retourne la string pour le packet affichant:
	 *  le nom du Channel, s'il a un password, le nombre de perso co/max, et les mode. 
	 */
	public String toString(){
		return name+","+(password == "" ? "0" : "1")+","+getNbrCo()+","+getNbrCoMax()+fightType.name()+","+roundType.name()+","+lootDistributionType.name();
	}
	
	
	
	public short getLevelMin(){
		return paramsAndConditions[12];
	}
	public short getLevelMax(){
		return paramsAndConditions[13];
	}
	public short getNbrCo(){
		return paramsAndConditions[16];
	}
	public short getNbrCoMax(){
		return paramsAndConditions[17];
	}

	@Override
	public FightType getType() {
		return FightType.PVPC;
	}

	@Override
	public boolean getShowCancelButtonOnJoin() {
		return true;
	}

	@Override
	public boolean getShowUIOnJoin() {
		return true;
	}

	@Override
	public byte getTeamAlignment(int arg0) {
		return 0;
	}
	
	
}
