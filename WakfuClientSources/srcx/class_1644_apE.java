import org.apache.log4j.Logger;

public final class apE extends doA
{
  private static final aee bx = new bOO(new cOi());

  private static final qM by = new dzQ(new ec[] { new dLx("Params", new dmb[0]) });

  public qM aF()
  {
    return by;
  }

  public apE() {
    aH();
  }

  public apE aBA()
  {
    apE localapE;
    try {
      localapE = (apE)bx.Mm();
      localapE.aOr = bx;
    } catch (Exception localException) {
      localapE = new apE();
      localapE.aOr = null;
      localapE.eXg = false;
      K.error("Erreur lors d'un checkOut sur un ChangeSpellTargetCellByCasterCell : " + localException.getMessage());
    }
    return localapE;
  }

  public void a(aVc paramaVc)
  {
  }

  protected void a(aVc paramaVc, boolean paramBoolean)
  {
    if ((!(this.ejP instanceof dMC)) || (this.evo == null)) {
      return;
    }
    ((dMC)this.ejP).dps().ah(this.evo.ML());
  }

  public boolean aL()
  {
    return true;
  }

  public boolean aM()
  {
    return false;
  }

  public boolean aN()
  {
    return true;
  }

  public void bc()
  {
    super.bc();
  }
}