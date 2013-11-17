import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public final class aKV extends cIX
{
  private static ArrayList aAG = new ArrayList();

  public aKV(ArrayList paramArrayList)
  {
    J(paramArrayList);
  }

  protected List kM()
  {
    return aAG;
  }

  public boolean pH()
  {
    return true;
  }

  public long b(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4)
  {
    if (paramObject2 == null) {
      return 0L;
    }
    aAn localaAn = j(paramObject2, paramObject4);
    if (localaAn == null) {
      return 0L;
    }
    cjT localcjT = localaAn.bKe();
    Iterator localIterator = localcjT.iterator();
    dbE localdbE = aAw.ah(paramObject4);
    ans localans = new ans();
    HashSet localHashSet = new HashSet();

    while (localIterator.hasNext()) {
      dpI localdpI = (dpI)localIterator.next();
      List localList1 = localans.a(localdpI, localaAn, localdbE.aIq(), localaAn.fa(), localaAn.fb(), localaAn.fc());

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

  private aAn j(Object paramObject1, Object paramObject2) {
    Object localObject = paramObject1;
    if ((paramObject1 instanceof cSG)) {
      localObject = ((cSG)paramObject1).clB();
    }

    aho localaho = null;
    if ((localObject instanceof aho)) {
      localaho = (aho)paramObject1;
    } else if ((paramObject1 instanceof cYk)) {
      dbE localdbE = aAw.ah(paramObject2);
      cYk localcYk = (cYk)paramObject1;
      cdO localcdO = localdbE.LB().au(localcYk.getX(), localcYk.getY());
      if ((localcdO instanceof aho))
        localaho = (aho)localcdO;
    }
    return localaho;
  }

  public Enum gm()
  {
    return Bz.bBN;
  }

  static
  {
    aAG.add(zT.buX);
  }
}