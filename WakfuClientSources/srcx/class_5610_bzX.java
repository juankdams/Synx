import org.apache.log4j.Logger;

public final class bzX extends aYO
{
  private static final qM by = new dzQ(new ec[] { new dLx("Quantité perdue par PA ou par PM (PA/PM consommés)", new dmb[] { new dmb("Qté par PA", dnN.lnR), new dmb("Qté par PM", dnN.lnR) }), new dLx("Quantité perdue par PA ou par PM (PA et PM peuvent rester)", new dmb[] { new dmb("Qté par PA", dnN.lnR), new dmb("Qté par PM", dnN.lnR), new dmb("Garder les PA (0 = PA enlevés(default), 1 = PA pas enlevés)", dnN.lnS), new dmb("Garder les PM (0 = PM enlevés(default), 1 = PM pas enlevés)", dnN.lnS), new dmb("Max PA Enlevables (<=0 = infini)", dnN.lnS), new dmb("Max PM enlevables (<=0 = infini)", dnN.lnS) }) });

  private static final aee bx = new bOO(new BM());
  private int cAa;
  private int cAb;
  private boolean gow;
  private boolean gox;

  public bzX()
  {
  }

  public bzX(dSc paramdSc)
  {
    super(paramdSc);
  }

  public bzX bIw()
  {
    bzX localbzX;
    try {
      localbzX = (bzX)bx.Mm();
      localbzX.aOr = bx;
    } catch (Exception localException) {
      localbzX = new bzX(this.aOF);
      localbzX.aOr = null;
      K.error("Erreur lors d'un newInstance sur un CharacLossFunctionPaPm : " + localException.getMessage());
    }
    localbzX.aOF = this.aOF;

    return localbzX;
  }

  public void a(aVc paramaVc) {
    this.cxl = 0;
    if (this.evo == null) {
      return;
    }
    this.cAa = this.evo.e(eu.ayN);
    this.cAb = this.evo.e(eu.ayO);

    if ((this.cAa == 0) && (this.cAb == 0)) {
      return;
    }
    short s = cVC();
    int i;
    if (((dpI)this.eWL).bep() >= 5) {
      i = ((dpI)this.eWL).a(4, s, dNF.meh);
      if (i > 0)
        this.cAa = Math.min(this.cAa, i);
    }
    if (((dpI)this.eWL).bep() >= 6) {
      i = ((dpI)this.eWL).a(5, s, dNF.meh);
      if (i > 0) {
        this.cAa = Math.min(this.cAa, i);
      }
    }
    float f1 = ((dpI)this.eWL).o(0, s);
    float f2 = ((dpI)this.eWL).o(1, s);

    if (f1 == 0.0F)
      this.cAa = 0;
    if (f2 == 0.0F) {
      this.cAb = 0;
    }
    if (this.cAa > 0) {
      if (((dpI)this.eWL).bep() >= 3)
        this.gow = (((dpI)this.eWL).o(2, s) == 0.0F);
      else
        this.gow = true;
    }
    else this.gow = false;

    if (this.cAb > 0) {
      if (((dpI)this.eWL).bep() >= 4)
        this.gox = (((dpI)this.eWL).o(3, s) == 0.0F);
      else
        this.gox = true;
    }
    else this.gox = false;

    this.cxl = Math.round(f1 * this.cAa + f2 * this.cAb);
    if (this.cxl == 0);
  }

  protected void a(aVc paramaVc, boolean paramBoolean)
  {
    if ((this.evo == null) || (this.evp == null)) {
      return;
    }
    if ((this.gow) || (this.gox)) {
      dRu localdRu = dRu.a(this.ejP, new bPk((byte)(this.gow ? this.cAa : 0), (byte)(this.gox ? this.cAb : 0), (byte)0), this.evo);

      localdRu.i(this.evo);
      localdRu.a(cMe.krm);
      localdRu.c(null, false);
    }
    super.a(paramaVc, paramBoolean);
  }

  protected int st()
  {
    return 100;
  }

  protected boolean afW()
  {
    return true;
  }

  public qM aF() {
    return by;
  }
}