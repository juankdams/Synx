import org.apache.log4j.Logger;

public final class IN extends doA
{
  private static final aee bx = new bOO(new bYo());

  private static final qM by = new dzQ(new ec[] { new dLx("Annulation d'un lancer de sort", new dmb[0]) });

  public qM aF()
  {
    return by;
  }

  public IN Sj()
  {
    IN localIN;
    try {
      localIN = (IN)bx.Mm();
      localIN.aOr = bx;
    } catch (Exception localException) {
      localIN = new IN();
      localIN.aOr = null;
      localIN.eXg = false;
      K.error("Erreur lors d'un checkOut sur un SpellBreak : " + localException.getMessage());
    }

    return localIN;
  }

  protected void a(aVc paramaVc, boolean paramBoolean)
  {
    if (this.evp != null)
      this.evp.a(cfY.hBP);
  }

  public void aK() {
    if (this.evp != null)
      this.evp.b(cfY.hBP);
    super.aK();
  }

  public boolean aL() {
    return true;
  }

  public boolean aM() {
    return true;
  }

  public boolean aN() {
    return false;
  }

  public void a(aVc paramaVc)
  {
  }
}