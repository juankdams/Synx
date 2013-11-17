import java.util.ArrayList;
import java.util.List;

public final class cQv extends akN
{
  private static final ArrayList ayr = new ArrayList();
  private final boolean aXA;
  private final long kBt;

  public cQv(ArrayList paramArrayList)
  {
    u(paramArrayList);
    this.aXA = ((cic)paramArrayList.get(0)).getValue().equalsIgnoreCase("target");
    this.kBt = ((aOw)paramArrayList.get(1)).b(null, null, null, null);
  }

  protected List kM()
  {
    return ayr;
  }

  public int a(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4)
  {
    axQ localaxQ = aAw.b(this.aXA, paramObject1, paramObject2, paramObject4, paramObject3);

    if (localaxQ == null) {
      return -1;
    }
    dDN localdDN = localaxQ.atO();
    if (localdDN == null) {
      return -1;
    }
    boolean bool = localdDN.Cx((int)this.kBt);

    if (bool) {
      return 0;
    }
    return -1;
  }

  public Enum gm()
  {
    return Bz.bCd;
  }

  static
  {
    ayr.add(new Pq[] { Pq.chu, Pq.chv });
  }
}