import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class aOW extends akN
{
  private static ArrayList aAG = new ArrayList();
  private final long ewf;

  protected List kM()
  {
    return aAG;
  }

  public aOW(ArrayList paramArrayList)
  {
    u(paramArrayList);
    this.ewf = ((aOw)paramArrayList.get(0)).b(null, null, null, null);
  }

  public int a(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4)
  {
    Object localObject2;
    if (paramObject2 == null)
    {
      for (localObject1 = ((aPH)paramObject4).LC().bbj().iterator(); ((Iterator)localObject1).hasNext(); ) { localObject2 = (cjK)((Iterator)localObject1).next();
        if (((cjK)localObject2).clt() == this.ewf)
          return 0;
      }
      return -1;
    }

    if ((paramObject2 instanceof cSG)) {
      localObject1 = ((cSG)paramObject2).clB();
      if (localObject1 == null)
        return -1;
      return ((cjK)localObject1).clt() == this.ewf ? 0 : -1;
    }

    Object localObject1 = null;
    if ((paramObject4 instanceof dbE))
      localObject1 = (dbE)paramObject4;
    else if ((paramObject4 instanceof dMC))
      localObject1 = ((dMC)paramObject4).dps();
    if (((paramObject2 instanceof cYk)) && (localObject1 != null)) {
      localObject2 = (cYk)paramObject2;
      for (cjK localcjK : ((dbE)localObject1).LC().bbj()) {
        if ((localcjK.clt() == this.ewf) && (localcjK.P(((cYk)localObject2).getX(), ((cYk)localObject2).getY(), ((cYk)localObject2).IB()))) {
          return 0;
        }
      }

      return -1;
    }
    return -2;
  }

  public Enum gm()
  {
    return Bz.byw;
  }

  static
  {
    aAG.add(zT.bva);
  }
}