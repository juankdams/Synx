package Game;

import ConfigurationObjects.GConfig;
import Constants.CWorld;
import Handlers.GHandler;
import Login.LoginServer;
import Servers.MinaServer;

public class DofusGameServer extends GameServer { //extends MinaServer /*CServers*/ implements GServer {

	public MinaServer s = new MinaServer();
	
	public DofusGameServer(LoginServer ls, GConfig config, CWorld cworld){
		super(ls, config, cworld);
	}
	
	@Override
	/**
	 * Initialise le GameServer en fonction de la config qui a été donnée.<br>
	 * Initialize ses propriétés telles le GameWorld, ThreadManager, SqlService, GHandler... <br>
	 * Charge le reste de sa configuration en BDD SQL.
	 */
	public void boot() throws Exception {
		super.boot();
		s.setHandler( new GHandler(this) );
	}

	
	@Override
	public void terminate() {
		super.terminate();
		try {
			this.finalize();
		} catch (Throwable e) {e.printStackTrace();}
	}
	
	@Override
	public MinaServer get(){
		return s;
	}

}