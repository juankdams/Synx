import org.apache.log4j.Logger;

public class drJ extends doA
{
  private static final aee bx = new bOO(new bUA());

  private static final qM by = new dzQ(new ec[] { new dLx("remplace la cible de l'effet déclencheur par son propriétaire", new dmb[0]) });

  public qM aF()
  {
    return by;
  }

  public drJ cYy()
  {
    drJ localdrJ;
    try
    {
      localdrJ = (drJ)bx.Mm();
      localdrJ.aOr = bx;
    } catch (Exception localException) {
      localdrJ = new drJ();
      localdrJ.eXg = false;
      localdrJ.aOr = null;
      K.error("Erreur lors d'un checkOut sur un UpdateTargetByOwner : " + localException.getMessage());
    }
    return localdrJ;
  }

  protected void a(aVc paramaVc, boolean paramBoolean)
  {
    if ((paramaVc == null) || (!paramBoolean))
    {
      jJ(true);
      return;
    }

    dle localdle1 = paramaVc.bkf();
    if (localdle1 == null)
    {
      jJ(true);
      return;
    }

    dle localdle2 = E(localdle1);
    if ((localdle2 == null) || (localdle2 == localdle1))
    {
      jJ(true);
      return;
    }

    paramaVc.j(localdle2);
  }

  private dle E(dle paramdle)
  {
    if ((paramdle instanceof dhJ))
      return ((dhJ)paramdle).afw();
    if ((paramdle instanceof cBn))
      return E(((cBn)paramdle).axG());
    return paramdle;
  }

  public void a(aVc paramaVc)
  {
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
}