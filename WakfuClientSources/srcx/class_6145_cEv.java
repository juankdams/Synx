import org.apache.log4j.Logger;

public class cEv extends dMr
{
  private static Logger K = Logger.getLogger(cEv.class);

  private Object iyf = null;

  private static final aee aOr = new bOO(new com());

  private static int iyg = 0;
  private static int iyh = 0;

  public static cEv a(aNL paramaNL, CH paramCH, Object paramObject)
  {
    iyg += 1;
    cEv localcEv;
    try
    {
      localcEv = (cEv)aOr.Mm();
      localcEv.fnG = aOr;
    } catch (Exception localException) {
      K.error("Problème au borrowObject.");
      localcEv = new cEv();
      localcEv.aJ();
    }
    localcEv.q(paramaNL);
    localcEv.b(paramCH);
    localcEv.setItemValue(paramObject);
    return localcEv;
  }

  public static cEv a(dMr paramdMr, aNL paramaNL, CH paramCH, Object paramObject)
  {
    iyg += 1;
    cEv localcEv;
    try
    {
      localcEv = (cEv)aOr.Mm();
      localcEv.fnG = aOr;
    } catch (Exception localException) {
      K.error("Problème au borrowObject.");
      localcEv = new cEv();
      localcEv.aJ();
    }
    localcEv.nS(paramdMr.bPg);
    localcEv.CW(paramdMr.bPh);
    localcEv.setModifiers(paramdMr.kr);
    localcEv.setScreenX(paramdMr.kO);
    localcEv.setScreenY(paramdMr.kP);
    localcEv.iH(paramdMr.cIn());
    localcEv.q(paramaNL);
    localcEv.b(paramCH);
    localcEv.setItemValue(paramObject);
    return localcEv;
  }

  public void release()
  {
    super.release();
    iyh += 1;
  }

  public Object getItemValue()
  {
    return this.iyf;
  }

  public void setItemValue(Object paramObject)
  {
    this.iyf = paramObject;
  }

  public void bc()
  {
    super.bc();
    this.iyf = null;
  }
}