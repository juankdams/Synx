package Game;

import java.util.concurrent.TimeUnit;

import org.apache.mina.core.session.IoSession;

import Enums.SynActions.MapAction;
import Enums.SynActions.SchedulingA;
import GameObjects.GPersonnage;
import Handlers.GHandler;
import Login.LServer;
import LoginObjects.LAccount;

public class GClient {

	private IoSession session = null;
	private GHandler handler = null;
	
	public GClient(IoSession session){
		this.setSession(session);
	}

	
	
	public void kick() {
		if(session != null && session.isConnected()){
			session.close(false);
		}
		if(this.handler != null){
			this.handler.gServ.clients.remove(this);
		}
	}
	
	public void setSession(IoSession session) {
		this.session = session;
	}

	public IoSession getSession() {
		return session;
	}

	public void setHandler(GHandler handler) {
		this.handler = handler;
	}

	public GHandler getHandler() {
		return handler;
	}


}