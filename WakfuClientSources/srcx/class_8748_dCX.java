import java.nio.ByteBuffer;

public final class dCX extends dWi
{
  private long aXW;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    aY(localByteBuffer);
    this.aXW = localByteBuffer.getLong();
    return true;
  }

  public long AD() {
    return this.aXW;
  }

  public int getId() {
    return 8310;
  }
}