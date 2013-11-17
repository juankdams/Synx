import java.nio.ByteBuffer;

final class btW
{
  private final Jz flX = new Jz();

  private btW(bcl parambcl) {  } 
  public void z() { this.gdc.flX.bxv = this.flX.bxv;
    this.gdc.flX.bUp = this.flX.bUp;
    this.gdc.flX.bUq = this.flX.bUq; }

  private boolean f(ByteBuffer paramByteBuffer)
  {
    boolean bool = this.flX.b(paramByteBuffer, 1);
    if (!bool)
      return false;
    return true;
  }

  public void aJk() {
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    if (paramInt < 1)
    {
      return false;
    }if (paramInt < 10004) {
      boolean bool = f(paramByteBuffer);
      if (bool) {
        aJk();
        return true;
      }
      return false;
    }

    return false;
  }
}