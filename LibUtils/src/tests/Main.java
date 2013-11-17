package tests;

import tests.Handlers.WakfuHandler;
import Servers.NettyServer;

public class Main {

	public static NettyServer s = new NettyServer();
	
	public static void main(String[] args){
		//s.setEncoder(new WakfuEncoder());
		s.setHandler(new WakfuHandler());
		s.on();
		Misc.Utils.w("on");
	}

}
