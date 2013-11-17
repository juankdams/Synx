import java.util.ArrayList;
import java.util.List;

public class hH extends cIX
{
  private static ArrayList aAG = new ArrayList();
  private cYq aHo;

  public hH(ArrayList paramArrayList)
  {
    if (J(paramArrayList) == 1)
      this.aHo = new cYq((int)((aOw)paramArrayList.get(5)).b(null, null, null, null), (int)((aOw)paramArrayList.get(4)).b(null, null, null, null), (int)((aOw)paramArrayList.get(3)).b(null, null, null, null), (int)((aOw)paramArrayList.get(0)).b(null, null, null, null), (int)((aOw)paramArrayList.get(1)).b(null, null, null, null), (int)((aOw)paramArrayList.get(2)).b(null, null, null, null));
  }

  protected List kM()
  {
    return aAG;
  }

  public boolean pH() {
    return true;
  }

  public long b(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4) {
    if (this.aHo != null)
      return this.aHo.rP();
    return dDE.dft().VN().rP();
  }

  public Enum gm() {
    return Bz.bzx;
  }

  static
  {
    Pq[] arrayOfPq = new Pq[0];
    aAG.add(arrayOfPq);
    arrayOfPq = new Pq[6];
    arrayOfPq[0] = Pq.chv;
    arrayOfPq[1] = Pq.chv;
    arrayOfPq[2] = Pq.chv;
    arrayOfPq[3] = Pq.chv;
    arrayOfPq[4] = Pq.chv;
    arrayOfPq[5] = Pq.chv;
    aAG.add(arrayOfPq);
  }
}