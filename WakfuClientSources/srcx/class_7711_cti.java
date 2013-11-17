import java.nio.ByteBuffer;
import java.util.ArrayList;

final class cti
{
  private int eQZ = 0;
  private final cRf eRa = new cRf();

  private cti(aTq paramaTq) {  } 
  public void z() { this.idb.eQZ = this.eQZ;
    this.idb.eRa.cFZ.clear();
    this.idb.eRa.cFZ.ensureCapacity(this.eRa.cFZ.size());
    this.idb.eRa.cFZ.addAll(this.eRa.cFZ); }

  private boolean e(ByteBuffer paramByteBuffer)
  {
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