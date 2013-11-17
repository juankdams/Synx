import org.apache.log4j.Logger;

public final class bEI extends doA
{
  private static final aee bx = new bOO(new bx());

  private static final qM by = new dzQ(new ec[] { new dLx("Default", new dmb[] { new dmb("Valeur", dnN.lnR) }), new dLx("Modif valeur courante", new dmb[] { new dmb("Valeur en %", dnN.lnR), new dmb("Modifie la valeur courante (0 non 1 oui (defaut))", dnN.lnS), new dmb("Diminue à la désapplication (0 généralement. Si vous hésitez, demandez ! Bug à l'horizon)", dnN.lnS) }) });

  private final cCH cum = new bw(this);
  private dSc aOF;
  private boolean gzN = true;
  private boolean gzO = false;

  public qM aF()
  {
    return by;
  }

  private bEI()
  {
    aH();
  }

  public bEI(dSc paramdSc) {
    this.aOF = paramdSc;
    aH();
  }

  public bEI bMQ()
  {
    bEI localbEI;
    try {
      localbEI = (bEI)bx.Mm();
      localbEI.aOr = bx;
    } catch (Exception localException) {
      localbEI = new bEI();
      localbEI.aOr = null;
      localbEI.eXg = false;
      K.error("Erreur lors d'un checkOut sur un SetCharacMaxDebuff : " + localException.getMessage());
    }
    localbEI.aOF = this.aOF;
    return localbEI;
  }

  public void a(aVc paramaVc)
  {
    this.cxl = 0;
    if (this.eWL == null)
      return;
    this.cxl = ((dpI)this.eWL).a(0, cVC(), dNF.meh);
    if (((dpI)this.eWL).bep() >= 3) {
      this.gzN = (((dpI)this.eWL).a(1, cVC(), dNF.meh) == 1);
      this.gzO = (((dpI)this.eWL).a(2, cVC(), dNF.meh) == 1);
    }
  }

  protected void a(aVc paramaVc, boolean paramBoolean)
  {
    if (this.evp == null) {
      cVD();
      return;
    }

    cqm localcqm = this.evp.a(this.aOF);
    if (localcqm == null) {
      cVD();
      return;
    }

    int i = localcqm.max();
    this.cxl = localcqm.gu(this.cxl);
    int j = localcqm.max() - i;

    if (this.gzN) {
      int k = j;
      if (localcqm.adb() == eu.ayM)
        k = -j > localcqm.value() ? -(localcqm.value() - 1) : j;
      localcqm.gv(k);
    }
  }

  public void aK()
  {
    super.aK();
    if (this.evp == null)
      return;
    cqm localcqm = this.evp.a(this.aOF);
    if (localcqm == null)
      return;
    if (!this.ksH) {
      return;
    }
    int i = localcqm.max();
    localcqm.gu(-this.cxl);
    if (!this.gzO) {
      return;
    }
    int j = localcqm.max() - i;

    if (localcqm.value() <= 0) {
      return;
    }
    int k = j;
    if (localcqm.adb() == eu.ayM) {
      k = j > localcqm.value() ? localcqm.value() - 1 : j;
    }
    localcqm.gw(k);
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
    this.gzN = true;
    this.gzO = false;
    super.bc();
  }

  public cCH lJ()
  {
    return this.cum;
  }
}