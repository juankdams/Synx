package Servers;

import java.io.IOException;
import java.net.BindException;
import java.net.InetSocketAddress;
import java.nio.charset.Charset;

import org.apache.mina.core.service.IoAcceptor;
import org.apache.mina.core.session.IoSession;
import org.apache.mina.filter.codec.ProtocolCodecFilter;
import org.apache.mina.filter.codec.textline.TextLineCodecFactory;
import org.apache.mina.transport.socket.SocketSessionConfig;
import org.apache.mina.transport.socket.nio.NioSocketAcceptor;

import Handlers.MinaHandler;


public class MinaServer implements Server {

	public static final int BOTH_IDLE_TIME = 300;	// en secondes
	public static final int READ_BUFFER_SIZE = 9000;//512;	
	public static final Charset CHARSET = Charset.forName("UTF-8");	
	public static final String ENCODING_DELIMITER = String.valueOf((char)0);	
	public static final String DECODING_DELIMITER = "\n" + ENCODING_DELIMITER;
	
	
	private IoAcceptor acceptor = null;
	private MinaHandler handler = null;
	protected short port = 667;
	
	public MinaServer(){
		this.acceptor = new NioSocketAcceptor(Runtime.getRuntime().availableProcessors());		
		this.acceptor.getSessionConfig().setBothIdleTime(BOTH_IDLE_TIME);		
		this.acceptor.getSessionConfig().setReadBufferSize(READ_BUFFER_SIZE);		
		this.acceptor.getFilterChain().addLast("codec", new ProtocolCodecFilter(new TextLineCodecFactory(				
				CHARSET,				
				ENCODING_DELIMITER,				
				DECODING_DELIMITER		
				)));		
	}
	
	@Override
	public void start(){
		this.acceptor.setHandler(handler);
		this.acceptor.setDefaultLocalAddress(new InetSocketAddress( getPort() ));	
		SocketSessionConfig dsc =  (SocketSessionConfig) acceptor.getSessionConfig();
		dsc.setReuseAddress(true);
		try {
			
			this.acceptor.bind();
			
		} catch(BindException be) {
			Misc.Utils.w("BindException sur le binding d'un serveur au port : "+getPort()); 
			be.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void stop() {
		for(IoSession sess : acceptor.getManagedSessions().values())
	    {
			if(sess.isConnected() && sess.isClosing() == false){
				Misc.Utils.wD("MinaServer ("+getPort()+") session "+sess.getId()+" closed");
		        sess.close(true); // Make this true if you want to force the closure
			}else{
				String reason = "";
				if(sess.isClosing()){
					reason += " [sess.isClosing()] ";
				}
				if(sess.isConnected() == false){
					reason += " [sess.isConnected() == false] ";
				}
		        sess.close(false); // Make this true if you want to force the closure
				Misc.Utils.wD("MinaServer ("+getPort()+") session "+sess.getId()+" cant be closed (isConnected == false || isClosing).  reason : "+reason);
			}
	    }
		System.out.println("stop "+port);
		this.acceptor.unbind();
		System.out.println("unbind "+port);
		this.acceptor.dispose(true);
		System.out.println("dispose "+port);
	}

	@Override
	public void restart() {
		if(acceptor.isDisposed() == false){
			stop();
		}
		//au cas ou le port choisi en config aurait été changé
		this.acceptor.setDefaultLocalAddress(new InetSocketAddress( getPort() ));
		try {
			this.acceptor.bind();
		} catch (IOException e) {e.printStackTrace();}
	}
	

	//public abstract short getPort(); //{ return 0; }
	//public abstract void setPort(short port); //{}
	
	public void setHandler(MinaHandler h){
		this.handler = h;
	}
	

	@Override
	public void on() {
		start();
	}

	@Override
	public void off(boolean terminate) {
		stop();
		if(terminate){
			terminate();
		}
	}


	@Override
	public void terminate(){
		acceptor = null;
		handler = null;
		try {
			this.finalize();
		} catch (Throwable e) { e.printStackTrace(); }
	}

	@Override
	public short getPort() {
		return port;
	}

	@Override
	public void setPort(short port) {
		this.port = port;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
