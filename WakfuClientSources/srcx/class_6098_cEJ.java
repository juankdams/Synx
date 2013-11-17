import java.util.ArrayList;
import java.util.List;

public class cEJ extends akN
{
  private static ArrayList aAG = new ArrayList();

  private final cYq aHo = new cYq(0, 0, 0, 0, 0, 0);

  protected List kM()
  {
    return aAG;
  }

  public cEJ(ArrayList paramArrayList)
  {
    u(paramArrayList);
    int i = (int)((aOw)paramArrayList.get(0)).b(null, null, null, null);
    int j = (int)((aOw)paramArrayList.get(1)).b(null, null, null, null);
    int k = (int)((aOw)paramArrayList.get(2)).b(null, null, null, null);
    int m = (int)((aOw)paramArrayList.get(3)).b(null, null, null, null);
    int n = (int)((aOw)paramArrayList.get(4)).b(null, null, null, null);
    int i1 = (int)((aOw)paramArrayList.get(5)).b(null, null, null, null);

    this.aHo.set(i1, n, m, i, j, k);
  }

  public int a(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4)
  {
    if ((dDE.dft().isSynchronized()) && (dDE.dft().VN().U(this.aHo) >= 0))
      return 0;
    return -1;
  }

  public Enum gm() {
    return Bz.bzh;
  }

  static
  {
    Pq[] arrayOfPq = new Pq[6];
    arrayOfPq[0] = Pq.chv;
    arrayOfPq[1] = Pq.chv;
    arrayOfPq[2] = Pq.chv;
    arrayOfPq[3] = Pq.chv;
    arrayOfPq[4] = Pq.chv;
    arrayOfPq[5] = Pq.chv;
    aAG.add(arrayOfPq);
  }
}