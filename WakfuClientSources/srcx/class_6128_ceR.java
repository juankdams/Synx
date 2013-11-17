import org.apache.log4j.Logger;

public final class ceR
  implements dBv
{
  private static final Logger K = Logger.getLogger(ceR.class);
  private QT hzr;
  private static ceR hzs = new ceR(null);
  public static final String hzt = "capturedCreatures";
  public static final String hzu = "maxSize";
  public static final String hzv = "selectedCreature";
  public static final String hzw = "selectedCreatureIndex";
  public static final String hzx = "currentLeadershipCapacity";
  public static final String[] bF = { "capturedCreatures", "maxSize", "selectedCreature", "selectedCreatureIndex", "currentLeadershipCapacity" };

  public static ceR chM()
  {
    return hzs;
  }

  public void a(QT paramQT) {
    this.hzr = paramQT;
  }

  public ceR(QT paramQT) {
    this.hzr = paramQT;
  }

  public String[] getFields()
  {
    return bF;
  }

  public Object getFieldValue(String paramString) {
    if (this.hzr == null)
      return null;
    Object localObject;
    if (paramString.equals("capturedCreatures")) {
      localObject = new csi[5];
      int i = 0;
      for (byte b = 0; b < (byte)localObject.length; b = (byte)(b + 1))
      {
        localObject[(i++)] = this.hzr.aj(b);
      }

      return localObject;
    }if (paramString.equals("maxSize"))
      return Integer.valueOf(this.hzr.aaa());
    if (paramString.equals("selectedCreature"))
      return this.hzr.aac();
    if (paramString.equals("selectedCreatureIndex"))
      return Byte.valueOf(this.hzr.aae());
    if (paramString.equals("currentLeadershipCapacity")) {
      localObject = byv.bFN().bFO();
      return Integer.valueOf(Math.max(0, ((byz)localObject).d(eu.ayV).value() - ((byz)localObject).aJt()));
    }

    return null;
  }

  public void a(String paramString, Object paramObject) {
  }

  public void b(String paramString, Object paramObject) {
  }

  public void c(String paramString, Object paramObject) {
  }

  public boolean l(String paramString) {
    return false;
  }

  public void acy() {
    dLE.doY().a(this, new String[] { "capturedCreatures" });
  }

  public void acz() {
    try {
      dLE.doY().a(this, new String[] { "selectedCreature", "selectedCreatureIndex" });
    } catch (Exception localException) {
      K.error("Exception levee", localException);
    }
  }

  public void chN() {
    dLE.doY().a(this, new String[] { "currentLeadershipCapacity" });
  }

  public void chO() {
    if (!cBQ.cxL().mZ("osamodasSymbiotDialog"))
      Bf.Kk().Km();
    dLE.doY().t("osamodasSymbiotCreatureCapturedState", Boolean.valueOf(true));
  }
}