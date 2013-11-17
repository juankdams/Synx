import java.util.BitSet;
import org.apache.log4j.Logger;

public final class bqe extends avO
{
  protected static final aee bx = new bOO(new cyJ());

  private static final qM by = new dzQ(new ec[] { new dLx("Se rapproche au maximum de la cible", new dmb[0]), new dLx("Rapproche le caster de la cible", new dmb[] { new dmb("nombre de case d'écart (0 possible)", dnN.lnR) }) });

  public qM aF()
  {
    return by;
  }

  public bqe bzb()
  {
    bqe localbqe;
    try {
      localbqe = (bqe)bx.Mm();
      localbqe.aOr = bx;
    } catch (Exception localException) {
      localbqe = new bqe();
      localbqe.aOr = null;
      K.error("Erreur lors d'un checkOut sur un ArenaRunningEffect : " + localException.getMessage());
    }
    localbqe.dKF = this.dKF;
    return localbqe;
  }

  public void aH()
  {
    super.aH();
    this.eWR.set(193);
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

  public boolean bzc() {
    return true;
  }

  boolean aAv()
  {
    return (this.evo != null) && (!aHE()) && (!aHF()) && (!aHJ());
  }

  boolean aAw()
  {
    return false;
  }

  public agl aAx()
  {
    if ((this.evo instanceof agl))
      return (agl)this.evo;
    return null;
  }

  cYk aAy()
  {
    return this.eUw;
  }

  boolean aAu()
  {
    return true;
  }
}