import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Pattern;

public class aRT
{
  private static final String eOY = "The value %s is not in the specified exclusive range of %s to %s";
  private static final String eOZ = "The value %s is not in the specified inclusive range of %s to %s";
  private static final String ePa = "The string %s does not match the pattern %s";
  private static final String ePb = "The validated object is null";
  private static final String ePc = "The validated expression is false";
  private static final String ePd = "The validated array contains null element at index: %d";
  private static final String ePe = "The validated collection contains null element at index: %d";
  private static final String ePf = "The validated character sequence is blank";
  private static final String ePg = "The validated array is empty";
  private static final String ePh = "The validated character sequence is empty";
  private static final String ePi = "The validated collection is empty";
  private static final String ePj = "The validated map is empty";
  private static final String ePk = "The validated array index is invalid: %d";
  private static final String ePl = "The validated character sequence index is invalid: %d";
  private static final String ePm = "The validated collection index is invalid: %d";
  private static final String ePn = "The validated state is false";
  private static final String ePo = "The validated class can not be converted to the %s class";
  private static final String ePp = "The validated object is not an instance of %s";

  public static void a(boolean paramBoolean, String paramString, long paramLong)
  {
    if (!paramBoolean)
      throw new IllegalArgumentException(String.format(paramString, new Object[] { Long.valueOf(paramLong) }));
  }

  public static void a(boolean paramBoolean, String paramString, double paramDouble)
  {
    if (!paramBoolean)
      throw new IllegalArgumentException(String.format(paramString, new Object[] { Double.valueOf(paramDouble) }));
  }

  public static void a(boolean paramBoolean, String paramString, Object[] paramArrayOfObject)
  {
    if (!paramBoolean)
      throw new IllegalArgumentException(String.format(paramString, paramArrayOfObject));
  }

  public static void dS(boolean paramBoolean)
  {
    if (!paramBoolean)
      throw new IllegalArgumentException("The validated expression is false");
  }

  public static Object ay(Object paramObject)
  {
    return a(paramObject, "The validated object is null", new Object[0]);
  }

  public static Object a(Object paramObject, String paramString, Object[] paramArrayOfObject)
  {
    if (paramObject == null) {
      throw new NullPointerException(String.format(paramString, paramArrayOfObject));
    }
    return paramObject;
  }

  public static Object[] a(Object[] paramArrayOfObject1, String paramString, Object[] paramArrayOfObject2)
  {
    if (paramArrayOfObject1 == null) {
      throw new NullPointerException(String.format(paramString, paramArrayOfObject2));
    }
    if (paramArrayOfObject1.length == 0) {
      throw new IllegalArgumentException(String.format(paramString, paramArrayOfObject2));
    }
    return paramArrayOfObject1;
  }

  public static Object[] h(Object[] paramArrayOfObject)
  {
    return a(paramArrayOfObject, "The validated array is empty", new Object[0]);
  }

  public static Collection a(Collection paramCollection, String paramString, Object[] paramArrayOfObject)
  {
    if (paramCollection == null) {
      throw new NullPointerException(String.format(paramString, paramArrayOfObject));
    }
    if (paramCollection.size() == 0) {
      throw new IllegalArgumentException(String.format(paramString, paramArrayOfObject));
    }
    return paramCollection;
  }

  public static Collection f(Collection paramCollection)
  {
    return a(paramCollection, "The validated collection is empty", new Object[0]);
  }

  public static Map a(Map paramMap, String paramString, Object[] paramArrayOfObject)
  {
    if (paramMap == null) {
      throw new NullPointerException(String.format(paramString, paramArrayOfObject));
    }
    if (paramMap.size() == 0) {
      throw new IllegalArgumentException(String.format(paramString, paramArrayOfObject));
    }
    return paramMap;
  }

  public static Map f(Map paramMap)
  {
    return a(paramMap, "The validated map is empty", new Object[0]);
  }

  public static CharSequence a(CharSequence paramCharSequence, String paramString, Object[] paramArrayOfObject)
  {
    if (paramCharSequence == null) {
      throw new NullPointerException(String.format(paramString, paramArrayOfObject));
    }
    if (paramCharSequence.length() == 0) {
      throw new IllegalArgumentException(String.format(paramString, paramArrayOfObject));
    }
    return paramCharSequence;
  }

  public static CharSequence b(CharSequence paramCharSequence)
  {
    return a(paramCharSequence, "The validated character sequence is empty", new Object[0]);
  }

  public static CharSequence b(CharSequence paramCharSequence, String paramString, Object[] paramArrayOfObject)
  {
    if (paramCharSequence == null) {
      throw new NullPointerException(String.format(paramString, paramArrayOfObject));
    }
    if (cOg.h(paramCharSequence)) {
      throw new IllegalArgumentException(String.format(paramString, paramArrayOfObject));
    }
    return paramCharSequence;
  }

  public static CharSequence c(CharSequence paramCharSequence)
  {
    return b(paramCharSequence, "The validated character sequence is blank", new Object[0]);
  }

  public static Object[] b(Object[] paramArrayOfObject1, String paramString, Object[] paramArrayOfObject2)
  {
    ay(paramArrayOfObject1);
    for (int i = 0; i < paramArrayOfObject1.length; i++) {
      if (paramArrayOfObject1[i] == null) {
        Object[] arrayOfObject = aUP.d(paramArrayOfObject2, Integer.valueOf(i));
        throw new IllegalArgumentException(String.format(paramString, arrayOfObject));
      }
    }
    return paramArrayOfObject1;
  }

  public static Object[] i(Object[] paramArrayOfObject)
  {
    return b(paramArrayOfObject, "The validated array contains null element at index: %d", new Object[0]);
  }

  public static Iterable a(Iterable paramIterable, String paramString, Object[] paramArrayOfObject)
  {
    ay(paramIterable);
    int i = 0;
    for (Iterator localIterator = paramIterable.iterator(); localIterator.hasNext(); i++) {
      if (localIterator.next() == null) {
        Object[] arrayOfObject = aUP.c(paramArrayOfObject, new Object[] { Integer.valueOf(i) });
        throw new IllegalArgumentException(String.format(paramString, arrayOfObject));
      }
    }
    return paramIterable;
  }

  public static Iterable c(Iterable paramIterable)
  {
    return a(paramIterable, "The validated collection contains null element at index: %d", new Object[0]);
  }

  public static Object[] a(Object[] paramArrayOfObject1, int paramInt, String paramString, Object[] paramArrayOfObject2)
  {
    ay(paramArrayOfObject1);
    if ((paramInt < 0) || (paramInt >= paramArrayOfObject1.length)) {
      throw new IndexOutOfBoundsException(String.format(paramString, paramArrayOfObject2));
    }
    return paramArrayOfObject1;
  }

  public static Object[] a(Object[] paramArrayOfObject, int paramInt)
  {
    return a(paramArrayOfObject, paramInt, "The validated array index is invalid: %d", new Object[] { Integer.valueOf(paramInt) });
  }

  public static Collection a(Collection paramCollection, int paramInt, String paramString, Object[] paramArrayOfObject)
  {
    ay(paramCollection);
    if ((paramInt < 0) || (paramInt >= paramCollection.size())) {
      throw new IndexOutOfBoundsException(String.format(paramString, paramArrayOfObject));
    }
    return paramCollection;
  }

  public static Collection a(Collection paramCollection, int paramInt)
  {
    return a(paramCollection, paramInt, "The validated collection index is invalid: %d", new Object[] { Integer.valueOf(paramInt) });
  }

  public static CharSequence a(CharSequence paramCharSequence, int paramInt, String paramString, Object[] paramArrayOfObject)
  {
    ay(paramCharSequence);
    if ((paramInt < 0) || (paramInt >= paramCharSequence.length())) {
      throw new IndexOutOfBoundsException(String.format(paramString, paramArrayOfObject));
    }
    return paramCharSequence;
  }

  public static CharSequence a(CharSequence paramCharSequence, int paramInt)
  {
    return a(paramCharSequence, paramInt, "The validated character sequence index is invalid: %d", new Object[] { Integer.valueOf(paramInt) });
  }

  public static void dT(boolean paramBoolean)
  {
    if (!paramBoolean)
      throw new IllegalStateException("The validated state is false");
  }

  public static void b(boolean paramBoolean, String paramString, Object[] paramArrayOfObject)
  {
    if (!paramBoolean)
      throw new IllegalStateException(String.format(paramString, paramArrayOfObject));
  }

  public static void a(CharSequence paramCharSequence, String paramString)
  {
    if (!Pattern.matches(paramString, paramCharSequence))
      throw new IllegalArgumentException(String.format("The string %s does not match the pattern %s", new Object[] { paramCharSequence, paramString }));
  }

  public static void a(CharSequence paramCharSequence, String paramString1, String paramString2, Object[] paramArrayOfObject)
  {
    if (!Pattern.matches(paramString1, paramCharSequence))
      throw new IllegalArgumentException(String.format(paramString2, paramArrayOfObject));
  }

  public static void a(Object paramObject1, Object paramObject2, Comparable paramComparable)
  {
    if ((paramComparable.compareTo(paramObject1) < 0) || (paramComparable.compareTo(paramObject2) > 0))
      throw new IllegalArgumentException(String.format("The value %s is not in the specified inclusive range of %s to %s", new Object[] { paramComparable, paramObject1, paramObject2 }));
  }

  public static void a(Object paramObject1, Object paramObject2, Comparable paramComparable, String paramString, Object[] paramArrayOfObject)
  {
    if ((paramComparable.compareTo(paramObject1) < 0) || (paramComparable.compareTo(paramObject2) > 0))
      throw new IllegalArgumentException(String.format(paramString, paramArrayOfObject));
  }

  public static void b(Object paramObject1, Object paramObject2, Comparable paramComparable)
  {
    if ((paramComparable.compareTo(paramObject1) <= 0) || (paramComparable.compareTo(paramObject2) >= 0))
      throw new IllegalArgumentException(String.format("The value %s is not in the specified exclusive range of %s to %s", new Object[] { paramComparable, paramObject1, paramObject2 }));
  }

  public static void b(Object paramObject1, Object paramObject2, Comparable paramComparable, String paramString, Object[] paramArrayOfObject)
  {
    if ((paramComparable.compareTo(paramObject1) <= 0) || (paramComparable.compareTo(paramObject2) >= 0))
      throw new IllegalArgumentException(String.format(paramString, paramArrayOfObject));
  }

  public static void c(Class paramClass, Object paramObject)
  {
    if (!paramClass.isInstance(paramObject))
      throw new IllegalArgumentException(String.format("The validated object is not an instance of %s", new Object[] { paramClass.getName() }));
  }

  public static void a(Class paramClass, Object paramObject, String paramString, Object[] paramArrayOfObject)
  {
    if (!paramClass.isInstance(paramObject))
      throw new IllegalArgumentException(String.format(paramString, paramArrayOfObject));
  }

  public static void a(Class paramClass1, Class paramClass2)
  {
    if (!paramClass1.isAssignableFrom(paramClass2))
      throw new IllegalArgumentException(String.format("The validated class can not be converted to the %s class", new Object[] { paramClass1.getName() }));
  }

  public static void a(Class paramClass1, Class paramClass2, String paramString, Object[] paramArrayOfObject)
  {
    if (!paramClass1.isAssignableFrom(paramClass2))
      throw new IllegalArgumentException(String.format(paramString, paramArrayOfObject));
  }
}