import org.apache.log4j.Logger;

public class aDS extends doA
{
  private static final int dZj = 0;
  private static final bOO aCJ = new bOO(new cVm());

  private static final qM by = new dzQ(new ec[] { new dLx("Absorbe une certaines quantités de dégats, puis se désapplique", new dmb[] { new dmb("Valeur d'armure", dnN.lnR) }), new dLx("Valeur en % des Hp", new dmb[] { new dmb("Valeur en %", dnN.lnR), new dmb("En fonction de : Valeur max (0) ou Courante (1)", dnN.lnS) }), new dLx("% de perte de pdv absorbé", new dmb[] { new dmb("Valeur en %", dnN.lnR), new dmb("En fonction de : Valeur max (0) ou Courante (1)", dnN.lnS), new dmb("% des pertes de pdv a absorber (defaut 100%)", dnN.lnS) }) });
  private int aFS;
  private int dZk;

  public qM aF()
  {
    return by;
  }

  public aDS aQc()
  {
    aDS localaDS;
    try
    {
      localaDS = (aDS)aCJ.Mm();
      localaDS.aOr = aCJ;
    } catch (Exception localException) {
      K.warn("Erreur lors de newInstance sur un " + getClass().getSimpleName());
      localaDS = new aDS();
      localaDS.aOr = null;
      localaDS.eXg = false;
    }
    localaDS.aFS = this.aFS;
    localaDS.dZk = this.dZk;
    return localaDS;
  }

  private void oS() {
    short s = cVC();
    this.aFS = ((dpI)this.eWL).a(0, s, dNF.meh);

    if (this.evo == null) {
      return;
    }
    if (this.evo.b(eu.aAf)) {
      this.aFS += this.evo.e(eu.aAf);
    }
    if (((dpI)this.eWL).bep() <= 1) {
      return;
    }
    if (!this.evo.b(eu.ayM)) {
      return;
    }
    int i = ((dpI)this.eWL).a(1, s, dNF.mei);
    if (ml(i))
      this.aFS = (this.evo.a(eu.ayM).max() * this.aFS / 100);
    else {
      this.aFS = (this.evo.a(eu.ayM).value() * this.aFS / 100);
    }

    this.aFS = Math.max(this.aFS, 1);
  }

  private boolean ml(int paramInt) {
    return paramInt == 0;
  }

  public int aQd() {
    return this.aFS;
  }

  public void aK(int paramInt) {
    this.aFS -= paramInt;
    if (this.aFS <= 0)
      this.eWS = 0;
  }

  public void a(aVc paramaVc)
  {
    if ((bkn() != null) && (bkn().getId() == getId())) {
      this.aFS = ((aDS)bkn()).aQd();
    }
    this.dZk = 100;
    if (((dpI)this.eWL).bep() >= 3)
      this.dZk = ((dpI)this.eWL).a(2, cVC(), dNF.meh);
  }

  public void oT()
  {
    super.oT();

    oS();
  }

  protected void a(aVc paramaVc, boolean paramBoolean)
  {
    if ((bkt()) && (paramaVc != null) && (paramBoolean))
      c(paramaVc);
    else
      this.cxl = this.aFS;
  }

  private void c(aVc paramaVc)
  {
    dle localdle = paramaVc.bkf();
    if (localdle == null) {
      return;
    }
    int i = this.aFS;
    int j = paramaVc.getValue();
    int k = this.dZk < 100 ? j * this.dZk / 100 : j;
    this.aFS -= k;

    int m = Math.max(0, -this.aFS) + j - k;
    paramaVc.b(1, m, true);

    this.cxl = (i - Math.max(0, this.aFS));

    if ((bkn() != null) && (bkn().getId() == getId()))
      ((aDS)bkn()).aK(this.cxl);
  }

  public void bc()
  {
    this.dZk = 0;
    super.bc();
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
}