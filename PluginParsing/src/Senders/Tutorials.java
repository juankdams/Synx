package Senders;

import org.apache.mina.core.session.IoSession;

import GameObjects.GPersonnage;
import static SM.Sender.send;

//------------------------------------------------------------------------------------------------------------------ TUTORIALS

/**
 * Contient tous les paquets envoyables concernant les tutoriels
 */
public class Tutorials extends Sender{
	/**
	 *  this.aks.Tutorial.onCreate(sData.substr(2));
	 */
	public static void TC(IoSession session, String packet) {
		send(session, "TC"+packet);
	}
	/**
	 * this.aks.Tutorial.onShowTip(sData.substr(2));
	 */
	public static void TT(IoSession session, String packet) {
		send(session, "TT"+packet);
	}
	/**
	 * this.aks.Tutorial.onShowTip(sData.substr(2));
	 * <p> Cinématique de départ
	 */
	public static void TB(IoSession session){
		send(session, "TB");
	}
	/**
	 *  this.defaultProcessAction(sType, sAction, bError, sData);
	 */
	public static void T_AUTRE(IoSession session, String packet){
		send(session, "T"+packet);
	}
}