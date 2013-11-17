import java.nio.ByteBuffer;

public abstract class cDO extends dzz
{
  protected static final int ixq = 8;
  private int gLo;
  private int ixr = -1;

  public abstract int eo();

  public abstract adO bxg();

  protected void aG(ByteBuffer paramByteBuffer)
  {
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