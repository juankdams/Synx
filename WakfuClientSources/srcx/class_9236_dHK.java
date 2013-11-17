import org.apache.log4j.Logger;

public final class dHK extends doA
{
  private static final aee bx = new bOO(new bMe());

  private static final qM by = new dzQ(new ec[] { new dLx("Pas de params", new dmb[0]), new dLx("% de Dégats absorbé", new dmb[] { new dmb("% absorbé", dnN.lnS) }) });
  private int lSA;

  public qM aF()
  {
    return by;
  }

  protected void a(aVc paramaVc, boolean paramBoolean)
  {
    if (!bkt())
      return;
    if (bkn() == null)
      return;
    if ((paramaVc instanceof bFw)) {
      int i = paramaVc.getValue();
      int j = i * this.lSA / 100;
      int k = bkn().getValue();
      int m = k + j;
      bkn().kf(m);
      paramaVc.kf(i - j);
    }
  }

  public aVc aO() {
    dHK localdHK;
    try {
      localdHK = (dHK)bx.Mm();
      localdHK.aOr = bx;
    } catch (Exception localException) {
      localdHK = new dHK();
      localdHK.aOr = null;
      K.error("Erreur lors d'un checkOut sur un HpLossAccumulation : " + localException.getMessage());
    }
    localdHK.lSA = this.lSA;
    return localdHK;
  }

  public boolean aL() {
    return false;
  }

  public boolean aM() {
    return true;
  }

  public boolean aN() {
    return false;
  }

  public void a(aVc paramaVc) {
    if (this.eWL == null)
      return;
    if (((dpI)this.eWL).bep() == 0)
      this.lSA = 100;
    else
      this.lSA = ((dpI)this.eWL).a(0, cVC(), dNF.meh);
  }

  public void aK()
  {
    if ((bkt()) && (this.cxl > 0)) {
      if (bkn() != null)
        return;
      if ((aIq() instanceof dMC)) {
        localObject = (dMC)aIq();
        int i = ((dMC)localObject).dps().aEu() == dzm.lFM ? 1 : 0;
        if (i != 0)
          return;
      }
      Object localObject = dap.cMI().zw(yR());
      if ((localObject == null) || (((aLM)localObject).bdo() == 0)) {
        K.error("Pas de sous effet pour l'accumulation de perte de pdv " + yR());
        super.aK();
        return;
      }

      dpI localdpI = ((aLM)localObject).nc(0);
      dji localdji = dji.a(true, false, null);
      localdji.Ap(this.cxl);
      try {
        localdpI.a(wa(), this.evo, aIq(), bsj.bAv(), this.evp.fa(), this.evp.fb(), this.evp.fc(), this.evp, localdji);
      }
      catch (Exception localException) {
        K.error("Exception levee", localException);
      }
      localdji.release();
    }

    super.aK();
  }
}