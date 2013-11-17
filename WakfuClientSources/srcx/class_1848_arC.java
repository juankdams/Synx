import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class arC extends akN
{
  private static final List aWC = Collections.singletonList(Pq.chC);

  protected List kM()
  {
    return aWC;
  }

  public arC(ArrayList paramArrayList)
  {
  }

  public int a(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4) {
    axQ localaxQ1 = aAw.b(false, paramObject1, paramObject2, paramObject4, paramObject3);
    if (localaxQ1 == null) {
      return -1;
    }
    dbE localdbE = aAw.ah(paramObject4);
    if (localdbE == null) {
      return -1;
    }
    axQ localaxQ2 = aAw.b(true, paramObject1, paramObject2, paramObject4, paramObject3);
    cYk localcYk = aAw.d(true, paramObject1, paramObject2, paramObject4, paramObject3);
    if (localaxQ2 != null) {
      if (cyC.a(localaxQ1, localdbE.LB(), localcYk.getX(), localcYk.getY(), localcYk.IB(), localaxQ2))
        return 0;
    }
    else if (cyC.a(localaxQ1, localdbE, localcYk.getX(), localcYk.getY(), localcYk.IB())) {
      return 0;
    }

    return -1;
  }

  public Enum gm()
  {
    return Bz.bBK;
  }
}