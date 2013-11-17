package SM;

import static Enums.FightTeamEnum.ATTACKER;
import static Enums.FightTeamEnum.DEFENDER;
import static Enums.FightTeamEnum.SPECTATOR;
import static SM.Sender.send;

import java.util.ArrayList;

import org.apache.mina.core.session.IoSession;

import Abstractions.CombativeCharacter;
import Enums.CharacterType;
import Enums.SynActions.MapAction;
import GameObjects.GPersonnage;
import GameObjects.Fights.GFight;
import GlobalObjects.Map;
import Interfaces.ISprite;

public class fights {


	/**
	 * fightCountMessage. L'envoie à un seul personnage
	 * @param fights
	 * @return
	 */
	public static void fC(IoSession is, int fights){
		send(is, "fC" + fights);
    }
	
	/**
	 * fightCountMessage. L'envoie à tous les personnages de la map qui sont sur le layer 0 (de base)
	 * @param m - La map dont on peut envoyer le nombre de fights et qui contient les characters/sprites à qui on veut l'envoyer
	 * @param layer - Le layer sur lequel il faut compter le nombre de combats et sur lequel on doit envoyer le packet
	 * @return
	 */
	public static void fC_LAYER(Map m, byte layer){
		int count =  m.getFightCount(layer);
		for(ISprite is : m.getSpritesSynchroFull()){
			if(is.getCharacterType() == CharacterType.PLAYER && is.getLayer() == layer){//Map.baseLayer){
				send(((GPersonnage)is).getClient().getSession(), "fC" + count );
			}
		}
    }

	/**
	 * TODO
	 * @param p
	 */
	public static void fL(GPersonnage p){
		String list = "";
		ArrayList<GFight> gf = p.getMap().updateFightsList(MapAction.GET_FIGHTS, null);
		if(gf != null && gf.size() > 0){
			for(GFight f : gf){
				list += "|"+f.getID()+";"+f.getDuration();
				//for(int i = f.getTeams().size()-1; i >= 0; i--){}
				list += 
				";" + f.getTeamType(ATTACKER.get()) +
				"," + f.getTeamAlignment(ATTACKER.get()) +
				"," + f.getTeams().get(ATTACKER.get()).size();

				list += 
				";" + f.getTeamType(DEFENDER.get()) +
				"," + f.getTeamAlignment(DEFENDER.get()) +
				"," + f.getTeams().get(DEFENDER.get()).size();
			}
		}
		send(p.getClient().getSession(), "fL"+list);
	}

	/**
	 * TODO
	 * @param p
	 */
	public static void fD(GPersonnage p, GFight f){
		String list = "";
		for(int i = 0; i <= f.getTeams().size()-1; i++){
			if(i == SPECTATOR.get()){
				continue;
			}
			list += "|";
			for(CombativeCharacter c : f.getTeams().get(i)){
				list += c.getName() + "~" + c.getLevel() + ";";
			}
		}
		
		send(p.getClient().getSession(), "fD"+f.getID()+list);
	}
	
	
	
}
