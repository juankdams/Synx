package SM;

import org.apache.mina.core.session.IoSession;

import Core.Syn;


public class Sender {

	
	public static void send(IoSession session, String packet)
	{
		if(session != null && !session.isClosing() && session.isConnected() && !packet.equals("") && !packet.equals(""+(char)0x00))
		{
			session.write(packet);
			Syn.wD("[Send] >> "+packet);
		}else if(session == null){
			Syn.log.error("SM.Sender.send(PW out).out == null");
		}
	}
	
}
