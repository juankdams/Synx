import org.apache.log4j.Logger;

public final class iT extends ccB
{
  private static final aee bx = new bOO(new cSA());

  public iT()
  {
    aH();
  }

  public iT qO()
  {
    iT localiT;
    try {
      localiT = (iT)bx.Mm();
      localiT.aOr = bx;
    } catch (Exception localException) {
      localiT = new iT();
      localiT.aOr = null;
      localiT.eXg = false;
      K.error("Erreur lors d'un checkOut sur un NullEffectOnCell : " + localException.getMessage());
    }
    return localiT;
  }

  public boolean aL() {
    return false;
  }

  public boolean aM() {
    return false;
  }

  public boolean aN() {
    return true;
  }
}