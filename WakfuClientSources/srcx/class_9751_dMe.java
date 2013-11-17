import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class dMe extends akN
{
  private static ArrayList aAG = new ArrayList();

  private boolean mcs = false;

  protected List kM()
  {
    return aAG;
  }

  dMe() {
  }

  public dMe(ArrayList paramArrayList) {
    u(paramArrayList);
    if (paramArrayList.size() >= 1)
      this.mcs = ((bBB)paramArrayList.get(0)).i(null, null, null, null);
  }

  public int a(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4)
  {
    if (paramObject2 == null) {
      return 0;
    }
    if ((paramObject1 == null) || (!(paramObject1 instanceof dhJ))) {
      return -1;
    }
    dbE localdbE = null;

    if ((paramObject4 instanceof dbE))
      localdbE = (dbE)paramObject4;
    else if ((paramObject4 instanceof dMC)) {
      localdbE = ((dMC)paramObject4).dps();
    }
    if (localdbE == null)
      return -1;
    Object localObject1;
    if ((paramObject2 instanceof cYk)) {
      localObject1 = (cYk)paramObject2;
      UG localUG = localdbE.LB();
      if (!localUG.aq(((cYk)localObject1).getX(), ((cYk)localObject1).getY())) {
        return -1;
      }
      Collection localCollection = localdbE.LC().bbj();
      for (Object localObject2 = localCollection.iterator(); ((Iterator)localObject2).hasNext(); ) { cjK localcjK = (cjK)((Iterator)localObject2).next();
        if (localcjK.ML().bg(localObject1)) {
          if (this.mcs)
            return -1;
          if (localcjK.aeH())
            return -1;
        }
      }
      localObject2 = localUG.au(((cYk)localObject1).getX(), ((cYk)localObject1).getY());
      if (localObject2 == null) {
        return 0;
      }
      return -1;
    }

    if ((paramObject2 instanceof cSG)) {
      if (this.mcs) {
        return -1;
      }
      localObject1 = ((cSG)paramObject2).clB();
      if ((localObject1 != null) && (((cjK)localObject1).aeH())) {
        return -1;
      }
      return 0;
    }

    return -2;
  }

  public Enum gm()
  {
    return Bz.bAO;
  }

  static
  {
    aAG.add(zT.buX);
    aAG.add(zT.buZ);
  }
}