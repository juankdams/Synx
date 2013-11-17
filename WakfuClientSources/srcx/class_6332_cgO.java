import org.apache.log4j.Logger;

public final class cgO extends doA
{
  private static final aee bx = new bOO(new cRx());

  private static final qM by = new dzQ(new ec[] { new dLx("PA et Pm a consommer", new dmb[] { new dmb("PA a consommer (-1 = tout)", dnN.lnR), new dmb("PM a consommer (-1 = tout)", dnN.lnR) }) });
  private int hEI;
  private int hEJ;

  public qM aF()
  {
    return by;
  }

  public cgO() {
    aH();
  }

  public cgO ciO()
  {
    cgO localcgO;
    try {
      localcgO = (cgO)bx.Mm();
      localcgO.aOr = bx;
    } catch (Exception localException) {
      localcgO = new cgO();
      localcgO.aOr = null;
      localcgO.eXg = false;
      K.error("Erreur lors d'un checkOut sur un ExecuteActionCost : " + localException.getMessage());
    }
    return localcgO;
  }

  public void a(aVc paramaVc)
  {
    this.hEI = this.evo.e(eu.ayN);
    this.hEJ = this.evo.e(eu.ayO);

    if ((this.hEI == 0) && (this.hEJ == 0)) {
      return;
    }
    int i = ((dpI)this.eWL).a(0, cVC(), dNF.meh);
    if (i >= 0)
      this.hEI = Math.min(this.hEI, i);
    int j = ((dpI)this.eWL).a(1, cVC(), dNF.meh);
    if (j >= 0)
      this.hEJ = Math.min(this.hEJ, j);
  }

  protected void a(aVc paramaVc, boolean paramBoolean)
  {
    cVD();
    if (this.evo == null)
      return;
    dRu localdRu = dRu.a(this.ejP, new bPk((byte)this.hEI, (byte)this.hEJ, (byte)0), this.evo);
    localdRu.i(this.evo);
    localdRu.a(cMe.krm);
    localdRu.c(null, false);
  }

  public boolean aiz()
  {
    return true;
  }

  public boolean aL()
  {
    return true;
  }

  public boolean aM()
  {
    return false;
  }

  public boolean aN()
  {
    return true;
  }

  public void bc()
  {
    super.bc();
  }
}