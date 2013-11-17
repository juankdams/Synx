import org.apache.log4j.Logger;

public final class dFp extends doA
{
  private static final aee bx = new bOO(new cMs());

  private static final qM by = new dzQ(new ec[] { new dLx("Params", new dmb[0]) });

  public qM aF()
  {
    return by;
  }

  public dFp()
  {
    aH();
  }

  public dFp dgN()
  {
    dFp localdFp;
    try {
      localdFp = (dFp)bx.Mm();
      localdFp.aOr = bx;
    } catch (Exception localException) {
      localdFp = new dFp();
      localdFp.aOr = null;
      localdFp.eXg = false;
      K.error("Erreur lors d'un checkOut sur un InstantKO : " + localException.getMessage());
    }
    return localdFp;
  }

  public void a(aVc paramaVc) {
  }

  protected void a(aVc paramaVc, boolean paramBoolean) {
    if ((this.evp != null) && (this.evp.b(eu.ayM)))
      this.evp.a(eu.ayM).cpy();
    else
      jJ(true);
  }

  public boolean aL()
  {
    return false;
  }

  public boolean aM() {
    return true;
  }

  public boolean aN() {
    return false;
  }

  public void bc() {
    super.bc();
  }
}