package Senders;

import static SM.Sender.send;

import org.apache.mina.core.session.IoSession;

import Enums.CharacterType;
import Enums.SynActions.MapAction;
import GameObjects.GPersonnage;
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
	 * fightCountMessage. L'envoie à tous les personnages de la map
	 * @param m - La map dont on peut envoyer le nombre de fights et qui contient les characters/sprites à qui on veut l'envoyer
	 * @return
	 */
	public static void fC_ALL(Map m){
		int count =  m.getFightCount();
		for(ISprite is : m.getSpritesSynchroFull()){
			if(is.getCharacterType() == CharacterType.PLAYER){
				send(((GPersonnage)is).getClient().getSession(), "fC" +count );
			}
		}
    }
	
	
}
