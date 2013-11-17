package Tool;

import Handlers.THandler;
import Interfaces.IService;
import Servers.MinaServer;

public class TServer extends MinaServer implements IService {

	private short ID = 0;
	private byte state = 0;
	
	@Override
	public void boot() throws Exception {
		this.setHandler(new THandler(this));
	}

	@Override
	public void reboot() throws Exception {
		save();
		off(false);
		super.restart();
	}

	public void on(){
		super.start();
	}
	
	public void off(boolean terminate) {
		super.stop();
		if(terminate){
			terminate();
		}
	}

	public void save() {
		// TODO Auto-generated method stub
	}

	@Override
	public void terminate() {
		super.terminate();
	}
	


	public void setID(short iD) {
		ID = iD;
	}
	public short getID() {
		return ID;
	}
	public byte getState(){
		return state;
	}
	public void setState(byte state){
		this.state = state;
	}

	
	
	
}
