package Senders;

import static SM.Sender.send;
import Game.GClient;

public class Crystal {

	/**
	 * Envoie packet @SC
	 * @param c
	 * @param packet
	 */
	public static void SC(GClient c, String packet){
		send(c.getSession(), "@SC"+packet);
	}
	
	
}
