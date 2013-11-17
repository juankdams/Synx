import org.apache.log4j.Logger;

public final class bzy extends doA
{
  private static final aee bx = new bOO(new cxU());

  private static final qM by = new dzQ(new ec[] { new dLx("Default", new dmb[0]) });

  public qM aF()
  {
    return by;
  }

  public bzy() {
    aH();
  }

  public bzy bIo()
  {
    bzy localbzy;
    try {
      localbzy = (bzy)bx.Mm();
      localbzy.aOr = bx;
    } catch (Exception localException) {
      localbzy = new bzy();
      localbzy.aOr = null;
      localbzy.eXg = false;
      K.error("Erreur lors d'un checkOut sur un FakeKo : " + localException.getMessage());
    }
    return localbzy;
  }

  public void a(aVc paramaVc)
  {
    if ((this.evp != null) && (this.evp.b(eu.ayM)))
      this.cxl = this.evp.e(eu.ayM);
  }

  protected void a(aVc paramaVc, boolean paramBoolean)
  {
    if ((this.evp != null) && (this.evp.b(eu.ayM)))
      this.evp.a(eu.ayM).cpy();
    else
      jJ(true);
  }

  public void aK()
  {
    if ((this.evp != null) && (this.evp.b(eu.ayM))) {
      this.evp.a(eu.ayM).set(this.cxl);
      ((dhJ)this.evp).jm(true);
    }
    jI(true);
    super.aK();
  }

  protected boolean afW()
  {
    return true;
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