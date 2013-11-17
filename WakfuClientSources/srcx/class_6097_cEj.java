import org.apache.log4j.Logger;

public class cEj extends dKf
{
  private static final Logger K = Logger.getLogger(cEj.class);
  private int bWq;
  private short aFe;

  public cEj(int paramInt)
  {
    super(paramInt);
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

  public void c(String[] paramArrayOfString) {
    this.bWq = Integer.parseInt(paramArrayOfString[0]);
    this.aFe = Short.parseShort(paramArrayOfString[1]);
  }

  public void clear()
  {
  }
}