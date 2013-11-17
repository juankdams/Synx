import org.apache.log4j.Logger;

public final class ceh extends Hr
{
  private static final aee bx = new bOO(new bq());

  private static final qM by = new dzQ(new ec[] { new dLx("Valeur fonction d'une charac", new dmb[] { new dmb("valeur / charac", dnN.lnS) }), new dLx("Valeur fonction d'une charac", new dmb[] { new dmb("valeur de base", dnN.lnS), new dmb("% valeur de base / charac", dnN.lnS) }) });
  private eu aCa;

  public qM aF()
  {
    return by;
  }

  private ceh()
  {
  }

  public ceh(eu parameu)
  {
    aH();
    this.aCa = parameu;
  }

  public ceh cgK()
  {
    ceh localceh;
    try {
      localceh = (ceh)bx.Mm();
      localceh.aOr = bx;
    } catch (Exception localException) {
      localceh = new ceh();
      localceh.aOr = null;
      localceh.eXg = false;
      K.error("Erreur lors d'un checkOut sur un RunningEffectGroupSecondValueFunctionFirst : " + localException.getMessage());
    }
    localceh.aCa = this.aCa;
    return localceh;
  }

  public void a(aVc paramaVc)
  {
    if (this.eWL == null)
      return;
    int i;
    if (((dpI)this.eWL).bep() == 1) {
      i = ((dpI)this.eWL).a(0, cVC(), dNF.meh);

      if (this.evo.b(this.aCa)) {
        this.cxl = (i * this.evo.e(this.aCa));
      }
    }
    if (((dpI)this.eWL).bep() == 2) {
      i = ((dpI)this.eWL).a(0, cVC(), dNF.meh);
      int j = ((dpI)this.eWL).a(1, cVC(), dNF.meh);

      if (this.evo.b(this.aCa)) {
        int k = j * this.evo.e(this.aCa);
        this.cxl = (i * (1 + k / 100));
      }
    }
  }

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
    localdji.Ap(this.cxl);
    return localdji;
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