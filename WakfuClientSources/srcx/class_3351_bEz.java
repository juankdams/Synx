import java.util.ArrayList;
import java.util.List;

public final class bEz extends akN
{
  private int epL;
  private static ArrayList aAG = new ArrayList();

  protected List kM()
  {
    return aAG;
  }

  public bEz()
  {
  }

  public bEz(ArrayList paramArrayList) {
    int i = (short)u(paramArrayList);
    if (i == 0)
      this.epL = ((int)((aOw)paramArrayList.get(0)).b(null, null, null, null));
  }

  public int a(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4)
  {
    dbE localdbE = aAw.ah(paramObject4);
    if (localdbE == null)
      return -1;
    if (localdbE.agb() == null) {
      return -1;
    }
    if (localdbE.agb().cSU() == this.epL) {
      return 0;
    }
    return -1;
  }

  public Enum gm()
  {
    return Bz.bBA;
  }

  static
  {
    Pq[] arrayOfPq = new Pq[1];
    arrayOfPq[0] = Pq.chv;
    aAG.add(arrayOfPq);
  }
}