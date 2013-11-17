import org.apache.log4j.Logger;

public final class Di extends cBf
{
  private static final aee bx = new bOO(new dNI());

  private static final qM by = new dzQ(new ec[] { new dLx("Params", new dmb[0]) });

  public qM aF()
  {
    return by;
  }

  public Di()
  {
    aH();
  }

  public Di Mv()
  {
    Di localDi;
    try {
      localDi = (Di)bx.Mm();
      localDi.aOr = bx;
    } catch (Exception localException) {
      localDi = new Di();
      localDi.aOr = null;
      localDi.eXg = false;
      K.error("Erreur lors d'un checkOut sur un BringBackToControllerSymbiot : " + localException.getMessage());
    }
    return localDi;
  }

  protected dle Mw() {
    if (!(this.evo instanceof dhJ))
      return null;
    return ((dhJ)this.evo).afw();
  }
}