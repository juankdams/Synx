import com.sun.jna.Native;
import java.lang.reflect.Method;

public class drg
  implements vN
{
  static Class bZS;

  protected int an(Class paramClass)
  {
    if ((bZS == null ? (drg.bZS = cd("arr")) : bZS).isAssignableFrom(paramClass)) {
      paramClass = MK.k(paramClass).WJ();
    }
    if (paramClass.isArray())
      return axA.SIZE;
    try
    {
      return Native.s(paramClass);
    } catch (IllegalArgumentException localIllegalArgumentException) {
    }
    throw new IllegalArgumentException("Unknown native stack allocation size for " + paramClass);
  }

  public String a(bMB parambMB, Method paramMethod)
  {
    String str1 = paramMethod.getName();
    int i = 0;
    Class[] arrayOfClass = paramMethod.getParameterTypes();
    for (int j = 0; j < arrayOfClass.length; j++) {
      i += an(arrayOfClass[j]);
    }
    String str2 = str1 + "@" + i;
    int k = 1;
    try {
      str1 = parambMB.C(str2, k).getName();
    }
    catch (UnsatisfiedLinkError localUnsatisfiedLinkError1)
    {
      try
      {
        str1 = parambMB.C("_" + str2, k).getName();
      }
      catch (UnsatisfiedLinkError localUnsatisfiedLinkError2)
      {
      }
    }
    return str1;
  }

  static Class cd(String paramString)
  {
    try
    {
      return Class.forName(paramString); } catch (ClassNotFoundException localClassNotFoundException) { throw new NoClassDefFoundError().initCause(localClassNotFoundException); }

  }
}