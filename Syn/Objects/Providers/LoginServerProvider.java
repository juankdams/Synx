package Providers;

import Interfaces.IProvider;
import Login.DofusLoginServer;
import Login.LoginServer;
import Login.WakfuLoginServer;

public interface LoginServerProvider extends IProvider {
	
	public LoginServer createNew(short ID, String dbHostIP, String dbName, String dbUser, String dbPass, String ownerss);
	
	public static class DofusLServerProvider implements LoginServerProvider {
		public LoginServer createNew(short ID, String dbHostIP, String dbName, String dbUser, String dbPass, String ownerss) {
			return new DofusLoginServer(ID, dbHostIP, dbName, dbUser, dbPass, ownerss);
		}
	}
	public static class WakfuLServerProvider implements LoginServerProvider {
		public LoginServer createNew(short ID, String dbHostIP, String dbName, String dbUser, String dbPass, String ownerss) {
			return new WakfuLoginServer(ID, dbHostIP, dbName, dbUser, dbPass, ownerss);
		}
	}

}
