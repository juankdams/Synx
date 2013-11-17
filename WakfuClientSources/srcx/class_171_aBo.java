import java.util.ArrayList;
import java.util.List;

public class aBo extends cIX
{
  private int dfl;
  private static ArrayList aAG = new ArrayList();

  protected List kM()
  {
    return aAG;
  }

  public aBo() {
  }

  public aBo(ArrayList paramArrayList) {
    int i = (short)J(paramArrayList);
    if (i == 0)
      this.dfl = ((int)((aOw)paramArrayList.get(0)).b(null, null, null, null));
    else if (i == 1)
      this.dfl = ((int)((aOw)paramArrayList.get(0)).b(null, null, null, null));
  }

  public boolean pH()
  {
    return true;
  }

  public long b(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4) {
    if (!(paramObject1 instanceof djv)) {
      return 0L;
    }

    djv localdjv = (djv)paramObject1;
    se localse = localdjv.bFZ();

    return localse.cJ(this.dfl);
  }

  public Enum gm() {
    return Bz.bDs;
  }

  static
  {
    Pq[] arrayOfPq = new Pq[1];
    arrayOfPq[0] = Pq.chv;
    aAG.add(arrayOfPq);
  }
}