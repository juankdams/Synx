import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

abstract class aKz extends akN
{
  private static ArrayList aAG = new ArrayList();

  protected List kM()
  {
    return aAG;
  }

  aKz(ArrayList paramArrayList) {
    u(paramArrayList);
  }

  public int a(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4)
  {
    Object localObject2;
    if (paramObject2 == null)
    {
      if (ajF()) {
        return -1;
      }
      for (localObject1 = ((aPH)paramObject4).LC().bbj().iterator(); ((Iterator)localObject1).hasNext(); ) { localObject2 = (cjK)((Iterator)localObject1).next();
        if (c((cjK)localObject2)) {
          return 0;
        }
      }
      return -1;
    }

    if ((paramObject2 instanceof cSG)) {
      return c(((cSG)paramObject2).clB()) ? 0 : -1;
    }
    Object localObject1 = null;
    if ((paramObject4 instanceof dbE))
      localObject1 = (dbE)paramObject4;
    else if ((paramObject4 instanceof dMC))
      localObject1 = ((dMC)paramObject4).dps();
    if (((paramObject2 instanceof cYk)) && (localObject1 != null)) {
      for (localObject2 = ((dbE)localObject1).LC().bbj().iterator(); ((Iterator)localObject2).hasNext(); ) { cjK localcjK = (cjK)((Iterator)localObject2).next();
        cYk localcYk = (cYk)paramObject2;
        if (a(localcjK, localcYk)) {
          return 0;
        }
      }
      return -1;
    }
    return -2;
  }

  protected boolean a(cjK paramcjK, cYk paramcYk) {
    if (paramcjK == null)
      return false;
    return (c(paramcjK)) && (paramcjK.P(paramcYk.getX(), paramcYk.getY(), paramcYk.IB()));
  }

  protected boolean c(cjK paramcjK)
  {
    return paramcjK.getType() == go().xj();
  }

  abstract xj go();

  static
  {
    aAG.add(zT.buX);
  }
}