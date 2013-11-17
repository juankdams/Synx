import java.nio.ByteBuffer;

final class buQ
{
  private alN gey = null;

  private buQ(cqg paramcqg) {  } 
  public void z() { this.aPl.gey = this.gey; }

  private boolean e(ByteBuffer paramByteBuffer)
  {
    return true;
  }

  private boolean f(ByteBuffer paramByteBuffer) {
    int i = paramByteBuffer.get() == 1 ? 1 : 0;
    if (i != 0) {
      this.gey = new alN();
      boolean bool = this.gey.b(paramByteBuffer, 1);
      if (!bool)
        return false;
    } else {
      this.gey = null;
    }
    return true;
  }

  public void A() {
  }

  public void bgg() {
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
        bgg();
        return true;
      }
      return false;
    }
    if (paramInt < 10027003) {
      bool = f(paramByteBuffer);
      if (bool) {
        bgg();
        return true;
      }
      return false;
    }

    return false;
  }
}