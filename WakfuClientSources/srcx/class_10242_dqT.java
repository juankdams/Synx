import java.nio.ByteBuffer;
import java.util.ArrayList;

final class dqT
{
  private final ArrayList ghz = new ArrayList(0);
  private byte ghA = 0;

  private dqT(bxb parambxb) {  } 
  public void z() { this.lto.ghz.clear();
    this.lto.ghz.ensureCapacity(this.ghz.size());
    this.lto.ghz.addAll(this.ghz);
    this.lto.ghA = this.ghA; }

  private boolean f(ByteBuffer paramByteBuffer)
  {
    int i = paramByteBuffer.get() & 0xFF;
    this.ghz.clear();
    this.ghz.ensureCapacity(i);
    for (int j = 0; j < i; j++) {
      bql localbql = new bql();
      boolean bool = localbql.b(paramByteBuffer, 1);
      if (!bool)
        return false;
      this.ghz.add(localbql);
    }
    this.ghA = paramByteBuffer.get();
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