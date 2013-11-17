import java.nio.ByteBuffer;

final class dVJ
{
  private int muC = 0;
  private boolean bIb = false;

  private dVJ(bMP parambMP) {
  }
  public void z() {
  }
  private boolean f(ByteBuffer paramByteBuffer) { this.muC = paramByteBuffer.getInt();
    this.bIb = (paramByteBuffer.get() == 1);
    return true; }

  public void DN()
  {
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    if (paramInt < 1)
    {
      return false;
    }if (paramInt < 10014) {
      boolean bool = f(paramByteBuffer);
      if (bool) {
        DN();
        return true;
      }
      return false;
    }

    return false;
  }
}