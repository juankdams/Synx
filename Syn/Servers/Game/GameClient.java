package Game;

import Interfaces.IClient;
import LoginObjects.LAccount;

public abstract class GameClient implements IClient {
	

	protected LAccount account = null;

	public LAccount getAccount() {
		return account;
	}
	
	
}