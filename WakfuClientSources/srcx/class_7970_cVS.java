import org.apache.log4j.Logger;

public class cVS extends doA
{
  private static final aee bx = new bOO(new agb());

  private static final qM by = new dzQ(new ec[] { new dLx("Ordre à une créature lié à une cellule", new dmb[] { new dmb("Id", dnN.lnQ) }) });
  private long kIv;
  public cCH aAR = new age(this, 8);

  public qM aF()
  {
    return by;
  }

  public cVS() {
    aH();
  }

  public cVS cKj()
  {
    cVS localcVS;
    try
    {
      localcVS = (cVS)bx.Mm();
      localcVS.aOr = bx;
    } catch (Exception localException) {
      localcVS = new cVS();
      localcVS.aOr = null;
      localcVS.eXg = false;
      K.error("Erreur lors d'un checkOut sur un OrderSummon : " + localException.getMessage());
    }
    return localcVS;
  }

  protected void a(aVc paramaVc, boolean paramBoolean)
  {
    dle localdle = this.ejP.LD().bk(this.kIv);
    if ((localdle != null) && ((localdle instanceof dhJ)) && 
      (this.cxl >= 0))
      ((dhJ)localdle).h(this.cxl, this.eUw);
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
    return false;
  }

  public boolean aN()
  {
    return true;
  }

  public cCH lJ()
  {
    return this.aAR;
  }
}