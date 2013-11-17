package Senders;

import org.apache.mina.core.session.IoSession;

import Game.GClient;


//------------------------------------------------------------------------------------------------------------------ WAYPOINTS

/**
 * Contient tous les paquets envoyables concernant les areas 
 */
public class areas extends Sender{
	/**
	 * GAME_SEND_ZONE_ALIGN_STATUT <p>
	 * TODO this.aks.Subareas.onList(sData.substr(3));
	 * @param packet
	 */
	public static void al(IoSession s) {
		//TODO send(out, "al|"+World.getSousZoneStateString());
		send(s, "al|");
	}
	/**
	 * this.aks.Subareas.onAlignmentModification(sData.substr(2));
	 * SEND_am_MESSAGE_ALIGNEMENT_SUBAREA
	 *  "am"+sub.get_id()+"|"+sub.get_alignement()+"|0"
	 * @param packet
	 */
	public static void am(GClient c, int subAreaID, int subAreaAlignment, int win) {
		send(c.getSession(), "am"+subAreaID+"|"+subAreaAlignment+"|"+win);
	}
	/**
	 * this.aks.Conquest.onAreaAlignmentChanged(sData.substr(2));
	 * SEND_aM_MESSAGE_ALIGNEMENT_AREA
	 * "aM"+area.get_id()+"|"+area.getalignement()
	 * @param packet
	 */
	public static void aM(GClient c, int areaID, int areaAlignment) {
		send(c.getSession(), "aM"+areaID+"|"+areaAlignment);
	}
	/**
	 *  this.defaultProcessAction(sType, sAction, bError, sData);
	 * @param packet
	 */
	public static void a_AUTRE(GClient c, String packet){
		send(c.getSession(), "a"+packet);
	}
}