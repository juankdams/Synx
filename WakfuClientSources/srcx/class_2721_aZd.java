import java.nio.ByteBuffer;
import java.util.ArrayList;

final class aZd
{
  private final bxb ffF = new bxb();

  private aZd(dKF paramdKF) {  } 
  public void z() { this.ffG.ffF.ghz.clear();
    this.ffG.ffF.ghz.ensureCapacity(this.ffF.ghz.size());
    this.ffG.ffF.ghz.addAll(this.ffF.ghz);
    this.ffG.ffF.ghA = this.ffF.ghA; }

  private boolean f(ByteBuffer paramByteBuffer)
  {
    boolean bool = this.ffF.b(paramByteBuffer, 1);
    if (!bool)
      return false;
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