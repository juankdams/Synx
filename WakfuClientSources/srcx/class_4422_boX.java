import java.util.ArrayList;
import java.util.List;

public class boX extends cIX
{
  private static ArrayList aAG = new ArrayList();
  private bZA aB;

  public boX(ArrayList paramArrayList)
  {
    if (J(paramArrayList) == 0)
      this.aB = ((bZA)paramArrayList.get(0));
  }

  protected List kM()
  {
    return aAG;
  }

  public boolean pH() {
    return true;
  }

  public long b(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4) {
    if (this.aB != null) {
      return this.aB.a(paramObject1, paramObject2, paramObject3, paramObject4) == 0 ? 1L : 0L;
    }
    return 0L;
  }

  public Enum gm() {
    return Bz.bAb;
  }

  static
  {
    Pq[] arrayOfPq = new Pq[1];
    arrayOfPq[0] = Pq.chw;
    aAG.add(arrayOfPq);
  }
}