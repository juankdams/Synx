package Login;

import GameClientStrategies.GameClientStrategy;
import Handlers.LHandler;
import Servers.MinaServer;

public class DofusLoginServer extends LoginServer {

	public MinaServer s = new MinaServer();

	public DofusLoginServer(short ID, String dbHostIP, String dbName, String dbUser, String dbPass, String ownerss) {
		super(ID, dbHostIP, dbName, dbUser, dbPass, ownerss);
	}

	@Override
	public void boot() throws Exception {
		super.boot();
		s.setHandler(new LHandler(this));
	}
	
	@Override
	public void terminate() {
		super.terminate();
		try {
			this.finalize();
		} catch (Throwable e) {e.printStackTrace();}
	}

	@Override
	public GameClientStrategy getGameClientStrategy(){
		return GameClientStrategies.GameClientStrategies.DofusClientStrategy.get();
	}

	@Override
	protected MinaServer get() {
		return s;
	}
	
}