package Game;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;


import org.apache.mina.core.service.IoAcceptor;
import org.apache.mina.filter.codec.ProtocolCodecFilter;
import org.apache.mina.filter.codec.textline.TextLineCodecFactory;
import org.apache.mina.transport.socket.nio.NioSocketAcceptor;

import SQL.SConfig;
import XML.GConfig;

import Handlers.GHandler;
import Misc.LifeRegenerator;
import NewThreads.ThreadsManager;
import ConfigurationObjects.Config;
import Constants.CServers;
import Constants.CWorld;
import Enums.SynActions.SchedulingA;
import GameObjects.GWorld;

public class GServer extends CServers{
	
	private IoAcceptor acceptor = null;	
	private GHandler handler = null;

	public ArrayList<GClient> clients = new ArrayList<GClient>();
	
	public GServer(){
		handler = new GHandler(this);
		start();
	}
	
	
	public void start(){
		this.acceptor = new NioSocketAcceptor(Runtime.getRuntime().availableProcessors());		
		this.acceptor.getSessionConfig().setBothIdleTime(BOTH_IDLE_TIME);		
		this.acceptor.getSessionConfig().setReadBufferSize(READ_BUFFER_SIZE);		
		this.acceptor.getFilterChain().addLast("codec", new ProtocolCodecFilter(new TextLineCodecFactory(				
				CHARSET,				
				ENCODING_DELIMITER,				
				DECODING_DELIMITER		
				)));		
		this.acceptor.setHandler(handler);		
		this.acceptor.setDefaultLocalAddress(new InetSocketAddress(config.getPort()));	
		try {
			this.acceptor.bind();
		} catch (IOException e) {e.printStackTrace();}
		
	}
	
	public void off(){
		for(GClient gc : clients){
			gc.kick();//Kick tout le monde + créé des sheduledTask pour terminate les perso+compte et tout
		}
		this.clients.clear();
		this.acceptor.unbind();//.dispose();//.close();
	}
	
	public void terminate() {
		try {
			this.finalize();
		} catch (Throwable e) {e.printStackTrace();}
	}


}