
importClass(Packages.java.lang.System);
importClass(Packages.Interfaces.IWakfuClient);
importClass(Packages.io.netty.buffer.ByteBuf);
importClass(Packages.WakfuPackets.Approach);

function parse(array, strings, a3){
	//System.out.println("a testing "+array+" . "+a2+" . "+a3);   			  //a testing [Ljava.lang.Object;@9d532ae . [Ljava.lang.String;@1a9db992 . undefined
	//System.out.println("b testing "+array[0]+" . "+array[1]+" . "+a2[0]);   //b testing [Ljava.lang.Object;@bf2428d . undefined . 
	//System.out.println("c testing "+array[0][0]+" . "+array[0][1]);		  //c testing PooledUnsafeDirectByteBuf(freed) . Login.WakfuLoginClient@5ffbc355
	
	var msg = array[0][0];
	var sess = array[0][1];
	
	var size = msg.readUnsignedShort();  // 2 bytes / 16 bits
	//var type = msg.readByte();			 // 1 byte  / 8  bits
	//var opcode = msg.readUnsignedShort();// 2 bytes / 16 bits
	
	/*if(opcode == 7){
		int version = msg.readByte();
		short subversion = msg.readShort();
		int revision = msg.readByte();
		
		System.out.println("Received version : "+version+"."+subversion+"."+revision);
		//sess.getChannel().write(WakfuPackets.Approach.getRsaKeyPacket());
	}
	*/
	
	System.out.println("done testing x "+size);
}


/*
function parse(msg, sess){
	System.out.println("chiz");
	
	int size = msg.readUnsignedShort();  // 2 bytes / 16 bits
	byte type = msg.readByte();			 // 1 byte  / 8  bits
	int opcode = msg.readUnsignedShort();// 2 bytes / 16 bits
	
	if(opcode == 7){
		parseVersion(msg, sess);
	}
	System.out.println("testing right");
}

function parseVersion(msg, sess){
	int version = msg.readByte();
	short subversion = msg.readShort();
	int revision = msg.readByte();
	
	System.out.println("Received version : "+version+"."+subversion+"."+revision);
	sess.getChannel().write(WakfuPackets.Approach.getRsaKeyPacket());
}

*/