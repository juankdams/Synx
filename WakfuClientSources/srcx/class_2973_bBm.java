import org.apache.log4j.Logger;

public final class bBm extends oy
{
  private static final aee bx = new bOO(new pl());

  private static final qM by = new dzQ(new ec[] { new dLx("Retrait uniquement", new dmb[] { new dmb("Zone a retirer (-1 pour tout retirer)", dnN.lnR) }) });

  public qM aF()
  {
    return by;
  }

  public bBm() {
    aH();
  }

  public bBm bKd()
  {
    bBm localbBm;
    try {
      localbBm = (bBm)bx.Mm();
      localbBm.aOr = bx;
    } catch (Exception localException) {
      localbBm = new bBm();
      localbBm.aOr = null;
      localbBm.eXg = false;
      K.error("Erreur lors d'un checkOut sur un ReplaceAreaByAnotherUsingTarget : " + localException.getMessage());
    }
    return localbBm;
  }

  protected boolean d(cjK paramcjK)
  {
    return (!paramcjK.aeH()) || (super.d(paramcjK));
  }

  public boolean aM()
  {
    return true;
  }

  public boolean aN()
  {
    return false;
  }
}