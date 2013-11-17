import org.apache.log4j.Logger;

public final class ccx extends dQi
{
  private static final aee bx = new bOO(new cjF());

  private static final qM huh = new dzQ(new ec[] { new dLx("groupe d'effet standard", new dmb[] { new dmb("nb maximum d'effect à executer", dnN.lnR) }), new dLx("groupe de réussite", new dmb[] { new dmb("nb maximum d'effect à réussir", dnN.lnR), new dmb("avec réussite (1 : oui, 0 : non = standard", dnN.lnS) }), new dLx("groupe d'effet ciblé", new dmb[] { new dmb("nb maximum d'effect à executer", dnN.lnR), new dmb("avec réussite (1 : oui, 0 : non = standard", dnN.lnS), new dmb("0 = cellule, 1 = cibles (default)", dnN.lnS) }), new dLx("groupe d'effet ciblé, probabilité relative", new dmb[] { new dmb("nb maximum d'effect à executer", dnN.lnR), new dmb("avec réussite (1 : oui, 0 : non = standard", dnN.lnS), new dmb("0 = cellule, 1 = cibles (default)", dnN.lnS), new dmb("proba relative = 1 (on regarde les effets reellement executable et on recalcule leurs proba entre eux) ", dnN.lnS) }), new dLx("Gestion de la tansmission de la cible originale", new dmb[] { new dmb("nb maximum d'effect à executer", dnN.lnR), new dmb("avec réussite (1 : oui, 0 : non = standard", dnN.lnS), new dmb("0 = cellule, 1 = cibles  (default)", dnN.lnS), new dmb("proba relative = 1 (on regarde les effets reellement executable et on recalcule leurs proba entre eux) ", dnN.lnS), new dmb("Transmission de la cible originale aux effets du groupe : oui = 1 (défaut), non = 0 ", dnN.lnS) }), new dLx("Change le caster du groupe d'effet pas sa cible", new dmb[] { new dmb("nb maximum d'effect à executer", dnN.lnR), new dmb("avec réussite (1 : oui, 0 : non = standard", dnN.lnS), new dmb("0 = cellule, 1 = cibles (default)", dnN.lnS), new dmb("proba relative = 1 (on regarde les effets reellement executable et on recalcule leurs proba entre eux) ", dnN.lnS), new dmb("Transmission de la cible originale aux effets du groupe : oui = 1 (défaut), non = 0 ", dnN.lnS), new dmb("Change le caster du groupe d'effet par sa cible oui = 1, non = 0 (défaut)", dnN.lnS) }), new dLx("Calcul le niveau des effets du groupe en fonction du cout du sort déclenchant", new dmb[] { new dmb("nb maximum d'effect à executer", dnN.lnR), new dmb("avec réussite (1 : oui, 0 : non = standard", dnN.lnS), new dmb("0 = cellule, 1 = cibles (default)", dnN.lnS), new dmb("proba relative = 1 (on regarde les effets reellement executable et on recalcule leurs proba entre eux) ", dnN.lnS), new dmb("Transmission de la cible originale aux effets du groupe : oui = 1 (défaut), non = 0 ", dnN.lnS), new dmb("Change le caster du groupe d'effet par sa cible oui = 1, non = 0 (défaut)", dnN.lnS), new dmb("Ratio entre 0 et 1 (default = 1)", dnN.lnS) }) });
  private float aN;

  public qM aF()
  {
    return huh;
  }

  public ccx() {
    aH();
  }

  public ccx cfI()
  {
    ccx localccx;
    try {
      localccx = (ccx)bx.Mm();
      localccx.aOr = bx;
    } catch (Exception localException) {
      localccx = new ccx();
      localccx.aOr = null;
      localccx.eXg = false;
      K.error("Erreur lors d'un checkOut sur un RunningEffectGroupLevelFunctionTriggeringValue : " + localException.getMessage());
    }
    localccx.aN = this.aN;
    return localccx;
  }

  public void a(aVc paramaVc)
  {
    if (this.eWL == null)
      return;
    super.a(paramaVc);
    this.aN = 1.0F;
    if (((dpI)this.eWL).bep() > 6)
      this.aN = ((dpI)this.eWL).o(6, cVC());
  }

  protected dji a(doA paramdoA, boolean paramBoolean)
  {
    dji localdji = super.a(paramdoA, paramBoolean);

    if (paramdoA == null) {
      K.error("Unable to execute a RunningEffectGroupLevelFunctionTriggeringActionCost without triggering effect");
      return localdji;
    }

    localdji.Ao((int)(paramdoA.getValue() * this.aN));

    return localdji;
  }

  public void bc()
  {
    this.aN = 1.0F;
    super.bc();
  }
}