import org.apache.log4j.Logger;

public class cVy extends dKf
{
  private static final Logger K = Logger.getLogger(cVy.class);

  public cVy(int paramInt) {
    super(paramInt);
  }

  public boolean f(gA paramgA) {
    byz localbyz = byv.bFN().bFO();

    if (localbyz.bGP().iS(paramgA.oj()) == null) {
      K.error("[ItemAction] On essaye de lancer une action avec un item qui n'est pas dans les bags");
      return false;
    }

    if (!byv.bFN().c(bNu.bVe())) {
      byv.bFN().a(bNu.bVe());
    }
    bZ(paramgA.oj());
    return true;
  }

  public void c(String[] paramArrayOfString)
  {
  }

  public void clear()
  {
  }
}