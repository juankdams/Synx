import org.apache.log4j.Logger;

public class cWB extends doA
{
  private static final aee bx = new bOO(new uZ());

  private static final qM by = new dzQ(new ec[] { new dLx("modifie le caster de l'effet déclenché par la cible (le porteur de cet effet)", new dmb[0]) });

  public qM aF()
  {
    return by;
  }

  public cWB cKv()
  {
    cWB localcWB;
    try
    {
      localcWB = (cWB)bx.Mm();
      localcWB.aOr = bx;
    } catch (Exception localException) {
      localcWB = new cWB();
      localcWB.eXg = false;
      localcWB.aOr = null;
      K.error("Erreur lors d'un checkOut sur un UpdateTargetByOther : " + localException.getMessage());
    }
    return localcWB;
  }

  protected void a(aVc paramaVc, boolean paramBoolean)
  {
    if ((paramaVc != null) && (paramBoolean) && (paramaVc.bkf() != null)) {
      paramaVc.i(paramaVc.bkf());
    }
    jJ(true);
  }

  public void a(aVc paramaVc)
  {
    int i = cVC();
    if (this.eWL != null);
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