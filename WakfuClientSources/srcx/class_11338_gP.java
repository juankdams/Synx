import org.apache.log4j.Logger;

public final class gP extends doA
{
  private static final aee bx = new bOO(new ayW());

  private static final qM by = new dzQ(new ec[] { new dLx("Bouclier en valeur fixe", new dmb[] { new dmb("Valeur d'armure", dnN.lnR) }), new dLx("Bouclier élémentaire", new dmb[] { new dmb("Valeur d'armure", dnN.lnR), new dmb("Element", dnN.lnS) }) });

  private final cCH aFR = new ayV(this, 4);
  private int aFS;

  public qM aF()
  {
    return by;
  }

  public gP()
  {
    aH();
  }

  public gP oR()
  {
    gP localgP;
    try {
      localgP = (gP)bx.Mm();
      localgP.aOr = bx;
    } catch (Exception localException) {
      localgP = new gP();
      localgP.aOr = null;
      localgP.eXg = false;
      K.error("Erreur lors d'un checkOut sur un VirutalArmorFlat : " + localException.getMessage());
    }
    localgP.aFS = this.aFS;
    return localgP;
  }

  private void oS() {
    short s = cVC();
    this.aFS = ((dpI)this.eWL).a(0, s, dNF.meh);
    if ((this.evo == null) || (((dpI)this.eWL).bep() <= 1))
      return;
    byte b = (byte)((dpI)this.eWL).a(1, s, dNF.meh);
    bTI localbTI = bTI.dx(b);
    if (localbTI == null) {
      K.error("L'element specifie n'existe pas : " + b);
      return;
    }
    this.aFS = bMr.ax(this.aFS * (1.0F + b(localbTI)));
  }

  private float b(bTI parambTI) {
    return (this.evo.e(parambTI.bZS()) + this.evo.e(eu.azc)) / 100.0F;
  }

  public void oT()
  {
    super.oT();
    if (bkt())
    {
      oS();
    }
  }

  public void a(aVc paramaVc)
  {
    if ((bkn() != null) && (bkn().getId() == getId()))
      this.aFS = ((gP)bkn()).aFS;
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
    this.aFS -= j;

    int k = Math.max(0, -this.aFS) + j - j;
    paramaVc.b(1, k, true);

    this.cxl = (i - Math.max(0, this.aFS));

    if ((bkn() != null) && (bkn().getId() == getId()))
      ((gP)bkn()).aK(this.cxl);
  }

  public void aK(int paramInt)
  {
    this.aFS -= paramInt;
    if (this.aFS <= 0)
      this.eWS = 0;
  }

  public boolean aL()
  {
    return true;
  }

  public boolean aM()
  {
    return true;
  }

  public boolean aN()
  {
    return false;
  }

  public cCH lJ()
  {
    return this.aFR;
  }

  public void bc()
  {
    this.aFS = 0;
    super.bc();
  }
}