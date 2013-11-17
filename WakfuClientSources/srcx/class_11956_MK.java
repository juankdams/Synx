import java.lang.ref.Reference;
import java.lang.ref.SoftReference;
import java.util.Map;
import java.util.WeakHashMap;

public class MK
  implements dsn
{
  private static final Map bZP = new WeakHashMap();
  private final Class type;
  private final Class bZQ;
  private final arr bZR;
  static Class bZS;
  static Class bZT;

  public static MK k(Class paramClass)
  {
    synchronized (bZP) {
      Reference localReference = (Reference)bZP.get(paramClass);
      MK localMK = localReference != null ? (MK)localReference.get() : null;
      if (localMK == null) {
        localMK = new MK(paramClass);
        bZP.put(paramClass, new SoftReference(localMK));
      }
      return localMK;
    }
  }

  public MK(Class paramClass) {
    if (!(bZS == null ? (MK.bZS = cd("arr")) : bZS).isAssignableFrom(paramClass)) {
      throw new IllegalArgumentException("Type must derive from " + (bZS == null ? (MK.bZS = cd("arr")) : bZS));
    }
    this.type = paramClass;
    this.bZR = WI();
    this.bZQ = this.bZR.WJ();
  }
  public arr WI() {
    String str;
    try {
      return (arr)this.type.newInstance();
    }
    catch (InstantiationException localInstantiationException) {
      str = "Can't create an instance of " + this.type + ", requires a no-arg constructor: " + localInstantiationException;

      throw new IllegalArgumentException(str);
    }
    catch (IllegalAccessException localIllegalAccessException) {
      str = "Not allowed to create an instance of " + this.type + ", requires a public, no-arg constructor: " + localIllegalAccessException;
    }
    throw new IllegalArgumentException(str);
  }

  public Object a(Object paramObject, hT paramhT) {
    return this.bZR.a(paramObject, paramhT);
  }

  public Class WJ() {
    return this.bZQ;
  }

  public Object a(Object paramObject, qd paramqd) {
    if (paramObject == null) {
      if ((bZT == null ? (MK.bZT = cd("axA")) : bZT).isAssignableFrom(this.bZQ)) {
        return null;
      }
      paramObject = WI();
    }
    return ((arr)paramObject).aDQ();
  }

  static Class cd(String paramString)
  {
    try
    {
      return Class.forName(paramString); } catch (ClassNotFoundException localClassNotFoundException) { throw new NoClassDefFoundError().initCause(localClassNotFoundException); }

  }
}