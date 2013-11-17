package Senders;

import java.util.Calendar;

import org.apache.mina.core.session.IoSession;

import Misc.Utils;
import static SM.Sender.send;


//------------------------------------------------------------------------------------------------------------------ BASICS

/**
 * Contient tous les paquets envoyables concernant les Basics
 */
public class Basics{
  //  private static final String PATTERN_FORMATTER = "yyyy|MM|dd";
  //  private static final SimpleDateFormat CURRENT_DATE_FORMATTER = new SimpleDateFormat(PATTERN_FORMATTER);
  //  private static final DateTimeFormatter CURRENT_DATE_TIME_FORMATTER = DateTimeFormat.forPattern(PATTERN_FORMATTER);

	
	/**
	 * Ferme le panneau (interface) envoyé par BAIO ou autre, pas au courant.
	 *  this.aks.Basics.onAuthorizedInterfaceClose(sData.substr(4));
	 */
	public static void BAIC(IoSession out){
		send(out, "BAIC");
	}
	/**
	 * ENVIAR_BAIO_MENSAJE_PANEL_INFORMACION<p>
	 * Envoie un panneau (interface) avec le message en paramètres<p>
	 *  this.aks.Basics.onAuthorizedInterfaceOpen(sData.substr(4));
	 */
	public static void BAIO(IoSession out, String message){
		send(out, "BAIO" + message);
	}
	/**
	 * GAME_SEND_BN <p>
	 * Envoie "BN" <p>
	 * case "N":{return;break;}
	 */
	public static void BN(IoSession out)
	{
		send(out,"BN");
	}
	
  //	public static String currentDateMessage(Date now){
  //      return "BD" + CURRENT_DATE_FORMATTER.format(now);
  //  }

    public static void BD(IoSession out){
    	send(out, "BD"+Constants.Constants.DOFUS_YEAR+"|"+(Utils.calender.get(Calendar.MONTH)+1)+"|"+Utils.calender.get(Calendar.DAY_OF_MONTH));
    	//send(out, "BD"+Utils.calender.get(Calendar.YEAR)+"|"+(Utils.calender.get(Calendar.MONTH)+1)+"|"+Utils.calender.get(Calendar.DAY_OF_MONTH));
    	//send(out,"BD" + CURRENT_DATE_TIME_FORMATTER.print(DateTime.now()));
    }
    
    /**
     * Envoie un message console en BLANC (Commande 'correcte' ? info?) au client
     * @param out - Celui à qui envoyer l'packet
     */
    public static void BAT_NEUTRAL(IoSession out, String msg){
    	send(out, "BAT0"+msg);
    }
    /**
     * Envoie un message console en ROUGE (Erreur,mauvaise commande) au client
     * @param out - Celui à qui envoyer l'packet
     */
    public static void BAT_FAIL(IoSession out, String msg){
    	send(out, "BAT1"+msg);
    }
    /**
     * Envoie un message console en VERT (Bonne commande) au client
     * @param out - Celui à qui envoyer l'packet
     */
    public static void BAT_SUCCESS(IoSession out, String msg){
    	send(out, "BAT2"+msg);
    }
	
	
	
	
	/*
	 * case "B":
        {
            switch (sAction)
            {
                case "N":
                {
                    return;
                    break;
                } 
                case "A":
                {
                    switch (sData.charAt(2))
                    {
                        case "T":
                        {
                            this.aks.Basics.onAuthorizedCommand(true, sData.substr(3));
                            break;
                        } 
                        case "L":
                        {
                            this.aks.Basics.onAuthorizedLine(sData.substr(3));
                            break;
                        } 
                        case "P":
                        {
                            this.aks.Basics.onAuthorizedCommandPrompt(sData.substr(3));
                            break;
                        } 
                        case "C":
                        {
                            this.aks.Basics.onAuthorizedCommandClear();
                            break;
                        } 
                        case "E":
                        {
                            this.aks.Basics.onAuthorizedCommand(false);
                            break;
                        } 
                        case "I":
                        {
                            switch (sData.charAt(3))
                            {
                                case "O":
                                {
                                    this.aks.Basics.onAuthorizedInterfaceOpen(sData.substr(4));
                                    break;
                                } 
                                case "C":
                                {
                                    this.aks.Basics.onAuthorizedInterfaceClose(sData.substr(4));
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
                case "T":
                {
                    this.aks.Basics.onReferenceTime(sData.substr(2));
                    break;
                } 
                case "D":
                {
                    this.aks.Basics.onDate(sData.substr(2));
                    break;
                } 
                case "W":
                {
                    this.aks.Basics.onWhoIs(!bError, sData.substr(3));
                    break;
                } 
                case "P":
                {
                    this.aks.Basics.onSubscriberRestriction(sData.substr(2));
                    break;
                } 
                case "C":
                {
                    this.aks.Basics.onFileCheck(sData.substr(2));
                    break;
                } 
                case "p":
                {
                    this.aks.Basics.onAveragePing(sData.substr(2));
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