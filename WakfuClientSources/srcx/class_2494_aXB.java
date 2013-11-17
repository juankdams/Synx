import org.apache.log4j.Logger;

public final class aXB extends doA
{
  private static final aee bx = new bOO(new dnB());

  private static final qM by = new dzQ(new ec[] { new dLx("Valeur de la redirection", new dmb[] { new dmb("Redirection en %", dnN.lnR) }) });

  public qM aF()
  {
    return by;
  }

  public aXB() {
    aH();
  }

  public aXB bmP()
  {
    aXB localaXB;
    try {
      localaXB = (aXB)bx.Mm();
      localaXB.aOr = bx;
    } catch (Exception localException) {
      localaXB = new aXB();
      localaXB.aOr = null;
      localaXB.eXg = false;
      K.error("Erreur lors d'un checkOut sur un SteamerDamageRedirection : " + localException.getMessage());
    }
    return localaXB;
  }

  public void a(aVc paramaVc)
  {
    if (this.eWL == null)
      return;
    this.cxl = ((dpI)this.eWL).a(0, cVC(), dNF.meh);
  }

  protected void a(aVc paramaVc, boolean paramBoolean)
  {
    cVD();
    if (paramaVc == null) {
      return;
    }
    doA localdoA = (doA)paramaVc.bko();
    localdoA.j(this.evo);
    dji localdji = dji.a(true, true, (doA)bkn());

    int i = this.cxl;
    int j = paramaVc.getValue();
    int k = Math.min(j * i / 100, j);
    int m = j - k;

    localdji.Ap(k);
    localdoA.a(localdji);
    localdoA.B(paramaVc);
    localdoA.bkz();
    paramaVc.kf(m);
  }

  public boolean aL()
  {
    return false;
  }

  public boolean aM()
  {
    return true;
  }

  public boolean aN()
  {
    return false;
  }

  public void bc()
  {
    super.bc();
  }
}