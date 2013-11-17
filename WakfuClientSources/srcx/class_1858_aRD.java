import java.util.BitSet;
import org.apache.log4j.Logger;

public final class aRD extends doA
{
  private BitSet eOE;
  private static final aee bx = new bOO(new bUY());

  private static final qM by = new dzQ(new ec[] { new dLx("Desc", new dmb[] { new dmb("Id", dnN.lnR) }) });

  public qM aF()
  {
    return by;
  }

  public aRD() {
    aH();
    this.eOE = new BitSet();
    this.eOE.set(1024);
  }

  public aRD bhU()
  {
    aRD localaRD;
    try {
      localaRD = (aRD)bx.Mm();
      localaRD.aOr = bx;
    } catch (Exception localException) {
      localaRD = new aRD();
      localaRD.aOr = null;
      localaRD.eXg = false;
      K.error("Erreur lors d'un checkOut sur un ChangeSpellTargetCell : " + localException.getMessage());
    }
    return localaRD;
  }

  public void a(aVc paramaVc)
  {
  }

  protected void a(aVc paramaVc, boolean paramBoolean)
  {
    if (!(this.ejP instanceof dMC)) {
      return;
    }
    ((dMC)this.ejP).dps().ah(this.eUw);
  }

  public boolean aL()
  {
    return false;
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