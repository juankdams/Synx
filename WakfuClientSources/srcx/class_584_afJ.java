import java.util.ArrayList;
import java.util.List;

public final class afJ extends akN
  implements azn
{
  private boolean aMu = false;
  private eu crd;
  private static ArrayList aAG = new ArrayList();

  protected List kM()
  {
    return aAG;
  }

  public afJ(ArrayList paramArrayList) {
    int i = (short)u(paramArrayList);
    if (i == 0)
      this.crd = ZD.dU(((cic)paramArrayList.get(0)).getValue());
    if (i == 1) {
      this.crd = ZD.dU(((cic)paramArrayList.get(0)).getValue());
      if (((cic)paramArrayList.get(1)).getValue().equalsIgnoreCase("target"))
        this.aMu = true;
      else
        this.aMu = false;
    }
  }

  public int a(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4)
  {
    axQ localaxQ = aAw.b(this.aMu, paramObject1, paramObject2, paramObject4, paramObject3);
    if (localaxQ == null) {
      return -1;
    }
    if (!localaxQ.b(this.crd))
      return -1;
    int i = localaxQ.e(this.crd);
    int j = localaxQ.g(this.crd);
    if (i == j)
      return 0;
    return -1;
  }

  public Enum gm() {
    return Bz.bCt;
  }

  public boolean akL() {
    return this.aMu;
  }

  static
  {
    Pq[] arrayOfPq = new Pq[1];
    arrayOfPq[0] = Pq.chu;
    aAG.add(arrayOfPq);
    arrayOfPq = new Pq[2];
    arrayOfPq[0] = Pq.chu;
    arrayOfPq[1] = Pq.chu;
    aAG.add(arrayOfPq);
  }
}