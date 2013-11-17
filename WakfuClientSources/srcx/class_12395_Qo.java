import org.apache.log4j.Logger;

public final class Qo extends oy
{
  private static final aee bx = new bOO(new blm());

  private static final qM by = new dzQ(new ec[] { new dLx("Retrait uniquement", new dmb[] { new dmb("Zone a retirer (-1 pour tout retirer)", dnN.lnR) }) });

  public qM aF()
  {
    return by;
  }

  public Qo() {
    aH();
  }

  public Qo acc()
  {
    Qo localQo;
    try {
      localQo = (Qo)bx.Mm();
      localQo.aOr = bx;
    } catch (Exception localException) {
      localQo = new Qo();
      localQo.aOr = null;
      localQo.eXg = false;
      K.error("Erreur lors d'un checkOut sur un ReplaceAreaByAnotherUsingTarget : " + localException.getMessage());
    }
    return localQo;
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