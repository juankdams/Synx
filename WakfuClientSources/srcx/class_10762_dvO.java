import org.apache.log4j.Logger;

public final class dvO extends doA
{
  private static final aee bx = new bOO(new bMW());

  private static final qM by = new dzQ(new ec[] { new dLx("Params", new dmb[] { new dmb("Ratio", dnN.lnR) }) });
  private float aN;
  private UL lAZ;
  private final cCH aFR = new bMU(this, 4);

  public qM aF()
  {
    return by;
  }

  public dvO() {
    aH();
  }

  public dvO dbb()
  {
    dvO localdvO;
    try {
      localdvO = (dvO)bx.Mm();
      localdvO.aOr = bx;
    } catch (Exception localException) {
      localdvO = new dvO();
      localdvO.aOr = null;
      localdvO.eXg = false;
      K.error("Erreur lors d'un checkOut sur un SetChrageToDmgRatio : " + localException.getMessage());
    }
    return localdvO;
  }

  public void a(aVc paramaVc)
  {
    if (this.eWL == null)
      return;
    this.aN = ((dpI)this.eWL).o(0, cVC());
  }

  protected void a(aVc paramaVc, boolean paramBoolean)
  {
    if ((this.aN == 0.0F) || (this.evp == null) || (!this.evp.b(eu.azE)) || (!(this.evp instanceof dhJ)))
    {
      cVD();
      return;
    }

    this.lAZ = new UL(((dhJ)this.evp).cQY(), eu.azE, eu.azc, this.aN);

    ((Rx)this.evp.a(eu.azE)).a(this.lAZ);
    this.lAZ.b(Xh.cHp, this.evp.e(eu.azE));
  }

  public void aK()
  {
    super.aK();
    if ((this.evp == null) || (!this.evp.b(eu.azE)) || (this.lAZ == null)) {
      return;
    }
    ((Rx)this.evp.a(eu.azE)).b(this.lAZ);
    this.lAZ.b(Xh.cHm, this.evp.e(eu.azE));
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

  public cCH lJ()
  {
    return this.aFR;
  }

  public void bc()
  {
    this.aN = 0.0F;
    this.lAZ = null;
    super.bc();
  }
}