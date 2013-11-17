import org.apache.log4j.Logger;

public class azy extends doA
{
  private static final aee bx = new bOO(new cbe());

  private static final qM by = new dzQ(new ec[] { new dLx("Pas de params", new dmb[0]) });

  public qM aF()
  {
    return by;
  }

  public azy aLo()
  {
    azy localazy;
    try
    {
      localazy = (azy)bx.Mm();
      localazy.aOr = bx;
    } catch (Exception localException) {
      localazy = new azy();
      localazy.aOr = null;
      localazy.eXg = false;
      K.error("Erreur lors d'un newInstance sur RevealInvisibility : " + localException.getMessage());
    }
    return localazy;
  }

  protected void a(aVc paramaVc, boolean paramBoolean)
  {
    if ((this.evo != null) && ((this.evo instanceof dhJ)) && (this.evp != null) && ((this.evp instanceof dhJ))) {
      dhJ localdhJ1 = (dhJ)this.evo;
      dhJ localdhJ2 = (dhJ)this.evp;

      if (localdhJ2.c(cfY.hBf))
      {
        if (localdhJ1.afv() != null) {
          ((dbE)localdhJ1.afv()).w(localdhJ2);
        }
      }
    }
    jJ(true);
  }

  public void a(aVc paramaVc)
  {
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