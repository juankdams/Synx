import java.nio.ByteBuffer;

public class EM extends dWi
{
  private long aXW;
  private boolean bKT;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    aY(localByteBuffer);
    this.aXW = localByteBuffer.getLong();
    this.bKT = (localByteBuffer.get() == 1);
    return true;
  }

  public int getId() {
    return 8150;
  }

  public boolean gI()
  {
    return this.bKT;
  }

  public long AD()
  {
    return this.aXW;
  }
}