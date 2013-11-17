import org.apache.log4j.Logger;

public final class crF extends dQi
{
  private static final aee bx = new bOO(new cgV());

  private static final qM iaS = new dzQ(new ec[] { new dLx("Calcul le niveau des effets du groupe en fonction du cout du sort déclenchant", new dmb[] { new dmb("nb maximum d'effect à executer", dnN.lnR), new dmb("avec réussite (1 : oui, 0 : non = standard", dnN.lnS), new dmb("0 = cellule, 1 = cibles (default)", dnN.lnS), new dmb("proba relative = 1 (on regarde les effets reellement executable et on recalcule leurs proba entre eux) ", dnN.lnS), new dmb("Transmission de la cible originale aux effets du groupe : oui = 1 (défaut), non = 0 ", dnN.lnS), new dmb("Change le caster du groupe d'effet par sa cible oui = 1, non = 0 (défaut)", dnN.lnS), new dmb("Niveau par PA", dnN.lnS), new dmb("Niveau par PM", dnN.lnS), new dmb("Niveau par PW", dnN.lnS) }) });

  private float iaT = 0.0F;
  private float iaU = 0.0F;
  private float iaV = 0.0F;

  public qM aF()
  {
    return iaS;
  }

  public crF() {
    aH();
  }

  public crF cpU()
  {
    crF localcrF;
    try {
      localcrF = (crF)bx.Mm();
      localcrF.aOr = bx;
    } catch (Exception localException) {
      localcrF = new crF();
      localcrF.aOr = null;
      localcrF.eXg = false;
      K.error("Erreur lors d'un checkOut sur un RunningEffectGroupLevelFunctionTriggeringActionCost : " + localException.getMessage());
    }
    return localcrF;
  }

  public void a(aVc paramaVc)
  {
    if (this.eWL == null)
      return;
    super.a(paramaVc);

    this.iaT = ((dpI)this.eWL).o(6, cVC());
    this.iaU = ((dpI)this.eWL).o(7, cVC());
    this.iaV = ((dpI)this.eWL).o(8, cVC());
  }

  protected dji a(doA paramdoA, boolean paramBoolean)
  {
    dji localdji = super.a(paramdoA, paramBoolean);

    if (paramdoA == null) {
      K.error("Unable to execute a RunningEffectGroupLevelFunctionTriggeringActionCost without triggering effect");
      return localdji;
    }

    if (!(paramdoA instanceof dRu)) {
      K.error("Unable to execute a RunningEffectGroupLevelFunctionTriggeringActionCost without actionCost triggering effect");
      return localdji;
    }

    dRu localdRu = (dRu)paramdoA;
    int i = localdRu.dsq();
    int j = localdRu.dsp();
    int k = localdRu.dso();

    float f = i * this.iaT + j * this.iaU + k * this.iaV;
    localdji.Ao(Math.round(f));

    return localdji;
  }

  public void bc()
  {
    super.bc();
  }
}