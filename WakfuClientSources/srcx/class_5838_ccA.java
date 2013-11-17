import java.nio.ByteBuffer;

final class ccA
{
  private byte cUJ = 0;
  private short cUK = 0;
  private short aDf = 0;
  private String name = null;

  private ccA(adT paramadT) {  } 
  public void z() { this.huC.cUJ = this.cUJ;
    this.huC.cUK = this.cUK;
    this.huC.aDf = this.aDf;
    this.huC.name = this.name; }

  private boolean f(ByteBuffer paramByteBuffer)
  {
    this.cUJ = paramByteBuffer.get();
    this.cUK = paramByteBuffer.getShort();
    this.aDf = paramByteBuffer.getShort();
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