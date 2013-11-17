import org.apache.log4j.Logger;

public final class dFH extends doA
{
  private static final aee bx = new bOO(new bLr());

  private static final qM by = new dzQ(new ec[] { new dLx("Transmet 100% de la valeur", new dmb[0]), new dLx("% Paramétré", new dmb[] { new dmb("% transmis (defaut = 100)", dnN.lnS) }), new dLx("Valeur min pour le second effet", new dmb[] { new dmb("% transmis (defaut = 100)", dnN.lnS), new dmb("valeur min du second effet (defaut = 0)", dnN.lnS) }), new dLx("Caster ou target pour le second effet", new dmb[] { new dmb("% transmis (defaut = 100)", dnN.lnS), new dmb("valeur min du second effet (defaut = 0)", dnN.lnS), new dmb("Cible du second effet, 0=caster (defaut) 1=target", dnN.lnS) }), new dLx("Type d'arrondi", new dmb[] { new dmb("% transmis (defaut = 100)", dnN.lnS), new dmb("valeur min du second effet (defaut = 0)", dnN.lnS), new dmb("Cible du second effet, 0=caster (defaut) 1=target", dnN.lnS), new dmb("Arrondi du second effet (-1=inferieur, 0=random (default), 1=(supérieur)", dnN.lnS) }) });
  private int lPU;
  private int lPV;
  private final int[] lPW = new int[1];
  private int lPX;
  private boolean lPY;

  public qM aF()
  {
    return by;
  }

  public dFH() {
    aH();
  }

  public dFH dgZ()
  {
    dFH localdFH;
    try {
      localdFH = (dFH)bx.Mm();
      localdFH.aOr = bx;
    } catch (Exception localException) {
      localdFH = new dFH();
      localdFH.aOr = null;
      localdFH.eXg = false;
      K.error("Erreur lors d'un checkOut sur un RunningEffectGroupSecondValueFunctionFirst : " + localException.getMessage());
    }
    return localdFH;
  }

  public void a(aVc paramaVc)
  {
    this.lPU = 100;
    this.lPV = 0;
    this.lPX = 0;
    this.lPY = true;
    if (this.eWL == null)
      return;
    if (((dpI)this.eWL).bep() >= 1)
      this.lPU = ((dpI)this.eWL).a(0, cVC(), dNF.meh);
    if (((dpI)this.eWL).bep() >= 2)
      this.lPX = ((dpI)this.eWL).a(1, cVC(), dNF.meh);
    if (((dpI)this.eWL).bep() >= 3)
      this.lPY = (((dpI)this.eWL).a(2, cVC(), dNF.meh) == 0);
    if (((dpI)this.eWL).bep() >= 4)
      this.lPV = ((dpI)this.eWL).a(3, cVC(), dNF.meh);
  }

  protected void a(aVc paramaVc, boolean paramBoolean)
  {
    if (!bkt()) {
      return;
    }
    if (this.eWL == null) {
      cVD();
      return;
    }

    aLM localaLM = dap.cMI().zw(((dpI)this.eWL).yR());
    if (localaLM == null) {
      K.error("Groupe d'effet inconnu" + ((dpI)this.eWL).yR());
      cVD();
      return;
    }
    if (localaLM.bdo() != 2) {
      K.error("On ne peut pas avoir plus ou moins de deux effets dans un groupe d'effet de ce type " + ((dpI)this.eWL).yR());
      cVD();
      return;
    }

    this.lPW[0] = 0;

    dji localdji = a((doA)paramaVc, true);
    if ((a(PY.coL)) && (localdji.cRW() == -1)) {
      localdji.Ao(cVC());
    }

    dpI localdpI1 = localaLM.nc(0);
    localdpI1.a(wa(), bke(), aIq(), bsj.bAv(), this.evp.fa(), this.evp.fb(), this.evp.fc(), this.evp, localdji);

    int i = this.lPW[0];
    if (i == 0) {
      return;
    }

    dpI localdpI2 = localaLM.nc(1);
    if (((this.evp instanceof dha)) && 
      (localdpI2.yR() == 101395))
      return;
    int j;
    switch (this.lPV) {
    case -1:
      j = bCO.bD(i * this.lPU / 100.0F);
      break;
    case 0:
      j = bMr.ax(i * this.lPU / 100.0F);
      break;
    case 1:
      j = bCO.aB(i * this.lPU / 100.0F);
      break;
    default:
      j = bMr.ax(i * this.lPU / 100.0F);
    }
    int k = Math.max(j, this.lPX);
    localdji.Ap(k);

    dle localdle = this.lPY ? bke() : bkf();

    localdpI2.a(wa(), bke(), aIq(), bsj.bAv(), this.evp.fa(), this.evp.fb(), this.evp.fc(), localdle, localdji);

    localdji.release();
  }

  private dji a(doA paramdoA, boolean paramBoolean) {
    dji localdji = dji.a(paramBoolean, false, paramdoA);
    localdji.jt(false);
    localdji.a(new bLs(this, localdji));

    return localdji;
  }

  public boolean aL()
  {
    return true;
  }

  public boolean aM()
  {
    return true;
  }

  public boolean aN()
  {
    return false;
  }

  public void bc()
  {
    super.bc();
  }
}