import java.nio.ByteBuffer;

final class y
{
  private dKF aE = null;

  private y(chg paramchg) {  } 
  public void z() { this.aF.aE = this.aE; }

  private boolean e(ByteBuffer paramByteBuffer)
  {
    return true;
  }

  private boolean f(ByteBuffer paramByteBuffer) {
    int i = paramByteBuffer.get() == 1 ? 1 : 0;
    if (i != 0) {
      this.aE = new dKF();
      boolean bool = this.aE.b(paramByteBuffer, 1);
      if (!bool)
        return false;
    } else {
      this.aE = null;
    }
    return true;
  }

  public void A() {
  }

  public void J() {
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    if (paramInt < 0)
    {
      return false;
    }
    boolean bool;
    if (paramInt < 1) {
      bool = e(paramByteBuffer);
      if (bool) {
        A();
        J();
        return true;
      }
      return false;
    }
    if (paramInt < 10013) {
      bool = f(paramByteBuffer);
      if (bool) {
        J();
        return true;
      }
      return false;
    }

    return false;
  }
}