package Handlers;

import org.apache.mina.core.service.IoHandlerAdapter;
import org.apache.mina.core.session.IdleStatus;
import org.apache.mina.core.session.IoSession;


public abstract class MinaHandler extends IoHandlerAdapter {
	
	
	public Object parse(IoSession session, String packet){
		return packet;
	}
	public Object send(IoSession session, String packet){
		return packet;
	}
	
	public abstract void exceptionCaught(IoSession arg0, Throwable arg1) throws Exception;

	public abstract void messageReceived(IoSession arg0, Object arg1) throws Exception;

	public abstract void sessionClosed(IoSession arg0) throws Exception;

	public abstract void sessionIdle(IoSession arg0, IdleStatus arg1) throws Exception ;

	public abstract void sessionOpened(IoSession arg0) throws Exception;

	public void messageSent(IoSession arg0, Object arg1) throws Exception { }
	public void sessionCreated(IoSession arg0) throws Exception { }

}
