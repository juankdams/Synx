import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class dst
{
  public static final List EMPTY_LIST = Collections.EMPTY_LIST;

  public static boolean a(Vector paramVector1, Vector paramVector2)
  {
    if (paramVector1 == paramVector2) {
      return true;
    }

    if ((paramVector1 == null) || (paramVector2 == null)) {
      return false;
    }

    return paramVector1.equals(paramVector2);
  }

  public static boolean a(Dictionary paramDictionary1, Dictionary paramDictionary2)
  {
    if (paramDictionary1 == paramDictionary2) {
      return true;
    }

    if ((paramDictionary1 == null) || (paramDictionary2 == null)) {
      return false;
    }

    if (paramDictionary1.size() != paramDictionary2.size()) {
      return false;
    }

    Enumeration localEnumeration = paramDictionary1.keys();
    while (localEnumeration.hasMoreElements()) {
      Object localObject1 = localEnumeration.nextElement();
      Object localObject2 = paramDictionary1.get(localObject1);
      Object localObject3 = paramDictionary2.get(localObject1);
      if ((localObject3 == null) || (!localObject2.equals(localObject3))) {
        return false;
      }

    }

    return true;
  }

  public static String w(Collection paramCollection)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    for (Iterator localIterator = paramCollection.iterator(); localIterator.hasNext(); ) { Object localObject = localIterator.next();
      if (localStringBuilder.length() != 0) {
        localStringBuilder.append(",");
      }
      localStringBuilder.append(localObject);
    }
    return localStringBuilder.toString();
  }

  public static void b(Dictionary paramDictionary1, Dictionary paramDictionary2)
  {
    for (Enumeration localEnumeration = paramDictionary2.keys(); localEnumeration.hasMoreElements(); ) {
      Object localObject = localEnumeration.nextElement();
      paramDictionary1.put(localObject, paramDictionary2.get(localObject));
    }
  }

  public static Enumeration a(Enumeration paramEnumeration1, Enumeration paramEnumeration2)
  {
    return new buu(paramEnumeration1, paramEnumeration2);
  }

  public static Enumeration g(Iterator paramIterator)
  {
    return new dQT(paramIterator);
  }

  public static Iterator a(Enumeration paramEnumeration)
  {
    return new dQP(paramEnumeration);
  }

  public static Collection h(Iterator paramIterator)
  {
    ArrayList localArrayList = new ArrayList();
    while (paramIterator.hasNext()) {
      localArrayList.add(paramIterator.next());
    }
    return localArrayList;
  }

  public static int frequency(Collection paramCollection, Object paramObject)
  {
    int i = 0;
    Iterator localIterator;
    if (paramCollection != null) {
      for (localIterator = paramCollection.iterator(); localIterator.hasNext(); ) {
        Object localObject = localIterator.next();
        if (paramObject == null ? localObject == null : paramObject.equals(localObject)) {
          i++;
        }
      }
    }
    return i;
  }
}