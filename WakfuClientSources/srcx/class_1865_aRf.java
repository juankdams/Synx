import java.util.ArrayList;
import java.util.List;

public final class aRf extends akN
{
  private int bla;
  private static ArrayList aAG = new ArrayList();

  protected List kM()
  {
    return aAG;
  }

  public aRf()
  {
  }

  public aRf(ArrayList paramArrayList) {
    int i = (short)u(paramArrayList);
    if (i == 0)
      this.bla = ((int)((aOw)paramArrayList.get(0)).b(null, null, null, null));
  }

  public int a(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4)
  {
    dbE localdbE = aAw.ah(paramObject4);
    if (localdbE == null)
      return -1;
    if (localdbE.agb() == null) {
      return -1;
    }
    if (localdbE.agb().Fh() == this.bla) {
      return 0;
    }
    return -1;
  }

  public Enum gm()
  {
    return Bz.bBB;
  }

  static
  {
    Pq[] arrayOfPq = new Pq[1];
    arrayOfPq[0] = Pq.chv;
    aAG.add(arrayOfPq);
  }
}