import org.apache.log4j.Logger;

public final class UP extends dqZ
{
  private static final aee bx = new bOO(new cyR());

  private static final qM by = new dzQ(new ec[] { new dLx("Gain de Charac fn du level d'un état (+ x / y niveaux)", new dmb[] { new dmb("valeur de x", dnN.lnR), new dmb("valeur de y", dnN.lnR), new dmb("id de l'état", dnN.lnQ), new dmb("état testé sur : cible(0) ou caster(1)", dnN.lnS), new dmb("gain appliqué sur : cible(0) ou caster(1)", dnN.lnS) }) });

  private boolean bvD = false;

  public qM aF()
  {
    return by;
  }

  public UP()
  {
    aH();
  }

  public UP(dSc paramdSc) {
    super(paramdSc);
  }

  public UP aig()
  {
    UP localUP;
    try {
      localUP = (UP)bx.Mm();
      localUP.aOr = bx;
    } catch (Exception localException) {
      localUP = new UP();
      localUP.aOr = null;
      localUP.eXg = false;
      K.error("Erreur lors d'un checkOut sur un CharacGainFunctionStateLevel : " + localException.getMessage());
    }
    localUP.aOF = this.aOF;
    localUP.bvD = false;
    return localUP;
  }

  protected dle sx() {
    return this.bvD ? this.evo : this.evp;
  }

  public void a(aVc paramaVc)
  {
    this.cxl = 0;

    if (this.eWL == null)
      return;
    if (((dpI)this.eWL).bep() != 5) {
      return;
    }

    boolean bool = 0 != ((dpI)this.eWL).a(4, cVC(), dNF.meh);
    dle localdle1 = bool ? this.evo : this.evp;
    if (localdle1 == null) {
      K.error("Unable to compute value for a null target for the gain ! applyOnCaster:" + bool + " effect_id=" + ((dpI)this.eWL).yR());
      return;
    }

    float f1 = ((dpI)this.eWL).o(0, cVC());
    float f2 = ((dpI)this.eWL).o(1, cVC());
    if (f2 == 0.0F) {
      K.error("Increment can't be 0 in CharacGainFucntionStateLevel ! effect_id=" + ((dpI)this.eWL).yR(), new Exception());
      return;
    }
    float f3 = f1 / f2;

    int i = 0 == ((dpI)this.eWL).a(3, cVC(), dNF.meh) ? 1 : 0;
    dle localdle2 = i != 0 ? this.evp : this.evo;
    if (localdle2 == null) {
      K.error("Unable to compute value for a null target for the gain ! effect_id=" + ((dpI)this.eWL).yR());
      return;
    }

    int j = ((dpI)this.eWL).a(2, cVC(), dNF.meh);
    dDN localdDN = localdle2.atO();
    if ((localdDN == null) || (!(localdDN instanceof bgJ))) {
      K.error("Unable to compute value for a target with an invalide REM. Target : " + this.evp + " REM : " + localdDN + " effect_id:" + ((dpI)this.eWL).yR());

      return;
    }
    bgJ localbgJ = (bgJ)localdDN;
    bPD localbPD = localbgJ.pz(j);
    if (localbPD == null)
    {
      return;
    }

    this.cxl = bMr.ax(localbPD.bWk().nU() * f3);

    by(bool);
  }

  private void by(boolean paramBoolean) {
    if (paramBoolean)
      this.evp = this.evo;
  }
}