import java.nio.ByteBuffer;

final class axI
{
  private short bxv = 0;
  private short bUp = 0;
  private short bUq = 0;

  private axI(Jz paramJz) {  } 
  public void z() { this.dMU.bxv = this.bxv;
    this.dMU.bUp = this.bUp;
    this.dMU.bUq = this.bUq; }

  private boolean f(ByteBuffer paramByteBuffer)
  {
    this.bxv = paramByteBuffer.getShort();
    this.bUp = paramByteBuffer.getShort();
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