import org.apache.log4j.Logger;

public final class XK extends doA
{
  private static final aee bx = new bOO(new dzG());

  private static final qM by = new dzQ(new ec[] { new dLx("id de titre", new dmb[] { new dmb("valeur", dnN.lnR) }) });

  public XK ajI()
  {
    XK localXK;
    try
    {
      localXK = (XK)bx.Mm();
      localXK.aOr = bx;
    } catch (Exception localException) {
      localXK = new XK();
      localXK.aOr = null;
      localXK.eXg = false;
      K.error("Erreur lors d'un checkOut sur un GetPlayerTitle : " + localException.getMessage());
    }

    return localXK;
  }

  public qM aF()
  {
    return by;
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

  public void a(aVc paramaVc)
  {
    if (this.eWL != null)
      this.cxl = ((dpI)this.eWL).a(0, (short)0, dNF.mei);
  }

  protected void a(aVc paramaVc, boolean paramBoolean)
  {
    if ((this.evo != null) && ((this.evo instanceof dhJ)))
      ((dhJ)this.evo).rz(this.cxl);
  }
}