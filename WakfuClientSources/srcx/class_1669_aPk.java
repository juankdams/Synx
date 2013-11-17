import java.nio.ByteBuffer;

final class aPk
{
  private boolean dmL = false;
  private boolean dmM = false;

  private aPk(alN paramalN) {  } 
  public void z() { this.eLp.dmL = this.dmL;
    this.eLp.dmM = this.dmM; }

  private boolean f(ByteBuffer paramByteBuffer)
  {
    this.dmL = (paramByteBuffer.get() == 1);
    return true;
  }

  public void bgg() {
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    if (paramInt < 1)
    {
      return false;
    }if (paramInt < 10027003) {
      boolean bool = f(paramByteBuffer);
      if (bool) {
        bgg();
        return true;
      }
      return false;
    }

    return false;
  }
}