package WakfuPackets;

import io.netty.buffer.ByteBuf;

import com.velocity.jwakfu.crypto.RSACertificateManager;

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
