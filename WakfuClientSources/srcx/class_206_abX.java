import org.apache.log4j.Logger;

public final class abX extends dQi
{
  private static final aee bx = new bOO(new NO());

  private static final qM cQJ = new dzQ(new ec[] { new dLx("Niveau des effets du groupe basé sur une caractéristique : la carac sert de 'faux niveau'", new dmb[] { new dmb("nb maximum d'effect à executer", dnN.lnR), new dmb("avec réussite (1 : oui, 0 : non = standard", dnN.lnS), new dmb("0 = cellule, 1 = cibles (default)", dnN.lnS), new dmb("proba relative = 1 (on regarde les effets reellement executable et on recalcule leurs proba entre eux) ", dnN.lnS), new dmb("Transmission de la cible originale aux effets du groupe : oui = 1 (défaut), non = 0 ", dnN.lnS), new dmb("Change le caster du groupe d'effet par sa cible oui = 1, non = 0 (défaut)", dnN.lnS), new dmb("Charac prise sur Target = 0 (defaut), Caster = 1", dnN.lnS), new dmb("Ratio en %", dnN.lnR) }) });

  private boolean cQK = false;
  private int cQL;

  public qM aF()
  {
    return cQJ;
  }

  public abX() {
    aH();
  }

  public abX aoi()
  {
    abX localabX;
    try {
      localabX = (abX)bx.Mm();
      localabX.aOr = bx;
    } catch (Exception localException) {
      localabX = new abX();
      localabX.aOr = null;
      localabX.eXg = false;
      K.error("Erreur lors d'un checkOut sur un RunningEffectGroupLevelFunctionCharacteristic : " + localException.getMessage());
    }
    localabX.cQL = this.cQL;
    localabX.cQK = this.cQK;
    return localabX;
  }

  public void a(aVc paramaVc)
  {
    if (this.eWL == null)
      return;
    super.a(paramaVc);
    this.cQK = (((dpI)this.eWL).a(6, cVC(), dNF.meh) == 1);
    this.cQL = ((dpI)this.eWL).a(7, cVC(), dNF.meh);
  }

  protected dji a(doA paramdoA, boolean paramBoolean)
  {
    dji localdji = super.a(paramdoA, paramBoolean);
    dle localdle;
    if (this.cQK)
      localdle = this.evo;
    else {
      localdle = this.evp;
    }
    if (!(localdle instanceof dhJ)) {
      return localdji;
    }
    int i = ((dhJ)localdle).nU();
    i = i * this.cQL / 100;
    localdji.Ao(i);
    return localdji;
  }

  public void bc()
  {
    super.bc();
    this.cQL = 0;
  }
}