import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class cFJ
{
  public static final List EMPTY_LIST = Collections.EMPTY_LIST;

  public static List c(List paramList1, List paramList2)
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = paramList2.iterator();

    while (localIterator.hasNext()) {
      Object localObject = localIterator.next();

      if (paramList1.contains(localObject)) {
        localArrayList.add(localObject);
      }
    }

    return localArrayList;
  }

  public static List d(List paramList1, List paramList2)
  {
    ArrayList localArrayList = new ArrayList(paramList1);
    Iterator localIterator = paramList2.iterator();

    while (localIterator.hasNext()) {
      localArrayList.remove(localIterator.next());
    }

    return localArrayList;
  }

  public static List e(List paramList1, List paramList2)
  {
    return d(f(paramList1, paramList2), c(paramList1, paramList2));
  }

  public static List f(List paramList1, List paramList2)
  {
    ArrayList localArrayList = new ArrayList(paramList1);
    localArrayList.addAll(paramList2);
    return localArrayList;
  }

  public static boolean a(Collection paramCollection1, Collection paramCollection2)
  {
    if (paramCollection1 == paramCollection2) {
      return true;
    }
    if ((paramCollection1 == null) || (paramCollection2 == null) || (paramCollection1.size() != paramCollection2.size())) {
      return false;
    }

    Iterator localIterator1 = paramCollection1.iterator();
    Iterator localIterator2 = paramCollection2.iterator();
    Object localObject1 = null;
    Object localObject2 = null;

    while ((localIterator1.hasNext()) && (localIterator2.hasNext())) {
      localObject1 = localIterator1.next();
      localObject2 = localIterator2.next();

      if (localObject1 == null ? localObject2 != null : !localObject1.equals(localObject2)) {
        return false;
      }
    }

    return (!localIterator1.hasNext()) && (!localIterator2.hasNext());
  }

  public static int v(Collection paramCollection)
  {
    if (paramCollection == null) {
      return 0;
    }
    int i = 1;
    Iterator localIterator = paramCollection.iterator();
    Object localObject = null;

    while (localIterator.hasNext()) {
      localObject = localIterator.next();
      i = 31 * i + (localObject == null ? 0 : localObject.hashCode());
    }
    return i;
  }

  public static List b(Collection paramCollection1, Collection paramCollection2)
  {
    ArrayList localArrayList = new ArrayList(Math.min(paramCollection1.size(), paramCollection2.size()));

    for (Iterator localIterator = paramCollection1.iterator(); localIterator.hasNext(); ) {
      Object localObject = localIterator.next();
      if (paramCollection2.contains(localObject)) {
        localArrayList.add(localObject);
      }
    }
    return localArrayList;
  }

  public static List c(Collection paramCollection1, Collection paramCollection2)
  {
    ArrayList localArrayList = new ArrayList();
    for (Iterator localIterator = paramCollection1.iterator(); localIterator.hasNext(); ) {
      Object localObject = localIterator.next();
      if (!paramCollection2.contains(localObject)) {
        localArrayList.add(localObject);
      }
    }
    return localArrayList;
  }

  public static List synchronizedList(List paramList)
  {
    return dPw.u(paramList);
  }

  public static List unmodifiableList(List paramList)
  {
    return bsl.u(paramList);
  }

  public static List b(List paramList, cSc paramcSc)
  {
    return bUn.a(paramList, paramcSc);
  }

  public static List b(List paramList, Class paramClass)
  {
    return bZS.a(paramList, paramClass);
  }

  public static List b(List paramList, bna parambna)
  {
    return bzh.a(paramList, parambna);
  }

  public static List b(List paramList, dsr paramdsr)
  {
    return ajJ.a(paramList, paramdsr);
  }

  public static List I(List paramList)
  {
    return aJz.u(paramList);
  }
}