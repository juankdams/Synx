import java.nio.ByteBuffer;

public class oJ extends dzz
{
  private long RY;
  private int RZ;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);

    this.RY = localByteBuffer.getLong();
    this.RZ = localByteBuffer.getInt();

    return true;
  }

  public long gv() {
    return this.RY;
  }

  public int gw() {
    return this.RZ;
  }

  public int getId()
  {
    return 5524;
  }
}