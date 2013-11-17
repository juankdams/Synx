package Login;

import Handlers.LHandler;
import Interfaces.IClient;
import LoginObjects.LAccount;

public abstract class LoginClient implements IClient {

	protected LAccount account = null;
	protected LHandler handler = null;

	public void setAccount(LAccount account) {
		this.account = account;
	}

	public LAccount getAccount() {
		return account;
	}

	public LHandler getHandler() {		
		return handler;	
	}
	
	public void setHandler(LHandler handler) {
		this.handler = handler;
	}

	
}
