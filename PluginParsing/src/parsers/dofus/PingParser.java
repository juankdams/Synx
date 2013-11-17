package parsers.dofus;

import Game.DofusGameClient;
import Plugins.Abstractions.AbstractPacketParser;

public class PingParser extends AbstractPacketParser<DofusGameClient, String> {

	@Override
	public boolean parse(DofusGameClient c, String packet) {
		// TODO Auto-generated method stub
		switch(packet.charAt(0)){
			case 'p'://TODO recevance du packet ping
				SM.Sender.send(c.getSession(), "ping");//il (client) va faire .onPong en recevant ca
				return true;//break;
			case 'q'://TODO recevance du packet qping
				SM.Sender.send(c.getSession(), "qping");//il (client) va faire .onQuickPong en recevant ca
				return true;//break;
			case 'r'://TODO recevance du packet rping
				//reconnection en combat.
				/*DataProcessor . :
				  case "r":
		            {
		                this.aks.send("rpong" + sData.substr(5), false);
		                break;
		            } 
				 */
				break;
		}
		return false;
	}

/*  dans dofus.aks.Aks

_loc1.ping = function ()
    {
        this.api.datacenter.Basics.lastPingTimer = getTimer();
        this.send("ping");
    };	
	
 */
	
	
	
}
