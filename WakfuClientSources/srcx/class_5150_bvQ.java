import java.nio.ByteBuffer;

public class bvQ extends dzz
{
  private int ggd;

  public int bDx()
  {
    return this.ggd;
  }

  public boolean a(byte[] paramArrayOfByte) {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.ggd = localByteBuffer.getInt();
    return true;
  }

  public int getId() {
    return 5240;
  }
}