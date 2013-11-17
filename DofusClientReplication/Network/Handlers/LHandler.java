package Handlers;

import org.apache.mina.core.session.IdleStatus;
import org.apache.mina.core.session.IoSession;

import Core.Dofus;
import Core.Exceptions;
import Login.LClient;
import Managers.ParsingManager;

public class LHandler extends MinaHandler {
	

	@Override
	public void sessionOpened(IoSession session) throws Exception {
		// TODO Auto-generated method stub
		LClient c = Dofus.loginClients.get((int) session.getId()-1);
		Dofus.w("Session opened.  session.id = "+session.getId()+",  " +
				"Client.session.id = "+(c==null?"null":(c.getSession()==null?"null_session":c.getSession().getId())));
	}

	@Override
	public void messageReceived(IoSession session, Object mess) throws Exception {
		// TODO Auto-generated method stub  
		//todo : parsing
		Dofus.w("L "+session.getId()+" Recv << "+mess);
		if (!(mess instanceof String)) {
			Exceptions.throwException("LHandler.[RECV] : le message recu n'est pas une string.");
			return;
		}
		LClient c = ((LClient)session.getAttribute("client"));

		String packet = mess.toString();
		
		boolean nobug =  ParsingManager.parse(c, packet);
		//Dofus.d("nobug ="+nobug+".");
		//if(!nobug){
		//	packetCantParse(c, packet, "Raison inconnue, soit parseur non-créé soit erreur dans un des parseurs.");
		//}
	}

	/**
	 * XXX [À achever!] GGameHandler.packetCantParse(GClient c)   -> que faire si le packet à pârser n'existe pas.
	 * @param c
	 */
	public static void packetCantParse(LClient c, String packet, String additionnalInfo){
		if(c != null && c.getSession().isConnected()){
			c.kick();
			Exceptions.throwException("THandler.packetCantParse : "+packet+". "+additionnalInfo);
		}
	}
	


	@Override
	public void exceptionCaught(IoSession session, Throwable arg1) throws Exception {
		if(session.getAttribute("client") != null){
			((LClient)session.getAttribute("client")).kick();
		}
		Dofus.w("L exceptionCaught kicked LClient ("+session.getId()+") : ");
		arg1.printStackTrace();
	}
	@Override
	public void sessionClosed(IoSession session) throws Exception {
		if(session.getAttribute("client") != null){
			((LClient)session.getAttribute("client")).kick();
		}
		Dofus.w("LHandler LClient session closed ("+session.getId()+") : ");
	}

	@Override
	public void sessionIdle(IoSession session, IdleStatus arg1) throws Exception {
		if(session.getAttribute("client") != null){
			((LClient)session.getAttribute("client")).kick();
		}
		Dofus.w("LHandler LClient session idle ("+session.getId()+") : ");
	}

	
	
	
	
	
	

}
