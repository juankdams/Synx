import org.apache.log4j.Logger;

public final class aSq extends bFw
{
  private static final aee bx = new bOO(new aSx());

  private static final qM by = new dzQ(new ec[] { new dLx("Dmg par PA, Dmg par PM", new dmb[] { new dmb("Dmg par PA", dnN.lnR), new dmb("Dmg par PM", dnN.lnR) }) });

  public qM aF()
  {
    return by;
  }

  public aSq() {
    aH();
  }

  public aSq(bTI parambTI, dnO paramdnO) {
    super(parambTI, paramdnO);
  }

  public aSq bie()
  {
    aSq localaSq;
    try {
      localaSq = (aSq)bx.Mm();
      localaSq.aOr = bx;
    } catch (Exception localException) {
      localaSq = new aSq();
      localaSq.aOr = null;
      localaSq.eXg = false;
      K.error("Erreur lors d'un checkOut sur un HpLossFctPaPmWithoutConsume : " + localException.getMessage());
    }
    a(localaSq);
    return localaSq;
  }

  public void a(aVc paramaVc)
  {
    bNo();
    this.cxl = 0;
    if (this.evo == null) {
      return;
    }
    short s = cVC();

    int i = this.evo.e(eu.ayN);
    int j = this.evo.e(eu.ayO);

    if ((i == 0) && (j == 0)) {
      return;
    }
    float f1 = ((dpI)this.eWL).o(0, s);
    float f2 = ((dpI)this.eWL).o(1, s);

    if (f1 == 0.0F)
      i = 0;
    if (f2 == 0.0F) {
      j = 0;
    }
    this.cxl = Math.round(f1 * i + f2 * j);
    sD(this.gAD);
  }
}