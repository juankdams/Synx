import org.apache.log4j.Logger;

public class czr extends cMb
  implements aNA
{
  public static final short ioo = 1;
  public static final short iop = 2;
  protected static final Logger K = Logger.getLogger(czr.class);
  public static final short ioq = 0;
  public static final short ior = 1;
  public static final short ios = 2;
  private dwN iot;
  private boolean coU;
  private final cCH kC = new cRq(this);

  public dwN cwk()
  {
    return this.iot;
  }

  public void bc()
  {
    cwp();
    this.iot = null;
    super.bc();
  }

  public void aJ()
  {
    super.aJ();
    this.krb = true;
    this.kqX = 0;
    this.coU = false;
    this.aTn = 0;
    this.kqY = true;
    this.kra = true;
    this.kre = true;
    if ((!bB) && (this.iot != null)) throw new AssertionError();
  }

  private void cwl()
  {
    int i = this.cGk.getX();
    int j = this.cGk.getY();
    short s = this.cGk.IB();

    Object localObject = CG.bFG;

    dJN localdJN = (dJN)cPV.cGZ().es(i, j);
    if (localdJN != null) {
      CG localCG = localdJN.al(i, j, s);
      if ((localCG != null) && (localCG != CG.bFP)) {
        localObject = localCG;
      }
    }
    c((CG)localObject);
  }

  protected cCH ak()
  {
    return this.kC;
  }

  public void a(abc paramabc)
  {
  }

  public boolean a(dJO paramdJO, bhL parambhL)
  {
    switch (cRp.av[paramdJO.ordinal()]) {
    case 1:
      cwm();

      return true;
    }

    return false;
  }

  private void cwm() {
    cew localcew = byv.bFN().bFO().aeL();

    int i = fa() - localcew.fa();
    int j = fb() - localcew.fb();

    if ((Math.abs(i) <= 1) && (Math.abs(j) <= 1)) {
      localcew.c(La.l(i, j));
      bve localbve = new bve();
      localbve.ge(cwk().sN());
      byv.bFN().aJK().d(localbve);
    }
  }

  public dJO eR()
  {
    return dJO.lVG;
  }

  public dJO[] eS()
  {
    return new dJO[] { dJO.lVG };
  }

  public csx[] am()
  {
    return new csx[] { aiI.dfC.avt(), aiI.dfD.avt() };
  }

  public String getName()
  {
    return bU.fH().getString("bag.of", new Object[] { cwk().bhX() });
  }

  public boolean cwn()
  {
    if ((this.kqX == 0) && (this.aTn == 1)) {
      this.kqX = 0;
      return true;
    }
    if (this.aTn == 2) {
      this.kqX = 1;
      return true;
    }

    return false;
  }

  private void cwo() {
    Su localSu = CA.Lv().bj(this.iot.sN());
    if (localSu != null) {
      cew localcew = localSu.aeL();
      localcew.c(CG.bFG);
      localcew.a(this);
    }
  }

  private void cwp() {
    if (this.iot != null) {
      long l = this.iot.sN();
      Su localSu = CA.Lv().bj(l);
      if (localSu != null) {
        cew localcew = localSu.aeL();
        localcew.fF(false);
        localcew.b(this);
      }
    }
  }

  public void a(ahm paramahm) {
    cwp();
  }

  public void aau()
  {
    this.aTn = 1;
    sM();

    Su localSu = CA.Lv().bj(this.iot.sN());
    if (localSu != null) {
      cew localcew = localSu.aeL();
      localcew.c(CG.bFG);
      localcew.eq("AnimStatique");
    }
  }

  public boolean isVisible()
  {
    byz localbyz = byv.bFN().bFO();
    if (localbyz == null) {
      return false;
    }
    arl localarl = localbyz.bGv();
    cYk localcYk = ML();
    return (super.isVisible()) && ((localarl == null) || (!localarl.LB().aq(localcYk.getX(), localcYk.getY())));
  }

  public boolean isLocked() {
    return this.coU;
  }
}