package Proxy;

import java.io.UnsupportedEncodingException;

import org.apache.mina.core.session.IoSession;

import Main.Syn;

public class Sender {

	
	public static void send(IoSession session, String packet)
	{
		if(session != null && !session.isClosing() && !packet.equals("") && !packet.equals(""+(char)0x00))
		{
			try {
				packet = new String(packet.getBytes("UTF8"));
			} catch (UnsupportedEncodingException e) {e.printStackTrace();}
			session.write(packet);
			Syn.wD("[Send] >> "+packet);
		}else if(session == null){
			Syn.d("SM.Sender.send(PW out).out == null");
		}
	}
	
}
