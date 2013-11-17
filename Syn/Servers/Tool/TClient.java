package Tool;

import org.apache.mina.core.session.IoSession;

import Interfaces.IClient;
import Management.Users.User;

public class TClient implements IClient {

	//private THandler handler = null;
	private IoSession session = null;
	private User user = null;
	
	public TClient(IoSession session) {
		this.session = session;
	}

	@Override
	public void kick() {
		// TODO Auto-generated method stub
	}
	@Override
	public void terminate() throws Throwable {
		// TODO Auto-generated method stub
		session = null;
		user = null;
		this.finalize();
	}


	//public void setHandler(THandler handler) {
	//	this.handler = handler;
	//}
	//public THandler getHandler() {
	//	return handler;
	//}
	public IoSession getSession(){
		return session;
	}
	public void setSession(IoSession s){
		this.session = s;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public User getUser() {
		return user;
	}


	
	
}