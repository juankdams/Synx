import org.apache.log4j.Logger;

public class aRa
{
  private static final Logger K = Logger.getLogger(aRa.class);

  public static final aRa eNR = new aRa();

  private final arN eNS = new arN("patchImagePath", "patchImageOffsetFile");
  private final arN eNT = new arN("buildingImagePath", "buildingImageOffsetFile");

  private aRa()
  {
    try
    {
      this.eNS.initialize();
      this.eNT.initialize();
    } catch (Exception localException) {
      K.error("", localException);
    }
  }

  public float bhy()
  {
    return this.eNS.getScale();
  }

  public float bhz() {
    return this.eNT.getScale();
  }

  public MD nA(int paramInt) {
    return this.eNS.jQ(paramInt);
  }

  public MD nB(int paramInt) {
    return this.eNT.jQ(paramInt);
  }

  public uz nC(int paramInt) {
    return this.eNS.jP(paramInt);
  }

  public uz nD(int paramInt) {
    return this.eNT.jP(paramInt);
  }

  public MD nE(int paramInt) {
    return this.eNS.jR(paramInt);
  }

  public MD nF(int paramInt) {
    return this.eNT.jR(paramInt);
  }

  public void aEs() {
    this.eNS.aEs();
    this.eNT.aEs();
  }
}