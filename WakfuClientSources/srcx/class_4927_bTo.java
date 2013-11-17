import org.apache.log4j.Logger;

public final class bTo extends doA
{
  private static final aee bx = new bOO(new aqH());

  private static final qM by = new dzQ(new ec[] { new dLx("Params", new dmb[0]) });

  public qM aF()
  {
    return by;
  }

  public bTo()
  {
    aH();
  }

  public bTo bZM()
  {
    bTo localbTo;
    try {
      localbTo = (bTo)bx.Mm();
      localbTo.aOr = bx;
    } catch (Exception localException) {
      localbTo = new bTo();
      localbTo.aOr = null;
      localbTo.eXg = false;
      K.error("Erreur lors d'un checkOut sur un ExcludeFromFight : " + localException.getMessage());
    }
    return localbTo;
  }

  public void a(aVc paramaVc)
  {
  }

  protected void a(aVc paramaVc, boolean paramBoolean)
  {
    if (this.evp == null)
      return;
    b(paramaVc, paramBoolean);
    if ((this.evp instanceof dhJ))
      ((dhJ)this.evp).adu();
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

  public void bc()
  {
    super.bc();
  }
}