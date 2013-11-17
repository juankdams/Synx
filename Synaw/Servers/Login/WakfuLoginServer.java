package Login;

import Core.Syn;
import GameClientStrategies.GameClientStrategy;
import Handlers.WakfuEncoder;
import Handlers.WakfuHandler;
import Servers.NettyServer;
import Providers.WakfuClientProvider.WakfuLoginClientProvider;

public class WakfuLoginServer extends LoginServer {

	public NettyServer s = new NettyServer();

	public WakfuLoginServer(short ID, String dbHostIP, String dbName, String dbUser, String dbPass, String ownerss) {
		super(ID, dbHostIP, dbName, dbUser, dbPass, ownerss);
	}

	@Override
	public void boot() throws Exception {
		super.boot();
		//s.setDecoder(new WakfuDecoder());
		s.setEncoder(new WakfuEncoder());
		s.setHandler(new WakfuHandler(new WakfuLoginClientProvider()));
	}

	@Override
	public void on(){	
		get().start();
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
		return GameClientStrategies.GameClientStrategies.WakfuClientStrategy.get();
	}
	
	@Override
	protected NettyServer get() {
		return s;
	}
	
}