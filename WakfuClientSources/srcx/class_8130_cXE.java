abstract class cXE extends Hr
{
  private static final qM by = new dzQ(new ec[] { new dLx("Valeur * charac", new dmb[] { new dmb("valeur du modificateur", dnN.lnS) }), new dLx("Valeur de base charac + increment", new dmb[] { new dmb("valeur de base", dnN.lnS), new dmb("increment", dnN.lnS) }) });
  protected eu aCa;

  public qM aF()
  {
    return by;
  }

  public void a(aVc paramaVc) {
    if (this.eWL == null) {
      return;
    }
    dle localdle = bKS();
    if (((dpI)this.eWL).bep() == 1) {
      this.cxl = ((dpI)this.eWL).a(0, cVC(), dNF.meh);

      if (localdle.b(this.aCa)) {
        this.cxl = Math.max(this.cxl * localdle.e(this.aCa), 1);
      }
    }
    if (((dpI)this.eWL).bep() == 2) {
      this.cxl = ((dpI)this.eWL).a(0, cVC(), dNF.meh);
      int i = ((dpI)this.eWL).a(1, cVC(), dNF.meh);

      if (localdle.b(this.aCa))
        this.cxl += i * localdle.e(this.aCa);
    }
  }

  protected abstract dle bKS();

  protected void a(aVc paramaVc, boolean paramBoolean)
  {
    cVD();
    if (!bkt()) {
      return;
    }
    if (this.eWL == null) {
      cVD();
      return;
    }

    c((doA)paramaVc);
  }

  protected boolean QT() {
    return true;
  }

  protected dji a(doA paramdoA, boolean paramBoolean) {
    dji localdji = dji.a(paramBoolean, false, paramdoA);
    localdji.jt(false);
    localdji.a(this.cxl, aoC.dtV);
    return localdji;
  }

  public void bc() {
    super.bc();
  }
}