import java.util.ArrayList;

public final class aGi extends cIX
{
  private static final ArrayList ayr = new ArrayList();
  private boolean aXA;

  public aGi(ArrayList paramArrayList)
  {
    int i = J(paramArrayList);
    if (i == 1)
      this.aXA = ((cic)paramArrayList.get(0)).getValue().equalsIgnoreCase("target");
  }

  protected ArrayList Vs()
  {
    return ayr;
  }

  public long b(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4)
  {
    if ((paramObject2 instanceof cYk))
      return ((cYk)paramObject2).getX();
    axQ localaxQ = aAw.b(this.aXA, paramObject1, paramObject2, paramObject4, paramObject3);
    if (localaxQ == null)
      return -9223372036854775808L;
    return localaxQ.fa();
  }

  public boolean pH()
  {
    return true;
  }

  public Enum gm()
  {
    return Bz.bCU;
  }

  static
  {
    ayr.add(zT.buX);
    ayr.add(zT.buY);
  }
}