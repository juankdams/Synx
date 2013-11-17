import java.nio.ByteBuffer;

public final class bbe extends dzz
{
  private int aGC;
  private int dhG;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.aGC = localByteBuffer.getInt();
    this.dhG = localByteBuffer.getInt();
    return true;
  }

  public int getId() {
    return 15317;
  }

  public int avS() {
    return this.dhG;
  }

  public int CB() {
    return this.aGC;
  }
}