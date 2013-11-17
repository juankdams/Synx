import java.nio.ByteBuffer;

public final class aGN extends aRw
{
  private final long brC;
  private final byte eea;
  private final short eeb;
  private final int eec;
  private final byte eed;

  public aGN(long paramLong, byte paramByte1, short paramShort, int paramInt, byte paramByte2)
  {
    this.brC = paramLong;
    this.eea = paramByte1;
    this.eeb = paramShort;
    this.eec = paramInt;
    this.eed = paramByte2;
  }

  public byte[] encode() {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(16);

    localByteBuffer.putLong(this.brC);
    localByteBuffer.put(this.eea);
    localByteBuffer.putShort(this.eeb);
    localByteBuffer.putInt(this.eec);
    localByteBuffer.put(this.eed);

    return a((byte)3, localByteBuffer.array());
  }

  public int getId() {
    return 15261;
  }
}