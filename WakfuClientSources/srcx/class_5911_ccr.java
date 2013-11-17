import java.nio.ByteBuffer;

final class ccr
{
  private final cUp htZ = new cUp();

  private ccr(djL paramdjL) {  } 
  public void z() { this.hua.htZ.kGX = this.htZ.kGX;
    this.hua.htZ.kGY = this.htZ.kGY; }

  private boolean e(ByteBuffer paramByteBuffer)
  {
    boolean bool = this.htZ.b(paramByteBuffer, 0);
    if (!bool)
      return false;
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