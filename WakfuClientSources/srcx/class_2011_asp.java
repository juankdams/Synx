import org.apache.log4j.Logger;

public final class asp extends doA
{
  private static final aee bx = new bOO(new aaR());

  private static final qM by = new dzQ(new ec[] { new dLx("Pas de params", new dmb[0]) });
  private int dCi;

  public qM aF()
  {
    return by;
  }

  public asp() {
  }

  public asp(int paramInt) {
    this.dCi = paramInt;
    aH();
  }

  public asp aEG()
  {
    asp localasp;
    try {
      localasp = (asp)bx.Mm();
      localasp.aOr = bx;
    } catch (Exception localException) {
      localasp = new asp();
      localasp.aOr = null;
      localasp.eXg = false;
      K.error("Erreur lors d'un checkOut sur un RemoveEffectFromContainerType : " + localException.getMessage());
    }
    localasp.dCi = this.dCi;
    return localasp;
  }

  public void a(aVc paramaVc)
  {
  }

  protected void a(aVc paramaVc, boolean paramBoolean)
  {
    if ((this.evp == null) || (this.evp.atO() == null)) {
      cVD();
      return;
    }
    ((bgJ)this.evp.atO()).a(this.dCi, true, true);
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