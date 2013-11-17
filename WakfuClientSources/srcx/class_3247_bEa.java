import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class bEa extends akN
{
  private static final List aWC = Collections.singletonList(Pq.chC);

  protected List kM()
  {
    return aWC;
  }

  public bEa(ArrayList paramArrayList)
  {
  }

  public int a(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4) {
    dbE localdbE = aAw.ah(paramObject4);
    if (localdbE == null) {
      return -1;
    }
    cYk localcYk1 = aAw.d(false, paramObject1, paramObject2, paramObject4, paramObject3);
    if (localcYk1 == null)
      return -1;
    cYk localcYk2 = aAw.d(true, paramObject1, paramObject2, paramObject4, paramObject3);
    if (localcYk2 == null) {
      return -1;
    }
    if ((localcYk1.getX() == localcYk2.getX()) || (localcYk1.getY() == localcYk2.getY()))
      return 0;
    return -1;
  }

  public Enum gm()
  {
    return Bz.bCP;
  }
}