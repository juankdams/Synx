package Providers;

import io.netty.channel.Channel;
import Game.WakfuGameClient;
import Interfaces.IProvider;
import Login.WakfuLoginClient;
import Interfaces.IWakfuClient;

public interface WakfuClientProvider extends IProvider {
	
	public IWakfuClient createNew(Channel c);
	public String getSessionAttributeKey();
	
	public static class WakfuGameClientProvider implements WakfuClientProvider {
		public WakfuGameClient createNew(Channel c) {
			return new WakfuGameClient(c);
		}
		public String getSessionAttributeKey() {
			return "GameClient";
		}
	}
	public static class WakfuLoginClientProvider implements WakfuClientProvider {
		public WakfuLoginClient createNew(Channel c) {
			return new WakfuLoginClient(c);
		}
		public String getSessionAttributeKey() {
			return "LoginClient";
		}
	}
	
	

}
