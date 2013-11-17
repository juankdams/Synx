package Login;

import io.netty.channel.Channel;
import Interfaces.IWakfuClient;

public class WakfuLoginClient extends LoginClient implements IWakfuClient {

	private Channel channel; 
	
	public WakfuLoginClient(Channel c) {
		this.channel = c;
	}

	@Override
	public void kick() {
		// TODO Auto-generated method stub
		channel.close();
	}

	@Override
	public void terminate() {
		// TODO Auto-generated method stub
	}

	public void setChannel(Channel channel) {
		this.channel = channel;
	}

	public Channel getChannel() {
		return channel;
	}
	

}
