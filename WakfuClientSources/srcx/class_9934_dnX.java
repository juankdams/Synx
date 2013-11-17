import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class dnX extends akN
{
  private static ArrayList aAG = new ArrayList();

  private boolean aMu = false;

  public dnX(ArrayList paramArrayList) {
    this.aMu = ((cic)paramArrayList.get(0)).getValue().equalsIgnoreCase("target");
  }

  protected List kM() {
    return aAG;
  }

  public int a(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4) {
    axQ localaxQ = aAw.b(this.aMu, paramObject1, paramObject2, paramObject4, paramObject3);
    if (localaxQ == null) {
      return -1;
    }
    dbE localdbE = aAw.ah(paramObject4);
    if (localdbE == null) {
      return -1;
    }
    Collection localCollection = localdbE.cb(localaxQ.Fx());
    cYk localcYk = aAw.d(true, paramObject1, paramObject2, paramObject4, paramObject3);
    for (Iterator localIterator = localCollection.iterator(); localIterator.hasNext(); ) { Object localObject = localIterator.next();
      dhJ localdhJ = (dhJ)localObject;
      if (cyC.a(localdhJ, localdbE.LB(), localcYk.getX(), localcYk.getY(), localcYk.IB(), localaxQ)) {
        return 0;
      }
    }
    return -1;
  }

  public Enum gm() {
    return Bz.bBY;
  }

  static
  {
    Pq[] arrayOfPq = { Pq.chu };
    aAG.add(arrayOfPq);
  }
}