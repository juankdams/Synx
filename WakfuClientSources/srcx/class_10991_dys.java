import java.nio.ByteBuffer;

final class dys
{
  private final adT fLp = new adT();

  private dys(bql parambql) {  } 
  public void z() { this.lES.fLp.cUJ = this.fLp.cUJ;
    this.lES.fLp.cUK = this.fLp.cUK;
    this.lES.fLp.aDf = this.fLp.aDf;
    this.lES.fLp.name = this.fLp.name; }

  private boolean f(ByteBuffer paramByteBuffer)
  {
    boolean bool = this.fLp.b(paramByteBuffer, 1);
    if (!bool)
      return false;
    return true;
  }

  public void J() {
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    if (paramInt < 1)
    {
      return false;
    }if (paramInt < 10013) {
      boolean bool = f(paramByteBuffer);
      if (bool) {
        J();
        return true;
      }
      return false;
    }

    return false;
  }
}