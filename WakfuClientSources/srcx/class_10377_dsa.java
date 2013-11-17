import org.apache.log4j.Logger;

public final class dsa extends doA
{
  private static final aee bx = new bOO(new bFz());

  private static final qM by = new dzQ(new ec[] { new dLx("Valeur", new dmb[] { new dmb("Valeur", dnN.lnR) }) });

  public qM aF()
  {
    return by;
  }

  public dsa() {
    aH();
  }

  public dsa cYK()
  {
    dsa localdsa;
    try {
      localdsa = (dsa)bx.Mm();
      localdsa.aOr = bx;
    } catch (Exception localException) {
      localdsa = new dsa();
      localdsa.aOr = null;
      localdsa.eXg = false;
      K.error("Erreur lors d'un checkOut sur un SimpleValueEffect : " + localException.getMessage());
    }
    return localdsa;
  }

  public void a(aVc paramaVc)
  {
    if (this.eWL == null)
      return;
    this.cxl = ((dpI)this.eWL).a(0, cVC(), dNF.meh);
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

  public void bc()
  {
    super.bc();
  }
}