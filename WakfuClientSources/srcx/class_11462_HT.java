import org.apache.log4j.Logger;

public final class HT extends doA
{
  private static final aee bx = new bOO(new Fa());

  private static final qM by = new dzQ(new ec[] { new dLx("Params", new dmb[0]) });

  public qM aF()
  {
    return by;
  }

  public HT() {
    aH();
  }

  public HT Rj()
  {
    HT localHT;
    try {
      localHT = (HT)bx.Mm();
      localHT.aOr = bx;
    } catch (Exception localException) {
      localHT = new HT();
      localHT.aOr = null;
      localHT.eXg = false;
      K.error("Erreur lors d'un checkOut sur un SetResistanceTarget : " + localException.getMessage());
    }
    return localHT;
  }

  public void a(aVc paramaVc)
  {
  }

  protected void a(aVc paramaVc, boolean paramBoolean)
  {
    cVD();
    if ((this.evo == null) || (this.evp == null)) {
      return;
    }
    if ((this.evp instanceof dhJ))
      ((dhJ)this.evp).B(this.evo);
  }

  public void aK()
  {
    super.aK();
    if (this.evp == null)
      return;
    if ((this.evp instanceof dhJ))
      ((dhJ)this.evp).B(null);
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