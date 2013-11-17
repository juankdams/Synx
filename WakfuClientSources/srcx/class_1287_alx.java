import java.nio.ByteBuffer;

public class alx extends dWi
{
  private long aXW;
  private boolean dml;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    aY(localByteBuffer);
    this.aXW = localByteBuffer.getLong();
    this.dml = (localByteBuffer.get() == 1);
    return true;
  }

  public int getId() {
    return 8154;
  }

  public boolean ayg()
  {
    return this.dml;
  }

  public long AD()
  {
    return this.aXW;
  }
}