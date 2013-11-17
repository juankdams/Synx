import org.apache.log4j.Logger;

public class cVW extends dMr
{
  private static final Logger K = Logger.getLogger(cVW.class);

  private static final aee aOr = new bOO(new lN());
  private float kIw;
  private float kIx;
  private Object aOd;

  public static cVW cKk()
  {
    cVW localcVW;
    try
    {
      localcVW = (cVW)aOr.Mm();
      localcVW.fnG = aOr;
    } catch (Exception localException) {
      K.error("Problème au borrowObject.");
      localcVW = new cVW();
      localcVW.aJ();
    }
    return localcVW;
  }

  public static cVW a(dMr paramdMr, float paramFloat1, float paramFloat2, Object paramObject)
  {
    cVW localcVW = cKk();
    localcVW.nS(paramdMr.bPg);
    localcVW.CW(paramdMr.bPh);
    localcVW.setModifiers(paramdMr.kr);
    localcVW.setScreenX(paramdMr.kO);
    localcVW.setScreenY(paramdMr.kP);
    localcVW.q(paramdMr.cIl());
    localcVW.cU(paramFloat1);
    localcVW.cV(paramFloat2);
    localcVW.setValue(paramObject);
    return localcVW;
  }

  public float cKl() {
    return this.kIw;
  }

  public void cU(float paramFloat) {
    this.kIw = paramFloat;
  }

  public float cKm() {
    return this.kIx;
  }

  public void cV(float paramFloat) {
    this.kIx = paramFloat;
  }

  public Object getValue() {
    return this.aOd;
  }

  public void setValue(Object paramObject) {
    this.aOd = paramObject;
  }
}