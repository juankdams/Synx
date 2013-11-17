package SM;

import static SM.Sender.send;

import org.apache.mina.core.session.IoSession;

import Abstractions.AbstractCharacter;
import Enums.CharacterType;
import GameObjects.GPersonnage;
import Interfaces.ISprite;

/**
 * Contient tous les paquets envoyables concernant le Chat
 */
public class chat{
	
	
	
	
	/**
	 * GAME_SEND_cMK_PACKET_TO_MAP<p>
	 * @param p - GPersonnage envoyeur du message
	 */
	public static void cMK_Black(AbstractCharacter p,String msg)
	{
        String packet = (new StringBuilder("cMK|")).append(p.getID()).append("|").append(p.getName()).append("|").append(msg).append("|").toString();
        for(ISprite z : p.getMap().getSpritesSynchroFull()){
			if(z.getCharacterType() == CharacterType.PLAYER && z.getLayer() == p.getLayer()){
        	//  if(z.getClient() != null){
            	send(((GPersonnage)z).getClient().getSession(), packet);
           // }
        	}
        }
        packet = null;
	}
	/*
	/**
	 * GAME_SEND_cMK_PACKET_TO_FIGHT<p>
	 * @param guid - ID du perso envoyeur du message
	 *
	public static void cMK_FightBlack(Fight fight,int teams,int guid,String name,String msg)
	{
		if(fight != null){
			fight.ticMyTimer();
		}
        String packet = (new StringBuilder("cMK|")).append(guid).append("|").append(name).append("|").append(msg).toString();
        for(Fighter f : fight.getFighters(teams))
		{
			if(f.hasLeft()){
				continue;
			}
			if(f.getPersonnage() == null || !f.getPersonnage().isOnline()){
				continue;
			}
			send(f.getPersonnage(),packet);			
		}
	}
	
	/**
	 * GAME_SEND_cMK_PACKET_TO_FIGHT<p>
	 * @param guid - ID du perso envoyeur du message
	 *
	public static void cMK_FightTeam(Fight fight,int teams,int guid,String name,String msg)
	{
		if(fight != null){
			fight.ticMyTimer();
		}
        String packet = (new StringBuilder("cMK#|")).append(guid).append("|").append(name).append("|").append(msg).toString();
        for(Fighter f : fight.getFighters(teams))
		{
			if(f.hasLeft()){
				continue;
			}
			if(f.getPersonnage() == null || !f.getPersonnage().isOnline()){
				continue;
			}
			send(f.getPersonnage(),packet);
		}
	}
	*/
	/**
	 * GAME_SEND_cMK_PACKET_TO_GROUP<p>
	 * Envoie un message dans le canal groupe
	 * @param guid - ID du perso envoyeur du message
	 */
	/*public static void cMK_Group(Group g, int guid, String name, String msg)
	{
		for(Personnage P : g.getPersos()){
			send(P,"cMK$|"+guid+"|"+name+"|"+msg+"|");
		}
	}*/
	/**
	 * GAME_SEND_cMK_PACKET_TO_ALL   COMMERCE<p>
	 * Envoie un message sur le canal de commerce
	 * @param guid - ID du perso envoyeur du message
	 */
	public static void cMK_Commerce(AbstractCharacter p,String msg)
	{
		for(GPersonnage perso : p.getServer().getWorld().getPersos().values()){
			if(perso.getLayer() == p.getLayer()){
				send(perso.getClient().getSession(),"cMK:|"+p.getID()+"|"+p.getName()+"|"+msg);
			}
		}
		msg = null;
	}
	/**
	 * GAME_SEND_cMK_PACKET_TO_ALL   COMMERCE<p>
	 * Envoie un message sur le canal de commerce
	 * @param guid - ID du perso envoyeur du message
	 * @param prefix - Le préfix du canal sur lequel on doit envoyer le message
	 */
	public static void cMK_ALL(AbstractCharacter p, char prefix, String msg)
	{
		for(GPersonnage perso : p.getServer().getWorld().getPersos().values()){
			if(perso.getLayer() == p.getLayer()){
				send(perso.getClient().getSession(),"cMK"+prefix+"|"+p.getID()+"|"+p.getName()+"|"+msg);
			}
		}
		msg = null;
	}
	/**
	 * GAME_SEND_cMK_PACKET_TO_ADMIN<p>
	 * Envoie un message sur le canal d'admin
	 * 
	 */
	public static void cMK_Admin(AbstractCharacter p, String msg)
	{
		for(GPersonnage perso : p.getServer().getWorld().getPersos().values()){//World.getOnlinePersos()){
			if(perso.getAccount() != null && perso.getAccount().getGM() > 1 && perso.getLayer() == p.getLayer()){//1 = VIP
				send(perso.getClient().getSession(),"cMK@|"+p.getID()+"|"+p.getName()+"|"+msg);
			}
		}
		msg = null;
	}
	/**
	 * GAME_SEND_cMK_PACKET_TO_ALL   RECRUTEMENT<p>
	 * Envoie un message sur le canal de commerce
	 * @param guid - ID du perso envoyeur du message
	 */
	public static void cMK_Recrutement(AbstractCharacter p,String msg)
	{
		for(GPersonnage perso : p.getServer().getWorld().getPersos().values()){
			if(perso.getLayer() == p.getLayer()){
				send(perso.getClient().getSession(),"cMK?|"+p.getID()+"|"+p.getName()+"|"+msg);
			}
		}
		msg = null;
	}
	/**
	 * GAME_SEND_cMK_PACKET_TO_GUILD<p>
	 * Envoie un message à tous les membres online d'une guilde sur son canal guilde
	 */
	/*public static void cMK_Guild(Guild g, int guid,String name,String msg)
	{
		for(Personnage perso : g.getMembers())
		{
			if(perso == null || !perso.isOnline()){
				continue;
			}
			send(perso,"cMK%|"+guid+"|"+name+"|"+msg);
		}
	}*/
	/**
	 * GAME_SEND_cMK_PACKET_TO_ALIGN<p>
	 * Envoie un message à tous les joueurs online et du meme alignement sur son canal align
	 */
	public static void cMK_Alignement(AbstractCharacter p,String msg)
	{
		for(GPersonnage perso : p.getServer().getWorld().getPersos().values()){
			if(perso.getAlignementSpecialization() == p.getAlignementSpecialization() && perso.getLayer() == p.getLayer()){
				send(perso.getClient().getSession(),"cMK!|"+p.getID()+"|"+p.getName()+"|"+msg);
			}
		}
		msg = null;
	}
	/**
	 * GAME_SEND_cMK_PACKET_INCARNAM_CHAT<p>
	 * Envoie un message global à tous les connectés d'incarnam
	 */
	 public static void cMK_Incarnam(AbstractCharacter p, String msg) 
	 { 
		 for(GPersonnage perso : p.getServer().getWorld().getPersos().values()){
			 if(perso.getLayer() == p.getLayer()){
				 send(perso.getClient().getSession(),"cMK^|"+p.getID()+"|"+p.getName()+"|"+msg);
			 }
		 }
		msg = null;
	 }
	 /**
	  * GAME_SEND_CHAT_ERROR_PACKET<p>
	  * Envoie un packet d'erreur au gars qui a essayé de mp un joueur null, compte ou gamethread null.
	  */
	 public static void cMEf(IoSession out,String name)
	 {
		 send(out, "cMEf"+name);
		 name = null;
	 }
	/**
	 * Envoie un Message Privé à un personnage target à partir d'un autre personnage perso (Packets cMK F et cMK T)
	 * 
	 */
	public static void MP(GPersonnage target, GPersonnage perso, String msg)
	{
		send(target.getClient().getSession(),"cMKF|"+perso .getID()+"|"+perso .getName()+"|"+msg);
		send(perso.getClient().getSession(), "cMKT|"+target.getID()+"|"+target.getName()+"|"+msg);
		msg = null;
	}
	/**
	 * GAME_SEND_ADD_CANAL<p>
	 * this.aks.Chat.onSubscribeChannel(sData.substr(2));
	 * @param out
	 * @param chans
	 */
	public static void cC_A(IoSession out, String channel)
	{
		send(out,"cC+"+channel);
		channel = null;
	}
	/**
	 * GAME_SENDREMOVE_CANAL<p>
	 * this.aks.Chat.onSubscribeChannel(sData.substr(2));
	 * @param out
	 * @param chans
	 */
	public static void cC_R(IoSession out, String channel)
	{
		send(out,"cC-"+channel);
		channel = null;
	}
	/**
	 * GAME_SEND_CANAL<p>
	 * this.aks.Chat.onSubscribeChannel(sData.substr(2));
	 * @param chans - La string de tous les channels activés du personnage
	 */
	//public static void cC_ALL(IoSession out, String channels)
	//{
	//	send(out,"cC"+channels);
	//}
	/**
	 * this.aks.Chat.onServerMessage(sData.substr(2));
	 */
	public static void cs(IoSession out, String mess)
	{
		send(out,"cs"+mess);
		mess = null;
	}
	/**
	 * GAME_SEND_EMOTICONE_TO_FIGHT<p>
	 *this.aks.Chat.onSmiley(sData.substr(2));
	 */
	/*public static void cS(Fight fight, int teams, int guid, int id)
	{
		if(fight != null) fight.ticMyTimer();
        for(Fighter f : fight.getFighters(teams))
		{
			if(f.hasLeft())continue;
			if(f.getPersonnage() == null || !f.getPersonnage().isOnline())continue;
				send(f.getPersonnage(),(new StringBuilder("cS")).append(guid).append("|").append(id).toString());
		}
	}*/
	/**
	 * GAME_SEND_EMOTICONE_TO_MAP<p>
	 *this.aks.Chat.onSmiley(sData.substr(2));
	 */
	public static void cS(AbstractCharacter p, int id)
	{
		for(ISprite z : p.getMap().getSpritesSynchroFull()){
			if(z.getCharacterType() == CharacterType.PLAYER && z.getLayer() == p.getLayer()){
	        	send(((GPersonnage)z).getClient().getSession(),"cS"+p.getID()+"|"+id);
	        }
		}
	}

	
	
	
	
	/*
	 * case "c":
        {
            switch (sAction)
            {
                case "M":
                {
                    this.aks.Chat.onMessage(!bError, sData.substr(3));
                    break;
                } 
                case "s":
                {
                    this.aks.Chat.onServerMessage(sData.substr(2));
                    break;
                } 
                case "S":
                {
                    this.aks.Chat.onSmiley(sData.substr(2));
                    break;
                } 
                case "C":
                {
                    this.aks.Chat.onSubscribeChannel(sData.substr(2));
                    break;
                } 
                default:
                {
                    this.defaultProcessAction(sType, sAction, bError, sData);
                    break;
                } 
            } // End of switch
            break;
        } 
	 */
}