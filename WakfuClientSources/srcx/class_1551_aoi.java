import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class aoi extends akN
{
  private static ArrayList aAG = new ArrayList();
  private final aOw dsO;
  private final bBB cYJ;

  protected List kM()
  {
    return aAG;
  }

  public aoi(ArrayList paramArrayList)
  {
    u(paramArrayList);
    this.dsO = ((aOw)paramArrayList.get(0));

    if (paramArrayList.size() >= 2)
      this.cYJ = ((bBB)paramArrayList.get(1));
    else
      this.cYJ = null;
  }

  public int a(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4)
  {
    cYk localcYk = aAw.d(true, paramObject1, paramObject2, paramObject4, paramObject3);
    if (localcYk == null) {
      return -1;
    }
    long l = this.dsO.b(paramObject1, paramObject2, paramObject3, paramObject4);

    dbE localdbE = null;
    if ((paramObject4 instanceof dbE))
      localdbE = (dbE)paramObject4;
    else if ((paramObject4 instanceof dMC)) {
      localdbE = ((dMC)paramObject4).dps();
    }
    if (localdbE == null) {
      return -1;
    }
    int i = (this.cYJ != null) && (this.cYJ.i(paramObject1, paramObject3, paramObject3, paramObject4)) ? 1 : 0;
    dle localdle;
    if (i != 0) {
      localObject = aAw.b(false, paramObject1, paramObject2, paramObject4, paramObject3);
      if (localObject == null)
        return -1;
      localdle = aAw.ai(localObject);
    } else {
      localdle = null;
    }
    Object localObject = localdbE.LC().bbj();
    for (Iterator localIterator = ((Collection)localObject).iterator(); localIterator.hasNext(); ) {
      cjK localcjK = (cjK)localIterator.next();
      if ((localcjK.clt() == l) && (
        (localdle == null) || 
        (aAw.ai(localcjK) == localdle)))
      {
        if (localcjK.B(localcYk))
          return 0;
      }
    }
    return -1;
  }

  public Enum gm() {
    return Bz.bBF;
  }

  static
  {
    Pq[] arrayOfPq = new Pq[1];
    arrayOfPq[0] = Pq.chv;
    aAG.add(arrayOfPq);
    arrayOfPq = new Pq[3];
    arrayOfPq[0] = Pq.chv;
    arrayOfPq[1] = Pq.chw;
    aAG.add(arrayOfPq);
  }
}