import org.apache.log4j.Logger;

public final class cja extends doA
{
  private static final aee bx = new bOO(new vb());

  private static final qM by = new dzQ(new ec[] { new dLx("Params", new dmb[0]) });

  public qM aF()
  {
    return by;
  }

  public cja()
  {
    aH();
  }

  public cja ckW()
  {
    cja localcja;
    try {
      localcja = (cja)bx.Mm();
      localcja.aOr = bx;
    } catch (Exception localException) {
      localcja = new cja();
      localcja.aOr = null;
      localcja.eXg = false;
      K.error("Erreur lors d'un checkOut sur un DecurseLinkedToCaster : " + localException.getMessage());
    }
    return localcja;
  }

  public void a(aVc paramaVc)
  {
  }

  protected void a(aVc paramaVc, boolean paramBoolean)
  {
    if ((this.evp == null) || (wa() == null) || (this.evp.atO() == null)) {
      cVD();
      return;
    }

    bgJ localbgJ = (bgJ)this.evp.atO();
    localbgJ.p(this.evo);
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

  public void bc()
  {
    super.bc();
  }
}