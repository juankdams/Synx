package parsers.wakfu;

import io.netty.buffer.ByteBuf;
import Core.Syn;
import JWakfu.DataUtils;
import JWakfu.RSACertificateManager;
import Login.WakfuLoginClient;
import Plugins.Abstractions.AbstractPacketParser;

public class VersionParser extends AbstractPacketParser<WakfuLoginClient, ByteBuf> {

	String clientVersion = "1.28.2";
	
	@Override
	public boolean parse(WakfuLoginClient c, ByteBuf buffer) {
		int version = buffer.readByte();//"Version"
		short protocolVersion = buffer.readShort();//"Revision");
		int change = buffer.readByte();//"Change");
		String buildVersion = DataUtils.readString(buffer);
		
		StringBuilder sb = new StringBuilder();
		sb.append("Received version packet: ")
		.append(version).append('.')
		.append(protocolVersion).append('.')
		.append(change).append('.')
		.append(buildVersion);
		Syn.d(sb.toString());
		
		//if(){
			
		//}
		
		//c.getChannel().write(new Packet1032RSAKey().encode());
		c.getChannel().write(WakfuPackets.Approach.getRsaKeyPacket());
		return true;
	}

}
