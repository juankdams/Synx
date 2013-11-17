import org.apache.log4j.Logger;

public final class ayZ extends bFw
{
  private static final aee bx = new bOO(new csa());

  private static final qM by = new dzQ(new ec[] { new dLx("perte de PdV, évolution exponentielle hpLoss = a + b * level^c", new dmb[] { new dmb("a", dnN.lnR), new dmb("b", dnN.lnR), new dmb("c", dnN.lnR) }) });

  public qM aF()
  {
    return by;
  }

  public ayZ() {
    aH();
  }

  public ayZ(bTI parambTI) {
    aH();
    this.gAB = parambTI;
  }

  public ayZ aKY()
  {
    ayZ localayZ;
    try {
      localayZ = (ayZ)bx.Mm();
      localayZ.aOr = bx;
    } catch (Exception localException) {
      localayZ = new ayZ();
      localayZ.aOr = null;
      localayZ.eXg = false;
      K.error("Erreur lors d'un checkOut sur un HpLossExponentialGrowth : " + localException.getMessage());
    }
    localayZ.gAB = this.gAB;
    return localayZ;
  }

  public void a(aVc paramaVc) {
    if (this.eWL == null) {
      return;
    }
    if (((dpI)this.eWL).bep() != 3) {
      return;
    }
    int i = cVC();
    double d1 = ((dpI)this.eWL).nl(0);
    double d2 = ((dpI)this.eWL).nl(1);
    double d3 = ((dpI)this.eWL).nl(2);

    double d4 = d1 + d2 * Math.pow(i, d3);

    this.cxl = Math.max(0, bMr.ax((float)d4));

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