import java.nio.ByteBuffer;

public abstract class dWi extends dzz
{
  protected static final int mvs = 4;
  private int bdj = -1;

  protected void aY(ByteBuffer paramByteBuffer)
  {
    this.bdj = paramByteBuffer.getInt();
  }

  public int a()
  {
    return this.bdj;
  }
}