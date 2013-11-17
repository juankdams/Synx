import java.nio.ByteBuffer;

public class LX extends dzz
{
  private int bYZ;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.bYZ = localByteBuffer.getInt();
    return true;
  }

  public int getId() {
    return 15726;
  }

  public int Wz() {
    return this.bYZ;
  }
}