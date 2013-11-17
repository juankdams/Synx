package WakfuPackets;

import JWakfu.RSACertificateManager;
import io.netty.buffer.ByteBuf;


public class Approach {
	
	static {
		Object o = OutPacketsEnum.packets;
		{//RSA Key Packet
			getRsaKeyPacket().writeLong(OutPacketsEnum.RSA_VERIFICATION_LONG);
			getRsaKeyPacket().writeBytes(RSACertificateManager.INSTANCE.getPublicKey());
		}
		
	}
	
	
	public static ByteBuf getRsaKeyPacket(){
		return OutPacketsEnum.packets.get(OutPacketsEnum.RsaKey);
	}
	
	
	
}
