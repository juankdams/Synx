import org.apache.log4j.Logger;

public final class atd extends doA
{
  private static final aee bx = new bOO(new can());

  private static final qM by = new dzQ(new ec[] { new dLx("Default", new dmb[0]), new dLx("Ratio de la valeur transmise", new dmb[] { new dmb("Ratio (default 100%)", dnN.lnR) }), new dLx("Transmission (target/caster)", new dmb[] { new dmb("Ratio (default 100%)", dnN.lnR), new dmb("Transmis à la cible de cet effet (oui = 1, defaut = transmis au caster)", dnN.lnS) }) });
  private boolean dDd;

  public qM aF()
  {
    return by;
  }

  public atd() {
    aH();
  }

  public atd aFa()
  {
    atd localatd;
    try {
      localatd = (atd)bx.Mm();
      localatd.aOr = bx;
    } catch (Exception localException) {
      localatd = new atd();
      localatd.aOr = null;
      localatd.eXg = false;
      K.error("Erreur lors d'un checkOut sur un ChangeTriggeringEffectTarget : " + localException.getMessage());
    }
    localatd.dDd = this.dDd;
    return localatd;
  }

  public void a(aVc paramaVc)
  {
    this.cxl = -1;
    this.dDd = false;
    if (this.eWL == null) {
      return;
    }
    if (((dpI)this.eWL).bep() >= 1)
      this.cxl = ((dpI)this.eWL).a(0, cVC(), dNF.meh);
    if (((dpI)this.eWL).bep() >= 2)
      this.dDd = (((dpI)this.eWL).a(1, cVC(), dNF.meh) == 1);
  }

  protected void a(aVc paramaVc, boolean paramBoolean)
  {
    if (!bkt()) {
      return;
    }
    if (paramaVc == null) {
      return;
    }
    if (this.dDd)
      paramaVc.j(this.evp);
    else {
      paramaVc.j(this.evo);
    }
    if (this.cxl > 0)
      paramaVc.b(0, this.cxl, true);
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

  public void bc()
  {
    this.dDd = false;
    super.bc();
  }
}