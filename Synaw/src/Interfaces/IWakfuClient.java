package Interfaces;

import io.netty.channel.Channel;

public interface IWakfuClient extends IClient {
	
	public Channel getChannel();

}
