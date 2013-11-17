import org.apache.log4j.Logger;

public final class asB extends aWl
{
  private static final qM by = new dzQ(new ec[] { new dLx("Valeur de base", new dmb[] { new dmb("Valeur", dnN.lnR) }), new dLx("Prendre en compte le niveau du caster comme multiplicateur", new dmb[] { new dmb("Valeur", dnN.lnR), new dmb("Niveau du caster en multiplicateur de la valeur de base ", dnN.lnS) }) });

  private static final aee bx = new bOO(new dIF());

  public qM aF()
  {
    return by;
  }

  public asB() {
    aH();
  }

  public asB aEM()
  {
    asB localasB;
    try {
      localasB = (asB)bx.Mm();
      localasB.aOr = bx;
    } catch (Exception localException) {
      localasB = new asB();
      localasB.aOr = null;
      localasB.eXg = false;
      K.error("Erreur lors d'un checkOut sur un BestElementHpGain : " + localException.getMessage());
    }
    return localasB;
  }

  public void oT()
  {
    this.cpW = dzW.t(this);
    super.oT();
  }

  public void aEN()
  {
    if (this.eWL == null)
      return;
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
    this.cpW = dzW.t(this);
    super.a(paramaVc);
  }

  public void bc()
  {
    super.bc();
  }
}