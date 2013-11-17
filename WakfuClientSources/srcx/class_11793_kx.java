public class kx extends dMr
{
  private bXx aOn = null;
  private Object aOo = null;
  private Object aOd = null;
  private bXx aOp = null;
  private Object aOq = null;

  private static final aee aOr = new bOO(new bPZ());

  public kx()
  {
  }

  public kx(bXx parambXx1, bXx parambXx2, Object paramObject)
  {
    a(parambXx1);
    b(parambXx2);
    this.kET = parambXx1;
    this.aOd = paramObject;
  }

  public static kx a(dMr paramdMr, bXx parambXx1, bXx parambXx2, Object paramObject)
  {
    kx localkx;
    try
    {
      localkx = (kx)aOr.Mm();
      localkx.fnG = aOr;
    } catch (Exception localException) {
      localkx = new kx();
      localkx.aJ();
    }
    localkx.nS(paramdMr.bPg);
    localkx.CW(paramdMr.bPh);
    localkx.setModifiers(paramdMr.kr);
    localkx.setScreenX(paramdMr.kO);
    localkx.setScreenY(paramdMr.kP);
    localkx.q(parambXx1);
    localkx.b(CH.bFZ);
    localkx.a(parambXx1);
    localkx.b(parambXx2);
    localkx.aOd = paramObject;
    return localkx;
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

  public bXx sp()
  {
    return this.aOp;
  }

  public void b(bXx parambXx) {
    if ((parambXx instanceof aNL)) {
      this.aOp = parambXx;
    }

    if (parambXx != null) {
      axU localaxU = parambXx.getRenderableParent();
      if (localaxU != null)
        this.aOq = localaxU.getItemValue();
    }
  }

  public Object sq()
  {
    return this.aOo;
  }

  public Object sr()
  {
    return this.aOq;
  }

  public CH mp()
  {
    return CH.bFZ;
  }
}