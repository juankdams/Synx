package Login;

import Clients.MinaClient;
import Core.Config;

public class LClient extends MinaClient {

	private int ID = 0;
	
	public LClient(int id){
		ID = id;
	}
	
	
	@Override
	public void on() {
		super.start();
	}

	@Override
	public void off(boolean terminate) {
		super.stop();
		super.terminate();
	}

	@Override
	public short getHostPort() {
		return Config.loginServerPort;
	}

	@Override
	public void setHostPort(short port) {
		Config.loginServerPort = port;
	}

	@Override
	public String getHostIP() {
		return Config.loginServerIP;
	}

	@Override
	public void setHostIP(String ip) {
		Config.loginServerIP = ip;
	}

	
	public void kick(){
		super.getSession().close(true);
		
	}


	public void setID(int iD) {
		ID = iD;
	}


	public int getID() {
		return ID;
	}
	
	
	
	
	
}
