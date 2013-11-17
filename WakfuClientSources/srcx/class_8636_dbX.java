import org.apache.log4j.Logger;

public class dbX extends doA
{
  private static final aee bx = new bOO(new Vd());

  private static final qM by = new dzQ(new ec[] { new dLx("chance de loot fixe (%)", new dmb[] { new dmb("% de ramasser l'item", dnN.lnR) }) });

  public qM aF()
  {
    return by;
  }

  public dbX cNI()
  {
    dbX localdbX;
    try
    {
      localdbX = (dbX)bx.Mm();
      localdbX.aOr = bx;
    } catch (Exception localException) {
      localdbX = new dbX();
      localdbX.aOr = null;
      localdbX.eXg = false;
      K.error("Erreur lors d'un newInstance sur PickUpItem : " + localException.getMessage());
    }
    return localdbX;
  }

  protected void a(aVc paramaVc, boolean paramBoolean)
  {
    if ((bkt()) && (this.cxl > 0) && (dpe.AX(100) <= this.cxl) && 
      ((bke() instanceof dhJ)) && ((bkf() instanceof dhJ))) {
      dhJ localdhJ = (dhJ)bke();
      if ((this.ejP instanceof dMC)) {
        dbE localdbE = ((dMC)this.ejP).dps();
        if (localdbE != null)
          localdbE.a(this.eUw.getX(), this.eUw.getY(), localdhJ, true);
      }
    }
  }

  public void a(aVc paramaVc)
  {
    short s = cVC();
    if (this.eWL != null)
      this.cxl = ((dpI)this.eWL).a(0, s, dNF.mei);
    this.cxl = 0;
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
}