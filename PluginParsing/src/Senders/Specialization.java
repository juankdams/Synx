package Senders;

import org.apache.mina.core.session.IoSession;
import static SM.Sender.send;


//------------------------------------------------------------------------------------------------------------------ SPECIALIZATION (FM

/**
 * Contient tous les paquets envoyables concernant les specialisations (d'alignement)
 */
public class Specialization{
	/**
	 * GAME_SEND_ALIGNEMENT <p>
	 * this.aks.Specialization.onSet(sData.substr(2));
	 * @param alignID
	 */
	public static void ZS(IoSession perso, int alignID) {
		send(perso, "ZS"+alignID);
	}
	/**
	 * GAME_SEND_ZC_PACKET <p>
	 * this.aks.Specialization.onChange(sData.substr(2));
	 * @param alignID
	 */
	public static void ZC(IoSession perso, byte alignID) {
		send(perso, "ZC"+alignID);
	}
	/**
	 *  this.defaultProcessAction(sType, sAction, bError, sData);
	 * @param packet
	 */
	public static void Z_AUTRE(IoSession perso, String packet){
		send(perso, "Z"+packet);
	}
}