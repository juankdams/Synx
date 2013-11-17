import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class cjP extends cIX
{
  private static ArrayList aAG = new ArrayList();
  private aOw hJU;

  public cjP(ArrayList paramArrayList)
  {
    J(paramArrayList);
    this.hJU = ((aOw)paramArrayList.get(0));
  }

  protected List kM() {
    return aAG;
  }

  public boolean pH() {
    return true;
  }

  public long b(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4) {
    if ((paramObject2 == null) || (!(paramObject2 instanceof cYk))) {
      return 0L;
    }
    aAn localaAn = m(paramObject1, paramObject2, paramObject3, paramObject4);
    if (localaAn == null) {
      return 0L;
    }
    cYk localcYk = (cYk)paramObject2;

    cjT localcjT = localaAn.bKe();
    Iterator localIterator = localcjT.iterator();
    dbE localdbE = aAw.ah(paramObject4);
    ans localans = new ans();
    HashSet localHashSet = new HashSet();

    while (localIterator.hasNext()) {
      dpI localdpI = (dpI)localIterator.next();
      List localList1 = localans.a(localdpI, localaAn, localdbE.aIq(), localcYk.getX(), localcYk.getY(), localcYk.IB());

      if (!localList1.isEmpty())
      {
        int i = 0; for (int j = localList1.size(); i < j; i++) {
          List localList2 = (List)localList1.get(i);
          if (!localList2.isEmpty())
          {
            int k = 0; for (int m = localList2.size(); k < m; k++) {
              dle localdle = (dle)localList2.get(k);
              localHashSet.add(localdle);
            }
          }
        }
      }
    }
    return localHashSet.size();
  }

  private aAn m(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4) {
    long l = this.hJU.b(paramObject1, paramObject2, paramObject3, paramObject4);
    return bMF.bUo().fo(l);
  }

  public Enum gm() {
    return Bz.bBS;
  }

  static
  {
    Pq[] arrayOfPq = { Pq.chv };
    aAG.add(arrayOfPq);
  }
}