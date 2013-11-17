import org.apache.log4j.Logger;

public final class aEk extends aWl
{
  private static final aee bx = new bOO(new blF());

  private static final qM by = new dzQ(new ec[] { new dLx("x dy + z", new dmb[] { new dmb("x", dnN.lnR), new dmb("dy", dnN.lnR), new dmb("+ z", dnN.lnR) }) });

  public qM aF()
  {
    return by;
  }

  public aEk() {
    aH();
  }

  public aEk aQt()
  {
    aEk localaEk;
    try {
      localaEk = (aEk)bx.Mm();
      localaEk.aOr = bx;
    } catch (Exception localException) {
      localaEk = new aEk();
      localaEk.aOr = null;
      localaEk.eXg = false;
      K.error("Erreur lors d'un checkOut sur un HpGainRandomPercentOfValue : " + localException.getMessage());
    }
    return localaEk;
  }

  public void a(aVc paramaVc) {
    if ((this.eWL == null) && (this.evp != null) && (this.evp.b(eu.ayM))) {
      return;
    }
    short s = cVC();
    int i = ((dpI)this.eWL).a(0, s, dNF.meh);
    int j = ((dpI)this.eWL).a(1, s, dNF.meh);
    int k = ((dpI)this.eWL).a(2, s, dNF.meh);

    this.cxl = 0;
    for (int m = 0; m < i; m++) {
      this.cxl += dpe.AX(j);
    }
    this.cxl += k;

    this.cxl = bMr.ax(this.evp.a(eu.ayM).max() * this.cxl / 100.0F);
  }
}