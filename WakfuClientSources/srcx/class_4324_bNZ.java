import org.apache.log4j.Logger;

public class bNZ extends doA
{
  private static final qM by = new dzQ(new ec[] { new dLx("Type, Min, Max", new dmb[] { new dmb("Min", dnN.lnR), new dmb("Max", dnN.lnR) }) });

  private static final aee bx = new bOO(new HC());
  private bTI cpW;

  public qM aF()
  {
    return by;
  }

  private bNZ() {
  }

  public bNZ(bTI parambTI) {
    this.cpW = parambTI;
  }

  public bNZ bVq()
  {
    bNZ localbNZ;
    try {
      localbNZ = (bNZ)bx.Mm();
      localbNZ.aOr = bx;
    } catch (Exception localException) {
      localbNZ = new bNZ();
      localbNZ.aOr = null;
      K.error("Erreur lors d'un newInstance sur un HPLoss : " + localException.getMessage());
    }
    localbNZ.cpW = this.cpW;

    return localbNZ;
  }

  public void aH()
  {
    super.aH();
  }

  protected void a(aVc paramaVc, boolean paramBoolean)
  {
    bFw localbFw = bFw.a(this.ejP, Cz(), dnO.lnU, this.cxl, this.evp);

    localbFw.C(this.eUw.getX(), this.eUw.getY(), this.eUw.IB());
    localbFw.i(this.evo);
    localbFw.c(localbFw.bNo(), (this.eWL != null) && (((dpI)this.eWL).cL(1L)), (this.eWL != null) && (((dpI)this.eWL).zi()));

    localbFw.b(this.eWL);
    localbFw.bkB();
    localbFw.bkz();

    jJ(true);
  }

  public void a(aVc paramaVc)
  {
    int i = ((dpI)this.eWL).a(0, cVC(), dNF.mei);
    int j = ((dpI)this.eWL).a(1, cVC(), dNF.mei);

    this.cxl = bCO.cL(i, j);
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

  protected boolean afW()
  {
    return true;
  }

  public bTI Cz()
  {
    return this.cpW;
  }
}