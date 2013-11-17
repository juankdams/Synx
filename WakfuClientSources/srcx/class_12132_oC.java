import java.nio.Buffer;
import java.nio.ByteBuffer;

public final class oC
  implements cCE
{
  private final ByteBuffer aTS;
  private final cgE aTT;
  private final int aw;

  public oC(Buffer paramBuffer, int paramInt1, int paramInt2, cgE paramcgE)
  {
    this.aTS = ((ByteBuffer)paramBuffer);
    this.aw = paramInt2;
    this.aTT = paramcgE;
  }

  public final Buffer getBuffer()
  {
    return this.aTS;
  }

  public final int getId() {
    return this.aw;
  }

  public final void release() {
    if ((!bB) && (this.aTT == null)) throw new AssertionError();
    this.aTT.a(this);
  }
}