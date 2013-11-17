import org.apache.log4j.Logger;

public final class cWI extends dqZ
{
  private static final aee bx = new bOO(new dnb());

  private static final qM by = new dzQ(new ec[] { new dLx("Valeur du gain", new dmb[] { new dmb("Valeur", dnN.lnR) }) });

  public qM aF()
  {
    return by;
  }

  public cWI() {
    aH();
  }

  public cWI cKC()
  {
    cWI localcWI;
    try {
      localcWI = (cWI)bx.Mm();
      localcWI.aOr = bx;
    } catch (Exception localException) {
      localcWI = new cWI();
      localcWI.aOr = null;
      localcWI.eXg = false;
      K.error("Erreur lors d'un checkOut sur un WeakestResistGain : " + localException.getMessage());
    }
    return localcWI;
  }

  public void a(aVc paramaVc)
  {
    if (this.eWL == null)
      return;
    this.cxl = ((dpI)this.eWL).a(0, cVC(), dNF.meh);
  }

  protected void a(aVc paramaVc, boolean paramBoolean)
  {
    bTI localbTI = dzW.u(this);
    if (localbTI == null) {
      cVD();
      return;
    }
    this.aOF = localbTI.bZT();
    super.a(paramaVc, paramBoolean);
  }

  public void bc()
  {
    this.aOF = null;
    super.bc();
  }
}