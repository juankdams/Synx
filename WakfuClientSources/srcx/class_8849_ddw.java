import org.apache.log4j.Logger;

public final class ddw extends bFw
{
  private static final aee bx = new bOO(new Zi());

  private static final qM by = new dzQ(new ec[] { new dLx("Parameters", new dmb[] { new dmb("Moyenne", dnN.lnR), new dmb("Variance", dnN.lnS), new dmb("Min", dnN.lnS), new dmb("Max", dnN.lnS) }) });

  private static final cdq fbs = new cdq(0.0D, 0.0D, new cwS());

  public qM aF() {
    return by;
  }

  public ddw() {
    aH();
  }

  public ddw(bTI parambTI) {
    aH();
    this.gAB = parambTI;
  }

  public ddw cOD()
  {
    ddw localddw;
    try {
      localddw = (ddw)bx.Mm();
      localddw.aOr = bx;
    } catch (Exception localException) {
      localddw = new ddw();
      localddw.aOr = null;
      localddw.eXg = false;
      K.error("Erreur lors d'un checkOut sur un HpLossNormalDistrib : " + localException.getMessage());
    }
    localddw.gAB = this.gAB;
    return localddw;
  }

  public void a(aVc paramaVc) {
    if (this.eWL == null) {
      return;
    }
    if (((dpI)this.eWL).bep() != 4) {
      return;
    }
    short s = cVC();
    int i = ((dpI)this.eWL).a(0, s, dNF.meh);
    int j = ((dpI)this.eWL).a(1, s, dNF.meh);
    int k = ((dpI)this.eWL).a(2, s, dNF.meh);
    int m = ((dpI)this.eWL).a(3, s, dNF.meh);

    double d = fbs.m(i, j);
    this.cxl = ((int)bCO.f(d, k, m));

    sD(bNo());
  }

  protected void a(aVc paramaVc, boolean paramBoolean) {
    super.a(paramaVc, paramBoolean);
  }

  public boolean aL() {
    return true;
  }

  public boolean aM() {
    return true;
  }

  public boolean aN() {
    return false;
  }

  public void bc() {
    super.bc();
  }
}