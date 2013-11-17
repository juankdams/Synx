import org.apache.log4j.Logger;

public class bvN extends dMr
{
  private static Logger K = Logger.getLogger(bvN.class);

  private bXx ggq = null;
  private Object aOo = null;
  private Object aOd = null;

  private static final aee aOr = new bOO(new bbZ());

  public bvN()
  {
  }

  public bvN(bXx parambXx, Object paramObject)
  {
    setDragNDropable(parambXx);
    this.kET = parambXx;
    this.aOd = paramObject;
  }

  public static bvN a(dMr paramdMr, aNL paramaNL, Object paramObject)
  {
    bvN localbvN;
    try
    {
      localbvN = (bvN)aOr.Mm();
      localbvN.fnG = aOr;
    } catch (Exception localException) {
      K.error("Problème au borrowObject.");
      localbvN = new bvN();
      localbvN.aJ();
    }
    localbvN.nS(paramdMr.bPg);
    localbvN.CW(paramdMr.bPh);
    localbvN.setModifiers(paramdMr.kr);
    localbvN.setScreenX(paramdMr.kO);
    localbvN.setScreenY(paramdMr.kP);
    localbvN.q(paramaNL);
    localbvN.b(CH.bFX);
    localbvN.setDragNDropable((bXx)paramaNL);
    localbvN.aOd = paramObject;
    return localbvN;
  }

  public bXx getDragNDropable() {
    return this.ggq;
  }

  public void setDragNDropable(bXx parambXx) {
    if ((parambXx instanceof aNL)) {
      this.ggq = parambXx;
    }

    if (parambXx != null) {
      axU localaxU = parambXx.getRenderableParent();
      if (localaxU != null)
        this.aOo = localaxU.getItemValue();
    }
  }

  public Object sq()
  {
    return this.aOo;
  }

  public void M(Object paramObject)
  {
    this.aOo = paramObject;
  }

  public Object getValue()
  {
    return this.aOd;
  }

  public void setValue(Object paramObject)
  {
    this.aOd = paramObject;
  }

  public CH mp()
  {
    return CH.bFX;
  }
}