import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

public class aqV
{
  public static final axO dyC = new axO();

  public static Object g(Object paramObject1, Object paramObject2)
  {
    return paramObject1 != null ? paramObject1 : paramObject2;
  }

  public static Object e(Object[] paramArrayOfObject)
  {
    if (paramArrayOfObject != null) {
      for (Object localObject : paramArrayOfObject) {
        if (localObject != null) {
          return localObject;
        }
      }
    }
    return null;
  }

  public static boolean equals(Object paramObject1, Object paramObject2)
  {
    if (paramObject1 == paramObject2) {
      return true;
    }
    if ((paramObject1 == null) || (paramObject2 == null)) {
      return false;
    }
    return paramObject1.equals(paramObject2);
  }

  public static boolean h(Object paramObject1, Object paramObject2)
  {
    return !equals(paramObject1, paramObject2);
  }

  public static int ab(Object paramObject)
  {
    return paramObject == null ? 0 : paramObject.hashCode();
  }

  public static int f(Object[] paramArrayOfObject)
  {
    int i = 1;
    if (paramArrayOfObject != null) {
      for (Object localObject : paramArrayOfObject) {
        i = i * 31 + ab(localObject);
      }
    }
    return i;
  }

  public static String ac(Object paramObject)
  {
    if (paramObject == null) {
      return null;
    }
    StringBuffer localStringBuffer = new StringBuffer();
    e(localStringBuffer, paramObject);
    return localStringBuffer.toString();
  }

  public static void e(StringBuffer paramStringBuffer, Object paramObject)
  {
    if (paramObject == null) {
      throw new NullPointerException("Cannot get the toString of a null identity");
    }
    paramStringBuffer.append(paramObject.getClass().getName()).append('@').append(Integer.toHexString(System.identityHashCode(paramObject)));
  }

  public static String toString(Object paramObject)
  {
    return paramObject == null ? "" : paramObject.toString();
  }

  public static String b(Object paramObject, String paramString)
  {
    return paramObject == null ? paramString : paramObject.toString();
  }

  public static Comparable a(Comparable[] paramArrayOfComparable)
  {
    Object localObject = null;
    if (paramArrayOfComparable != null) {
      for (Comparable localComparable : paramArrayOfComparable) {
        if (a(localComparable, (Comparable)localObject, true) < 0) {
          localObject = localComparable;
        }
      }
    }
    return localObject;
  }

  public static Comparable b(Comparable[] paramArrayOfComparable)
  {
    Object localObject = null;
    if (paramArrayOfComparable != null) {
      for (Comparable localComparable : paramArrayOfComparable) {
        if (a(localComparable, (Comparable)localObject, false) > 0) {
          localObject = localComparable;
        }
      }
    }
    return localObject;
  }

  public static int compare(Comparable paramComparable1, Comparable paramComparable2)
  {
    return a(paramComparable1, paramComparable2, false);
  }

  public static int a(Comparable paramComparable1, Comparable paramComparable2, boolean paramBoolean)
  {
    if (paramComparable1 == paramComparable2)
      return 0;
    if (paramComparable1 == null)
      return paramBoolean ? 1 : -1;
    if (paramComparable2 == null) {
      return paramBoolean ? -1 : 1;
    }
    return paramComparable1.compareTo(paramComparable2);
  }

  public static Comparable c(Comparable[] paramArrayOfComparable)
  {
    aRT.h(paramArrayOfComparable);
    aRT.i(paramArrayOfComparable);
    TreeSet localTreeSet = new TreeSet();
    Collections.addAll(localTreeSet, paramArrayOfComparable);

    Comparable localComparable = (Comparable)localTreeSet.toArray()[((localTreeSet.size() - 1) / 2)];
    return localComparable;
  }

  public static Object a(Comparator paramComparator, Object[] paramArrayOfObject)
  {
    aRT.a(paramArrayOfObject, "null/empty items", new Object[0]);
    aRT.i(paramArrayOfObject);
    aRT.a(paramComparator, "null comparator", new Object[0]);
    TreeSet localTreeSet = new TreeSet(paramComparator);
    Collections.addAll(localTreeSet, paramArrayOfObject);

    Object localObject = localTreeSet.toArray()[((localTreeSet.size() - 1) / 2)];
    return localObject;
  }

  public static Object g(Object[] paramArrayOfObject)
  {
    if (aUP.o(paramArrayOfObject)) {
      HashMap localHashMap = new HashMap(paramArrayOfObject.length);
      Object localObject2;
      for (localObject2 : paramArrayOfObject) {
        dVB localdVB = (dVB)localHashMap.get(localObject2);
        if (localdVB == null)
          localHashMap.put(localObject2, new dVB(1));
        else {
          localdVB.dvt();
        }
      }
      ??? = null;
      ??? = 0;
      for (Iterator localIterator = localHashMap.entrySet().iterator(); localIterator.hasNext(); ) { localObject2 = (Map.Entry)localIterator.next();
        int k = ((dVB)((Map.Entry)localObject2).getValue()).intValue();
        if (k == ???) {
          ??? = null;
        } else if (k > ???) {
          ??? = k;
          ??? = ((Map.Entry)localObject2).getKey();
        }
      }
      return ???;
    }
    return null;
  }

  public static Object ad(Object paramObject)
  {
    if ((paramObject instanceof Cloneable))
    {
      Object localObject2;
      Object localObject1;
      if (paramObject.getClass().isArray()) {
        localObject2 = paramObject.getClass().getComponentType();
        if (!((Class)localObject2).isPrimitive()) {
          localObject1 = ((Object[])paramObject).clone();
        } else {
          int i = Array.getLength(paramObject);
          localObject1 = Array.newInstance((Class)localObject2, i);
          while (i-- > 0)
            Array.set(localObject1, i, Array.get(paramObject, i));
        }
      }
      else {
        try {
          localObject2 = paramObject.getClass().getMethod("clone", new Class[0]);
          localObject1 = ((Method)localObject2).invoke(paramObject, new Object[0]);
        } catch (NoSuchMethodException localNoSuchMethodException) {
          throw new bkM("Cloneable type " + paramObject.getClass().getName() + " has no clone method", localNoSuchMethodException);
        }
        catch (IllegalAccessException localIllegalAccessException)
        {
          throw new bkM("Cannot clone Cloneable type " + paramObject.getClass().getName(), localIllegalAccessException);
        }
        catch (InvocationTargetException localInvocationTargetException) {
          throw new bkM("Exception cloning Cloneable type " + paramObject.getClass().getName(), localInvocationTargetException.getCause());
        }

      }

      Object localObject3 = localObject1;
      return localObject3;
    }

    return null;
  }

  public static Object ae(Object paramObject)
  {
    Object localObject = ad(paramObject);
    return localObject == null ? paramObject : localObject;
  }
}