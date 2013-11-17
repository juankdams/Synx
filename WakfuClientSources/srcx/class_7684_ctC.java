import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

public class ctC
{
  public static final char idE = '.';
  public static final String idF = String.valueOf('.');
  public static final char idG = '$';
  public static final String idH = String.valueOf('$');

  private static final Map idI = new HashMap();
  private static final Map idJ;
  private static final Map idK;
  private static final Map idL;

  private static void ay(String paramString1, String paramString2)
  {
    idK.put(paramString1, paramString2);
    idL.put(paramString2, paramString1);
  }

  public static String i(Object paramObject, String paramString)
  {
    if (paramObject == null) {
      return paramString;
    }
    return j(paramObject.getClass());
  }

  public static String j(Class paramClass)
  {
    if (paramClass == null) {
      return "";
    }
    return mc(paramClass.getName());
  }

  public static String mc(String paramString)
  {
    if (paramString == null) {
      return "";
    }
    if (paramString.length() == 0) {
      return "";
    }

    StringBuilder localStringBuilder = new StringBuilder();

    if (paramString.startsWith("[")) {
      while (paramString.charAt(0) == '[') {
        paramString = paramString.substring(1);
        localStringBuilder.append("[]");
      }

      if ((paramString.charAt(0) == 'L') && (paramString.charAt(paramString.length() - 1) == ';')) {
        paramString = paramString.substring(1, paramString.length() - 1);
      }
    }

    if (idL.containsKey(paramString)) {
      paramString = (String)idL.get(paramString);
    }

    int i = paramString.lastIndexOf('.');
    int j = paramString.indexOf('$', i == -1 ? 0 : i + 1);

    String str = paramString.substring(i + 1);
    if (j != -1) {
      str = str.replace('$', '.');
    }
    return str + localStringBuilder;
  }

  public static String aa(Class paramClass)
  {
    if (paramClass == null) {
      return "";
    }
    return paramClass.getSimpleName();
  }

  public static String j(Object paramObject, String paramString)
  {
    if (paramObject == null) {
      return paramString;
    }
    return aa(paramObject.getClass());
  }

  public static String k(Object paramObject, String paramString)
  {
    if (paramObject == null) {
      return paramString;
    }
    return getPackageName(paramObject.getClass());
  }

  public static String getPackageName(Class paramClass)
  {
    if (paramClass == null) {
      return "";
    }
    return md(paramClass.getName());
  }

  public static String md(String paramString)
  {
    if ((paramString == null) || (paramString.length() == 0)) {
      return "";
    }

    while (paramString.charAt(0) == '[') {
      paramString = paramString.substring(1);
    }

    if ((paramString.charAt(0) == 'L') && (paramString.charAt(paramString.length() - 1) == ';')) {
      paramString = paramString.substring(1);
    }

    int i = paramString.lastIndexOf('.');
    if (i == -1) {
      return "";
    }
    return paramString.substring(0, i);
  }

  public static List ab(Class paramClass)
  {
    if (paramClass == null) {
      return null;
    }
    ArrayList localArrayList = new ArrayList();
    Class localClass = paramClass.getSuperclass();
    while (localClass != null) {
      localArrayList.add(localClass);
      localClass = localClass.getSuperclass();
    }
    return localArrayList;
  }

  public static List ac(Class paramClass)
  {
    if (paramClass == null) {
      return null;
    }

    LinkedHashSet localLinkedHashSet = new LinkedHashSet();
    a(paramClass, localLinkedHashSet);

    return new ArrayList(localLinkedHashSet);
  }

  private static void a(Class paramClass, HashSet paramHashSet)
  {
    while (paramClass != null) {
      Class[] arrayOfClass1 = paramClass.getInterfaces();

      for (Class localClass : arrayOfClass1) {
        if (paramHashSet.add(localClass)) {
          a(localClass, paramHashSet);
        }
      }

      paramClass = paramClass.getSuperclass();
    }
  }

  public static List G(List paramList)
  {
    if (paramList == null) {
      return null;
    }
    ArrayList localArrayList = new ArrayList(paramList.size());
    for (String str : paramList) {
      try {
        localArrayList.add(Class.forName(str));
      } catch (Exception localException) {
        localArrayList.add(null);
      }
    }
    return localArrayList;
  }

  public static List H(List paramList)
  {
    if (paramList == null) {
      return null;
    }
    ArrayList localArrayList = new ArrayList(paramList.size());
    for (Class localClass : paramList) {
      if (localClass == null)
        localArrayList.add(null);
      else {
        localArrayList.add(localClass.getName());
      }
    }
    return localArrayList;
  }

  public static boolean a(Class[] paramArrayOfClass1, Class[] paramArrayOfClass2)
  {
    return a(paramArrayOfClass1, paramArrayOfClass2, ati.a(dKy.lYm));
  }

  public static boolean a(Class[] paramArrayOfClass1, Class[] paramArrayOfClass2, boolean paramBoolean)
  {
    if (!aUP.b(paramArrayOfClass1, paramArrayOfClass2)) {
      return false;
    }
    if (paramArrayOfClass1 == null) {
      paramArrayOfClass1 = aUP.EMPTY_CLASS_ARRAY;
    }
    if (paramArrayOfClass2 == null) {
      paramArrayOfClass2 = aUP.EMPTY_CLASS_ARRAY;
    }
    for (int i = 0; i < paramArrayOfClass1.length; i++) {
      if (!a(paramArrayOfClass1[i], paramArrayOfClass2[i], paramBoolean)) {
        return false;
      }
    }
    return true;
  }

  public static boolean b(Class paramClass1, Class paramClass2)
  {
    return a(paramClass1, paramClass2, ati.a(dKy.lYm));
  }

  public static boolean a(Class paramClass1, Class paramClass2, boolean paramBoolean)
  {
    if (paramClass2 == null) {
      return false;
    }

    if (paramClass1 == null) {
      return !paramClass2.isPrimitive();
    }

    if (paramBoolean) {
      if ((paramClass1.isPrimitive()) && (!paramClass2.isPrimitive())) {
        paramClass1 = ad(paramClass1);
        if (paramClass1 == null) {
          return false;
        }
      }
      if ((paramClass2.isPrimitive()) && (!paramClass1.isPrimitive())) {
        paramClass1 = ae(paramClass1);
        if (paramClass1 == null) {
          return false;
        }
      }
    }
    if (paramClass1.equals(paramClass2)) {
      return true;
    }
    if (paramClass1.isPrimitive()) {
      if (!paramClass2.isPrimitive()) {
        return false;
      }
      if (Integer.TYPE.equals(paramClass1)) {
        return (Long.TYPE.equals(paramClass2)) || (Float.TYPE.equals(paramClass2)) || (Double.TYPE.equals(paramClass2));
      }

      if (Long.TYPE.equals(paramClass1)) {
        return (Float.TYPE.equals(paramClass2)) || (Double.TYPE.equals(paramClass2));
      }

      if (Boolean.TYPE.equals(paramClass1)) {
        return false;
      }
      if (Double.TYPE.equals(paramClass1)) {
        return false;
      }
      if (Float.TYPE.equals(paramClass1)) {
        return Double.TYPE.equals(paramClass2);
      }
      if (Character.TYPE.equals(paramClass1)) {
        return (Integer.TYPE.equals(paramClass2)) || (Long.TYPE.equals(paramClass2)) || (Float.TYPE.equals(paramClass2)) || (Double.TYPE.equals(paramClass2));
      }

      if (Short.TYPE.equals(paramClass1)) {
        return (Integer.TYPE.equals(paramClass2)) || (Long.TYPE.equals(paramClass2)) || (Float.TYPE.equals(paramClass2)) || (Double.TYPE.equals(paramClass2));
      }

      if (Byte.TYPE.equals(paramClass1)) {
        return (Short.TYPE.equals(paramClass2)) || (Integer.TYPE.equals(paramClass2)) || (Long.TYPE.equals(paramClass2)) || (Float.TYPE.equals(paramClass2)) || (Double.TYPE.equals(paramClass2));
      }

      return false;
    }
    return paramClass2.isAssignableFrom(paramClass1);
  }

  public static Class ad(Class paramClass)
  {
    Class localClass = paramClass;
    if ((paramClass != null) && (paramClass.isPrimitive())) {
      localClass = (Class)idI.get(paramClass);
    }
    return localClass;
  }

  public static Class[] a(Class[] paramArrayOfClass)
  {
    if (paramArrayOfClass == null) {
      return null;
    }

    if (paramArrayOfClass.length == 0) {
      return paramArrayOfClass;
    }

    Class[] arrayOfClass = new Class[paramArrayOfClass.length];
    for (int i = 0; i < paramArrayOfClass.length; i++) {
      arrayOfClass[i] = ad(paramArrayOfClass[i]);
    }
    return arrayOfClass;
  }

  public static Class ae(Class paramClass)
  {
    return (Class)idJ.get(paramClass);
  }

  public static Class[] b(Class[] paramArrayOfClass)
  {
    if (paramArrayOfClass == null) {
      return null;
    }

    if (paramArrayOfClass.length == 0) {
      return paramArrayOfClass;
    }

    Class[] arrayOfClass = new Class[paramArrayOfClass.length];
    for (int i = 0; i < paramArrayOfClass.length; i++) {
      arrayOfClass[i] = ae(paramArrayOfClass[i]);
    }
    return arrayOfClass;
  }

  public static boolean isInnerClass(Class paramClass)
  {
    return (paramClass != null) && (paramClass.getEnclosingClass() != null);
  }

  public static Class a(ClassLoader paramClassLoader, String paramString, boolean paramBoolean)
  {
    try
    {
      Class localClass;
      if (idK.containsKey(paramString)) {
        String str = "[" + (String)idK.get(paramString);
        localClass = Class.forName(str, paramBoolean, paramClassLoader).getComponentType();
      }
      return Class.forName(me(paramString), paramBoolean, paramClassLoader);
    }
    catch (ClassNotFoundException localClassNotFoundException1)
    {
      int i = paramString.lastIndexOf('.');

      if (i != -1) {
        try {
          return a(paramClassLoader, paramString.substring(0, i) + '$' + paramString.substring(i + 1), paramBoolean);
        }
        catch (ClassNotFoundException localClassNotFoundException2)
        {
        }

      }

      throw localClassNotFoundException1;
    }
  }

  public static Class a(ClassLoader paramClassLoader, String paramString)
  {
    return a(paramClassLoader, paramString, true);
  }

  public static Class getClass(String paramString)
  {
    return K(paramString, true);
  }

  public static Class K(String paramString, boolean paramBoolean)
  {
    ClassLoader localClassLoader1 = Thread.currentThread().getContextClassLoader();
    ClassLoader localClassLoader2 = localClassLoader1 == null ? ctC.class.getClassLoader() : localClassLoader1;
    return a(localClassLoader2, paramString, paramBoolean);
  }

  public static Method a(Class paramClass, String paramString, Class[] paramArrayOfClass)
  {
    Method localMethod1 = paramClass.getMethod(paramString, paramArrayOfClass);
    if (Modifier.isPublic(localMethod1.getDeclaringClass().getModifiers())) {
      return localMethod1;
    }

    ArrayList localArrayList = new ArrayList();
    localArrayList.addAll(ac(paramClass));
    localArrayList.addAll(ab(paramClass));

    for (Class localClass : localArrayList) {
      if (Modifier.isPublic(localClass.getModifiers()))
      {
        Method localMethod2;
        try
        {
          localMethod2 = localClass.getMethod(paramString, paramArrayOfClass); } catch (NoSuchMethodException localNoSuchMethodException) {
        }
        continue;

        if (Modifier.isPublic(localMethod2.getDeclaringClass().getModifiers())) {
          return localMethod2;
        }
      }
    }
    throw new NoSuchMethodException("Can't find a public method for " + paramString + " " + aUP.toString(paramArrayOfClass));
  }

  private static String me(String paramString)
  {
    paramString = cOg.oc(paramString);
    if (paramString == null)
      throw new NullPointerException("className must not be null.");
    if (paramString.endsWith("[]")) {
      StringBuilder localStringBuilder = new StringBuilder();
      while (paramString.endsWith("[]")) {
        paramString = paramString.substring(0, paramString.length() - 2);
        localStringBuilder.append("[");
      }
      String str = (String)idK.get(paramString);
      if (str != null)
        localStringBuilder.append(str);
      else {
        localStringBuilder.append("L").append(paramString).append(";");
      }
      paramString = localStringBuilder.toString();
    }
    return paramString;
  }

  public static Class[] r(Object[] paramArrayOfObject)
  {
    if (paramArrayOfObject == null)
      return null;
    if (paramArrayOfObject.length == 0) {
      return aUP.EMPTY_CLASS_ARRAY;
    }
    Class[] arrayOfClass = new Class[paramArrayOfObject.length];
    for (int i = 0; i < paramArrayOfObject.length; i++) {
      arrayOfClass[i] = (paramArrayOfObject[i] == null ? null : paramArrayOfObject[i].getClass());
    }
    return arrayOfClass;
  }

  public static String l(Object paramObject, String paramString)
  {
    if (paramObject == null) {
      return paramString;
    }
    return mf(paramObject.getClass().getName());
  }

  public static String af(Class paramClass)
  {
    if (paramClass == null) {
      return "";
    }
    return mf(paramClass.getName());
  }

  public static String mf(String paramString)
  {
    return mc(mh(paramString));
  }

  public static String m(Object paramObject, String paramString)
  {
    if (paramObject == null) {
      return paramString;
    }
    return mg(paramObject.getClass().getName());
  }

  public static String ag(Class paramClass)
  {
    if (paramClass == null) {
      return "";
    }
    return mg(paramClass.getName());
  }

  public static String mg(String paramString)
  {
    return md(mh(paramString));
  }

  private static String mh(String paramString)
  {
    paramString = cOg.oc(paramString);
    if (paramString == null) {
      return null;
    }
    int i = 0;
    while (paramString.startsWith("[")) {
      i++;
      paramString = paramString.substring(1);
    }
    if (i < 1) {
      return paramString;
    }
    if (paramString.startsWith("L")) {
      paramString = paramString.substring(1, paramString.endsWith(";") ? paramString.length() - 1 : paramString.length());
    }
    else if (paramString.length() > 0) {
      paramString = (String)idL.get(paramString.substring(0, 1));
    }

    StringBuilder localStringBuilder = new StringBuilder(paramString);
    for (int j = 0; j < i; j++) {
      localStringBuilder.append("[]");
    }
    return localStringBuilder.toString();
  }

  static
  {
    idI.put(Boolean.TYPE, Boolean.class);
    idI.put(Byte.TYPE, Byte.class);
    idI.put(Character.TYPE, Character.class);
    idI.put(Short.TYPE, Short.class);
    idI.put(Integer.TYPE, Integer.class);
    idI.put(Long.TYPE, Long.class);
    idI.put(Double.TYPE, Double.class);
    idI.put(Float.TYPE, Float.class);
    idI.put(Void.TYPE, Void.TYPE);

    idJ = new HashMap();

    for (Class localClass1 : idI.keySet()) {
      Class localClass2 = (Class)idI.get(localClass1);
      if (!localClass1.equals(localClass2)) {
        idJ.put(localClass2, localClass1);
      }

    }

    idK = new HashMap();

    idL = new HashMap();

    ay("int", "I");
    ay("boolean", "Z");
    ay("float", "F");
    ay("long", "J");
    ay("short", "S");
    ay("byte", "B");
    ay("double", "D");
    ay("char", "C");
  }
}