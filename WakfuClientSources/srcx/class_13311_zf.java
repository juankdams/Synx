import java.nio.ByteBuffer;
import java.util.ArrayList;

final class zf
{
  private final apY btw = new apY();

  private zf(PB paramPB) {  } 
  public void z() { this.btx.btw.bQH.clear();
    this.btx.btw.bQH.ensureCapacity(this.btw.bQH.size());
    this.btx.btw.bQH.addAll(this.btw.bQH); }

  private boolean e(ByteBuffer paramByteBuffer)
  {
    return true;
  }

  private boolean A(ByteBuffer paramByteBuffer) {
    boolean bool = this.btw.b(paramByteBuffer, 10021);
    if (!bool)
      return false;
    return true;
  }

  public void HG() {
  }

  public void HH() {
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    if (paramInt < 0)
    {
      return false;
    }
    boolean bool;
    if (paramInt < 10021) {
      bool = e(paramByteBuffer);
      if (bool) {
        HG();
        HH();
        return true;
      }
      return false;
    }
    if (paramInt < 10028001) {
      bool = A(paramByteBuffer);
      if (bool) {
        HH();
        return true;
      }
      return false;
    }

    return false;
  }
}