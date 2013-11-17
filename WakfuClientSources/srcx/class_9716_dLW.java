import org.apache.log4j.Logger;

public final class dLW extends avO
{
  private static final aee bx = new bOO(new aZq());

  private static final qM by = new dzQ(new ec[] { new dLx("Distance a parcourir", new dmb[] { new dmb("valeur", dnN.lnR) }) });

  public qM aF()
  {
    return by;
  }

  public dLW() {
    aH();
  }

  public dLW dpc()
  {
    dLW localdLW;
    try {
      localdLW = (dLW)bx.Mm();
      localdLW.aOr = bx;
    } catch (Exception localException) {
      localdLW = new dLW();
      localdLW.aOr = null;
      localdLW.eXg = false;
      K.error("Erreur lors d'un checkOut sur un MoveAwayFromCell : " + localException.getMessage());
    }
    return localdLW;
  }

  boolean aAu()
  {
    return false;
  }

  boolean aAv()
  {
    return (this.eUw != null) && (!aHE()) && (!aHF()) && (!aHI());
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