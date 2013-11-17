import org.apache.log4j.Logger;

public final class bWg extends doA
{
  private static final aee bx = new bOO(new vU());

  private static final qM by = new dzQ(new ec[] { new dLx("Params", new dmb[0]) });

  public qM aF()
  {
    return by;
  }

  public bWg()
  {
    aH();
  }

  public bWg cbu()
  {
    bWg localbWg;
    try {
      localbWg = (bWg)bx.Mm();
      localbWg.aOr = bx;
    } catch (Exception localException) {
      localbWg = new bWg();
      localbWg.aOr = null;
      localbWg.eXg = false;
      K.error("Erreur lors d'un checkOut sur un NullEffectNotifiedToAI : " + localException.getMessage());
    }
    return localbWg;
  }

  public void a(aVc paramaVc)
  {
  }

  protected void a(aVc paramaVc, boolean paramBoolean)
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