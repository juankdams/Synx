import java.nio.ByteBuffer;

public class cFi extends dzz
{
  private long iI;
  private byte[] izh;

  public long eq()
  {
    return this.iI;
  }

  public byte[] cAG() {
    return this.izh;
  }

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);

    this.iI = localByteBuffer.getLong();

    this.izh = new byte[localByteBuffer.getShort()];
    localByteBuffer.get(this.izh);

    return true;
  }

  public int getId() {
    return 4130;
  }
}