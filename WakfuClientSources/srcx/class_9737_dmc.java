import java.nio.ByteBuffer;
import java.util.ArrayList;

final class dmc
{
  private final ArrayList dlU = new ArrayList(0);
  private final ArrayList dlV = new ArrayList(0);

  private dmc(all paramall) {  } 
  public void z() { this.aLg.dlU.clear();
    this.aLg.dlU.ensureCapacity(this.dlU.size());
    this.aLg.dlU.addAll(this.dlU);
    this.aLg.dlV.clear();
    this.aLg.dlV.ensureCapacity(this.dlV.size());
    this.aLg.dlV.addAll(this.dlV); }

  private boolean f(ByteBuffer paramByteBuffer)
  {
    int i = paramByteBuffer.getShort() & 0xFFFF;
    this.dlU.clear();
    this.dlU.ensureCapacity(i);
    for (int j = 0; j < i; j++) {
      ai localai = new ai();
      boolean bool = localai.b(paramByteBuffer, 1);
      if (!bool)
        return false;
      this.dlU.add(localai);
    }
    return true;
  }

  public void cTV() {
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    if (paramInt < 1)
    {
      return false;
    }if (paramInt < 222) {
      boolean bool = f(paramByteBuffer);
      if (bool) {
        cTV();
        return true;
      }
      return false;
    }

    return false;
  }
}