import java.nio.ByteBuffer;

public final class akC extends dzz
{
  private boolean dlv;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.dlv = (localByteBuffer.get() == 1);
    return true;
  }

  public boolean axB() {
    return this.dlv;
  }

  public int getId()
  {
    return 2076;
  }
}