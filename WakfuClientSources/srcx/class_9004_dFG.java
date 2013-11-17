import java.nio.ByteBuffer;
import java.util.ArrayList;

final class dFG
{
  private final ArrayList aZC = new ArrayList(0);
  private final ArrayList iza = new ArrayList(0);

  private dFG(cEZ paramcEZ) {  } 
  public void z() { this.lPT.aZC.clear();
    this.lPT.aZC.ensureCapacity(this.aZC.size());
    this.lPT.aZC.addAll(this.aZC);
    this.lPT.iza.clear();
    this.lPT.iza.ensureCapacity(this.iza.size());
    this.lPT.iza.addAll(this.iza); }

  private boolean f(ByteBuffer paramByteBuffer)
  {
    int i = paramByteBuffer.getShort() & 0xFFFF;
    this.aZC.clear();
    this.aZC.ensureCapacity(i);
    for (int j = 0; j < i; j++) {
      bcl localbcl = new bcl();
      boolean bool1 = localbcl.b(paramByteBuffer, 1);
      if (!bool1)
        return false;
      this.aZC.add(localbcl);
    }
    j = paramByteBuffer.getShort() & 0xFFFF;
    this.iza.clear();
    this.iza.ensureCapacity(j);
    for (int k = 0; k < j; k++) {
      bFs localbFs = new bFs();
      boolean bool2 = localbFs.b(paramByteBuffer, 1);
      if (!bool2)
        return false;
      this.iza.add(localbFs);
    }
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