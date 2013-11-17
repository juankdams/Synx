package WakfuPackets;

import java.util.HashMap;
import java.util.Map;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

enum OutPacketsEnum {
	
	
	
	RsaKey(1032),
	
	;
	
	private int id = 0;
	private OutPacketsEnum(int id){
		this.id = id;
		//set();
	}
	//private void set(){
	//	packets.put(this, Unpooled.buffer());
	//	packets.get(this).writeShort(0); //Size placeholder
	//	packets.get(this).writeShort(this.get());
	//}
	public int get(){
		return id;
	}
	
	
	static Map<OutPacketsEnum, ByteBuf> packets = new HashMap<OutPacketsEnum, ByteBuf>();
	static final long RSA_VERIFICATION_LONG = 0x8000000000000000L;

	static {
		for(OutPacketsEnum o : OutPacketsEnum.values()){
			packets.put(o, Unpooled.buffer());
			packets.get(o).writeShort(0); //Size placeholder
			packets.get(o).writeShort(o.get());
		}
	}
	
	
}