import org.apache.log4j.Logger;

public final class Wy extends doA
{
  private static final aee bx = new bOO(new fF());

  private static final qM by = new dzQ(new ec[] { new dLx("Params", new dmb[] { new dmb("Loot refId", dnN.lnR), new dmb("Quantité", dnN.lnR) }) });
  private byte cGu;

  public qM aF()
  {
    return by;
  }

  public Wy() {
    aH();
  }

  public Wy aja()
  {
    Wy localWy;
    try {
      localWy = (Wy)bx.Mm();
      localWy.aOr = bx;
    } catch (Exception localException) {
      localWy = new Wy();
      localWy.aOr = null;
      localWy.eXg = false;
      K.error("Erreur lors d'un checkOut sur un AddBonusLoot : " + localException.getMessage());
    }
    return localWy;
  }

  public void a(aVc paramaVc)
  {
    if (this.eWL == null) {
      return;
    }

    this.cxl = ((dpI)this.eWL).a(0, cVC(), dNF.meh);
    this.cGu = ((byte)((dpI)this.eWL).a(1, cVC(), dNF.meh));
  }

  protected void a(aVc paramaVc, boolean paramBoolean)
  {
    if ((this.evp == null) || (this.eWL == null)) {
      cVD();
      return;
    }

    if (!bkt()) {
      return;
    }

    bBn localbBn = Hh.QM().dh(this.cxl);
    if (localbBn == null) {
      K.error("L'item a ajouter au loot n'existe pas " + this.cxl);
      cVD();
      return;
    }

    if ((!(this.evp instanceof bqi)) || (!(this.evp instanceof dHW))) {
      cVD();
      return;
    }
    dbE localdbE = (dbE)((dHW)this.evp).afv();
    localdbE.a((bqi)this.evp, this.cxl, this.cGu);
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
    super.bc();
  }
}