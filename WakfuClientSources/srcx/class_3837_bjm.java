import org.apache.log4j.Logger;

public class bjm extends doA
{
  private static final aee bx = new bOO(new aUn());

  private static final qM by = new dzQ(new ec[] { new dLx("modifie la cible de l'effet déclenché par le caster", new dmb[0]) });

  public qM aF()
  {
    return by;
  }

  public bjm buO()
  {
    bjm localbjm;
    try
    {
      localbjm = (bjm)bx.Mm();
      localbjm.aOr = bx;
    } catch (Exception localException) {
      localbjm = new bjm();
      localbjm.eXg = false;
      localbjm.aOr = null;
      K.error("Erreur lors d'un checkOut sur un UpdateTargetByOther : " + localException.getMessage());
    }
    return localbjm;
  }

  protected void a(aVc paramaVc, boolean paramBoolean)
  {
    if ((paramaVc != null) && (paramBoolean) && (this.evo != null)) {
      paramaVc.j(this.evo);
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