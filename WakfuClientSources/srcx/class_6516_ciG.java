import java.nio.ByteBuffer;

final class ciG
{
  private aJE hHR = null;

  private ciG(cPS paramcPS) {  } 
  public void z() { this.hHS.hHR = this.hHR; }

  private boolean e(ByteBuffer paramByteBuffer)
  {
    return true;
  }

  public void cky() {
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    if (paramInt < 0)
    {
      return false;
    }if (paramInt < 10026000) {
      boolean bool = e(paramByteBuffer);
      if (bool) {
        cky();
        return true;
      }
      return false;
    }

    return false;
  }
}