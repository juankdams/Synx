import java.nio.Buffer;
import java.nio.ShortBuffer;

public final class ayd
  implements cCE
{
  private final ShortBuffer dNK;
  private final cgE aTT;
  private final int aw;

  public ayd(Buffer paramBuffer, int paramInt1, int paramInt2, cgE paramcgE)
  {
    this.dNK = ((ShortBuffer)paramBuffer);
    this.aw = paramInt2;
    this.aTT = paramcgE;
  }

  public final Buffer getBuffer()
  {
    return this.dNK;
  }

  public final int getId() {
    return this.aw;
  }

  public final void release() {
    if ((!bB) && (this.aTT == null)) throw new AssertionError();
    this.aTT.a(this);
  }
}