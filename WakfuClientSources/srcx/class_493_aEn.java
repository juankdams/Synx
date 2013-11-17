import org.apache.log4j.Logger;

public final class aEn extends dQi
{
  private static final aee bx = new bOO(new axC());

  private static final qM dZK = new dzQ(new ec[] { new dLx("Transmet le niveau du sort (caster) comme niveau pour les effets du groupe", new dmb[] { new dmb("nb maximum d'effect à executer", dnN.lnR), new dmb("avec réussite (1 : oui, 0 : non = standard", dnN.lnS), new dmb("0 = cellule, 1 = cibles (default)", dnN.lnS), new dmb("proba relative = 1 (on regarde les effets reellement executable et on recalcule leurs proba entre eux) ", dnN.lnS), new dmb("Transmission de la cible originale aux effets du groupe : oui = 1 (défaut), non = 0 ", dnN.lnS), new dmb("Change le caster du groupe d'effet par sa cible oui = 1, non = 0 (défaut)", dnN.lnS), new dmb("Id du sort à consulter pour le niveau du groupe", dnN.lnS) }), new dLx("\"Transmet le niveau du sort (cible) comme niveau pour les effets du groupe", new dmb[] { new dmb("nb maximum d'effect à executer", dnN.lnR), new dmb("avec réussite (1 : oui, 0 : non = standard", dnN.lnS), new dmb("0 = cellule, 1 = cibles (default)", dnN.lnS), new dmb("proba relative = 1 (on regarde les effets reellement executable et on recalcule leurs proba entre eux) ", dnN.lnS), new dmb("Transmission de la cible originale aux effets du groupe : oui = 1 (défaut), non = 0 ", dnN.lnS), new dmb("Change le caster du groupe d'effet par sa cible oui = 1, non = 0 (défaut)", dnN.lnS), new dmb("Id du sort à consulter pour le niveau du groupe", dnN.lnS), new dmb("Check on Target = 0, Caster = 1 (defaut)", dnN.lnS) }), new dLx("Transmet le niveau du sort comme niveau pour les effets du groupe avec multiplicateur", new dmb[] { new dmb("nb maximum d'effect à executer", dnN.lnR), new dmb("avec réussite (1 : oui, 0 : non = standard", dnN.lnS), new dmb("0 = cellule, 1 = cibles (default)", dnN.lnS), new dmb("proba relative = 1 (on regarde les effets reellement executable et on recalcule leurs proba entre eux) ", dnN.lnS), new dmb("Transmission de la cible originale aux effets du groupe : oui = 1 (défaut), non = 0 ", dnN.lnS), new dmb("Change le caster du groupe d'effet par sa cible oui = 1, non = 0 (défaut)", dnN.lnS), new dmb("Id du sort à consulter pour le niveau du groupe", dnN.lnS), new dmb("Check on Target = 0, Caster = 1 (defaut)", dnN.lnS), new dmb("Facteur sur le niveau du sort", dnN.lnS) }), new dLx("Facteur sur le niveau du sort", new dmb[] { new dmb("nb maximum d'effect à executer", dnN.lnR), new dmb("avec réussite (1 : oui, 0 : non = standard", dnN.lnS), new dmb("0 = cellule, 1 = cibles (default)", dnN.lnS), new dmb("proba relative = 1 (on regarde les effets reellement executable et on recalcule leurs proba entre eux) ", dnN.lnS), new dmb("Transmission de la cible originale aux effets du groupe : oui = 1 (défaut), non = 0 ", dnN.lnS), new dmb("Change le caster du groupe d'effet par sa cible oui = 1, non = 0 (défaut)", dnN.lnS), new dmb("Id du sort à consulter pour le niveau du groupe", dnN.lnS), new dmb("Check on Target = 0, Caster = 1 (defaut)", dnN.lnS), new dmb("Facteur sur le niveau du sort", dnN.lnS), new dmb("Facteur inverse (0 = non (defaut), 1 = oui)", dnN.lnS) }), new dLx("Utilise l'inventaire permanent", new dmb[] { new dmb("nb maximum d'effect à executer", dnN.lnR), new dmb("avec réussite (1 : oui, 0 : non = standard", dnN.lnS), new dmb("0 = cellule, 1 = cibles (default)", dnN.lnS), new dmb("proba relative = 1 (on regarde les effets reellement executable et on recalcule leurs proba entre eux) ", dnN.lnS), new dmb("Transmission de la cible originale aux effets du groupe : oui = 1 (défaut), non = 0 ", dnN.lnS), new dmb("Change le caster du groupe d'effet par sa cible oui = 1, non = 0 (défaut)", dnN.lnS), new dmb("Id du sort à consulter pour le niveau du groupe", dnN.lnS), new dmb("Check on Target = 0, Caster = 1 (defaut)", dnN.lnS), new dmb("Facteur sur le niveau du sort", dnN.lnS), new dmb("Facteur inverse (0 = non (defaut), 1 = oui)", dnN.lnS), new dmb("Utilise l'inventaire permanent (0 = non (defaut), 1 = oui)", dnN.lnS) }) });
  private int bla;
  private float dZL = 1.0F;
  private boolean cQK = true;
  private boolean dZM = false;

  public qM aF()
  {
    return dZK;
  }

  public aEn()
  {
    aH();
  }

  public aEn aQu()
  {
    aEn localaEn;
    try {
      localaEn = (aEn)bx.Mm();
      localaEn.aOr = bx;
    } catch (Exception localException) {
      localaEn = new aEn();
      localaEn.aOr = null;
      localaEn.eXg = false;
      K.error("Erreur lors d'un checkOut sur un RunningEffectGroupLevelFunctionSpell : " + localException.getMessage());
    }
    return localaEn;
  }

  public void a(aVc paramaVc)
  {
    if (this.eWL == null)
      return;
    super.a(paramaVc);
    this.cQK = true;
    this.bla = ((dpI)this.eWL).a(6, cVC(), dNF.meh);
    if (((dpI)this.eWL).bep() >= 8)
      this.cQK = (((dpI)this.eWL).a(7, cVC(), dNF.meh) == 1);
    if (((dpI)this.eWL).bep() >= 9)
      this.dZL = ((dpI)this.eWL).o(8, cVC());
    else {
      this.dZL = 1.0F;
    }
    if (((dpI)this.eWL).bep() >= 10) {
      int i = ((dpI)this.eWL).a(9, cVC(), dNF.meh) == 1 ? 1 : 0;
      if (i != 0)
        this.dZL = (1.0F / this.dZL);
    }
    if (((dpI)this.eWL).bep() >= 11)
      this.dZM = (((dpI)this.eWL).a(10, cVC(), dNF.meh) == 1);
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
    if (localdle == null) {
      return localdji;
    }
    if (!(localdle instanceof dhJ))
      return localdji;
    dCi localdCi;
    if (this.dZM)
      localdCi = ((dhJ)localdle).auL();
    else {
      localdCi = ((dhJ)localdle).auK();
    }
    if (localdCi == null) {
      return localdji;
    }
    bfE localbfE = (bfE)localdCi.hh(this.bla);
    if (localbfE == null) {
      return localdji;
    }
    int i = (int)Math.floor(this.dZL * localbfE.nU());
    localdji.Ao(i);

    return localdji;
  }

  public void bc()
  {
    super.bc();
    this.bla = -1;
    this.cQK = true;
    this.dZM = false;
  }
}