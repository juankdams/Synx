package Senders;

import org.apache.mina.core.session.IoSession;
import Core.Syn;
import org.fusesource.jansi.Ansi;

public class Sender {

	
	public static void send(IoSession session, String packet)
	{
		if(session != null && !session.isClosing() && session.isConnected() && !packet.equals("") && !packet.equals(""+(char)0x00))
		{
			//try {
			//	packet = new String(packet.getBytes("UTF8"));
			//} catch (UnsupportedEncodingException e) {e.printStackTrace();}
			session.write(packet);
			Syn.wD("[Send] >> "+packet, Ansi.Color.CYAN);
			//Syn.wD("[Send] >> "+packet);
		}else if(session == null){
			//Syn.d("SM.Sender.send(PW out).out == null", Ansi.Color.RED);
			Syn.log.error("SM.Sender.send(PW out).out == null");
		}
	}
	
}
