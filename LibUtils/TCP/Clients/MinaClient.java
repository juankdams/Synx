package Clients;

import java.net.InetSocketAddress;
import java.nio.charset.Charset;

import org.apache.mina.core.future.ConnectFuture;
import org.apache.mina.core.session.IoSession;
import org.apache.mina.filter.codec.ProtocolCodecFilter;
import org.apache.mina.filter.codec.textline.TextLineCodecFactory;
import org.apache.mina.transport.socket.nio.NioSocketConnector;

import Handlers.MinaHandler;

public abstract class MinaClient implements Client {


	public static final int BOTH_IDLE_TIME = 300;	// en secondes = 5min
	public static final int READ_BUFFER_SIZE = 9000;//512;	
	public static final Charset CHARSET = Charset.forName("UTF-8");	
	public static final String ENCODING_DELIMITER = String.valueOf((char)0);	
	public static final String DECODING_DELIMITER = "\n" + ENCODING_DELIMITER;
	
	
	private NioSocketConnector connector = null;
	private MinaHandler handler = null;
	private IoSession session = null;
	
	protected MinaClient(){

	}
	
	@Override
	public void start(){
	    connector = new NioSocketConnector();
	    connector.setConnectTimeoutMillis(BOTH_IDLE_TIME*1000);
	    connector.setHandler(handler);
	    connector.getFilterChain().addLast("codec", new ProtocolCodecFilter(new TextLineCodecFactory(				
				CHARSET,				
				ENCODING_DELIMITER,				
				DECODING_DELIMITER		
				)));
	    ConnectFuture future = connector.connect(new InetSocketAddress(getHostIP(), getHostPort()));
        future.awaitUninterruptibly();
        session = future.getSession();
	}

	public void setHandler(MinaHandler handler) {
		this.handler = handler;
	}
	public MinaHandler getHandler() {
		return handler;
	}

	@Override
	public void stop() {
		if(connector != null){
		    connector.dispose();
		}
		if(session != null){
		    session.close(true);
		    session.getCloseFuture().awaitUninterruptibly();
		}
	}

	@Override
	public void restart() {
		// TODO Auto-generated method stub
		stop();
	    ConnectFuture future = connector.connect(new InetSocketAddress(getHostIP(), getHostPort()));
        future.awaitUninterruptibly();
        session = future.getSession();
	}
	
	@Override
	public void terminate() {
		if(connector != null && connector.isDisposed() == false){
			stop();
		}
		connector = null;
		handler = null;
		session = null;
		try {
			this.finalize();
		} catch (Throwable e) { e.printStackTrace(); }
	}


	public IoSession getSession(){
		return session;
	}
	
	public abstract short getHostPort();
	public abstract void setHostPort(short port);
	public abstract String getHostIP();
	public abstract void setHostIP(String ip);
	
	
}
