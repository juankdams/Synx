import java.nio.Buffer;

public final class Jh
  implements cCE
{
  private final Buffer bSW;
  private final cgE aTT;
  private final int aw;

  public Jh(Buffer paramBuffer, int paramInt1, int paramInt2, cgE paramcgE)
  {
    this.bSW = paramBuffer;
    this.aw = paramInt2;
    this.aTT = paramcgE;
  }

  public final Buffer getBuffer()
  {
    return this.bSW;
  }

  public final int getId() {
    return this.aw;
  }

  public final void release() {
    if ((!bB) && (this.aTT == null)) throw new AssertionError();
    this.aTT.a(this);
  }
}