import org.apache.log4j.Logger;

public class qz extends dKf
{
  private static final Logger K = Logger.getLogger(qz.class);

  public qz(int paramInt) {
    super(paramInt);
  }

  public void c(String[] paramArrayOfString) {
  }

  public boolean f(gA paramgA) {
    byz localbyz = byv.bFN().bFO();

    if (localbyz.bGP().iS(paramgA.oj()) == null) {
      K.error("[ItemAction] On essaye de lancer une action avec un item qui n'est pas dans les bags");
      return false;
    }

    bZ(paramgA.oj());
    return true;
  }

  public void clear()
  {
  }
}