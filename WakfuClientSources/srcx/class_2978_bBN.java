import org.apache.log4j.Logger;

public final class bBN extends Hr
{
  private static final aee bx = new bOO(new aNY());

  private static final qM by = new dzQ(new ec[] { new dLx("Params", new dmb[] { new dmb("Proba / charac", dnN.lnR) }), new dLx("Params", new dmb[] { new dmb("Base", dnN.lnR), new dmb("Increment / charac", dnN.lnR) }) });
  private eu aCa;

  public qM aF()
  {
    return by;
  }

  public bBN()
  {
    aH();
  }

  public bBN(eu parameu) {
    this.aCa = parameu;
  }

  public bBN bKL()
  {
    bBN localbBN;
    try {
      localbBN = (bBN)bx.Mm();
      localbBN.aOr = bx;
    } catch (Exception localException) {
      localbBN = new bBN();
      localbBN.aOr = null;
      localbBN.eXg = false;
      K.error("Erreur lors d'un checkOut sur un EffectProbaFunctionCasterCharac : " + localException.getMessage());
    }
    localbBN.aCa = this.aCa;
    return localbBN;
  }

  public void a(aVc paramaVc) {
    if (this.eWL == null)
      return;
    if (this.evo == null)
      return;
    if (!this.evo.b(this.aCa)) {
      return;
    }
    this.cxl = ((dpI)this.eWL).a(0, cVC(), dNF.meh);
    int i;
    if (((dpI)this.eWL).bep() == 1) {
      i = this.evo.e(this.aCa);
      this.cxl *= i;
    } else if (((dpI)this.eWL).bep() == 2) {
      i = ((dpI)this.eWL).a(1, cVC(), dNF.meh);
      int j = this.evo.e(this.aCa);
      this.cxl += i * j;
    }
  }

  protected void a(aVc paramaVc, boolean paramBoolean) {
    cVD();

    if (this.cxl <= 0)
      return;
    if (dpe.AX(100) > this.cxl) {
      return;
    }
    c((doA)paramaVc);
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
    this.aCa = null;
    super.bc();
  }

  protected boolean QT() {
    return true;
  }
}