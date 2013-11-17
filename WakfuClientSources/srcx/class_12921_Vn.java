abstract class Vn extends doA
{
  private static final qM by = new dzQ(new ec[] { new dLx("Element, valeur par PA, valeur par PM", new dmb[] { new dmb("Element", dnN.lnS), new dmb("valeur par PA", dnN.lnR), new dmb("valeur par PM", dnN.lnR) }), new dLx("Element, valeur par PA, valeur par PM, et chance de doubler les dégats en fonction des PA/PM", new dmb[] { new dmb("Element", dnN.lnS), new dmb("valeur par PA", dnN.lnR), new dmb("valeur par PM", dnN.lnR), new dmb("% de chances de doubler par PA/PM utilisés", dnN.lnR) }), new dLx("Element, valeur par PA, valeur par PM, chance de doubler les dégats en fonction des PA/PM, limite de PA/PM", new dmb[] { new dmb("Element", dnN.lnS), new dmb("valeur par PA", dnN.lnR), new dmb("valeur par PM", dnN.lnR), new dmb("% de chances de doubler par PA/PM utilisés", dnN.lnR), new dmb("Max PA à utiliser (-1 = tous)", dnN.lnR), new dmb("Max PM à utiliser (-1 = tous)", dnN.lnR) }), new dLx("Element, valeur par PA, valeur par PM, chance de doubler les dégats en fonction des PA/PM, limite de PA/PM, consomme les pa/pm", new dmb[] { new dmb("Element", dnN.lnS), new dmb("valeur par PA", dnN.lnR), new dmb("valeur par PM", dnN.lnR), new dmb("% de chances de doubler par PA/PM utilisés", dnN.lnR), new dmb("Max PA à utiliser (-1 = tous)", dnN.lnR), new dmb("Max PM à utiliser (-1 = tous)", dnN.lnR), new dmb("Consomme les pa/pm (0 = non, 1 = oui (default))", dnN.lnR) }) });
  protected bTI cpW;
  protected int cAa;
  protected int cAb;
  protected boolean cAc;
  private boolean cAd = true;

  public void a(aVc paramaVc)
  {
    this.cxl = 0;
    if (this.evo == null) {
      return;
    }

    short s = cVC();
    ah(s);

    this.cAa = this.evo.e(eu.ayN);
    this.cAb = this.evo.e(eu.ayO);

    if ((this.cAa == 0) && (this.cAb == 0)) {
      return;
    }

    ae(s);
    ad(s);

    float f1 = ag(s);
    float f2 = af(s);

    if (f1 == 0.0F) {
      this.cAa = 0;
    }
    if (f2 == 0.0F) {
      this.cAb = 0;
    }

    this.cxl = Math.round(f1 * this.cAa + f2 * this.cAb);
    if (this.cxl == 0) {
      return;
    }

    ac(s);
    ab(s);
  }

  private void ab(short paramShort) {
    this.cAd = true;
    if (((dpI)this.eWL).bep() >= 7)
      this.cAd = (((dpI)this.eWL).a(6, paramShort, dNF.meh) == 1);
  }

  protected void ac(short paramShort) {
    if (((dpI)this.eWL).bep() == 4) {
      float f = (this.cAa + this.cAb) * ((dpI)this.eWL).o(3, paramShort);
      this.cAc = (bCO.U(0.0F, 100.0F) <= f);
    } else {
      this.cAc = false;
    }
  }

  protected void ad(short paramShort) {
    if (((dpI)this.eWL).bep() >= 6) {
      int i = ((dpI)this.eWL).a(5, paramShort, dNF.meh);
      if (i > 0)
        this.cAb = Math.min(this.cAb, i);
    }
  }

  protected void ae(short paramShort)
  {
    if (((dpI)this.eWL).bep() >= 5) {
      int i = ((dpI)this.eWL).a(4, paramShort, dNF.meh);
      if (i > 0)
        this.cAa = Math.min(this.cAa, i);
    }
  }

  protected float af(short paramShort)
  {
    return ((dpI)this.eWL).o(2, paramShort);
  }

  protected float ag(short paramShort) {
    return ((dpI)this.eWL).o(1, paramShort);
  }

  protected abstract void ah(short paramShort);

  protected void a(aVc paramaVc, boolean paramBoolean)
  {
    jJ(true);

    if ((this.evo == null) || (this.evp == null)) {
      return;
    }

    if ((this.cAd) && (bkt())) {
      aix();
    }

    aiy();
    if (this.cAc)
      aiy();
  }

  private void aix()
  {
    dRu localdRu = dRu.a(this.ejP, new bPk((byte)this.cAa, (byte)this.cAb, (byte)0), this.evo);
    localdRu.i(this.evo);
    localdRu.a(cMe.krm);
    localdRu.c(null, false);
  }

  protected abstract void aiy();

  public boolean aiz()
  {
    return true;
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

  protected boolean afW()
  {
    return true;
  }

  public void aJ()
  {
    super.aJ();
    this.cAd = true;
  }

  public qM aF() {
    return by;
  }
}