import java.nio.ByteBuffer;

public class cKt extends aRw
{
  private long iI;
  private String bSn;

  public byte[] encode()
  {
    byte[] arrayOfByte = dzp.qC(this.bSn);

    ByteBuffer localByteBuffer = ByteBuffer.allocate(10 + arrayOfByte.length);

    localByteBuffer.putLong(this.iI);
    localByteBuffer.putShort((short)(arrayOfByte.length & 0xFF));
    localByteBuffer.put(arrayOfByte);

    return a((byte)2, localByteBuffer.array());
  }

  public int getId()
  {
    return 2071;
  }

  public void g(long paramLong) {
    this.iI = paramLong;
  }

  public void cf(String paramString) {
    this.bSn = paramString;
  }
}