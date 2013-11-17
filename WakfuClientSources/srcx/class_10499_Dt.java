import java.nio.ByteBuffer;

final class Dt
{
  private czX aV = null;

  private Dt(M paramM) {  } 
  public void z() { this.bId.aV = this.aV; }

  private boolean e(ByteBuffer paramByteBuffer)
  {
    return true;
  }

  public void A() {
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    if (paramInt < 0)
    {
      return false;
    }if (paramInt < 1) {
      boolean bool = e(paramByteBuffer);
      if (bool) {
        A();
        return true;
      }
      return false;
    }

    return false;
  }
}