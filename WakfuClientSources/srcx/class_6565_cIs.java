import org.apache.log4j.Logger;

public final class cIs extends doA
{
  private static final aee bx = new bOO(new ceP());

  private static final qM by = new dzQ(new ec[] { new dLx("Ratio dgts/lvl", new dmb[] { new dmb("Ratio degats/level", dnN.lnR) }), new dLx("Drop améliorer", new dmb[] { new dmb("Ratio degats/level", dnN.lnR), new dmb("Drop Amélioré (1 = oui, 0 = non (defaut)", dnN.lnS) }) });
  private int cQL;
  private boolean iDZ;

  public qM aF()
  {
    return by;
  }

  public cIs() {
    aH();
  }

  public cIs cCr()
  {
    cIs localcIs;
    try {
      localcIs = (cIs)bx.Mm();
      localcIs.aOr = bx;
    } catch (Exception localException) {
      localcIs = new cIs();
      localcIs.aOr = null;
      localcIs.eXg = false;
      K.error("Erreur lors d'un checkOut sur un DropFromLootArea : " + localException.getMessage());
    }
    return localcIs;
  }

  public void a(aVc paramaVc) {
    if (this.eWL == null) {
      return;
    }

    if (((dpI)this.eWL).bep() < 1) {
      return;
    }

    this.cQL = ((dpI)this.eWL).a(0, cVC(), dNF.meh);

    if (((dpI)this.eWL).bep() < 2) {
      this.iDZ = false;
      return;
    }

    this.iDZ = (((dpI)this.eWL).a(1, cVC(), dNF.meh) == 1);
  }

  protected void a(aVc paramaVc, boolean paramBoolean)
  {
    if (!bkt()) {
      return;
    }

    if (!(this.ejP instanceof dMC)) {
      cVD();
      return;
    }

    if ((!(this.evo instanceof bqi)) || (!(this.evp instanceof aDW))) {
      cVD();
      return;
    }

    dbE localdbE = ((dMC)this.ejP).dps();

    this.cxl = localdbE.a((aDW)this.evp, (bqi)this.evo, false, this.iDZ);

    if (this.cxl == 0) {
      cVD();
      return;
    }

    b(paramaVc, paramBoolean);

    bBn localbBn = Hh.QM().dh(this.cxl);
    int i = localbBn.nU();
    int j = this.cQL * i;

    bFw localbFw = bFw.a(this.ejP, bTI.heZ, dnO.lnU, j, null);
    localbFw.bkr();
    localbFw.b(bkc());
    localbFw.i(this.evo);

    bbq localbbq = localbFw.a(bkc(), this.eWM, this.ejP, this.evo, this.eUw.getX(), this.eUw.getY(), this.eUw.IB(), null, bkh());
    if (localbbq != null) {
      localbbq.release();
    }

    localbFw.release();
  }

  public boolean aL()
  {
    return false;
  }

  public boolean aM() {
    return true;
  }

  public boolean aN() {
    return false;
  }

  public void bc() {
    this.cQL = 0;
    this.iDZ = false;
    super.bc();
  }
}