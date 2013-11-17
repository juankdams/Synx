import java.nio.ByteBuffer;
import java.util.ArrayList;

final class bKo
{
  private final FU aHK = new FU();
  private final FU aHL = new FU();
  private final FU aHM = new FU();
  private final FU aHN = new FU();

  private bKo(ij paramij) {  } 
  public void z() { this.gNd.aHK.aZC.clear();
    this.gNd.aHK.aZC.ensureCapacity(this.aHK.aZC.size());
    this.gNd.aHK.aZC.addAll(this.aHK.aZC);
    this.gNd.aHK.bNV = this.aHK.bNV;
    this.gNd.aHK.bNW.clear();
    this.gNd.aHK.bNW.ensureCapacity(this.aHK.bNW.size());
    this.gNd.aHK.bNW.addAll(this.aHK.bNW);
    this.gNd.aHL.aZC.clear();
    this.gNd.aHL.aZC.ensureCapacity(this.aHL.aZC.size());
    this.gNd.aHL.aZC.addAll(this.aHL.aZC);
    this.gNd.aHL.bNV = this.aHL.bNV;
    this.gNd.aHL.bNW.clear();
    this.gNd.aHL.bNW.ensureCapacity(this.aHL.bNW.size());
    this.gNd.aHL.bNW.addAll(this.aHL.bNW);
    this.gNd.aHM.aZC.clear();
    this.gNd.aHM.aZC.ensureCapacity(this.aHM.aZC.size());
    this.gNd.aHM.aZC.addAll(this.aHM.aZC);
    this.gNd.aHM.bNV = this.aHM.bNV;
    this.gNd.aHM.bNW.clear();
    this.gNd.aHM.bNW.ensureCapacity(this.aHM.bNW.size());
    this.gNd.aHM.bNW.addAll(this.aHM.bNW);
    this.gNd.aHN.aZC.clear();
    this.gNd.aHN.aZC.ensureCapacity(this.aHN.aZC.size());
    this.gNd.aHN.aZC.addAll(this.aHN.aZC);
    this.gNd.aHN.bNV = this.aHN.bNV;
    this.gNd.aHN.bNW.clear();
    this.gNd.aHN.bNW.ensureCapacity(this.aHN.bNW.size());
    this.gNd.aHN.bNW.addAll(this.aHN.bNW); }

  private boolean e(ByteBuffer paramByteBuffer)
  {
    boolean bool1 = this.aHK.b(paramByteBuffer, 0);
    if (!bool1)
      return false;
    boolean bool2 = this.aHL.b(paramByteBuffer, 0);
    if (!bool2)
      return false;
    boolean bool3 = this.aHM.b(paramByteBuffer, 0);
    if (!bool3)
      return false;
    boolean bool4 = this.aHN.b(paramByteBuffer, 0);
    if (!bool4)
      return false;
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