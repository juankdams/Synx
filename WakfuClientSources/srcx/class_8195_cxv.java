import org.apache.log4j.Logger;

public final class cxv extends dQi
{
  private static final aee bx = new bOO(new dIr());

  private static final qM ilr = new dzQ(new ec[] { new dLx("Utilise le nombde de PA/PM/PW restants pour calculer la proba d'exécution du groupe d'effet", new dmb[] { new dmb("nb maximum d'effect à executer", dnN.lnR), new dmb("avec réussite (1 : oui, 0 : non = standard", dnN.lnS), new dmb("0 = cellule, 1 = cibles (default)", dnN.lnS), new dmb("proba relative = 1 (on regarde les effets reellement executable et on recalcule leurs proba entre eux) ", dnN.lnS), new dmb("Transmission de la cible originale aux effets du groupe : oui = 1 (défaut), non = 0 ", dnN.lnS), new dmb("Change le caster du groupe d'effet par sa cible oui = 1, non = 0 (défaut)", dnN.lnS), new dmb("% de proba par PA", dnN.lnS), new dmb("% de proba par PM", dnN.lnS), new dmb("% de proba par PW", dnN.lnS), new dmb("Consomme PA/PM/PW à la fin (0=non, 1 = oui)", dnN.lnS) }) });

  private boolean aYN = false;
  private float ils = 0.0F;
  private float ilt = 0.0F;
  private float ilu = 0.0F;

  public qM aF() {
    return ilr;
  }

  public cxv() {
    aH();
  }

  public cxv cuQ()
  {
    cxv localcxv;
    try {
      localcxv = (cxv)bx.Mm();
      localcxv.aOr = bx;
    } catch (Exception localException) {
      localcxv = new cxv();
      localcxv.aOr = null;
      localcxv.eXg = false;
      K.error("Erreur lors d'un checkOut sur un RunningEffectGroupLevelFuntionState : " + localException.getMessage());
    }
    return localcxv;
  }

  public void a(aVc paramaVc) {
    if (this.eWL == null)
      return;
    super.a(paramaVc);
    this.ils = ((dpI)this.eWL).o(6, cVC());
    this.ilt = ((dpI)this.eWL).o(7, cVC());
    this.ilu = ((dpI)this.eWL).o(8, cVC());
    this.aYN = (1 == ((dpI)this.eWL).a(9, cVC(), dNF.meh));
  }

  public boolean Cu() {
    if (!super.Cu()) {
      return false;
    }

    if (!bkt()) {
      return true;
    }
    if (this.evo == null) {
      return false;
    }
    int i = this.ils == 0.0F ? 0 : this.evo.e(eu.ayN);
    int j = this.ilt == 0.0F ? 0 : this.evo.e(eu.ayO);
    int k = this.ilu == 0.0F ? 0 : this.evo.e(eu.ayP);

    int m = (int)(this.ils * i + this.ilt * j + this.ilu * k);

    if (m <= 0)
      return false;
    if (m >= 100)
      return true;
    return dpe.AX(100) <= m;
  }

  protected void a(aVc paramaVc, boolean paramBoolean)
  {
    if ((this.aYN) && (this.evo != null)) {
      int i = this.ils == 0.0F ? 0 : this.evo.e(eu.ayN);
      int j = this.ilt == 0.0F ? 0 : this.evo.e(eu.ayO);
      int k = this.ilu == 0.0F ? 0 : this.evo.e(eu.ayP);

      dRu localdRu = dRu.a(this.ejP, new bPk((byte)i, (byte)j, (byte)k), this.evo);
      localdRu.i(this.evo);
      localdRu.a(cMe.krm);
      localdRu.c(null, false);
    }

    super.a(paramaVc, paramBoolean);
  }

  public void bc() {
    super.bc();
    this.aYN = false;
  }
}