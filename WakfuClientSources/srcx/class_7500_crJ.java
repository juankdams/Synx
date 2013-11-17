import org.apache.log4j.Logger;

public final class crJ extends dQi
{
  private static final aee bx = new bOO(new dCu());

  private static final qM ibd = new dzQ(new ec[] { new dLx("Niveau des effets du groupe basé sur une caractéristique : la carac sert de 'faux niveau'", new dmb[] { new dmb("nb maximum d'effect à executer", dnN.lnR), new dmb("avec réussite (1 : oui, 0 : non = standard", dnN.lnS), new dmb("0 = cellule, 1 = cibles (default)", dnN.lnS), new dmb("proba relative = 1 (on regarde les effets reellement executable et on recalcule leurs proba entre eux) ", dnN.lnS), new dmb("Transmission de la cible originale aux effets du groupe : oui = 1 (défaut), non = 0 ", dnN.lnS), new dmb("Change le caster du groupe d'effet par sa cible oui = 1, non = 0 (défaut)", dnN.lnS), new dmb("Id de a Charactéristique à regarder", dnN.lnS), new dmb("Charac prise sur Target = 0 (defaut), Caster = 1", dnN.lnS), new dmb("Niveau : Base", dnN.lnR), new dmb("Niveau : Incrément par point de charac", dnN.lnR) }), new dLx("Niveau des effets du groupe basé sur une caractéristique : niveau par paliers de la carac (+1 tous les x carac)", new dmb[] { new dmb("nb maximum d'effect à executer", dnN.lnR), new dmb("avec réussite (1 : oui, 0 : non = standard", dnN.lnS), new dmb("0 = cellule, 1 = cibles (default)", dnN.lnS), new dmb("proba relative = 1 (on regarde les effets reellement executable et on recalcule leurs proba entre eux) ", dnN.lnS), new dmb("Transmission de la cible originale aux effets du groupe : oui = 1 (défaut), non = 0 ", dnN.lnS), new dmb("Change le caster du groupe d'effet par sa cible oui = 1, non = 0 (défaut)", dnN.lnS), new dmb("Id de a Charactéristique à regarder", dnN.lnS), new dmb("Charac prise sur Target = 0 (defaut), Caster = 1", dnN.lnS), new dmb("Palier de Charac pour avoir +1 niveau", dnN.lnR) }), new dLx("Niveau des effets du groupe basé sur une caractéristique (ou son max) : la carac sert de 'faux niveau'", new dmb[] { new dmb("nb maximum d'effect à executer", dnN.lnR), new dmb("avec réussite (1 : oui, 0 : non = standard", dnN.lnS), new dmb("0 = cellule, 1 = cibles (default)", dnN.lnS), new dmb("proba relative = 1 (on regarde les effets reellement executable et on recalcule leurs proba entre eux) ", dnN.lnS), new dmb("Transmission de la cible originale aux effets du groupe : oui = 1 (défaut), non = 0 ", dnN.lnS), new dmb("Change le caster du groupe d'effet par sa cible oui = 1, non = 0 (défaut)", dnN.lnS), new dmb("Id de a Charactéristique à regarder", dnN.lnS), new dmb("Charac prise sur Target = 0 (defaut), Caster = 1", dnN.lnS), new dmb("Niveau : Base", dnN.lnR), new dmb("Niveau : Incrément par point de charac", dnN.lnR), new dmb("Utilisation du max et non de la valeur courante (default: 0=valeur courante, 1=maximum)", dnN.lnS) }) });
  private eu ibe;
  private boolean cQK = false;
  private boolean ibf = false;
  private int ibg;
  private float ibh;
  private float ibi;
  private boolean ibj = false;

  public qM aF() {
    return ibd;
  }

  public crJ() {
    aH();
  }

  public crJ cqh()
  {
    crJ localcrJ;
    try {
      localcrJ = (crJ)bx.Mm();
      localcrJ.aOr = bx;
    } catch (Exception localException) {
      localcrJ = new crJ();
      localcrJ.aOr = null;
      localcrJ.eXg = false;
      K.error("Erreur lors d'un checkOut sur un RunningEffectGroupLevelFunctionCharacteristic : " + localException.getMessage());
    }
    return localcrJ;
  }

  public void a(aVc paramaVc) {
    if (this.eWL == null) {
      return;
    }
    super.a(paramaVc);
    int i = ((dpI)this.eWL).a(6, cVC(), dNF.meh);
    this.ibe = eu.a(Byte.valueOf((byte)i));
    if (this.ibe == null) {
      K.error("Unable to get characteristic with id " + i);
    }
    this.cQK = (((dpI)this.eWL).a(7, cVC(), dNF.meh) == 1);
    if (((dpI)this.eWL).bep() == 9) {
      this.ibf = true;
      this.ibg = ((dpI)this.eWL).a(8, cVC(), dNF.meh);
    } else {
      this.ibf = false;
      this.ibh = ((dpI)this.eWL).o(8, cVC());
      this.ibi = ((dpI)this.eWL).o(9, cVC());
      if (((dpI)this.eWL).bep() == 11)
        this.ibj = (((dpI)this.eWL).o(10, cVC()) == 1.0F);
      else
        this.ibj = false;
    }
  }

  protected dji a(doA paramdoA, boolean paramBoolean)
  {
    dji localdji = super.a(paramdoA, paramBoolean);

    if (this.ibe == null)
      return localdji;
    dle localdle;
    if (this.cQK)
      localdle = this.evo;
    else {
      localdle = this.evp;
    }

    if (localdle == null) {
      return localdji;
    }

    cqm localcqm = localdle.a(this.ibe);
    int i;
    if (localcqm != null) {
      if (this.ibj)
        i = localcqm.max();
      else
        i = localcqm.value();
    }
    else
      i = 0;
    int j;
    if (this.ibf) {
      if (this.ibg == 0)
        j = i;
      else
        j = (int)Math.floor(i / this.ibg);
    }
    else {
      j = Math.round(this.ibh + this.ibi * i);
    }
    localdji.Ao(j);
    return localdji;
  }

  public void bc() {
    super.bc();
    this.ibe = null;
  }
}