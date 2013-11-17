import java.util.BitSet;
import org.apache.log4j.Logger;

public final class dqH extends dQi
{
  private static final aee bx = new bOO(new avE());

  private static final qM iaS = new dzQ(new ec[] { new dLx("Calcul le niveau des effets du groupe en fonction du cout du sort déclenchant", new dmb[] { new dmb("nb maximum d'effect à executer", dnN.lnR), new dmb("avec réussite (1 : oui, 0 : non = standard", dnN.lnS), new dmb("0 = cellule, 1 = cibles (default)", dnN.lnS), new dmb("proba relative = 1 (on regarde les effets reellement executable et on recalcule leurs proba entre eux) ", dnN.lnS), new dmb("Transmission de la cible originale aux effets du groupe : oui = 1 (défaut), non = 0 ", dnN.lnS), new dmb("Change le caster du groupe d'effet par sa cible oui = 1, non = 0 (défaut)", dnN.lnS), new dmb("Niveau par PA", dnN.lnS), new dmb("Niveau par PM", dnN.lnS), new dmb("Niveau par PW", dnN.lnS) }) });

  private float iaT = 0.0F;
  private float iaU = 0.0F;
  private float iaV = 0.0F;

  public qM aF()
  {
    return iaS;
  }

  public dqH() {
    aH();
  }

  protected void a(aVc paramaVc, boolean paramBoolean)
  {
    super.a(paramaVc, paramBoolean);
  }

  public dqH cXX()
  {
    dqH localdqH;
    try {
      localdqH = (dqH)bx.Mm();
      localdqH.aOr = bx;
    } catch (Exception localException) {
      localdqH = new dqH();
      localdqH.aOr = null;
      localdqH.eXg = false;
      K.error("Erreur lors d'un checkOut sur un RunningEffectGroupLevelFunctionTriggeringSpell : " + localException.getMessage());
    }
    return localdqH;
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
      K.error("Unable to execute a RunningEffectGroupLevelFunctionTriggeringSpell without triggering effect");
      localdji.Ao(0);
      return localdji;
    }

    if (paramdoA.DV().get(500)) {
      a(localdji, (bfE)this.ejP.agb().cSW(), this.ejP.agb().cSV());
      return localdji;
    }

    bqk localbqk = (bqk)paramdoA.wa();
    if (localbqk == null) {
      K.error("Unable to execute a RunningEffectGroupLevelFunctionTriggeringSpell when the triggering effect has no container. Effect id : " + ((dpI)paramdoA.bkc()).yR());

      localdji.Ao(0);
      return localdji;
    }

    if (localbqk.nS() != 11) {
      K.error("Unable to execute a RunningEffectGroupLevelFunctionTriggeringSpell when the triggering effect container is not a spell.Effect id : " + ((dpI)paramdoA.bkc()).yR() + " ContainerType : " + localbqk.nS() + " Container ID : " + localbqk.nT());

      localdji.Ao(0);
      return localdji;
    }
    short s = paramdoA.cVC();
    a(localdji, (bfE)localbqk, s);

    return localdji;
  }

  private void a(dji paramdji, bfE parambfE, short paramShort) {
    bfE localbfE = parambfE;
    bzj localbzj = localbfE.bsL();
    int i = localbzj.rI(paramShort);
    int j = localbzj.rK(paramShort);
    int k = localbzj.rJ(paramShort);

    float f = i * this.iaT + j * this.iaU + k * this.iaV;
    paramdji.Ao(Math.round(f));
  }

  public void bc()
  {
    super.bc();
  }
}