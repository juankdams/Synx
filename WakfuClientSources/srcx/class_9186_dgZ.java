import java.nio.ByteBuffer;

public class dgZ extends dzz
{
  private long iI;
  private int aRQ;
  private boolean lch;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);

    this.iI = localByteBuffer.getLong();
    this.aRQ = localByteBuffer.getInt();
    this.lch = (localByteBuffer.get() == 1);

    return true;
  }

  public int getId()
  {
    return 4526;
  }

  public long eq() {
    return this.iI;
  }

  public int eo() {
    return this.aRQ;
  }

  public boolean cPX() {
    return this.lch;
  }
}