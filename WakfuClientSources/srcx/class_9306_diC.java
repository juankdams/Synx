import java.util.ArrayList;

public final class diC extends cIX
{
  private static final ArrayList ayr = new ArrayList();
  private final boolean aXA;
  private final cSi leR;

  public diC(ArrayList paramArrayList)
  {
    J(paramArrayList);
    this.aXA = ((cic)paramArrayList.get(0)).getValue().equalsIgnoreCase("target");
    this.leR = new cSi();
    int i = 1; for (int j = paramArrayList.size(); i < j; i++)
      this.leR.add((int)((aOw)paramArrayList.get(i)).b(null, null, null, null));
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
    dDN localdDN = localaxQ.atO();
    if (localdDN == null) {
      return -1L;
    }
    long l = 0L;
    int i = 0; for (int j = this.leR.size(); i < j; i++) {
      int k = this.leR.get(i);
      if (localdDN.Cx(k)) {
        l += 1L;
      }
    }
    return l;
  }

  public boolean pH()
  {
    return true;
  }

  public Enum gm()
  {
    return Bz.bCY;
  }

  static
  {
    ayr.add(new Pq[] { Pq.chu, Pq.chx });
  }
}