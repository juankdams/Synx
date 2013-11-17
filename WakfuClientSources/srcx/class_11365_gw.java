import org.apache.log4j.Logger;

public class gw extends doA
{
  private static final aee bx = new bOO(new cTJ());

  private static final qM by = new dzQ(new ec[] { new dLx("nombre de kama volés fixes", new dmb[] { new dmb("nombres de kamas volés", dnN.lnR) }) });

  public qM aF()
  {
    return by;
  }

  public gw nD()
  {
    gw localgw;
    try
    {
      localgw = (gw)bx.Mm();
      localgw.aOr = bx;
    } catch (Exception localException) {
      localgw = new gw();
      localgw.aOr = null;
      localgw.eXg = false;
      K.error("Erreur lors d'un newInstance sur KamaSteal : " + localException.getMessage());
    }
    return localgw;
  }

  protected void a(aVc paramaVc, boolean paramBoolean)
  {
    if ((bkt()) && (this.cxl > 0) && (bkf() != null) && 
      ((bke() instanceof dhJ)) && ((bkf() instanceof dhJ))) {
      dhJ localdhJ1 = (dhJ)bke();
      dhJ localdhJ2 = (dhJ)bkf();

      int i = localdhJ2.dU(this.cxl);
      this.cxl = i;
      localdhJ1.dV(i);
    }
  }

  public void a(aVc paramaVc)
  {
    short s = cVC();
    this.cxl = 0;
    if (this.eWL != null)
      this.cxl = ((dpI)this.eWL).a(0, s, dNF.mei);
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
    return true;
  }
}