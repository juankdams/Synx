import java.util.ArrayList;
import java.util.List;

public final class dwc extends akN
{
  private static final ArrayList ayr = new ArrayList();

  public dwc(ArrayList paramArrayList)
  {
    u(paramArrayList);
  }

  protected List kM()
  {
    return ayr;
  }

  public int a(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4)
  {
    axQ localaxQ = aAw.b(true, paramObject1, paramObject2, paramObject4, paramObject3);

    if (paramObject2 == null) {
      return -1;
    }
    cYk localcYk = new cYk(localaxQ.ML());
    CG localCG = localaxQ.E();

    localcYk.aa(localCG.hY, localCG.hZ, 0);

    dMe localdMe = new dMe();

    return localdMe.a(paramObject1, localcYk, paramObject3, paramObject4);
  }

  public Enum gm()
  {
    return Bz.bDk;
  }

  static
  {
    ayr.add(zT.buX);
  }
}