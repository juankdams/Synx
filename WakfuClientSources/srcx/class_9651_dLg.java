import org.apache.log4j.Logger;

public final class dLg extends oy
{
  private static final aee bx = new bOO(new dMs());

  private static final qM by = new dzQ(new ec[] { new dLx("Retrait uniquement", new dmb[] { new dmb("Zone a retirer (-1 pour tout retirer)", dnN.lnR) }) });

  public qM aF()
  {
    return by;
  }

  public dLg() {
    aH();
  }

  public dLg djN()
  {
    dLg localdLg;
    try {
      localdLg = (dLg)bx.Mm();
      localdLg.aOr = bx;
    } catch (Exception localException) {
      localdLg = new dLg();
      localdLg.aOr = null;
      localdLg.eXg = false;
      K.error("Erreur lors d'un checkOut sur un ReplaceAreaByAnotherUsingTarget : " + localException.getMessage());
    }
    return localdLg;
  }
}