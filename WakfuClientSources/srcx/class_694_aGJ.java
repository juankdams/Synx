import org.apache.log4j.Logger;

public class aGJ extends bFw
{
  private static final aee bx = new bOO(new cmX());

  private static final qM by = new dzQ(new ec[] { new dLx("Perte de point de vie/Kamas limité par le portefeuille", new dmb[] { new dmb("Nombre de Pdv", dnN.lnR), new dmb("Ratio perte de Kama/PDV", dnN.lnS) }) });
  private float edQ;

  public qM aF()
  {
    return by;
  }

  private aGJ() {
  }

  public aGJ(bTI parambTI, dnO paramdnO) {
    super(parambTI, paramdnO);
    this.eXg = true;
  }

  public aGJ aSG()
  {
    aGJ localaGJ;
    try
    {
      localaGJ = (aGJ)bx.Mm();
      localaGJ.aOr = bx;
    } catch (Exception localException) {
      localaGJ = new aGJ();
      localaGJ.aOr = null;
      localaGJ.eXg = false;
      K.error("Erreur lors d'un checkOut sur un HPKamas : " + localException.getMessage());
    }
    localaGJ.gAB = this.gAB;
    return localaGJ;
  }

  public void aH()
  {
    super.aH();
  }

  protected void a(aVc paramaVc, boolean paramBoolean)
  {
    int i = (int)(this.cxl * this.edQ);

    if ((bke() instanceof dhJ)) {
      dhJ localdhJ = (dhJ)bke();
      int j = localdhJ.JE();
      if (j < i) {
        i = j;
        this.cxl = bMr.ax(i / this.edQ);
      }
      localdhJ.dU(i);
    }
    super.a(paramaVc, paramBoolean);
  }

  public void a(aVc paramaVc)
  {
    short s = cVC();
    if (this.eWL != null) {
      this.cxl = ((dpI)this.eWL).a(0, s, dNF.mei);
      this.edQ = ((dpI)this.eWL).a(1, s, dNF.mei);
    }
    bNp();
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