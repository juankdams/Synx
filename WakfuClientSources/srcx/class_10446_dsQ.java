import java.nio.ByteBuffer;

public abstract class dsQ extends dWi
{
  protected static final int lvg = 12;
  private int gLo;
  private int ixr = -1;

  public abstract int eo();

  public abstract dPD ep();

  protected void aN(ByteBuffer paramByteBuffer)
  {
    aY(paramByteBuffer);
    this.gLo = paramByteBuffer.getInt();
    this.ixr = paramByteBuffer.getInt();
  }

  public int bQX()
  {
    return this.gLo;
  }

  public int czG()
  {
    return this.ixr;
  }
}