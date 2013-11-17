import java.nio.ByteBuffer;
import java.util.ArrayList;

final class dnf
{
  private final cEZ dEN = new cEZ();
  private short dEO = 0;

  private dnf(att paramatt) {  } 
  public void z() { this.hgs.dEN.aZC.clear();
    this.hgs.dEN.aZC.ensureCapacity(this.dEN.aZC.size());
    this.hgs.dEN.aZC.addAll(this.dEN.aZC);
    this.hgs.dEN.iza.clear();
    this.hgs.dEN.iza.ensureCapacity(this.dEN.iza.size());
    this.hgs.dEN.iza.addAll(this.dEN.iza);
    this.hgs.dEO = this.dEO; }

  private boolean f(ByteBuffer paramByteBuffer)
  {
    boolean bool = this.dEN.b(paramByteBuffer, 1);
    if (!bool)
      return false;
    this.dEO = paramByteBuffer.getShort();
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