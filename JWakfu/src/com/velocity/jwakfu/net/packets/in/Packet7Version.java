package com.velocity.jwakfu.net.packets.in;

import io.netty.buffer.ByteBuf;

import org.slf4j.Logger;

import com.velocity.jwakfu.net.packets.IncomingPacket;
import com.velocity.jwakfu.net.packets.out.Packet1032RSAKey;
import com.velocity.jwakfu.session.ClientSession;
import com.velocity.jwakfu.util.DataUtils;
import com.velocity.jwakfu.util.LoggingUtil;

public class Packet7Version implements IncomingPacket {
	
	private static final Logger logger = LoggingUtil.log();
	private static final String REQUIRED_BUILD_VERSION = "90414";

	@Override
	public void decode(ClientSession session, ByteBuf buffer, int size) {
		//buffer.readByte(); //Always 1
		//int protocolVersion = buffer.readShort();
		//String buildVersion = DataUtils.readString(buffer);
		

		int version = buffer.readByte();//"Version"
		short protocolVersion = buffer.readShort();//"Revision");
		int change = buffer.readByte();//"Change");
		//String build = buffer.readBytes(1);//.readString();//"Build");
		String buildVersion = DataUtils.readString(buffer);
		
		StringBuilder sb = new StringBuilder();
		sb.append("Received version packet: ")
		.append(version).append('.')
		.append(protocolVersion).append('.')
		.append(change).append('.')
		.append(buildVersion);
		
		logger.info(sb.toString());
		//logger.info("Received version packet: {proto="+protocolVersion+", buildVersion="+buildVersion+"}");
		session.write(new Packet1032RSAKey());
	}

}
