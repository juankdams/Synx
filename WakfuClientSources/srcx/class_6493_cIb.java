import java.nio.ByteBuffer;

public class cIb extends aRw
{
  private long cfv;
  private String dlS;

  public byte[] encode()
  {
    byte[] arrayOfByte = dzp.qC(this.dlS);
    ByteBuffer localByteBuffer = ByteBuffer.allocate(8 + arrayOfByte.length);
    localByteBuffer.putLong(this.cfv);
    localByteBuffer.put(arrayOfByte);

    return a((byte)3, localByteBuffer.array());
  }

  public int getId()
  {
    return 15981;
  }

  public void bP(long paramLong) {
    this.cfv = paramLong;
  }

  public void eK(String paramString) {
    this.dlS = paramString;
  }
}