import org.apache.log4j.Logger;

public final class Ri extends bFw
{
  private static final aee bx = new bOO(new Mz());

  private static final qM by = new dzQ(new ec[] { new dLx("% de la valeur de l'effet déclencheur", new dmb[] { new dmb("% de la valeur de l'effet déclencheur", dnN.lnR) }), new dLx("Avec élément", new dmb[] { new dmb("% de la valeur de l'effet déclencheur", dnN.lnR), new dmb("Element", dnN.lnS) }), new dLx("Avec élément et modificateurs", new dmb[] { new dmb("% de la valeur de l'effet déclencheur", dnN.lnR), new dmb("Element", dnN.lnS), new dmb("mod : boost(1) / res (2) / rebound (4) / absorb(8) ", dnN.lnS) }) });

  public qM aF()
  {
    return by;
  }

  public Ri() {
    aH();
  }

  public Ri acL()
  {
    Ri localRi;
    try {
      localRi = (Ri)bx.Mm();
      localRi.aOr = bx;
    } catch (Exception localException) {
      localRi = new Ri();
      localRi.aOr = null;
      localRi.eXg = false;
      K.error("Erreur lors d'un checkOut sur un HpLossFunctionTriggeringValue : " + localException.getMessage());
    }
    return localRi;
  }

  protected void a(aVc paramaVc, boolean paramBoolean) {
    if ((paramaVc != null) && (paramaVc.getValue() == 0)) {
      cVD();
      return;
    }
    super.a(paramaVc, paramBoolean);
  }

  protected void b(aVc paramaVc) {
    this.gAD = 0;
    this.gAC = dnO.lnU;
    this.gAB = bTI.heW;
    doA localdoA = paramaVc != null ? paramaVc : ((dji)bkh()).cRV();
    if (localdoA == null) {
      this.cxl = 0;
      K.error("Impossible de calculer la valeur de cet effet, il doit etre déclencher par un autre");
      return;
    }

    short s = cVC();
    if (this.eWL == null) {
      return;
    }

    float f1 = ((dpI)this.eWL).a(0, s, dNF.meh);

    float f2 = localdoA.getValue() * f1 / 100.0F;

    this.cxl = bMr.ax(f2);

    int i = ((dpI)this.eWL).bep();

    if (i > 1) {
      this.gAB = bTI.dx((byte)((dpI)this.eWL).a(1, s, dNF.meh));
    }

    if (i >= 3)
      sE(((dpI)this.eWL).a(2, s, dNF.meh));
  }
}