import java.util.ArrayList;

public final class dtd extends akN
{
  private static final ArrayList ayr = new ArrayList();

  public dtd(ArrayList paramArrayList)
  {
    u(paramArrayList);
  }

  protected ArrayList Vs()
  {
    return ayr;
  }

  public int a(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4)
  {
    doA localdoA = aAw.aj(paramObject3);
    if (localdoA == null)
      return -1;
    dpI localdpI = (dpI)localdoA.bkc();
    if ((localdpI == null) || ((localdpI.aui().eL() == chY.hGe) && (!localdpI.a(PY.coz))))
    {
      return -1;
    }
    return 0;
  }

  public Enum gm()
  {
    return Bz.bDA;
  }

  static
  {
    ayr.add(zT.buX);
  }
}