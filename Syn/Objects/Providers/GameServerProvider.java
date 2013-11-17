package Providers;

import ConfigurationObjects.GConfig;
import Constants.CWorld;
import Game.DofusGameServer;
import Game.GameServer;
import Game.WakfuGameServer;
import Interfaces.IProvider;
import Login.LoginServer;

public interface GameServerProvider extends IProvider {


	public GameServer createNew(LoginServer ls, GConfig config, CWorld cworld);
	
	public static class DofusGameServerProvider implements GameServerProvider {
		public GameServer createNew(LoginServer ls, GConfig config, CWorld cworld) {
			return new DofusGameServer(ls, config, cworld);
		}
	}
	public static class WakfuGameServerProvider implements GameServerProvider {
		public GameServer createNew(LoginServer ls, GConfig config, CWorld cworld) {
			return new WakfuGameServer(ls, config, cworld);
		}
	}
	
}
