package Senders;



import org.apache.mina.core.session.IoSession;
import static SM.Sender.send;

import Enums.CharacterType;
import Game.GClient;
import GameObjects.*;
import LoginObjects.LAccount;
import GlobalObjects.*;
import Interfaces.ICharacter;
import Interfaces.ISprite;

//------------------------------------------------------------------------------------------------------------------ MESSAGES

/**
 * Le but ici est par exemple d'envoyer un message à un/++ personnage, en mp ou autre. 
 * Cela peut aussi etre un message d'erreur
 * @author Robyn
 */
public class Messages{
	/**
	 * Envoie un Message à un personnage -- (Packet inexistant)
	 */
	public static void M(GPersonnage perso, String mess, String color)
	{
		send(perso.getClient().getSession(),"cs<font color='#"+color+"'>"+mess+"</font>");
	}
	/**
	 * Envoie un Message à un personnage -- (Packet inexistant)
	 */
	public static void M(IoSession out, String mess, String color)
	{
		send(out,"cs<font color='#"+color+"'>"+mess+"</font>");
	}
	/**
	 * Envoie un message à tous les comptes co sur une IP
	 */
	public static void MIP(String IP, String message, String color){
		for(LAccount c : LoginObjects.LWorld.getAccounts().values()){
			if(c.getCurIP().compareTo(IP) == 0){
				if(c.getCurPerso() != null){
					if(c.getCurPerso().getClient() != null){
						send(c.getCurPerso().getClient().getSession(), "cs<font color='#"+color+"'>"+message+"</font>");
					}
				}
			}
		}
	}
	/**
	 * Envoie un Message de Serveur : this.aks.onServerMessage(sData.substr(1));  -- (Packet M)
	 */
	public static void MS(GClient perso, String mess)
	{
		send(perso.getSession(),"M"+mess);
	}
	/**
	 * Envoie un Message disant que le serveur va fermer : this.aks.onServerWillDisconnect();  -- (Packet k)
	 */
	public static void Mk(GPersonnage perso)
	{
		send(perso.getClient().getSession(),"k");
	}
	/**
	 * Envoie un Message Privé à un personnage à partir d'un autre personnage (Packets cMK F et cMK T)
	 * 
	 */
	public static void MP(GPersonnage target, GPersonnage perso, String msg)
	{
		send(target.getClient().getSession(),"cMKF|"+perso .getID()+"|"+perso .getName()+"|"+msg);
		send(perso.getClient().getSession(), "cMKT|"+target.getID()+"|"+target.getName()+"|"+msg);
	}
	/**
	 * Envoie un Message à tous les membres d'un Groupe Kolizeum
	 * @param gp - Le groupe Kolizeum
	 */
	/*public static void MKG(Koliseum.Group gp, String mess){
		if(gp.getPerso1() != null){
			//M(gp.getPerso1(), mess, color);
			send(gp.getPerso1(),"cs<font color='#"+Zen.koliMsgColor+"'>"+mess+"</font>");
		}
		if(gp.getPerso2() != null){
			//M(gp.getPerso2(), mess, color);
			send(gp.getPerso2(),"cs<font color='#"+Zen.koliMsgColor+"'>"+mess+"</font>");
		}
		if(gp.getPerso3() != null){
			//M(gp.getPerso3(), mess, color);
			send(gp.getPerso3(),"cs<font color='#"+Zen.koliMsgColor+"'>"+mess+"</font>");
		}
	}*/
	/**
	 * Envoie un Message à tous les joueurs de la Map.
	 */
	public static void MM(Map map, String mess, String color)
	{
		for(ISprite c : map.getSpritesSynchroFull()){
			if(c.getCharacterType() == CharacterType.PLAYER){
				send(((GPersonnage)c).getClient().getSession(),"cs<font color='#"+color+"'>"+mess+"</font>");
			}
		}
	}
	/**
	 * Envoie un Message à tous les joueurs Online.
	 */
	public static void MO(String msg, String color, GWorld gw)
	{
		for(GPersonnage P : gw.getPersos().values())
		{
			send(P.getClient().getSession(),"cs<font color='#"+color+"'>"+msg+"</font>");
		}		
	}
	/**
	 *  (Canal ALL) <p>
	 * Envoie un Message à tous les joueurs online qui ont le canal Alignement ouvert
	 */
	public static void MA(String msg,String color, GWorld gw)
	{
		for(GPersonnage P : gw.getPersos().values())
		{
			if(P.getChannels().indexOf("!") != -1){
				send(P.getClient().getSession(),"cs<font color='#"+color+"'>"+msg+"</font>");
			}
		}
	}
	/**
	 * Envoie un Message à la Console du out.
	 */
	public static void MC(IoSession out, String mess)
	{
		if(out != null){
			send(out,"BAT2"+mess);
		}else{
			//TODO Syn.commande(mess);
		}
	}
	/**
	 * Envoie un Packet à tous les joueurs de la Fight.
	 */
	/*public static void MF(Fight fight, String packet) {
		for(int team = 2; team >= 1; team--){
			for(int z=0;z < fight.getFighters(team).size();z++)
			{
				if(fight.getFighters(team).get(z).getPersonnage() != null){
					send(fight.getFighters(team).get(z).getPersonnage(), packet);
				}
			}
		}
	}
	
	*/
}