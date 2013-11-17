import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class beh
{
  public static Object a(Class paramClass, Class[] paramArrayOfClass, Object[] paramArrayOfObject)
  {
    try
    {
      Constructor localConstructor = paramClass.getConstructor(paramArrayOfClass);
      return localConstructor.newInstance(paramArrayOfObject);
    } catch (Exception localException) {
      a(localException);
    }return null;
  }

  public static Object e(Object paramObject, String paramString)
  {
    try
    {
      Method localMethod = paramObject.getClass().getMethod(paramString, (Class[])null);

      return localMethod.invoke(paramObject, (Object[])null);
    } catch (Exception localException) {
      a(localException);
    }return null;
  }

  public static Object f(Object paramObject, String paramString)
  {
    try
    {
      Method localMethod = ((Class)paramObject).getMethod(paramString, (Class[])null);

      return localMethod.invoke(paramObject, (Object[])null);
    } catch (Exception localException) {
      a(localException);
    }return null;
  }

  public static Object a(Object paramObject1, String paramString, Class paramClass, Object paramObject2)
  {
    try
    {
      Method localMethod = paramObject1.getClass().getMethod(paramString, new Class[] { paramClass });

      return localMethod.invoke(paramObject1, new Object[] { paramObject2 });
    } catch (Exception localException) {
      a(localException);
    }return null;
  }

  public static Object a(Object paramObject1, String paramString, Class paramClass1, Object paramObject2, Class paramClass2, Object paramObject3)
  {
    try
    {
      Method localMethod = paramObject1.getClass().getMethod(paramString, new Class[] { paramClass1, paramClass2 });

      return localMethod.invoke(paramObject1, new Object[] { paramObject2, paramObject3 });
    } catch (Exception localException) {
      a(localException);
    }return null;
  }

  public static Object g(Object paramObject, String paramString)
  {
    try
    {
      Field localField = paramObject.getClass().getDeclaredField(paramString);
      localField.setAccessible(true);
      return localField.get(paramObject);
    } catch (Exception localException) {
      a(localException);
    }return null;
  }

  public static void a(Exception paramException)
  {
    throw b(paramException);
  }

  public static cJ b(Exception paramException)
  {
    if ((paramException instanceof InvocationTargetException)) {
      Throwable localThrowable = ((InvocationTargetException)paramException).getTargetException();

      if ((localThrowable instanceof cJ)) {
        return (cJ)localThrowable;
      }
      return new cJ(localThrowable);
    }
    return new cJ(paramException);
  }

  public static boolean h(Object paramObject, String paramString)
  {
    try
    {
      Method[] arrayOfMethod = paramObject.getClass().getMethods();
      for (int i = 0; i < arrayOfMethod.length; i++) {
        if (arrayOfMethod[i].getName().equals(paramString)) {
          return true;
        }
      }
      return false;
    } catch (Exception localException) {
      throw b(localException);
    }
  }
}