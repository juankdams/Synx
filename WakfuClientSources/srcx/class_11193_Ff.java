import org.apache.log4j.Logger;

public class Ff extends cMb
{
  protected static final Logger K = Logger.getLogger(Ff.class);
  protected int aSg;
  protected int bMw;
  protected int bMx;
  private final cCH kC = new cYW(this, 22);

  public void aJ()
  {
    super.aJ();
    this.krb = true;
    this.krc = 40;
    this.aSg = 0;
    this.bMw = 0;
    this.bMx = 0;
    ev(true);
    eu(false);
  }

  protected cCH ak()
  {
    return this.kC;
  }

  public void a(abc paramabc)
  {
  }

  public boolean a(dJO paramdJO, bhL parambhL) {
    switch (cYU.av[paramdJO.ordinal()]) {
    case 1:
      d(paramdJO);
      sM();
      a(paramdJO);
      d(paramdJO);
      return true;
    }

    return false;
  }

  public dJO eR()
  {
    return dJO.lVR;
  }

  public dJO[] eS() {
    return new dJO[] { dJO.lVR };
  }

  public String getName() {
    return bU.fH().getString("ie.challenge." + this.bMw);
  }

  public short OL()
  {
    return (short)(int)(bY() * 10.0F);
  }

  public csx[] am()
  {
    csx[] arrayOfcsx = new csx[1];

    aXi localaXi = (aXi)aiI.dfP.avt();
    localaXi.iT(this.bMx);
    localaXi.setName("ie.challenge.mru." + this.bMw);

    localaXi.b(dJO.lVR);
    arrayOfcsx[0] = localaXi;
    return arrayOfcsx;
  }

  public void tk() {
    super.tk();
  }

  public void initialize() {
    if (this.aSg == -1)
      ayg.aJQ().e(this);
    else
      for (abc localabc : sL())
        if ((localabc instanceof djm))
          localabc.bQ(this.aSg);
  }
}