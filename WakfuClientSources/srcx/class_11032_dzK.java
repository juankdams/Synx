import org.apache.log4j.Logger;

public class dzK extends doA
{
  private static final aee bx = new bOO(new JE());

  private static final qM by = new dzQ(new ec[] { new dLx("Ordre à une créature ciblé sur une autre créature", new dmb[] { new dmb("Id", dnN.lnQ) }) });
  private long kIv;
  public cCH aAR = new JD(this, 8);

  public qM aF()
  {
    return by;
  }

  public dzK() {
    aH();
  }

  public dzK dde()
  {
    dzK localdzK;
    try
    {
      localdzK = (dzK)bx.Mm();
      localdzK.aOr = bx;
    } catch (Exception localException) {
      localdzK = new dzK();
      localdzK.aOr = null;
      localdzK.eXg = false;
      K.error("Erreur lors d'un checkOut sur un OrderSummon : " + localException.getMessage());
    }
    return localdzK;
  }

  protected void a(aVc paramaVc, boolean paramBoolean)
  {
    if ((this.evp != null) && ((this.evp instanceof dhJ)) && 
      (this.cxl >= 0))
      ((dhJ)this.evp).h(this.cxl, this.evp);
  }

  public void aK()
  {
    if ((this.evp != null) && ((this.evp instanceof dhJ)) && 
      (this.cxl >= 0)) {
      ((dhJ)this.evp).i(this.cxl, this.evp);
    }

    super.aK();
  }

  public void a(aVc paramaVc)
  {
    short s = cVC();

    if (this.eWL != null)
      this.cxl = ((dpI)this.eWL).a(0, s, dNF.mei);
    else
      this.cxl = -1;
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
    return this.aAR;
  }
}