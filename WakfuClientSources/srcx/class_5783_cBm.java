import java.nio.ByteBuffer;

final class cBm
{
  private int iso = 0;
  private final dDj isp = new dDj();

  private cBm(tB paramtB) {
  }
  public void z() {
  }
  private boolean e(ByteBuffer paramByteBuffer) { return true; }

  private boolean f(ByteBuffer paramByteBuffer)
  {
    this.iso = paramByteBuffer.getInt();
    boolean bool = this.isp.b(paramByteBuffer, 1);
    if (!bool)
      return false;
    return true;
  }

  public void A() {
  }

  public void DN() {
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
        DN();
        return true;
      }
      return false;
    }
    if (paramInt < 10014) {
      bool = f(paramByteBuffer);
      if (bool) {
        DN();
        return true;
      }
      return false;
    }

    return false;
  }
}