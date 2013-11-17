public class cWU extends InheritableThreadLocal
  implements BB, bME
{
  public static synchronized cWU Z(FF paramFF)
  {
    cWU localcWU = (cWU)paramFF.bR("ant.LocalProperties");

    if (localcWU == null) {
      localcWU = new cWU();
      paramFF.g("ant.LocalProperties", localcWU);
      afR.t(paramFF).a(localcWU);
    }
    return localcWU;
  }

  protected synchronized cJY cKH()
  {
    return new cJY();
  }

  private cJY cKI() {
    return (cJY)get();
  }

  public void ny(String paramString)
  {
    cKI().ny(paramString);
  }

  public void cDP()
  {
    cKI().cDP();
  }

  public void cDQ()
  {
    cKI().cDQ();
  }

  public void copy()
  {
    set(cKI().cDR());
  }

  public Object a(String paramString, afR paramafR)
  {
    return cKI().a(paramString, paramafR);
  }

  public boolean a(String paramString, Object paramObject, afR paramafR)
  {
    return cKI().a(paramString, paramObject, paramafR);
  }

  public boolean b(String paramString, Object paramObject, afR paramafR)
  {
    return cKI().b(paramString, paramObject, paramafR);
  }
}