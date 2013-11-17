import java.nio.ByteBuffer;

public class ber extends aRw
{
  public static final byte fro = 0;
  public static final byte frp = 1;
  public boolean bqF = true;
  private byte dJU;
  private long Tj;
  private String frq;
  private long frr;

  public byte[] encode()
  {
    ByteBuffer localByteBuffer;
    if (this.frq != null) {
      byte[] arrayOfByte = dzp.qC(this.frq);
      localByteBuffer = ByteBuffer.allocate(3 + arrayOfByte.length + 8);
      localByteBuffer.put(this.dJU);
      localByteBuffer.put((byte)0);
      localByteBuffer.put((byte)arrayOfByte.length);
      localByteBuffer.put(arrayOfByte);
      localByteBuffer.putLong(this.Tj);
    } else {
      localByteBuffer = ByteBuffer.allocate(18);
      localByteBuffer.put(this.dJU);
      localByteBuffer.put((byte)1);
      localByteBuffer.putLong(this.frr);
      localByteBuffer.putLong(this.Tj);
    }

    if (this.bqF)
      return a((byte)6, localByteBuffer.array());
    return a((byte)2, localByteBuffer.array());
  }

  public int getId() {
    return 501;
  }

  public void cF(byte paramByte) {
    this.dJU = paramByte;
  }

  public void jdMethod_if(String paramString) {
    this.frq = paramString;
    this.frr = -1L;
  }

  public void fr(long paramLong) {
    this.frr = paramLong;
    this.frq = null;
  }

  public void al(boolean paramBoolean) {
    this.bqF = paramBoolean;
  }

  public void aS(long paramLong) {
    this.Tj = paramLong;
  }
}