import java.nio.ByteBuffer;

public abstract class bJO extends dzz
{
  private int gLC;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    aB(localByteBuffer);
    return true;
  }

  public int getId()
  {
    return 103;
  }

  protected void aB(ByteBuffer paramByteBuffer)
  {
    this.gLC = paramByteBuffer.getInt();
  }

  public int bRq()
  {
    return this.gLC;
  }
}