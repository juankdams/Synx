package SM;

import static SM.Sender.send;
import Enums.ImPackets;
import Enums.ImPackets.ImType;
import Game.DofusGameClient;
import GameObjects.GPersonnage;


//------------------------------------------------------------------------------------------------------------------ INFOS

/**
 * Contient tous les paquets envoyables concernant les Infos (Ex: ILS/ILF pour le timer de récupération de vie)
 */
public class Infos{
	
	/**
	 *this.aks.Infos.onInfoMaps(sData.substr(2));
	 */
	public static void IM(GPersonnage out,String str)
	{
		send(out.getClient().getSession(),"IM"+str);
	}
	/**
	 * this.aks.Infos.onInfoCompass(sData.substr(2));
	 */
	public static void IC(GPersonnage out,String str)
	{
		send(out.getClient().getSession(),"IC"+str);
	}
	/**
	 * this.aks.Infos.onInfoCoordinatespHighlight(sData.substr(2));
	 */
	public static void IH(GPersonnage out,String str)
	{
		send(out.getClient().getSession(),"IH"+str);
	}
	/**
	 * GAME_SEND_Im_PACKET<p>
	 * Envoie un Message d'Information <p>
	 * this.aks.Infos.onMessage(sData.substr(2));
	 * @param str - Numéro du message à envoyer (Voir le Lang) ;parametres
	 */
	public static void Im(GPersonnage out, ImType imt, ImPackets imp, String str)
	{
		send(out.getClient().getSession(),"Im"+imt+imp+str);
	}
	/**
	 * this.aks.Infos.onQuantity(sData.substr(2));
	 */
	public static void IQ(GPersonnage out,String str)
	{
		send(out.getClient().getSession(),"IQ"+str);
	}
	/**
	 *  this.aks.Infos.onObject(sData.substr(2));
	 */
	public static void IO(GPersonnage out,String str)
	{
		send(out.getClient().getSession(),"IO"+str);
	}
	/**
	 * Start le timer de régénération de la vie<p>
	 * this.aks.Infos.onLifeRestoreTimerStart(sData.substr(3));
	 * 
	 */
	public static void ILS(GPersonnage out,String regenInterval)
	{
		send(out.getClient().getSession(),"ILS"+regenInterval);
	}
	/**
	 * Finit le timer de régénération de la vie
	 * <p>this.aks.Infos.onLifeRestoreTimerFinish(sData.substr(3));
	 * @param pdvRecovered - Le nombre de pdv retrouvés en se régénérant en étant assit/couché...
	 * @param c - Le client personnage
	 */
	public static void ILF(DofusGameClient c,long pdvRecovered, boolean forceZero)
	{
		if(pdvRecovered > 0 || forceZero){
			send(c.getSession(),"ILF"+pdvRecovered);
		}
	}
	
	
	
	/*
	 *  case "I":
        {
            switch (sAction)
            {
                case "M":
                {
                    this.aks.Infos.onInfoMaps(sData.substr(2));
                    break;
                } 
                case "C":
                {
                    this.aks.Infos.onInfoCompass(sData.substr(2));
                    break;
                } 
                case "H":
                {
                    this.aks.Infos.onInfoCoordinatespHighlight(sData.substr(2));
                    break;
                } 
                case "m":
                {
                    this.aks.Infos.onMessage(sData.substr(2));
                    break;
                } 
                case "Q":
                {
                    this.aks.Infos.onQuantity(sData.substr(2));
                    break;
                } 
                case "O":
                {
                    this.aks.Infos.onObject(sData.substr(2));
                    break;
                } 
                case "L":
                {
                    switch (sData.charAt(2))
                    {
                        case "S":
                        {
                            this.aks.Infos.onLifeRestoreTimerStart(sData.substr(3));
                            break;
                        } 
                        case "F":
                        {
                            this.aks.Infos.onLifeRestoreTimerFinish(sData.substr(3));
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