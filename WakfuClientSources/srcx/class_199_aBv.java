import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class aBv extends akN
{
  private static final ArrayList ayr = new ArrayList();
  private final bBB dVk;

  protected List kM()
  {
    return ayr;
  }

  public aBv(ArrayList paramArrayList) {
    u(paramArrayList);
    if (paramArrayList.isEmpty())
      this.dVk = null;
    else
      this.dVk = ((bBB)paramArrayList.get(0));
  }

  public int a(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4)
  {
    dle localdle1 = aAw.ai(paramObject1);
    dle localdle2 = aAw.ai(paramObject2);
    if (paramObject1 == null) {
      return -1;
    }
    if ((paramObject2 instanceof cBn)) {
      if (((go() == null) || (((cBn)paramObject2).getType() == go().xj())) && (localdle2 == localdle1))
      {
        return 0;
      }
      return -1;
    }

    if (paramObject2 == null)
    {
      for (Iterator localIterator1 = ((dbE)paramObject4).LC().bbj().iterator(); localIterator1.hasNext(); ) { localObject = (cjK)localIterator1.next();
        if (((go() == null) || (((cjK)localObject).getType() == go().xj())) && (a(localdle1, (cjK)localObject))) {
          return 0;
        }
      }
      return -1;
    }

    int i = (this.dVk != null) && (this.dVk.i(paramObject1, paramObject3, paramObject3, paramObject4)) ? 1 : 0;

    Object localObject = aAw.ah(paramObject4);
    if (((paramObject2 instanceof cYk)) && (localObject != null)) {
      cYk localcYk = (cYk)paramObject2;
      for (cjK localcjK : ((dbE)localObject).LC().bbj()) {
        if ((i == 0) || (localcjK.ML().bg(localcYk)))
        {
          if ((a(localcYk, localcjK)) && (a(localdle1, localcjK)))
            return 0;
        }
      }
      return -1;
    }
    return -2;
  }

  private boolean a(dle paramdle, cjK paramcjK) {
    return aAw.ai(paramcjK) == paramdle;
  }

  private boolean a(cYk paramcYk, cjK paramcjK) {
    return ((go() == null) || (paramcjK.getType() == go().xj())) && (paramcjK.P(paramcYk.getX(), paramcYk.getY(), paramcYk.IB()));
  }

  xj go()
  {
    return null;
  }

  public Enum gm()
  {
    return Bz.bCh;
  }

  static
  {
    ayr.add(zT.buX);
    ayr.add(zT.buZ);
  }
}