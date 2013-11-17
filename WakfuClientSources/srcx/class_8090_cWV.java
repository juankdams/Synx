import org.apache.log4j.Logger;

public abstract class cWV
{
  private static final Logger K = Logger.getLogger(cWV.class);
  public static final int NONE = -1;
  public static final int kJE = 0;
  public static final int kJF = 1;
  public static final int cFn = 2;
  protected int kJG = -1;

  public abstract int getType();

  public void f(cew paramcew)
  {
    paramcew.a(dFc.dgE());
  }

  public int t(cew paramcew)
  {
    return a(paramcew, bts());
  }

  public int u(cew paramcew)
  {
    return a(paramcew, btt());
  }

  private int a(cew paramcew, String paramString) {
    int i = paramcew.H(paramString);
    if (i == 2147483647) {
      if (!paramString.equals(paramcew.atp()))
        K.warn("acteur gfxId=" + paramcew.cbD().oc() + " n'a pas une anim " + paramString + " valide");
      return 0;
    }
    return i;
  }

  protected abstract String bts();

  protected abstract String btt();

  public abstract void g(cew paramcew);

  public boolean a(cWV paramcWV)
  {
    if (paramcWV == this)
      return true;
    if ((paramcWV == null) || (paramcWV.getType() != getType()))
      return false;
    return true;
  }

  public String cfE() {
    return "AnimHit";
  }

  public String[] cfF() {
    return null;
  }

  public int cKJ() {
    return this.kJG;
  }

  public abstract void h(cew paramcew);
}