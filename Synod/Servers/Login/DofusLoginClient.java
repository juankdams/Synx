package Login;

import org.apache.mina.core.session.IoSession;
import XML.AccountsConfig;
import Handlers.LHandler;


public class DofusLoginClient extends LoginClient {

	private IoSession session = null;
	private String hashKey = null;
	
	public DofusLoginClient(IoSession session){
		this.session = session;
	}
	

	public IoSession getSession() {
		return session;
	}
	
	/**
	 * Kick le client, 
	 * enleve les références, et set tout à null avant de finalizer.
	 */
	public void kick() {	
		try {
			//if(handler != null){
			//	handler.serv.clients.remove(this);
			//}
			if(account != null){
				handler.serv.world.removeAccount(account.getID());
				if(AccountsConfig.accounts.contains(account)){
					AccountsConfig.accounts.remove(account);
				}
			}
			if(session != null){
				this.session.close(true);
			}
			this.account = null;
			this.session = null;
			this.handler = null;
			this.hashKey = null;
			this.finalize();
		} catch (Throwable e) {e.printStackTrace();}
	}	
	/**
	 * Kick comme normal, 
	 * sauf pour le compte qui est pas retiré de la liste de co ni setté à null
	 * <p>Parce que le compte est déjà connecté par quelqu'un d'autre, et ca le ferait buger.
	 * <p> Cette methode est pour kicker qqn qui essaie de se co sur un compte déjà co en fait.
	 *<p>Wo = Without
	 */
	public void kickWoAccount(){
		try {
			handler.serv.clients.remove(this);
			if(session != null){
				this.session.close(true);
			}
			this.session = null;
			this.handler = null;
			this.hashKey = null;
			this.finalize();
		} catch (Throwable e) {e.printStackTrace();}
	}
	/**
	 * this.finalize();
	 */
	public void terminate(){
		try {
			this.finalize();
		} catch (Throwable e) {e.printStackTrace();}
	}
	

	public void setHashKey(String hashKey) {
		this.hashKey = hashKey;
	}

	public String getHashKey() {
		return hashKey;
	}

	
}