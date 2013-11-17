import java.util.ArrayList;
import java.util.List;

public class ciN extends akN
{
  private static ArrayList aAG = new ArrayList();

  protected List kM()
  {
    return aAG;
  }

  public ciN(ArrayList paramArrayList) {
    u(paramArrayList);
  }

  public int a(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4)
  {
    if ((paramObject2 == null) || (!(paramObject2 instanceof aTa))) {
      return -1;
    }
    if ((paramObject1 == null) || (!(paramObject1 instanceof cYl))) {
      return -1;
    }
    cYl localcYl = (cYl)paramObject1;
    aTa localaTa = (aTa)paramObject2;
    if ((localcYl.b(localaTa)) && (localaTa.a(localcYl))) {
      return 0;
    }
    return -2;
  }

  public Enum gm() {
    return Bz.byG;
  }

  static
  {
    Pq[] arrayOfPq = new Pq[0];
    aAG.add(arrayOfPq);
  }
}