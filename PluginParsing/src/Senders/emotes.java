package Senders;

import org.apache.mina.core.session.IoSession;

import Enums.CharacterType;
import GameObjects.GPersonnage;
import Interfaces.ICharacter;
import Interfaces.ISprite;



//------------------------------------------------------------------------------------------------------------------ EMOTES

/**
 * Contient tous les paquets envoyables concernant les Emotes
 */
public class emotes extends Sender{
	
	/**
	 * Lancer une animation :
	 * <p>eUK persoID | emoteID | timer
	 * <p>this.aks.Emotes.onUse(!bError, sData.substr(3));
	 * @param emoteID - ID de l'emote (Elles sont listées dans EmoteEnum)
	 * @param timer - Pendant combien de temps en milliseconde l'emote doit être faite avant de s'achever. 0 si l'emote est permanente.
	 * <p>Ex: eUK25|1|5000 permet au persoID 25 de s'asseoir pendant 5 secondes avant de se lever.
	 */
	public static void eU(GPersonnage perso, int emoteID, int timer){
		for(ISprite z : perso.getMap().getSpritesSynchroFull()){
			if(z.getCharacterType() == CharacterType.PLAYER){
				if(timer > 0){
					send(((GPersonnage)z).getClient().getSession(), "eUK"+perso.getID()+"|"+emoteID+"|"+timer);
				}else{
					send(((GPersonnage)z).getClient().getSession(), "eUK"+perso.getID()+"|"+emoteID);
				}
			}
		}
		
	}
	
	/**
	 * GAME_SEND_EMOTE_LIST<p>
	 *  this.aks.Emotes.onList(sData.substr(2));
	 *  @param perso - Bah la session du personnage auquel on envoit le packet xd
	 *  @param emotes - Les emotes du perso
	 *  @param emotes2 - Chais pas pourquoi ca existe en fait
	 */
	public static void eL(IoSession perso, byte[] emotes, byte[] emotes2)
	{
		int e = 0;
		for(byte b : emotes){
			e += (2 << (b-2));
		}
		int e2 = 0;
		if(emotes2 != null){
			for(byte b : emotes2){
				e2 += (2 << (b-2));
			}
		}
		send(perso, "eL"+e+"|"+e2);
	}
	/**
	 * GAME_SEND_NO_EMOTE<p>
	 * emote User Error<p>
	 *  this.aks.Emotes.onUse(!bError, sData.substr(3));<p>
	 * @param out
	 */
	public static void eUE(IoSession out)
	{
		send(out, "eUE");
	}
	/**
	 *   this.aks.Emotes.onAdd(sData.substr(2));
	 *   @param emoteID - ID de l'emote à ajouter
	 *   @param showNotificationMsg - En principe, on met toujours true, mais t'essayera c'que ca donne si on met false ? ;o
	 */
	public static void eA(IoSession out, int emoteID, boolean showNotificationMsg)
	{
		//en fait, à la place du 1, on peut mettre n'importe quoi d'autre que 0, le client lui fait if(num!=0)
		send(out, "eA|"+emoteID+"|"+(showNotificationMsg ? 1 : 0));
	}
	/**
	 *   this.aks.Emotes.onRemove(sData.substr(2));
	 *   @param emoteID - ID de l'emote à enlever 
	 *   @param showNotificationMsg - En principe, on met toujours true, mais t'essayera c'que ca donne si on met false ? ;o
	 */
	public static void eR(IoSession out, int emoteID, boolean showNotificationMsg)
	{
		//en fait, à la place du 1, on peut mettre n'importe quoi d'autre que 0, le client lui fait if(num!=0)
		send(out, "eR|"+emoteID+"|"+(showNotificationMsg ? 1 : 0));
	}
	/**
	 * GAME_SEND_eD_PACKET_TO_MAP
	 * <p>Pour afficher un changement de la direction d'un Character (pointe vers le sud, l'est, etc)
	 * <p> Ça l'envoie/affiche à tous les personnages sur la map qui sont pas en combat
	 * <p>this.aks.Emotes.onDirection(sData.substr(2));
	 * @param dir - ID de la direction à prend dans src.Enums.Orientation
	 */
	public static void eD(GlobalObjects.Map map,int persoID, byte dir)
	{
		//Ici, meme avec 2 persos sur la map, le getSpritesSynchroFull est accessé juste une fois
		for(ISprite z : map.getSpritesSynchroFull()){
			if(z.getCharacterType() == CharacterType.PLAYER){
				if(((GPersonnage)z).getFight() == null){
					send(((GPersonnage)z).getClient().getSession(),"eD"+persoID+"|"+dir);
				}
			}
		}
	}
	/*
	 * case "e":
        {
            switch (sAction)
            {
                case "U":
                {
                    this.aks.Emotes.onUse(!bError, sData.substr(3));
                    break;
                } 
                case "L":
                {
                    this.aks.Emotes.onList(sData.substr(2));
                    break;
                } 
                case "A":
                {
                    this.aks.Emotes.onAdd(sData.substr(2));
                    break;
                } 
                case "R":
                {
                    this.aks.Emotes.onRemove(sData.substr(2));
                    break;
                } 
                case "D":
                {
                    this.aks.Emotes.onDirection(sData.substr(2));
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