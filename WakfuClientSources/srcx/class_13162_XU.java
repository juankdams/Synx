import java.nio.ByteBuffer;

final class XU
{
  private int cIt = 0;
  private int cIu = 0;
  private int cIv = 0;

  private XU(cil paramcil) {  } 
  public void z() { this.cIw.cIt = this.cIt;
    this.cIw.cIu = this.cIu;
    this.cIw.cIv = this.cIv; }

  private boolean f(ByteBuffer paramByteBuffer)
  {
    this.cIt = paramByteBuffer.getInt();
    this.cIu = paramByteBuffer.getInt();
    return true;
  }

  public void uF() {
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    if (paramInt < 1)
    {
      return false;
    }if (paramInt < 313) {
      boolean bool = f(paramByteBuffer);
      if (bool) {
        uF();
        return true;
      }
      return false;
    }

    return false;
  }
}