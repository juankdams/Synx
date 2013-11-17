import java.util.BitSet;
import org.apache.log4j.Logger;

public class cE extends gE
{
  private static final aee bx = new bOO(new cJd());

  public cE gr()
  {
    cE localcE;
    try
    {
      localcE = (cE)bx.Mm();
      localcE.aOr = bx;
    } catch (Exception localException) {
      localcE = new cE();
      localcE.aOr = null;
      localcE.eXg = false;
      K.error("Erreur lors d'un checkOut sur un Push : " + localException.getMessage());
    }
    localcE.aFK = true;
    return localcE;
  }

  public void aH() {
    super.aH();
    this.eWR.set(198);
  }

  protected dle gs() {
    return this.evp;
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
    return true;
  }
}