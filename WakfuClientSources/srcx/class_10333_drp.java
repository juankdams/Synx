import org.apache.log4j.Logger;

public final class drp extends bFw
{
  private static final aee bx = new bOO(new anV());

  private static final qM by = new dzQ(new ec[] { new dLx("Dommages de base", new dmb[] { new dmb("Dmg ou valeur %", dnN.lnR) }), new dLx("Prendre en compte le niveau du caster comme multiplicateur", new dmb[] { new dmb("Dmg ou valeur %", dnN.lnR), new dmb("Niveau du caster en multiplicateur de la valeur de base ", dnN.lnS) }) });

  public qM aF()
  {
    return by;
  }

  public drp() {
    super(null, dnO.lnU);
    aH();
  }

  public drp cYj()
  {
    drp localdrp;
    try {
      localdrp = (drp)bx.Mm();
      localdrp.aOr = bx;
    } catch (Exception localException) {
      localdrp = new drp();
      localdrp.aOr = null;
      localdrp.eXg = false;
      K.error("Erreur lors d'un checkOut sur un BestElementHpLoss : " + localException.getMessage());
    }
    a(localdrp);
    return localdrp;
  }

  protected void b(aVc paramaVc)
  {
    if (this.eWL == null)
      return;
    bNo();
    if (((dpI)this.eWL).bep() <= 1) {
      this.cxl = ((dpI)this.eWL).a(0, cVC(), dNF.meh);
      return;
    }

    if ((((dpI)this.eWL).a(1, cVC(), dNF.meh) == 1) && ((this.evo instanceof dHW))) {
      float f1 = ((dpI)this.eWL).nl(0);
      float f2 = ((cFp)this.eWL).xD(0);
      this.cxl = dzW.au(f1 + f2 * cVC() * ((dHW)this.evo).nU(), f2);
    }
  }

  public void a(aVc paramaVc)
  {
    this.gAB = dzW.t(this);
    super.a(paramaVc);
  }
}