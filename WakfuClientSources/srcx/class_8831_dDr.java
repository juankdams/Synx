import java.util.ArrayList;
import java.util.List;

public final class dDr extends akN
{
  private static final ArrayList ayr = new ArrayList();
  private boolean aXA;

  public dDr(ArrayList paramArrayList)
  {
    u(paramArrayList);
    this.aXA = ((cic)paramArrayList.get(0)).getValue().equalsIgnoreCase("target");
  }

  protected List kM()
  {
    return ayr;
  }

  public int a(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4)
  {
    axQ localaxQ = aAw.b(this.aXA, paramObject1, paramObject2, paramObject4, paramObject3);
    if ((localaxQ instanceof dhJ))
      return ((dhJ)localaxQ).cRj() ? 0 : -1;
    return -1;
  }

  public Enum gm()
  {
    return Bz.bCT;
  }

  static
  {
    ayr.add(zT.buY);
  }
}