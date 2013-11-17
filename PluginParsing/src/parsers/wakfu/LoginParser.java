package parsers.wakfu;

import io.netty.buffer.ByteBuf;

import java.io.File;

import Core.Syn;
import JWakfu.DataUtils;
import JWakfu.RSACertificateManager;
import Login.WakfuLoginClient;
import Plugins.Abstractions.AbstractPacketParser;

public class LoginParser extends AbstractPacketParser<WakfuLoginClient, ByteBuf> {

	
	@Override
	public boolean parse(WakfuLoginClient c, ByteBuf buffer) {
		byte[] b = new byte[buffer.readableBytes()];
		buffer.readBytes(b);

		byte[] decoded = RSACertificateManager.INSTANCE.decode(b);
		ByteBuf decbuffer = DataUtils.bufferFromBytes(decoded);

		long rsaVerification = decbuffer.readLong();
		String username = DataUtils.readString(decbuffer);
		String password = DataUtils.readString(decbuffer);

		Syn.d("Login packet: " + username + ", " + password);
		

	/*	if (rsaVerification != Packet1032RSAKey.RSA_VERIFICATION_LONG) {
			Syn.d("Error decoding RSA data: invalid verification long!");
			return false;
		}

		if (!userExists(username)) {
			c.getChannel().write(new Packet1024LoginResponse(LoginResponseCode.INVALID_LOGIN));
			//session.write(new Packet1024LoginResponse(LoginResponseCode.INVALID_LOGIN));
		} else {
			LAccount player = SQL.Accounts.load(c.getHandler().serv, username);
			if (player.getPassword().equals(password)) {
				c.getChannel().write(new Packet1024LoginResponse(player.getUsername(), 33965798L, 0L, false));
				c.getChannel().write(new Packet1200ListWorlds());
				//session.write(new Packet1024LoginResponse(player.getName(), 33965798L, 0L, false)).write(new Packet1200ListWorlds());
				c.setAccount(player);
				//c.setPlayer(player);
			} else {
				c.getChannel().write(new Packet1024LoginResponse(LoginResponseCode.INVALID_LOGIN));
				//session.write(new Packet1024LoginResponse(LoginResponseCode.INVALID_LOGIN));
			}
			//player.save(); dafuq ? pas besoin de save ça ._.
		}*/
		return true;
	}
	

	private boolean userExists(String user) {
		return new File("data/chars/"+user+".xml").exists();
	}
	

}
