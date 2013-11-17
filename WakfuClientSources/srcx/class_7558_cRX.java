import org.apache.log4j.Logger;

public final class cRX extends doA
{
  private static final aee aER = new bOO(new bft());

  private static final qM by = new dzQ(new ec[] { new dLx("Drop basique", new dmb[0]), new dLx("Drop amélioré", new dmb[] { new dmb("Drop Amélioré (1 = oui, 0 = non (defaut)", dnN.lnS) }) });
  private boolean iDZ;

  public qM aF()
  {
    return by;
  }

  public cRX() {
    aH();
  }

  public cRX cIe()
  {
    cRX localcRX;
    try {
      localcRX = (cRX)aER.Mm();
      localcRX.aOr = aER;
    } catch (Exception localException) {
      localcRX = new cRX();
      localcRX.aOr = null;
      localcRX.eXg = false;
      K.error("Erreur lors d'un checkOut sur un DropFromLootArea : " + localException.getMessage());
    }
    return localcRX;
  }

  public void a(aVc paramaVc)
  {
    if (this.eWL == null)
      return;
    this.iDZ = ((((dpI)this.eWL).bep() >= 1) && (((dpI)this.eWL).a(0, cVC(), dNF.meh) == 1));
  }

  protected void a(aVc paramaVc, boolean paramBoolean)
  {
    if (!bkt())
      return;
    if (!(this.eWM instanceof cdr)) {
      cVD();
      return;
    }
    if (!(this.evp instanceof bqi)) {
      cVD();
      return;
    }

    cBn localcBn = (cBn)this.eWM;
    if (!(this.ejP instanceof dMC)) {
      cVD();
      return;
    }

    dle localdle = localcBn.axG();
    if (!(localdle instanceof aDW)) {
      cVD();
      return;
    }
    this.cxl = ((dMC)this.ejP).dps().a((aDW)localdle, (bqi)this.evp, true, this.iDZ);
  }

  public boolean aL()
  {
    return false;
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
    this.iDZ = false;
    super.bc();
  }
}