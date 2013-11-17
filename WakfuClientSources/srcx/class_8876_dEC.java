import java.nio.ByteBuffer;

public class dEC extends aRw
{
  private final long giP;
  private final int buQ;
  private final byte frt;
  private final il iBF = new il();

  public dEC(long paramLong, int paramInt, byte paramByte) {
    this.giP = paramLong;
    this.buQ = paramInt;
    this.frt = paramByte;
  }

  public void I(int paramInt, short paramShort) {
    this.iBF.a(paramInt, paramShort);
  }

  public byte[] encode()
  {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(13 + this.iBF.size() * 6);

    localByteBuffer.putLong(this.giP);
    localByteBuffer.putInt(this.buQ);
    localByteBuffer.put(this.frt);
    for (BZ localBZ = this.iBF.qd(); localBZ.hasNext(); ) {
      localBZ.fl();
      localByteBuffer.putInt(localBZ.zY());
      localByteBuffer.putShort(localBZ.Lb());
    }

    return a((byte)3, localByteBuffer.array());
  }

  public int getId() {
    return 15713;
  }
}