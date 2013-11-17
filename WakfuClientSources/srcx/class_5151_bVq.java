import java.util.ArrayList;
import java.util.List;

public class bVq extends akN
{
  private int aPh;
  private static ArrayList aAG = new ArrayList();

  protected List kM()
  {
    return aAG;
  }

  public bVq()
  {
  }

  public bVq(ArrayList paramArrayList) {
    int i = (short)u(paramArrayList);
    if (i == 0)
      this.aPh = ((int)((aOw)paramArrayList.get(0)).b(null, null, null, null));
  }

  public int a(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4)
  {
    aDQ localaDQ = null;

    if ((paramObject4 instanceof aDQ))
      localaDQ = (aDQ)paramObject4;
    else if ((paramObject1 instanceof bEg)) {
      localaDQ = ((bEg)paramObject1).bHs();
    }

    if (localaDQ == null) {
      return -1;
    }

    if (localaDQ.mb(this.aPh)) {
      return localaDQ.mf(this.aPh) ? 0 : -1;
    }
    return -1;
  }

  public Enum gm()
  {
    return Bz.bDp;
  }

  static
  {
    Pq[] arrayOfPq = new Pq[1];
    arrayOfPq[0] = Pq.chv;
    aAG.add(arrayOfPq);
  }
}