package SM;

import static Enums.FightTeamEnum.ATTACKER;
import static Enums.FightTeamEnum.DEFENDER;
import static Enums.FightTeamEnum.SPECTATOR;
import static SM.Sender.send;

import java.util.ArrayList;
import java.util.List;

import org.apache.mina.core.session.IoSession;

import Abstractions.AbstractCharacter;
import Abstractions.CombativeCharacter;
import Core.Syn;
import Enums.CharacterType;
import Enums.FightState;
import Enums.FightSwordFlagType;
import GameObjects.GAction;
import GameObjects.GChallenge;
import GameObjects.GChallenge.FightChallengeState;
import GameObjects.GDropItem;
import GameObjects.GPersonnage;
import GameObjects.Fights.GFight;
import GameObjects.Fights.GameResults.GameResult;
import GlobalObjects.Map;
import Interfaces.ISprite;
import Plugins.Managers.PluginsManager;


public class Game{

	
	/**
	 * GAME_SEND_GAME_CREATE<p>
	 * @param name 
	 */
	public static void GCK(IoSession out, String name)
	{
		//TODO: trouve ca veut dire quoi le 1
		send(out,"GCK|1|"+name);
	}
	
	/**
	 * GAME_SEND_GDK_PACKET<p>
	 * this.aks.Game.onMapLoaded();
	 * @param serverName 
	 */
	public static void GDK(IoSession out)
	{
		send(out,"GDK");
	}
	
	/**
	 * GAME_SEND_MAPDATA<p>
	 *  GDM<p>
	 *  this.aks.Game.onMapData(sData.substr(4));
	 */
	public static void GDM(IoSession out, Map map)//, int id, String date,String key)
	{
		if(map != null){
			send(out,"GDM|"+map.getID()+"|"+map.getDate()+"|"+map.getKey());
		}
	}
	
	/**
	 * Envoie l'affichage de tous les sprites de la map au personnage.
	 * <p> Donc tous les GDO+, les GM|+, etc
	 */
	public static void showAllSprites(GPersonnage p, Map m){
		StringBuilder str = new StringBuilder();
		GFight f = p.getFight();
		PluginsManager pm = p.getServer().getPluginsManager();
		if(f != null){
			Syn.d("showAllSprites to guy in fight");
			for(int i = 0; i <= f.getTeams().size()-1; i++){
				if(i == SPECTATOR.get()){
					continue;
				}
				for(CombativeCharacter c : f.getTeams().get(i)){
					String packet = c.getSpritePacket(pm, "GM|+")+//Pour les characters (Persos,prismes,percepteurs,monstres...)
									c.getSpritePacket(pm, "GDO+");//Pour les items dropés sur le sol
					//Essaye d'append le packet au total
					if(packet.length() != 0){
						if(str.length() != 0){
							str.append('\u0000');
						}
						str.append(packet);
					}
				}
			}
		}else{
			Syn.d("showAllSprites to guy in null fight");
			for(ISprite s : m.getSpritesSynchroCopy()){
				if(s.getLayer() != p.getLayer()){
					Syn.d("s.getLayer("+s.getLayer()+")(id"+s.getID()+") != p.getLayer("+p.getLayer()+")(id"+p.getID()+")");
					continue;
				}
				//Syn.d("showAllSprites. spriteCharacterType :"+c.getCharacterType()+", spriteID ("+c.getID()+") .");
				//Essaye de pogner le bon packet correspondant au sprite
				String packet = s.getSpritePacket(pm, "GM|+")+//Pour les characters (Persos,prismes,percepteurs,monstres...)
								s.getSpritePacket(pm, "GDO+");//Pour les items dropés sur le sol
				
				//Essaye d'append le packet au total
				if(packet.length() != 0){// && s.getLayer() == p.getLayer()){
					if(str.length() != 0){
						str.append('\u0000');
					}
					str.append(packet);
				}
			}
			
			//Affichage des épées de combat
			List<GFight> fights = m.getFightsSynchroCopy();
			if(fights != null){
				for(GFight fight : fights){
					if(fight.getState() >= FightState.ACTIVE.get()){
						continue;
					}
					String packet = getFightSwordsTeams(fight);
					//Essaye d'append le packet au total
					if(packet.length() != 0){// && s.getLayer() == p.getLayer()){
						if(str.length() != 0){
							str.append('\u0000');
						}
						str.append(packet);
					}
				}
			}
			
		}
		
		send(p.getClient().getSession(), str.toString());
	}
	
	/**
	 * Envoie l'affichage d'un nouveau character à tous les perso qui étaient déjà sur la map (& sur même layer) sauf au nouveau.
	 * @param newC - Le nouveau Character
	 * @param m - La map sur laquelle le character est ajouté
	 */
	public static void GM_ADD(AbstractCharacter newC, Map m){
		PluginsManager pm = newC.getServer().getPluginsManager();
		for(ISprite c : m.getSpritesSynchroFull()){
			if(c.getCharacterType() == CharacterType.PLAYER && c != newC && c.getLayer() == newC.getLayer()){
				GPersonnage p = (GPersonnage)c;
				send(p.getClient().getSession(), newC.getSpritePacket(pm, "GM|+").toString());
				//Syn.d("GM_ADD newGuy("+newC.getID()+") packetReceiverGuy("+p.getID()+")");
			}
		}
	}
	/**
	 * Pareil que l'autre GM_ADD, sauf que ca l'envoie uniquement à un target.
	 * @param target - Personne à qui on envoie l'affichage du nouveau sprite
	 * @param newC - Nouveau sprite à afficher au target.
	 */
	public static void GM_ADD(AbstractCharacter newC, GPersonnage target){
		PluginsManager pm = newC.getServer().getPluginsManager();
		send(target.getClient().getSession(), newC.getSpritePacket(pm, "GM|+").toString());
	}
	
	/**
	 * Réenvoie l'affichage d'un character sur la map pour le modifier à tous les perso qui sont aussi sur la map (& le même layer)
	 * @param ichar - Le Character à modifier (GPerso/GNpc/etc)
	 * @param m - La map sur laquelle le character est.
	 */
	public static void GM_MODIFY(AbstractCharacter ichar, Map m){
		PluginsManager pm = ichar.getServer().getPluginsManager();
		for(ISprite c : m.getSpritesSynchroFull()){
			if(c.getCharacterType() == CharacterType.PLAYER && c.getLayer() == ichar.getLayer()){
				GPersonnage p = (GPersonnage)c;
				send(p.getClient().getSession(), ichar.getSpritePacket(pm, "GM|~").toString());
			}
		}
	}
	
	/**
	 * GAME_SEND_ERASE_ON_MAP_TO_MAP<p>
	 *  GM|-    : retire<p>
	 *  this.aks.Game.onMovement(sData.substr(3));
	 *  @param characterID - L'ID du character à retirer de l'affichage de la map
	 */
	public static void GM_REMOVE(Map map, AbstractCharacter ac)
	{
		for(ISprite c : map.getSpritesSynchroFull()){
			if(c.getCharacterType() == CharacterType.PLAYER && ac.getLayer() == c.getLayer()){
				send(((GPersonnage)c).getClient().getSession(),"GM|-"+ac.getID());
			}
		}
	}

	/**
	 * //FIXME: Packet GDO , le 0 à la fin À CHERCHER DANS LE LOADER
	 * <p>
	 * Ajoute l'affichage des items dropés par terre, sur le sol de la map.
	 * @param p - Le personnage à qui envoyer le packet. S'il est null on l'envoie à tout le monde sur la map.
	 * @param gdo - Des DropItems
	 */
	public static void GDO(GPersonnage p, Map m, boolean addOrRemove, GDropItem... gdos) {
		if((p == null && m == null) || gdos == null || gdos.length == 0){
			return;
		}
		String packet = "GDO";
		packet += (addOrRemove ? "+" : "-");//si true: +, si false: -
	
		for(GDropItem gdo : gdos){
			if(packet.length() != 0){
				packet += "|";
			}
			if(gdo != null) packet += gdo.parseToGDOPacket(p.getServer().getEffectsManager());
		}
		if(p == null && m != null){//envoie à toute la map
			for(ISprite c : m.getSpritesSynchroFull()){
				if(c.getCharacterType() == CharacterType.PLAYER && c.getLayer() == gdos[0].getLayer()){//Map.baseLayer){
					send(((GPersonnage)c).getClient().getSession(), packet);
				}
			}
		}else if(p != null){//envoie à un joueur seulement
			send(p.getClient().getSession(), packet);
		}
	}
	
	
	
	
	
	/** Voir la doc de GJK_FIGHT  */
	public static void GJK(GPersonnage p, GFight f){
		//GJK fightState | cancelbutton0false | UI0false | isSpectator0false | timerTimeMS | fightType
		send(p.getClient().getSession(), "GJK"+f.getState()+"|"+(f.getShowCancelButtonOnJoin()?1:0)+"|"+(f.getShowUIOnJoin()?1:0)+"|"+(f.isSpectator(p)?1:0)+"|"+p.getServer().getConfig().getFightStartTimerTime()+"|"+f.getType());
	}
	
	/**
	 * Game onJoin -> Envoie à tous les characters de la fight : <br>
	 * - L'état du combat (init,place,active,finish) <br>
	 * - L'affichage du boutton de cancellation du combat (Si en défi a.k.a FightType.Challenge) <br>
	 * - L'affichage de la UI contenant le bouton "Prêt"
	 * - Le boolean true si le personnage est en spectateur false sinon (ce qui voudrait dire qu'il est combattant)
	 * - Le temps du premier timer pour commencer le combat en millisecondes.
	 * - Le type de combat (FightType-> Challenge, pvm, pvp, etc)
	 * @param f - Le combat qui détient les informations à envoyer au personnage.
	 */
	public static void GJK_FIGHT(GFight f){
		//GJK fightState | cancelbutton0false | UI0false | isSpectator0false | timerTimeMS | fightType
		for(int i = f.getTeams().size()-1; i >=0; i--){
			if(i == SPECTATOR.get()){
				continue;
			}
			for(CombativeCharacter cc : f.getTeams().get(i)){
				if(cc.getCharacterType() == CharacterType.PLAYER && cc.getLayer() == f.getLayer()){
					send(((GPersonnage)cc).getClient().getSession(), "GJK"+f.getState()+"|"+(f.getShowCancelButtonOnJoin()?1:0)+"|"+(f.getShowUIOnJoin()?1:0)+"|"+(f.isSpectator(cc)?1:0)+"|"+cc.getServer().getConfig().getFightStartTimerTime()+"|"+f.getType());
				}
			}
		}
	}
	/**
	 * GameAction. <p>
	 * Se référer à l'enum GameActionType dans l'ActionPlugins 
	 * et l'ActionFactory disponible sous interface dans Plugins.Interfaces et implémentée dans l'ActionsPlugin.
	 */
	public static void GA(GPersonnage p, GAction action){
		send(p.getClient().getSession(), "GA"+action.getID()+";"+action.getType()+";"+p.getID()+";"+action.getSpecialArgs());
	}
	/**
	 * GameAction. <p>
	 * Se référer à l'enum GameActionType dans l'ActionPlugins 
	 * et l'ActionFactory disponible sous interface dans Plugins.Interfaces et implémentée dans l'ActionsPlugin.
	 */
	public static void GA_LAYER(AbstractCharacter p, GAction action){
		for(ISprite c : p.getMap().getSpritesSynchroFull()){
			if(c.getCharacterType() == CharacterType.PLAYER && c.getLayer() == p.getLayer()){
				GPersonnage t = ((GPersonnage)c);
				send(t.getClient().getSession(), "GA"+action.getID()+";"+action.getType()+";"+p.getID()+";"+action.getSpecialArgs());
			}
		}
	}
	

	/* *
	 * GameActionStart
	 * @param p - Personnage qui commence une action
	 */
	/*public static void GAS_LAYER(AbstractCharacter p){
		for(ISprite c : p.getMap().getSpritesSynchroFull()){
			if(c.getCharacterType() == CharacterType.PLAYER && c.getLayer() == p.getLayer()){
				send(((GPersonnage)c).getClient().getSession(), "GAS"+p.getID());
			}
		}
	}*/
	
	/**
	 * GameActionStart
	 * @param p - Personnage qui commence une action
	 */
	public static void GAS(AbstractCharacter p){
		for(ISprite c : p.getMap().getSpritesSynchroFull()){
			if(c.getCharacterType() == CharacterType.PLAYER && c.getLayer() == p.getLayer()){
				send(((GPersonnage)c).getClient().getSession(), "GAS"+p.getID());
			}
		}
	}
	
	/* *
	 * GameActionFinish : 
	 * _loc4 étant le premier chiffre dans GAF0|37 : 
	 *  <br> (À regarder dans Dofus > Aks > GameActions > onActionsFinish.
	 * 	<br> if (_loc4 != undefined)
	 * 	<br> {
	 * 	<br>	_loc7.addAction(false, this, this.actionAck, [_loc4]);
	 * 	<br> } // end if
	 * 	<br><br> Et: <br>
	 * 	<br> if (_loc4 == 2)
	 *	<br> {	//Grace à ça ici, En faisant pc GAF2|idPerso pendant un combat, �a m'a renvoy� GKK2 (pcq il renvoie GKK + _loc4 qui est l'Id unique de l'action, comme des id de perso)
     *	<br> 	this.api.kernel.TipsManager.showNewTip(dofus.managers.TipsManager.TIP_FIGHT_ENDMOVE);
     *  <br> } // end if
	 * @param p - Personnage qui finit une action
	 */
	/*public static void GAF_LAYER(AbstractCharacter p){
		for(ISprite c : p.getMap().getSpritesSynchroFull()){
			if(c.getCharacterType() == CharacterType.PLAYER && c.getLayer() == p.getLayer()){
				//send(((GPersonnage)c).getClient().getSession(), "GAF"+p.getID());
				/*
				 * if(p.activated tutorials : send ("GAF"+"2"+"|"+p.getID()); )
				 * /
				send(((GPersonnage)c).getClient().getSession(), "GAF"+"|"+p.getID());
			}
		}
	}*/

	/**
	 * GameActionFinish : 
	 * _loc4 étant le premier chiffre dans GAF0|37 : 
	 *  <br> (À regarder dans Dofus > Aks > GameActions > onActionsFinish.
	 * 	<br> if (_loc4 != undefined)
	 * 	<br> {
	 * 	<br>	_loc7.addAction(false, this, this.actionAck, [_loc4]);
	 * 	<br> } // end if
	 * 	<br><br> Et: <br>
	 * 	<br> if (_loc4 == 2)
	 *	<br> {	//Grace à ça ici, En faisant pc GAF2|idPerso pendant un combat, ça m'a renvoyé GKK2 
     *	<br> 	this.api.kernel.TipsManager.showNewTip(dofus.managers.TipsManager.TIP_FIGHT_ENDMOVE);
     *  <br> } // end if
     *  @param gameActionEndTypeID - ID du type de GameActionEnd qui est à prendre dans ActionsManager.getMovementEndAction ou .getSpellEndAction();  Ce sont les seuls actuellement.
	 * @param p - Personnage qui finit une action
	 */
	public static void GAF(byte gameActionEndTypeID, GPersonnage p){
		send(p.getClient().getSession(), "GAF"+gameActionEndTypeID+"|"+p.getID());
		/*
		   public enum GameActionEndType {
		    SPELL(0),
		    MOVEMENT(2);
		 */
	}

	/**
	 * GamePositions -> Les cellules de combats qui sont accessibles <br>
	 * (choisissables pendant la phase de placement)
	 */
	public static void GP(GPersonnage p, GFight f) {
		//TODO Corriger packet GP placesRouges | placesBleues | characTeamID
		send(p.getClient().getSession(), "GP"+"fbfpfqfEfFfT"+"|"+"e0"+"|"+f.getCharacterTeamID(p));
	}
	/**
	 * GameReady -> 
	 * @param p - Le joueur qui est prêt (ou qui n'est pu prêt)
	 * @param isReady - Si le joueur est prêt, envoie l'affichage des épées en haut de sa tête
	 */
	public static void GR(GPersonnage p, boolean isReady) {
		send(p.getClient().getSession(), "GR" + (isReady ? 1 : 0) + p.getID());
	}
	/**
	 * GameReady -> 
	 * @param p - Le joueur qui est prêt (ou qui n'est pu prêt)
	 * @param isReady - Si le joueur est prêt, envoie l'affichage des épées en haut de sa tête
	 */
	public static void GR_FIGHT(GPersonnage p, GFight f, boolean isReady) {
		for(int i = f.getTeams().size()-1; i >=0; i--){
			if(i == SPECTATOR.get()){
				continue;
			}
			for(CombativeCharacter cc : f.getTeams().get(i)){
				if(cc.getCharacterType() == CharacterType.PLAYER){
					send(((GPersonnage)cc).getClient().getSession(), "GR" + (isReady ? 1 : 0) + p.getID());
				}
			}
		}
	}
	/**
	 * Game on PlayersCoordinates -> Envoie les infos d'un character à tout le layer (donc tous les combattants)
	 * @param p - Le personnage de qui on doit prendre les informations
	 * @param error - Si une erreur est survenue, on envoie "GICe" à la place (Ex le joueur a essayé de se placer sur une case déjà occupée). 
	 * 				  On n'envoie le GICe qu'à la personne qui a généré l'erreur.
	 */
	public static void GIC_FIGHT(CombativeCharacter p, GFight f, boolean error){
		if(error && p.getCharacterType() == CharacterType.PLAYER){
			send(((GPersonnage)p).getClient().getSession(), "GICe");
		}else{
			for(int i = f.getTeams().size()-1; i >=0; i--){
				if(i == SPECTATOR.get()){
					continue;
				}
				for(CombativeCharacter cc : f.getTeams().get(i)){
					if(cc.getCharacterType() == CharacterType.PLAYER){
						send(((GPersonnage)cc).getClient().getSession(), "GIC|"+p.getID()+";"+p.getCellID()+";"+p.getOrientation());
					}
				}
			}
		}
	}
	
	/**
	 * Game on PlayersCoordinates -> Envoie les informations des characters du layer déjà présents à une personne.
	 * @param f - Fight dont on va prendre les combattants desquels on doit prendre les informations pour les envoyer au perso. (ID, cellID, Orientation)
	 * @param p - Le personnage à qui on doit envoyer les informations
	 * @param error - Si une erreur est survenue, on envoie "GICe" à la place (Ex le joueur a essayé de se placer sur une case déjà occupée)
	 */
	public static void GIC(GPersonnage p, GFight f, boolean error){
		if(error){
			send(p.getClient().getSession(), "GICe");
		}else{
			String s = "";
			for(int i = f.getTeams().size()-1; i >=0; i--){
				if(i == SPECTATOR.get()){
					continue;
				}
				for(CombativeCharacter cc : f.getTeams().get(i)){
					s += "|"+cc.getID()+";"+cc.getCellID()+";"+cc.getOrientation();
				}
			}
			send(p.getClient().getSession(), "GIC"+s);
		}
	}


	
	/**
	 * GameStart -> "Le combat commence !" <br>
	 * Envoie le packet GS à un personnage.
	 */
	public static void GS(GPersonnage p){
		send(p.getClient().getSession(), "GS");
	}
	/**
	 * GameStart -> "Le combat commence !" <br>
	 * Envoie le packet GS à tous les personnages du combat
	 */
	public static void GS_FIGHT(GFight f){
		for(CombativeCharacter cc : f.getTimeLine()){
			if(cc.getCharacterType() == CharacterType.PLAYER && cc.getLayer() == f.getLayer()){
				GPersonnage perso = (GPersonnage)cc;
				send(perso.getClient().getSession(), "GS");
			}
		}
	}
	/**
	 * GameTimeLine -> Envoie la liste des characters de la timeline (ordonné par initiative) à un joueur <br>
	 */
	public static void GTL(GPersonnage p, GFight f){
		String s = "GTL";
		for(CombativeCharacter cc : f.getTimeLine()){
			s += "|"+cc.getID();
		}
		send(p.getClient().getSession(), s);
	}
	/**
	 * GameTimeLine -> Envoie la liste des characters de la timeline (ordonné par initiative) à un joueur <br>
	 */
	public static void GTL_FIGHT(GFight f){
		String s = "GTL";
		for(CombativeCharacter cc : f.getTimeLine()){
			s += "|"+cc.getID();
		}
		for(CombativeCharacter cc : f.getTimeLine()){
			if(cc.getCharacterType() == CharacterType.PLAYER && cc.getLayer() == f.getLayer()){
				send(((GPersonnage)cc).getClient().getSession(), s);
			}
		}
	}

	/**
	 * GameTurnMiddle -> Envoie les infos des characters de la fight à un joueur <br>
	 * - Les infos contiennent: <br>
	 * - int characterID <br>
	 * - boolean hasSpriteOverHead & mustHideIt ? <br>
	 * - short pdv <br>
	 * - short points d'actions PA <br>
	 * - short points de mouvements PM <br>
	 * - byte orientation/direction <br>
	 * - short pdvMax 
	 * @param optionHideSpriteOverHead -> Pourrait servir à ceux qui sont morts pour ne pas les afficher en fait. donc ca serait optionHideSpriteOverHead = cc.isDead()?.
	 */
	public static void GTM(GPersonnage p, GFight f, boolean optionHideSpriteOverHead){
		String s = "";
		for(CombativeCharacter cc : f.getTimeLine()){
			if(cc.getLayer() == f.getLayer()){
				s += "|" + cc.getID() + ";" + 
				(optionHideSpriteOverHead ? 1 : 0) + ";" + /*cc.getSpriteOverHead*/
				cc.getStatistique().getPdv()+";"+
				cc.getStatistique().getPA(cc.getClasse())+";"+
				cc.getStatistique().getPM(cc.getClasse())+";"+
				cc.getCellID()+";"
				/* +rien... */+";"+
				cc.getStatistique().getPdvMax(cc)
				;
			}else{
				//--> veut dire que le gars n'est plus sur le même layer que le combat
				//--> donc qu'il a quitté le combat. Du genre par abandon :)
			}
		}
		send(p.getClient().getSession(), "GTM"+s);
	}
	/**
	 * GameTurnMiddle -> Envoie les infos des characters de la fight à un joueur <br>
	 * - Les infos contiennent: <br>
	 * - int characterID <br>
	 * - boolean hasSpriteOverHead & mustHideIt ? <br>
	 * - short pdv <br>
	 * - short points d'actions PA <br>
	 * - short points de mouvements PM <br>
	 * - byte orientation/direction <br>
	 * - short pdvMax 
	 */
	public static void GTM_FIGHT(GFight f, boolean optionHideSpriteOverHead){
		String s = "";
		for(CombativeCharacter cc : f.getTimeLine()){
			if(cc.getLayer() == f.getLayer()){
				s += "|" + cc.getID() + ";" + 
				(optionHideSpriteOverHead ? 1 : 0) + ";" + /*cc.getSpriteOverHead*/
				cc.getStatistique().getPdv()+";"+
				cc.getStatistique().getPA(cc.getClasse())+";"+
				cc.getStatistique().getPM(cc.getClasse())+";"+
				cc.getCellID()+";"
				/* +rien... */+";"+
				cc.getStatistique().getPdvMax(cc)
				;
			}else{
				//--> veut dire que le gars n'est plus sur le même layer que le combat
				//--> donc qu'il a quitté le combat. Du genre par abandon :)
			}
		}
		for(CombativeCharacter cc : f.getTimeLine()){
			if(cc.getCharacterType() == CharacterType.PLAYER && cc.getLayer() == f.getLayer()){
				send(((GPersonnage)cc).getClient().getSession(), "GTM"+s);
			}
		}
	}

	/* *
	 * Envoie le packet aux characters présents sur le layer 0 seulement. 
	 * //onFlag
	 * /
	public static void Gf_LAYER(GFight f){  
		
	}*/
	
	/* *
	 * Envoie le packet aux characters présents sur le layer 0 seulement.
	 * //onTeam
	 * /
	public static void Gt_LAYER(GFight f){  
		
	}*/
	
	public static void GTS_FIGHT(CombativeCharacter cc, GFight f){
		//GTS37|29000 -> 37 = spriteID, 29000 = temps de tour en millisecondes
		for(CombativeCharacter c : f.getTimeLine()){
			if(c.getCharacterType() == CharacterType.PLAYER && c.getLayer() == f.getLayer()){
				send(((GPersonnage)c).getClient().getSession(), "GTS"+cc.getID()+"|"+cc.getServer().getConfig().getFightTurnTimerTime());
			}
		}
	}
	public static void GTF_FIGHT(CombativeCharacter cc, GFight f){
		//GTF37 -> 37 = spriteID
		for(CombativeCharacter c : f.getTimeLine()){
			if(c.getCharacterType() == CharacterType.PLAYER && c.getLayer() == f.getLayer()){
				send(((GPersonnage)c).getClient().getSession(), "GTF"+cc.getID());
			}
		}
	}
	public static void GTR_FIGHT(CombativeCharacter cc, GFight f){
		//GTR37 -> 37 = spriteID
		for(CombativeCharacter c : f.getTimeLine()){
			if(c.getCharacterType() == CharacterType.PLAYER && c.getLayer() == f.getLayer()){
				send(((GPersonnage)c).getClient().getSession(), "GTR"+cc.getID());
			}
		}
	}
	
	/**
	 * onChallenge. + onTeam en même temps.
	 * @param f - Le combat qui commence
	 * @param challenger - Celui qui lance le combat en premier
	 * @param defender - Celui qui se fait aggresser en premier
	 */
	public static void showFightSwordTeams(GFight f){
		//pc Gc+1;4|37;250;0;-1|-26;311;1;-1
			//-> Le + est évidemment pour ajouter l'affichage des épées de cette fight à la map
			//-> Le 1 est l'ID de la fight
			//-> le 4 est le type de la fight (exemple PVM, PVP, etc)
			//-> ensuite le | sépare chaque starter du combat
			//-> 37 = characterID, 250 = cellID, 0 = swordType, -1 = alignement 
				//-> SwordType étant le type de l'épée à afficher sur la map:
					//-> soit normal, soit monstre, soit percepteur
		//pc Gt37|+41;Robyn;999  -> ajoute le perso 41 nommé robyn, du niveau 999 à la team du perso 37
		//pc Gt-26|+-26;Dat Mob;666 -> ajoute le monstre -26 "Dat Mob" niveau 666 à la team du gars -26
			//-> Le premier chiffre après Gt = l'ID du CombativeCharacter qui a commencé le combat
			//-> Donc, metons en pvm,  le personnage qui a aggro les monstres et le 1er monstre ds la team
			//-> En pvp, ça serait les deux personnages à s'être aggressés
			//-> Le | sépare chaque membre de l'équipe à mettre dedans
			//-> Le + choisi si on ajoute(+) ou retire (-) un membre à l'équipe
			//-> Le premier chiffre après le + est l'ID du nouveau membre de l'équipe
			//-> Ensuite y'a son nom à afficher et son niveau aussi. et voilà :)
		String s = getFightSwordsTeams(f);
		for(ISprite c : f.getMap().getSpritesSynchroFull()){
			if(c.getCharacterType() == CharacterType.PLAYER && c.getLayer() == f.getOldLayer()){//Map.baseLayer){
				send(((GPersonnage)c).getClient().getSession(), s);
			}
		}
	}
	
	private static String getFightSwordsTeams(GFight f){
		return getGc(f, true) + '\u0000' + getGt(f, true, null, null);
	}
	
	/**
	 * Envoie le packet Gc à tout le layer de base de la map (donc en dehors du combat)
	 */
	public static void Gc_LAYER(GFight f, boolean addOrRemove){
		String s = getGc(f, addOrRemove);
		for(ISprite c : f.getMap().getSpritesSynchroFull()){
			if(c.getCharacterType() == CharacterType.PLAYER && c.getLayer() == f.getOldLayer()){
				send(((GPersonnage)c).getClient().getSession(), s);
			}
		}
	}
	
	private static String getGc(GFight f, boolean addOrRemove){
		String s = "Gc";
		if(addOrRemove == false){//remove
			s += "-"+f.getID();
		}else{//add
			CombativeCharacter challenger = f.getTeams().get(ATTACKER.get()).get(0);//first attacker
			CombativeCharacter defender   = f.getTeams().get(DEFENDER.get()).get(0);//first defender
			s += "+"+f.getID()+";"+f.getType().get();
			s += "|"+challenger.getID()+";"+challenger.getCellID()+";"+FightSwordFlagType.get(challenger, f.getType()).get()+";"+challenger.getAlignementSpecialization();
			s += "|"+defender.getID()+  ";"+defender.getCellID()+  ";"+FightSwordFlagType.get(defender, f.getType()).get()+  ";"+defender.getAlignementSpecialization();
		}
		return s;
	}
	
	/**
	 * Envoie le packet Gt à tout le layer de base de la map (Donc tout le monde qui est hors-combat) <br>
	 * Gt = onTeam dans le client qui fait apparaître la liste de combattant d'un équipe au dessus 
	 * de l'épée de combat qui est affichée sur la map comme le "Dat Mob" lvl 666 là : http://pasteboard.co/1kPjBd7I.png
	 * @param f
	 * @param joiner
	 */
	public static void Gt_LAYER(GFight f, boolean addOrRemove, CombativeCharacter starter, CombativeCharacter joiner){
		String s = getGt(f, addOrRemove, starter, joiner);
		for(ISprite c : f.getMap().getSpritesSynchroFull()){
			if(c.getCharacterType() == CharacterType.PLAYER && c.getLayer() == f.getOldLayer()){//Map.baseLayer){
				send(((GPersonnage)c).getClient().getSession(), s);
			}
		}
	}
	private static String getGt(GFight f, boolean addOrRemove, CombativeCharacter starter, CombativeCharacter joiner){
		//pc Gt37|+41;Robyn;999  /-> ajoute le perso 41 nommé Robyn, lvl999 dans la team du character 37
		String s = "Gt";
		String addOrRem = addOrRemove ? "+" : "-";
		if(starter != null && joiner != null){
			//Soit on envoie le packet jsute pour ajouter le nouveau character qui join
			return s+starter.getID()+"|"+addOrRem+joiner.getID()+";"+joiner.getName()+";"+joiner.getLevel();
		}
		
		//Soit on fait le double packet complet de tous les membres de chaque teams
		String sDefend = "Gt";
		CombativeCharacter challenger = f.getTeams().get(ATTACKER.get()).get(0);//first attacker
		CombativeCharacter defender   = f.getTeams().get(DEFENDER.get()).get(0);//first defender
		s += challenger.getID();
		for(CombativeCharacter cc : f.getTeams().get(ATTACKER.get())){
			s += "|"+addOrRem+cc.getID()+";"+cc.getName()+";"+cc.getLevel();
		}
		sDefend += defender.getID();
		for(CombativeCharacter cc : f.getTeams().get(DEFENDER.get())){
			sDefend += "|"+addOrRem+cc.getID()+";"+cc.getName()+";"+cc.getLevel();
		}
		
		return s+'\u0000'+sDefend;
	}
	

	/**
	 * Si le personnage est null, envoie le packet à tout le combat. Sinon seulement à lui. */
	public static void Gd(GFight f, GPersonnage p, ArrayList<GChallenge> challenges){
		StringBuilder packet = new StringBuilder(challenges.size()*10);
		packet.append("Gd");
		for(GChallenge c : challenges){
			packet
			.append(c.getID()).append(';')
			.append(c.getTargetID() != 0).append(';')
			.append(c.getTargetID()).append(';')
			.append(c.getBonusXp()).append(';')
			.append(c.getTeamBonusXp(f)).append(';')
			.append(c.getBonusDrop()).append(';')
			.append(c.getTeamBonusDrop(f)).append(';')
			.append(c.getState().get()).append(';');
		}
		if(p != null){
			send(p.getClient().getSession(), packet.toString());
		}else{
			for(CombativeCharacter cc : f.getTimeLine()){
				if(cc.getCharacterType() == CharacterType.PLAYER && cc.getLayer() == f.getLayer()){
					send(((GPersonnage)cc).getClient().getSession(), packet.toString());
				}
			}
		}
	}

	/**
	 * Si le personnage est null, envoie le packet à tout le combat. Sinon seulement à lui. */
	public static void GdUpdate(GFight f, GPersonnage p, GChallenge challenge){
		String packet = 
			"Gd" +
			(challenge.getState() == FightChallengeState.Done ? "K" : "E") +
			challenge.getID();
		if(p != null){
			send(p.getClient().getSession(), packet);
		}else{
			for(CombativeCharacter cc : f.getTimeLine()){
				if(cc.getCharacterType() == CharacterType.PLAYER && cc.getLayer() == f.getLayer()){
					send(((GPersonnage)cc).getClient().getSession(), packet);
				}
			}
		}
	}

	public static void GV(GPersonnage p){
		send(p.getClient().getSession(), "GV");
	}

	public static void GE(GameResult gr) {
		String packet = gr.toPacket();
		for(CombativeCharacter cc : gr.getFight().getTimeLine()){
			if(cc.getCharacterType() == CharacterType.PLAYER){//&& cc.getLayer() == gr.getFight().getLayer()){
				send(((GPersonnage)cc).getClient().getSession(), packet);
			}
		}
	}
	
	
	
	/*
	 case "d":
                    {
                        switch (sData.charAt(3))
                        {
                            case "K":
                            {
                                this.aks.Game.onFightChallengeUpdate(sData.substr(4), true);
                                break;
                            } 
                            case "O":
                            {
                                this.aks.Game.onFightChallengeUpdate(sData.substr(4), false);
                                break;
                            } 
                            default:
                            {
                                this.aks.Game.onFightChallenge(sData.substr(2));
                                break;
                            } 
                        } // End of switch
                        break;
                    } 
     _loc1.onFightChallenge = function (sExtraData)
    {
        var _loc3 = sExtraData.split(";");
        if (!this.api.ui.getUIComponent("FightChallenge"))
        {
            this.api.ui.loadUIComponent("FightChallenge", "FightChallenge");
        } // end if
        var _loc4 = new dofus.datacenter.FightChallengeData(_global.parseInt(_loc3[0]), _loc3[1] == "1", _global.parseInt(_loc3[2]), _global.parseInt(_loc3[3]), _global.parseInt(_loc3[4]), _global.parseInt(_loc3[5]), _global.parseInt(_loc3[6]));
        (dofus.graphics.gapi.ui.FightChallenge)((dofus.graphics.gapi.ui.FightChallenge)(this.api.ui.getUIComponent("FightChallenge"))).addChallenge(_loc4);
    };
    _loc1.onFightChallengeUpdate = function (sExtraData, success)
    {
        var _loc4 = _global.parseInt(sExtraData);
        (dofus.graphics.gapi.ui.FightChallenge)((dofus.graphics.gapi.ui.FightChallenge)(this.api.ui.getUIComponent("FightChallenge"))).updateChallenge(_loc4, success);
        var _loc5 = success ? (this.api.lang.getText("FIGHT_CHALLENGE_DONE")) : (this.api.lang.getText("FIGHT_CHALLENGE_FAILED"));
        _loc5 = _loc5 + (" : " + this.api.lang.getFightChallenge(_loc4).n);
        this.api.kernel.showMessage(undefined, _loc5, "INFO_CHAT");
    };
	 */
	
	
	
	/*
	//TODO, les packets GM, j'ai mit le code du client ci-bas:
	 
	 _loc1.onMovement = function (sExtraData, bIsSummoned)
    {
        var _loc4 = sExtraData.split("|");
        var _loc5 = 0;
        
        while (++_loc5, _loc5 < _loc4.length)
        {
            var _loc6 = _loc4[_loc5];
            if (_loc6.length == 0)
            {
                continue;
            } // end if
            var _loc7 = false;
            var _loc8 = false;
            var _loc9 = _loc6.charAt(0);
            if (_loc9 == "+")
            {
                _loc8 = true;
            }
            else if (_loc9 == "~")
            {
                _loc8 = true;
                _loc7 = true;
            }
            else if (_loc9 != "-")
            {
                continue;
            } // end else if
            if (_loc8)
            {
                var _loc10 = _loc6.substr(1).split(";");
                var _loc11 = _loc10[0];
                var _loc12 = _loc10[1];
                var _loc13 = Number(_loc10[2]);
                var _loc14 = _loc10[3];
                var _loc15 = _loc10[4];
                var _loc16 = _loc10[5];
                var _loc17 = _loc10[6];
                var _loc18 = false;
                if (_loc17.charAt(_loc17.length - 1) == "*")
                {
                    _loc17 = _loc17.substr(0, _loc17.length - 1);
                    _loc18 = true;
                } // end if
                var _loc19 = _loc17.split("^");
                var _loc20 = _loc19.length == 2 ? (_loc19[0]) : (_loc17);
                var _loc21 = 100;
                var _loc22 = 100;
                if (_loc19.length == 2)
                {
                    var _loc23 = _loc19[1];
                    if (_global.isNaN(Number(_loc23)))
                    {
                        var _loc24 = _loc23.split("x");
                        _loc21 = _loc24.length == 2 ? (Number(_loc24[0])) : (100);
                        _loc22 = _loc24.length == 2 ? (Number(_loc24[1])) : (100);
                    }
                    else
                    {
                        _loc22 = Number(_loc23);
                        _loc21 = Number(_loc23);
                    } // end if
                } // end else if
                if (_loc7)
                {
                    var _loc25 = this.api.datacenter.Sprites.getItemAt(_loc14);
                    this.onSpriteMovement(false, _loc25);
                } // end if
                switch (_loc16)
                {
                    case "-1":
                    case "-2":
                    {
                        var _loc27 = new Object();
                        _loc27.spriteType = _loc16;
                        _loc27.gfxID = _loc20;
                        _loc27.scaleX = _loc21;
                        _loc27.scaleY = _loc22;
                        _loc27.noFlip = _loc18;
                        _loc27.cell = _loc11;
                        _loc27.dir = _loc12;
                        _loc27.powerLevel = _loc10[7];
                        _loc27.color1 = _loc10[8];
                        _loc27.color2 = _loc10[9];
                        _loc27.color3 = _loc10[10];
                        _loc27.accessories = _loc10[11];
                        if (this.api.datacenter.Game.isFight)
                        {
                            _loc27.LP = _loc10[12];
                            _loc27.AP = _loc10[13];
                            _loc27.MP = _loc10[14];
                            if (_loc10.length > 18)
                            {
                                _loc27.resistances = new Array(Number(_loc10[15]), Number(_loc10[16]), Number(_loc10[17]), Number(_loc10[18]), Number(_loc10[19]), Number(_loc10[20]), Number(_loc10[21]));
                                _loc27.team = _loc10[22];
                            }
                            else
                            {
                                _loc27.team = _loc10[15];
                            } // end else if
                            _loc27.summoned = bIsSummoned;
                        } // end if
                        if (_loc16 == -1)
                        {
                            _loc25 = this.api.kernel.CharactersManager.createCreature(_loc14, _loc15, _loc27);
                        }
                        else
                        {
                            _loc25 = this.api.kernel.CharactersManager.createMonster(_loc14, _loc15, _loc27);
                        } // end else if
                        break;
                    } 
                    case "-3":
                    {
                        var _loc28 = new Object();
                        _loc28.spriteType = _loc16;
                        _loc28.level = _loc10[7];
                        _loc28.scaleX = _loc21;
                        _loc28.scaleY = _loc22;
                        _loc28.noFlip = _loc18;
                        _loc28.cell = Number(_loc11);
                        _loc28.dir = _loc12;
                        var _loc29 = _loc10[8].split(",");
                        _loc28.color1 = _loc29[0];
                        _loc28.color2 = _loc29[1];
                        _loc28.color3 = _loc29[2];
                        _loc28.accessories = _loc10[9];
                        _loc28.bonusValue = _loc13;
                        var _loc30 = this.sliptGfxData(_loc17);
                        var _loc31 = _loc30.gfx;
                        this.splitGfxForScale(_loc31[0], _loc28);
                        _loc25 = this.api.kernel.CharactersManager.createMonsterGroup(_loc14, _loc15, _loc28);
                        if (this.api.kernel.OptionsManager.getOption("ViewAllMonsterInGroup") == true)
                        {
                            var _loc32 = _loc14;
                            var _loc33 = 1;
                            
                            while (++_loc33, _loc33 < _loc31.length)
                            {
                                if (_loc31[_loc5] == "")
                                {
                                    continue;
                                } // end if
                                this.splitGfxForScale(_loc31[_loc33], _loc28);
                                _loc29 = _loc10[8 + 2 * _loc33].split(",");
                                _loc28.color1 = _loc29[0];
                                _loc28.color2 = _loc29[1];
                                _loc28.color3 = _loc29[2];
                                _loc28.dir = random(4) * 2 + 1;
                                _loc28.accessories = _loc10[9 + 2 * _loc33];
                                var _loc34 = _loc14 + "_" + _loc33;
                                var _loc35 = this.api.kernel.CharactersManager.createMonsterGroup(_loc34, undefined, _loc28);
                                var _loc36 = _loc32;
                                if (random(3) != 0 && _loc33 != 1)
                                {
                                    _loc36 = _loc14 + "_" + (random(_loc33 - 1) + 1);
                                } // end if
                                var _loc37 = random(8);
                                this.api.gfx.addLinkedSprite(_loc34, _loc36, _loc37, _loc35);
                                if (!_global.isNaN(_loc35.scaleX))
                                {
                                    this.api.gfx.setSpriteScale(_loc35.id, _loc35.scaleX, _loc35.scaleY);
                                } // end if
                                switch (_loc30.shape)
                                {
                                    case "circle":
                                    {
                                        _loc37 = _loc33;
                                        break;
                                    } 
                                    case "line":
                                    {
                                        _loc36 = _loc34;
                                        _loc37 = 2;
                                        break;
                                    } 
                                } // End of switch
                            } // end while
                        } // end if
                        break;
                    } 
                    case "-4":
                    {
                        var _loc38 = new Object();
                        _loc38.spriteType = _loc16;
                        _loc38.gfxID = _loc20;
                        _loc38.scaleX = _loc21;
                        _loc38.scaleY = _loc22;
                        _loc38.cell = _loc11;
                        _loc38.dir = _loc12;
                        _loc38.sex = _loc10[7];
                        _loc38.color1 = _loc10[8];
                        _loc38.color2 = _loc10[9];
                        _loc38.color3 = _loc10[10];
                        _loc38.accessories = _loc10[11];
                        _loc38.extraClipID = _loc10[12] != undefined && !_global.isNaN(Number(_loc10[12])) ? (Number(_loc10[12])) : (-1);
                        _loc38.customArtwork = Number(_loc10[13]);
                        _loc25 = this.api.kernel.CharactersManager.createNonPlayableCharacter(_loc14, Number(_loc15), _loc38);
                        break;
                    } 
                    case "-5":
                    {
                        var _loc39 = new Object();
                        _loc39.spriteType = _loc16;
                        _loc39.gfxID = _loc20;
                        _loc39.scaleX = _loc21;
                        _loc39.scaleY = _loc22;
                        _loc39.cell = _loc11;
                        _loc39.dir = _loc12;
                        _loc39.color1 = _loc10[7];
                        _loc39.color2 = _loc10[8];
                        _loc39.color3 = _loc10[9];
                        _loc39.accessories = _loc10[10];
                        _loc39.guildName = _loc10[11];
                        _loc39.emblem = _loc10[12];
                        _loc39.offlineType = _loc10[13];
                        _loc25 = this.api.kernel.CharactersManager.createOfflineCharacter(_loc14, _loc15, _loc39);
                        break;
                    } 
                    case "-6":
                    {
                        var _loc40 = new Object();
                        _loc40.spriteType = _loc16;
                        _loc40.gfxID = _loc20;
                        _loc40.scaleX = _loc21;
                        _loc40.scaleY = _loc22;
                        _loc40.cell = _loc11;
                        _loc40.dir = _loc12;
                        _loc40.level = _loc10[7];
                        if (this.api.datacenter.Game.isFight)
                        {
                            _loc40.LP = _loc10[8];
                            _loc40.AP = _loc10[9];
                            _loc40.MP = _loc10[10];
                            _loc40.resistances = new Array(Number(_loc10[11]), Number(_loc10[12]), Number(_loc10[13]), Number(_loc10[14]), Number(_loc10[15]), Number(_loc10[16]), Number(_loc10[17]));
                            _loc40.team = _loc10[18];
                        }
                        else
                        {
                            _loc40.guildName = _loc10[8];
                            _loc40.emblem = _loc10[9];
                        } // end else if
                        _loc25 = this.api.kernel.CharactersManager.createTaxCollector(_loc14, _loc15, _loc40);
                        break;
                    } 
                    case "-7":
                    case "-8":
                    {
                        var _loc41 = new Object();
                        _loc41.spriteType = _loc16;
                        _loc41.gfxID = _loc20;
                        _loc41.scaleX = _loc21;
                        _loc41.scaleY = _loc22;
                        _loc41.cell = _loc11;
                        _loc41.dir = _loc12;
                        _loc41.sex = _loc10[7];
                        _loc41.powerLevel = _loc10[8];
                        _loc41.accessories = _loc10[9];
                        if (this.api.datacenter.Game.isFight)
                        {
                            _loc41.LP = _loc10[10];
                            _loc41.AP = _loc10[11];
                            _loc41.MP = _loc10[12];
                            _loc41.team = _loc10[20];
                        }
                        else
                        {
                            _loc41.emote = _loc10[10];
                            _loc41.emoteTimer = _loc10[11];
                            _loc41.restrictions = Number(_loc10[12]);
                        } // end else if
                        if (_loc16 == "-8")
                        {
                            _loc41.showIsPlayer = true;
                            var _loc42 = _loc15.split("~");
                            _loc41.monsterID = _loc42[0];
                            _loc41.playerName = _loc42[1];
                        }
                        else
                        {
                            _loc41.showIsPlayer = false;
                            _loc41.monsterID = _loc15;
                        } // end else if
                        _loc25 = this.api.kernel.CharactersManager.createMutant(_loc14, _loc41);
                        break;
                    } 
                    case "-9":
                    {
                        var _loc43 = new Object();
                        _loc43.spriteType = _loc16;
                        _loc43.gfxID = _loc20;
                        _loc43.scaleX = _loc21;
                        _loc43.scaleY = _loc22;
                        _loc43.cell = _loc11;
                        _loc43.dir = _loc12;
                        _loc43.ownerName = _loc10[7];
                        _loc43.level = _loc10[8];
                        _loc43.modelID = _loc10[9];
                        _loc25 = this.api.kernel.CharactersManager.createParkMount(_loc14, _loc15 != "" ? (_loc15) : (this.api.lang.getText("NO_NAME")), _loc43);
                        break;
                    } 
                    case "-10":
                    {
                        var _loc44 = new Object();
                        _loc44.spriteType = _loc16;
                        _loc44.gfxID = _loc20;
                        _loc44.scaleX = _loc21;
                        _loc44.scaleY = _loc22;
                        _loc44.cell = _loc11;
                        _loc44.dir = _loc12;
                        _loc44.level = _loc10[7];
                        _loc44.alignment = new dofus.datacenter.Alignment(Number(_loc10[9]), Number(_loc10[8]));
                        _loc25 = this.api.kernel.CharactersManager.createPrism(_loc14, _loc15, _loc44);
                        break;
                    } 
                    default:
                    {
                        var _loc46 = new Object();
                        _loc46.spriteType = _loc16;
                        _loc46.cell = _loc11;
                        _loc46.scaleX = _loc21;
                        _loc46.scaleY = _loc22;
                        _loc46.dir = _loc12;
                        _loc46.sex = _loc10[7];
                        if (this.api.datacenter.Game.isFight)
                        {
                            _loc46.level = _loc10[8];
                            var _loc45 = _loc10[9];
                            _loc46.color1 = _loc10[10];
                            _loc46.color2 = _loc10[11];
                            _loc46.color3 = _loc10[12];
                            _loc46.accessories = _loc10[13];
                            _loc46.LP = _loc10[14];
                            _loc46.AP = _loc10[15];
                            _loc46.MP = _loc10[16];
                            _loc46.resistances = new Array(Number(_loc10[17]), Number(_loc10[18]), Number(_loc10[19]), Number(_loc10[20]), Number(_loc10[21]), Number(_loc10[22]), Number(_loc10[23]));
                            _loc46.team = _loc10[24];
                            if (_loc10[25].indexOf(",") != -1)
                            {
                                var _loc47 = _loc10[25].split(",");
                                var _loc48 = Number(_loc47[0]);
                                var _loc49 = Number(_loc47[1]);
                                var _loc50 = Number(_loc47[2]);
                                var _loc51 = Number(_loc47[3]);
                                if (_loc49 == -1 || _global.isNaN(_loc49))
                                {
                                    _loc49 = this.api.datacenter.Player.color1;
                                } // end if
                                if (_loc50 == -1 || _global.isNaN(_loc50))
                                {
                                    _loc50 = this.api.datacenter.Player.color2;
                                } // end if
                                if (_loc51 == -1 || _global.isNaN(_loc51))
                                {
                                    _loc51 = this.api.datacenter.Player.color3;
                                } // end if
                                if (!_global.isNaN(_loc48))
                                {
                                    var _loc52 = new dofus.datacenter.Mount(_loc48, Number(_loc20));
                                    _loc52.customColor1 = _loc49;
                                    _loc52.customColor2 = _loc50;
                                    _loc52.customColor3 = _loc51;
                                    _loc46.mount = _loc52;
                                } // end if
                            }
                            else
                            {
                                var _loc53 = Number(_loc10[25]);
                                if (!_global.isNaN(_loc53))
                                {
                                    _loc46.mount = new dofus.datacenter.Mount(_loc53, Number(_loc20));
                                } // end if
                            } // end else if
                        }
                        else
                        {
                            _loc45 = _loc10[8];
                            _loc46.color1 = _loc10[9];
                            _loc46.color2 = _loc10[10];
                            _loc46.color3 = _loc10[11];
                            _loc46.accessories = _loc10[12];
                            _loc46.aura = _loc10[13];
                            _loc46.emote = _loc10[14];
                            _loc46.emoteTimer = _loc10[15];
                            _loc46.guildName = _loc10[16];
                            _loc46.emblem = _loc10[17];
                            _loc46.restrictions = _loc10[18];
                            if (_loc10[19].indexOf(",") != -1)
                            {
                                var _loc54 = _loc10[19].split(",");
                                var _loc55 = Number(_loc54[0]);
                                var _loc56 = _global.parseInt(_loc54[1], 16);
                                var _loc57 = _global.parseInt(_loc54[2], 16);
                                var _loc58 = _global.parseInt(_loc54[3], 16);
                                if (_loc56 == -1 || _global.isNaN(_loc56))
                                {
                                    _loc56 = this.api.datacenter.Player.color1;
                                } // end if
                                if (_loc57 == -1 || _global.isNaN(_loc57))
                                {
                                    _loc57 = this.api.datacenter.Player.color2;
                                } // end if
                                if (_loc58 == -1 || _global.isNaN(_loc58))
                                {
                                    _loc58 = this.api.datacenter.Player.color3;
                                } // end if
                                if (!_global.isNaN(_loc55))
                                {
                                    var _loc59 = new dofus.datacenter.Mount(_loc55, Number(_loc20));
                                    _loc59.customColor1 = _loc56;
                                    _loc59.customColor2 = _loc57;
                                    _loc59.customColor3 = _loc58;
                                    _loc46.mount = _loc59;
                                } // end if
                            }
                            else
                            {
                                var _loc60 = Number(_loc10[19]);
                                if (!_global.isNaN(_loc60))
                                {
                                    _loc46.mount = new dofus.datacenter.Mount(_loc60, Number(_loc20));
                                } // end if
                            } // end else if
                        } // end else if
                        if (_loc7)
                        {
                            var _loc26 = [_loc14, this.createTransitionEffect(), _loc11, 10];
                        } // end if
                        var _loc61 = _loc45.split(",");
                        _loc46.alignment = new dofus.datacenter.Alignment(Number(_loc61[0]), Number(_loc61[1]));
                        _loc46.rank = new dofus.datacenter.Rank(Number(_loc61[2]));
                        if (_loc61.length > 3 && _loc14 != this.api.datacenter.Player.ID)
                        {
                            if (this.api.lang.getAlignmentCanViewPvpGain(this.api.datacenter.Player.alignment.index, Number(_loc46.alignment.index)))
                            {
                                var _loc62 = Number(_loc61[3]) - _global.parseInt(_loc14);
                                var _loc63 = this.api.lang.getConfigText("PVP_VIEW_BONUS_MINOR_LIMIT");
                                var _loc64 = this.api.lang.getConfigText("PVP_VIEW_BONUS_MINOR_LIMIT_PRC");
                                var _loc65 = this.api.lang.getConfigText("PVP_VIEW_BONUS_MAJOR_LIMIT");
                                var _loc66 = this.api.lang.getConfigText("PVP_VIEW_BONUS_MAJOR_LIMIT_PRC");
                                var _loc67 = 0;
                                if (this.api.datacenter.Player.Level * (1 - _loc64 / 100) > _loc62)
                                {
                                    _loc67 = -1;
                                } // end if
                                if (this.api.datacenter.Player.Level - _loc62 > _loc63)
                                {
                                    _loc67 = -1;
                                } // end if
                                if (this.api.datacenter.Player.Level * (1 + _loc66 / 100) < _loc62)
                                {
                                    _loc67 = 1;
                                } // end if
                                if (this.api.datacenter.Player.Level - _loc62 < _loc65)
                                {
                                    _loc67 = 1;
                                } // end if
                                _loc46.pvpGain = _loc67;
                            } // end if
                        } // end if
                        if (!this.api.datacenter.Game.isFight && (_global.parseInt(_loc14, 10) != this.api.datacenter.Player.ID && ((this.api.datacenter.Player.alignment.index == 1 || this.api.datacenter.Player.alignment.index == 2) && ((_loc46.alignment.index == 1 || _loc46.alignment.index == 2) && (_loc46.alignment.index != this.api.datacenter.Player.alignment.index && (_loc46.rank.value && this.api.datacenter.Map.bCanAttack))))))
                        {
                            if (this.api.datacenter.Player.rank.value > _loc46.rank.value)
                            {
                                this.api.kernel.SpeakingItemsManager.triggerEvent(dofus.managers.SpeakingItemsManager.SPEAK_TRIGGER_NEW_ENEMY_WEAK);
                            } // end if
                            if (this.api.datacenter.Player.rank.value < _loc46.rank.value)
                            {
                                this.api.kernel.SpeakingItemsManager.triggerEvent(dofus.managers.SpeakingItemsManager.SPEAK_TRIGGER_NEW_ENEMY_STRONG);
                            } // end if
                        } // end if
                        var _loc68 = this.sliptGfxData(_loc17);
                        var _loc69 = _loc68.gfx;
                        this.splitGfxForScale(_loc69[0], _loc46);
                        _loc25 = this.api.kernel.CharactersManager.createCharacter(_loc14, _loc15, _loc46);
                        (dofus.datacenter.Character)(_loc25).isClear = false;
                        var _loc70 = _loc14;
                        var _loc71 = _loc68.shape == "circle" ? (0) : (2);
                        var _loc72 = 1;
                        
                        while (++_loc72, _loc72 < _loc69.length)
                        {
                            if (_loc69[_loc72] == "")
                            {
                                continue;
                            } // end if
                            var _loc73 = _loc14 + "_" + _loc72;
                            var _loc74 = new Object();
                            this.splitGfxForScale(_loc69[_loc72], _loc74);
                            var _loc75 = new ank.battlefield.datacenter.Sprite(_loc73, ank.battlefield.mc.Sprite, dofus.Constants.CLIPS_PERSOS_PATH + _loc74.gfxID + ".swf");
                            _loc75.allDirections = false;
                            this.api.gfx.addLinkedSprite(_loc73, _loc70, _loc71, _loc75);
                            if (!_global.isNaN(_loc74.scaleX))
                            {
                                this.api.gfx.setSpriteScale(_loc75.id, _loc74.scaleX, _loc74.scaleY);
                            } // end if
                            switch (_loc68.shape)
                            {
                                case "circle":
                                {
                                    _loc71 = _loc72;
                                    break;
                                } 
                                case "line":
                                {
                                    _loc70 = _loc73;
                                    _loc71 = 2;
                                    break;
                                } 
                            } // End of switch
                        } // end while
                        break;
                    } 
                } // End of switch
                this.onSpriteMovement(_loc8, _loc25, _loc26);
                continue;
            } // end if
            var _loc76 = _loc6.substr(1);
            var _loc77 = this.api.datacenter.Sprites.getItemAt(_loc76);
            this.onSpriteMovement(_loc8, _loc77);
        } // end while
    };
	 
	 */
	
	
	
	
	
	
	
	
	
	//-----------------------------------------------------------------------------------------------------------------------
	
	
	
	
	
	
	
	/* TODO: Tous les packets de Game (presque :3 )
	 case "G":
            {
                switch (sAction)
                {
                    case "C":
                    {
                        this.aks.Game.onCreate(!bError, sData.substr(4));  [FAIT]
                        break;
                    } 
                    case "J":
                    {
                        this.aks.Game.onJoin(sData.substr(3));
                        break;
                    } 
                    case "P":
                    {
                        this.aks.Game.onPositionStart(sData.substr(2));
                        break;
                    } 
                    case "R":
                    {
                        this.aks.Game.onReady(sData.substr(2));
                        break;
                    } 
                    case "S":
                    {
                        this.aks.Game.onStartToPlay();
                        break;
                    } 
                    case "E":
                    {
                        this.aks.Game.onEnd(sData.substr(2));
                        break;
                    } 
                    case "M":
                    {
                        this.aks.Game.onMovement(sData.substr(3));
                        break;
                    } 
                    case "c":
                    {
                        this.aks.Game.onChallenge(sData.substr(2));
                        break;
                    } 
                    case "t":
                    {
                        this.aks.Game.onTeam(sData.substr(2));
                        break;
                    } 
                    case "V":
                    {
                        this.aks.Game.onLeave(true, sData.substr(2));
                        break;
                    } 
                    case "f":
                    {
                        this.aks.Game.onFlag(sData.substr(2));
                        break;
                    } 
                    case "I":
                    {
                        switch (sData.charAt(2))
                        {
                            case "C":
                            {
                                this.aks.Game.onPlayersCoordinates(sData.substr(4));
                                break;
                            } 
                            case "E":
                            {
                                this.aks.Game.onEffect(sData.substr(3));
                                break;
                            } 
                            case "e":
                            {
                                this.aks.Game.onClearAllEffect(sData.substr(3));
                                break;
                            } 
                            case "P":
                            {
                                this.aks.Game.onPVP(sData.substr(3), false);
                                break;
                            } 
                        } // End of switch
                        break;
                    } 
                    case "D":
                    {
                        switch (sData.charAt(2))
                        {
                            case "M":
                            {
                                this.aks.Game.onMapData(sData.substr(4));  [FAIT]
                                break;
                            } 
                            case "K":
                            {
                                this.aks.Game.onMapLoaded();  [FAIT]
                                break;
                            } 
                            case "C":
                            {
                                this.aks.Game.onCellData(sData.substr(3));
                                break;
                            } 
                            case "Z":
                            {
                                this.aks.Game.onZoneData(sData.substring(3));
                                break;
                            } 
                            case "O":
                            {
                                this.aks.Game.onCellObject(sData.substring(3));
                                break;
                            } 
                            case "F":
                            {
                                this.aks.Game.onFrameObject2(sData.substring(4));
                                break;
                            } 
                            case "E":
                            {
                                this.aks.Game.onFrameObjectExternal(sData.substring(4));
                                break;
                            } 
                        } // End of switch
                        break;
                    } 
                    case "A":
                    {
                        switch (sData.charAt(2))
                        {
                            case "S":
                            {
                                this.aks.GameActions.onActionsStart(sData.substr(3));
                                break;
                            } 
                            case "F":
                            {
                                this.aks.GameActions.onActionsFinish(sData.substr(3));
                                break;
                            } 
                            default:
                            {
                                this.aks.GameActions.onActions(sData.substr(2));
                            } 
                        } // End of switch
                        break;
                    } 
                    case "T":
                    {
                        switch (sData.charAt(2))
                        {
                            case "S":
                            {
                                this.aks.Game.onTurnStart(sData.substr(3));
                                break;
                            } 
                            case "F":
                            {
                                this.aks.Game.onTurnFinish(sData.substr(3));
                                break;
                            } 
                            case "L":
                            {
                                this.aks.Game.onTurnlist(sData.substr(4));
                                break;
                            } 
                            case "M":
                            {
                                this.aks.Game.onTurnMiddle(sData.substr(4));
                                break;
                            } 
                            case "R":
                            {
                                this.aks.Game.onTurnReady(sData.substr(3));
                                break;
                            } 
                        } // End of switch
                        break;
                    } 
                    case "X":
                    {
                        this.aks.Game.onExtraClip(sData.substr(2));
                        break;
                    } 
                    case "o":
                    {
                        this.aks.Game.onFightOption(sData.substr(2));
                        break;
                    } 
                    case "O":
                    {
                        this.aks.Game.onGameOver();
                        break;
                    } 
                } // End of switch
                break;
            }
	 */
	
	
	
}
