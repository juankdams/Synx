import java.nio.ByteBuffer;

public class yr extends dzz
{
  private boolean brV;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.brV = (localByteBuffer.get() == 1);
    return true;
  }

  public boolean Hm() {
    return this.brV;
  }

  public int getId()
  {
    return 13004;
  }
}