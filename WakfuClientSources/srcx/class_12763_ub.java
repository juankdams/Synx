import java.nio.ByteBuffer;

public final class ub extends dzz
{
  private int aGC;
  private boolean Ur;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.aGC = localByteBuffer.getInt();
    this.Ur = (localByteBuffer.get() == 0);
    return true;
  }

  public int getId() {
    return 9303;
  }

  public int CB() {
    return this.aGC;
  }

  public boolean CC() {
    return this.Ur;
  }
}