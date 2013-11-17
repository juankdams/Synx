import java.nio.ByteBuffer;

public class AP extends dzz
{
  private int aNN;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.aNN = localByteBuffer.getInt();
    return true;
  }

  public int getId() {
    return 11210;
  }

  public int se()
  {
    return this.aNN;
  }
}