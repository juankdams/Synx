import java.util.ArrayList;

public final class dPo extends cIX
{
  private static final ArrayList ayr = new ArrayList();

  private boolean aXA = false;
  private long crQ;

  public dPo(ArrayList paramArrayList)
  {
    int i = J(paramArrayList);
    this.crQ = ((aOw)paramArrayList.get(0)).b(null, null, null, null);
    if (i == 1)
      this.aXA = ((cic)paramArrayList.get(1)).getValue().equalsIgnoreCase("target");
  }

  protected ArrayList Vs()
  {
    return ayr;
  }

  public long b(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4)
  {
    axQ localaxQ = aAw.b(this.aXA, paramObject1, paramObject2, paramObject4, paramObject3);
    if (localaxQ == null) {
      return -1L;
    }
    return localaxQ.dv(this.crQ);
  }

  public boolean pH()
  {
    return true;
  }

  public Enum gm()
  {
    return Bz.bDl;
  }

  static
  {
    ayr.add(zT.bva);
    ayr.add(new Pq[] { Pq.chv, Pq.chu });
  }
}