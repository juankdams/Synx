import org.apache.log4j.Logger;

public class bJH extends doA
{
  private static final aee bx = new bOO(new ahz());

  private static final qM by = new dzQ(new ec[] { new dLx("modifie la cible de l'effet déclencheur par la cible de cet effet", new dmb[0]), new dLx("partage la valeur de l'effet declencheur entre caster et target", new dmb[] { new dmb("% de la valeur de l'effet declencheur redirigé vers la cible de cet effet (inf ou egal a 100)", dnN.lnR) }), new dLx("Ne dépasse pas la valeur de hp de la nouvelle cible, ne fonctionne que sur les pertes de pdv", new dmb[] { new dmb("% de la valeur de l'effet declencheur redirigé vers la cible de cet effet (inf ou egal a 100)", dnN.lnR), new dmb("Ne dépasse pas la valeur de hp de la nouvelle cible (0=non (defaut), 1=oui)", dnN.lnR) }) });
  private boolean gLw;

  public qM aF()
  {
    return by;
  }

  public bJH bRm()
  {
    bJH localbJH;
    try {
      localbJH = (bJH)bx.Mm();
      localbJH.aOr = bx;
    } catch (Exception localException) {
      localbJH = new bJH();
      localbJH.eXg = false;
      localbJH.aOr = null;
      K.error("Erreur lors d'un checkOut sur un SplitTriggerEffect : " + localException.getMessage());
    }
    localbJH.gLw = this.gLw;
    return localbJH;
  }

  protected void a(aVc paramaVc, boolean paramBoolean)
  {
    if (!bkt()) {
      return;
    }
    if ((paramaVc == null) || (this.evo == null)) {
      cVD();
      return;
    }

    if (paramaVc.getId() == bsj.fOV.getId()) {
      cVD();
      return;
    }

    if (this.cxl >= 100) {
      paramaVc.j(this.evp);
      return;
    }

    int i = paramaVc.getValue();
    int j = i * this.cxl / 100;
    if ((this.gLw) && (this.evp.b(eu.ayM))) {
      j = Math.min(j, this.evp.e(eu.ayM));
    }
    if (j == 0) {
      cVD();
      return;
    }

    aVc localaVc = paramaVc.bko();

    paramaVc.kf(i - j);

    localaVc.i(A(paramaVc));
    localaVc.j(this.evp);
    localaVc.a(dji.a(true, true, null));
    localaVc.kf(j);
    localaVc.bkr();

    localaVc.bkz();
  }

  public void a(aVc paramaVc)
  {
    if (this.eWL == null) {
      return;
    }
    if (((dpI)this.eWL).bep() == 0)
      this.cxl = 100;
    else {
      this.cxl = Math.min(((dpI)this.eWL).a(0, cVC(), dNF.mei), 100);
    }
    if (((dpI)this.eWL).bep() >= 2)
      this.gLw = (((dpI)this.eWL).a(1, cVC(), dNF.meh) == 1);
  }

  public void bc() {
    this.gLw = false;
    super.bc();
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
}