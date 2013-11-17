import org.apache.log4j.Logger;

public final class dxD extends dQi
{
  private static final aee bx = new bOO(new ceI());

  private static final qM lEv = new dzQ(new ec[] { new dLx("Transmet le niveau de l'etat (cible) comme niveau pour les effets du groupe", new dmb[] { new dmb("nb maximum d'effect à executer", dnN.lnR), new dmb("avec réussite (1 : oui, 0 : non = standard", dnN.lnS), new dmb("0 = cellule, 1 = cibles (default)", dnN.lnS), new dmb("proba relative = 1 (on regarde les effets reellement executable et on recalcule leurs proba entre eux) ", dnN.lnS), new dmb("Transmission de la cible originale aux effets du groupe : oui = 1 (défaut), non = 0 ", dnN.lnS), new dmb("Change le caster du groupe d'effet par sa cible oui = 1, non = 0 (défaut)", dnN.lnS), new dmb("Id de l'état à consulter pour le niveau du groupe", dnN.lnS) }), new dLx("Transmet le niveau de l'etat (caster) comme niveau pour les effets du groupe", new dmb[] { new dmb("nb maximum d'effect à executer", dnN.lnR), new dmb("avec réussite (1 : oui, 0 : non = standard", dnN.lnS), new dmb("0 = cellule, 1 = cibles (default)", dnN.lnS), new dmb("proba relative = 1 (on regarde les effets reellement executable et on recalcule leurs proba entre eux) ", dnN.lnS), new dmb("Transmission de la cible originale aux effets du groupe : oui = 1 (défaut), non = 0 ", dnN.lnS), new dmb("Change le caster du groupe d'effet par sa cible oui = 1, non = 0 (défaut)", dnN.lnS), new dmb("Id de l'état à consulter pour le niveau du groupe", dnN.lnS), new dmb("Check on Target = 0 (defaut), Caster = 1", dnN.lnS) }), new dLx("Transmet le niveau de l'etat (caster) comme niveau pour les effets du groupe avec multiplicateur", new dmb[] { new dmb("nb maximum d'effect à executer", dnN.lnR), new dmb("avec réussite (1 : oui, 0 : non = standard", dnN.lnS), new dmb("0 = cellule, 1 = cibles (default)", dnN.lnS), new dmb("proba relative = 1 (on regarde les effets reellement executable et on recalcule leurs proba entre eux) ", dnN.lnS), new dmb("Transmission de la cible originale aux effets du groupe : oui = 1 (défaut), non = 0 ", dnN.lnS), new dmb("Change le caster du groupe d'effet par sa cible oui = 1, non = 0 (défaut)", dnN.lnS), new dmb("Id de l'état à consulter pour le niveau du groupe", dnN.lnS), new dmb("Check on Target = 0 (defaut), Caster = 1", dnN.lnS), new dmb("Facteur sur le niveau de l'état", dnN.lnS) }), new dLx("Transmet le niveau de l'etat (caster) comme niveau pour les effets du groupe avec multiplicateur", new dmb[] { new dmb("nb maximum d'effect à executer", dnN.lnR), new dmb("avec réussite (1 : oui, 0 : non = standard", dnN.lnS), new dmb("0 = cellule, 1 = cibles (default)", dnN.lnS), new dmb("proba relative = 1 (on regarde les effets reellement executable et on recalcule leurs proba entre eux) ", dnN.lnS), new dmb("Transmission de la cible originale aux effets du groupe : oui = 1 (défaut), non = 0 ", dnN.lnS), new dmb("Change le caster du groupe d'effet par sa cible oui = 1, non = 0 (défaut)", dnN.lnS), new dmb("Id de l'état à consulter pour le niveau du groupe", dnN.lnS), new dmb("Check on Target = 0 (defaut), Caster = 1", dnN.lnS), new dmb("Facteur sur le niveau de l'état", dnN.lnS), new dmb("Facteur inverse (0 = non (defaut), 1 = oui)", dnN.lnS) }) });
  private int hbr;
  private float lEw = 1.0F;
  private boolean cQK = false;

  public qM aF()
  {
    return lEv;
  }

  public dxD() {
    aH();
  }

  public dxD dcz()
  {
    dxD localdxD;
    try {
      localdxD = (dxD)bx.Mm();
      localdxD.aOr = bx;
    } catch (Exception localException) {
      localdxD = new dxD();
      localdxD.aOr = null;
      localdxD.eXg = false;
      K.error("Erreur lors d'un checkOut sur un RunningEffectGroupLevelFuntionState : " + localException.getMessage());
    }
    return localdxD;
  }

  public void a(aVc paramaVc)
  {
    if (this.eWL == null)
      return;
    super.a(paramaVc);
    this.hbr = ((dpI)this.eWL).a(6, cVC(), dNF.meh);
    if (((dpI)this.eWL).bep() >= 8)
      this.cQK = (((dpI)this.eWL).a(7, cVC(), dNF.meh) == 1);
    if (((dpI)this.eWL).bep() >= 9)
      this.lEw = ((dpI)this.eWL).o(8, cVC());
    else {
      this.lEw = 1.0F;
    }
    if (((dpI)this.eWL).bep() >= 10) {
      int i = ((dpI)this.eWL).a(9, cVC(), dNF.meh) == 1 ? 1 : 0;
      if (i != 0)
        this.lEw = (1.0F / this.lEw);
    }
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
    dDN localdDN = localdle.atO();
    for (aVc localaVc : localdDN)
      if ((localaVc instanceof bPD))
      {
        bJC localbJC = ((bPD)localaVc).bWk();
        if (localbJC.bQW() == this.hbr)
        {
          int i = (int)Math.floor(this.lEw * localbJC.nU());
          localdji.Ao(i);
        }
      }
    return localdji;
  }

  public void bc()
  {
    super.bc();
    this.hbr = -1;
    this.cQK = false;
  }
}