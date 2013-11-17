import java.nio.ByteBuffer;

public final class aqY extends dzz
{
  private int dyI;
  private boolean Ur;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.dyI = localByteBuffer.getInt();
    this.Ur = (localByteBuffer.get() == 0);
    return true;
  }

  public int getId() {
    return 9301;
  }

  public int aDi() {
    return this.dyI;
  }

  public boolean CC() {
    return this.Ur;
  }
}