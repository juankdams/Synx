import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class cFG extends akN
{
  private static final ArrayList ayr = new ArrayList();
  private boolean iAi;

  public cFG(ArrayList paramArrayList)
  {
    if (paramArrayList.size() >= 1)
      this.iAi = ((bBB)paramArrayList.get(0)).i(null, null, null, null);
  }

  protected List kM()
  {
    return ayr;
  }

  public int a(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4)
  {
    axQ localaxQ = aAw.b(false, paramObject1, paramObject2, paramObject4, paramObject3);
    if (localaxQ == null) {
      return -1;
    }
    dbE localdbE = aAw.ah(paramObject4);
    if (localdbE == null) {
      return -1;
    }
    cYk localcYk1 = aAw.d(true, paramObject1, paramObject2, paramObject4, paramObject3);
    cYk localcYk2 = aAw.d(false, paramObject1, paramObject2, paramObject4, paramObject3);

    CG localCG = localcYk2.aa(localcYk1);

    Collection localCollection = localdbE.cb(localaxQ.Fx());
    for (Iterator localIterator = localCollection.iterator(); localIterator.hasNext(); ) { Object localObject = localIterator.next();
      dhJ localdhJ = (dhJ)localObject;
      cYk localcYk3 = localdhJ.aKb();

      if ((!this.iAi) || (localCG == null) || (localCG.equals(localcYk2.aa(localcYk3))))
      {
        if (cyC.a(localaxQ, localdbE.LB(), localcYk3.getX(), localcYk3.getY(), localcYk3.IB(), localdhJ))
          return 0;
      }
    }
    return -1;
  }

  public Enum gm()
  {
    return Bz.bCL;
  }

  static
  {
    ayr.add(new Pq[0]);
    ayr.add(new Pq[] { Pq.chw });
  }
}