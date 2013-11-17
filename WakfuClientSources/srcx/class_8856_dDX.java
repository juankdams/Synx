import org.apache.log4j.Logger;

public class dDX extends dKf
{
  private static final Logger K = Logger.getLogger(dDX.class);

  private int bQm = 0;
  private boolean aKV = false;

  public dDX(int paramInt) {
    super(paramInt);
  }

  public boolean f(gA paramgA) {
    byz localbyz = byv.bFN().bFO();

    if (this.aKV)
    {
      K.error("[ItemAction] On essaye de lancer une action plusieurs fois d'affilé", new UnsupportedOperationException());
      return false;
    }

    if (localbyz.bGP().iS(paramgA.oj()) == null) {
      K.error("[ItemAction] On essaye de lancer une action avec un item qui n'est pas dans les bags");
      return false;
    }

    display();

    bZ(paramgA.oj());
    return true;
  }

  public void display() {
    Hv localHv = Hv.QV();
    localHv.eR(this.bQm);
    byv.bFN().a(localHv);
  }

  public boolean isRunning() {
    return this.aKV;
  }

  public void c(String[] paramArrayOfString) {
    this.bQm = Integer.valueOf(paramArrayOfString[0]).intValue();
  }

  public void clear()
  {
  }
}