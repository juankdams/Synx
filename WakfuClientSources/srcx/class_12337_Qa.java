public class Qa extends dMr
{
  private bXx coR;
  private bXx aOn;
  private Object aOo;
  private Object coS;
  private Object aOd;
  private static final aee aOr = new bOO(new bGA());

  public Qa()
  {
  }

  public Qa(bXx parambXx1, bXx parambXx2, Object paramObject)
  {
    d(parambXx2);
    e(parambXx1);
    this.kET = parambXx1;
    this.aOd = paramObject;
  }

  public static Qa c(dMr paramdMr, bXx parambXx1, bXx parambXx2, Object paramObject)
  {
    Qa localQa;
    try
    {
      localQa = (Qa)aOr.Mm();
      localQa.fnG = aOr;
    } catch (Exception localException) {
      localQa = new Qa();
      localQa.aJ();
    }
    localQa.nS(paramdMr.bPg);
    localQa.CW(paramdMr.bPh);
    localQa.setModifiers(paramdMr.kr);
    localQa.setScreenX(paramdMr.kO);
    localQa.setScreenY(paramdMr.kP);
    localQa.q(parambXx1);
    localQa.b(CH.bGa);
    localQa.d(parambXx2);
    localQa.e(parambXx1);
    localQa.aOd = paramObject;
    return localQa;
  }

  public bXx abN()
  {
    return this.aOn;
  }

  public void d(bXx parambXx)
  {
    if ((parambXx instanceof aNL)) {
      this.aOn = parambXx;
    }

    if (parambXx != null) {
      axU localaxU = parambXx.getRenderableParent();
      if (localaxU != null)
        this.aOo = localaxU.getItemValue();
    }
  }

  public bXx abO()
  {
    return this.coR;
  }

  public void e(bXx parambXx)
  {
    if ((parambXx instanceof aNL)) {
      this.coR = parambXx;
    }

    if (parambXx != null) {
      axU localaxU = parambXx.getRenderableParent();
      if (localaxU != null)
        this.coS = localaxU.getItemValue();
    }
  }

  public Object abP()
  {
    return this.coS;
  }

  public void L(Object paramObject)
  {
    this.coS = paramObject;
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
    return CH.bGa;
  }
}