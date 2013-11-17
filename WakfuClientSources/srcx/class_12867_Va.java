import java.nio.ByteBuffer;

public class Va extends dzz
{
  private int czq;
  private int czr;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);

    this.czq = localByteBuffer.getInt();
    this.czr = localByteBuffer.getInt();

    return true;
  }

  public int ail() {
    return this.czq;
  }

  public int aim() {
    return this.czr;
  }

  public int getId()
  {
    return 4186;
  }
}