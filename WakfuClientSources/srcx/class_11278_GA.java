public class GA extends dMr
{
  private bXx aOn = null;
  private Object aOo = null;
  private Object aOd = null;
  private bXx bOQ = null;
  private Object bOR = null;

  private static final aee aOr = new bOO(new btP());

  public GA()
  {
  }

  public GA(bXx parambXx1, bXx parambXx2, Object paramObject)
  {
    a(parambXx1);
    c(parambXx2);
    this.kET = parambXx1;
    this.aOd = paramObject;
  }

  public static GA b(dMr paramdMr, bXx parambXx1, bXx parambXx2, Object paramObject)
  {
    GA localGA;
    try
    {
      localGA = (GA)aOr.Mm();
      localGA.fnG = aOr;
    } catch (Exception localException) {
      localGA = new GA();
      localGA.aJ();
    }
    localGA.nS(paramdMr.bPg);
    localGA.CW(paramdMr.bPh);
    localGA.setModifiers(paramdMr.kr);
    localGA.setScreenX(paramdMr.kO);
    localGA.setScreenY(paramdMr.kP);
    localGA.q(parambXx1);
    localGA.b(CH.bFY);
    localGA.a(parambXx1);
    localGA.c(parambXx2);
    localGA.aOd = paramObject;
    return localGA;
  }

  public bXx so() {
    return this.aOn;
  }

  public void a(bXx parambXx) {
    if ((parambXx instanceof aNL)) {
      this.aOn = parambXx;
    }

    if (parambXx != null) {
      axU localaxU = parambXx.getRenderableParent();
      if (localaxU != null)
        this.aOo = localaxU.getItemValue();
    }
  }

  public bXx Qy()
  {
    return this.bOQ;
  }

  public void c(bXx parambXx) {
    if ((parambXx instanceof aNL)) {
      this.bOQ = parambXx;
    }

    if (parambXx != null) {
      axU localaxU = parambXx.getRenderableParent();
      if (localaxU != null)
        this.bOR = localaxU.getItemValue();
    }
  }

  public Object sq()
  {
    return this.aOo;
  }

  public Object Qz()
  {
    return this.bOR;
  }

  public Object getValue()
  {
    return this.aOd;
  }

  public CH mp()
  {
    return CH.bFY;
  }
}