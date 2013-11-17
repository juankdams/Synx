import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class dSp
  implements bWB
{
  private static final ThreadLocal bTg = new ThreadLocal();
  private final int mop;
  private int moq = 0;

  static Set cTa()
  {
    return (Set)bTg.get();
  }

  static boolean I(Object paramObject)
  {
    Set localSet = cTa();
    return (localSet != null) && (localSet.contains(new dld(paramObject)));
  }

  private static void a(Object paramObject, Class paramClass, dSp paramdSp, boolean paramBoolean, String[] paramArrayOfString)
  {
    if (I(paramObject))
      return;
    try
    {
      J(paramObject);
      Field[] arrayOfField1 = paramClass.getDeclaredFields();
      AccessibleObject.setAccessible(arrayOfField1, true);
      for (Field localField : arrayOfField1)
        if ((!aUP.c(paramArrayOfString, localField.getName())) && (localField.getName().indexOf('$') == -1) && ((paramBoolean) || (!Modifier.isTransient(localField.getModifiers()))) && (!Modifier.isStatic(localField.getModifiers())))
        {
          try
          {
            Object localObject1 = localField.get(paramObject);
            paramdSp.bC(localObject1);
          }
          catch (IllegalAccessException localIllegalAccessException)
          {
            throw new InternalError("Unexpected IllegalAccessException");
          }
        }
    }
    finally {
      K(paramObject);
    }
  }

  public static int b(int paramInt1, int paramInt2, Object paramObject)
  {
    return a(paramInt1, paramInt2, paramObject, false, null, new String[0]);
  }

  public static int a(int paramInt1, int paramInt2, Object paramObject, boolean paramBoolean)
  {
    return a(paramInt1, paramInt2, paramObject, paramBoolean, null, new String[0]);
  }

  public static int a(int paramInt1, int paramInt2, Object paramObject, boolean paramBoolean, Class paramClass, String[] paramArrayOfString)
  {
    if (paramObject == null) {
      throw new IllegalArgumentException("The object to build a hash code for must not be null");
    }
    dSp localdSp = new dSp(paramInt1, paramInt2);
    Class localClass = paramObject.getClass();
    a(paramObject, localClass, localdSp, paramBoolean, paramArrayOfString);
    while ((localClass.getSuperclass() != null) && (localClass != paramClass)) {
      localClass = localClass.getSuperclass();
      a(paramObject, localClass, localdSp, paramBoolean, paramArrayOfString);
    }
    return localdSp.dsT();
  }

  public static int g(Object paramObject, boolean paramBoolean)
  {
    return a(17, 37, paramObject, paramBoolean, null, new String[0]);
  }

  public static int b(Object paramObject, Collection paramCollection)
  {
    return b(paramObject, cAg.u(paramCollection));
  }

  public static int b(Object paramObject, String[] paramArrayOfString)
  {
    return a(17, 37, paramObject, false, null, paramArrayOfString);
  }

  static void J(Object paramObject)
  {
    synchronized (dSp.class) {
      if (cTa() == null) {
        bTg.set(new HashSet());
      }
    }
    cTa().add(new dld(paramObject));
  }

  static void K(Object paramObject)
  {
    Set localSet = cTa();
    if (localSet != null) {
      localSet.remove(new dld(paramObject));
      synchronized (dSp.class)
      {
        localSet = cTa();
        if ((localSet != null) && (localSet.isEmpty()))
          bTg.remove();
      }
    }
  }

  public dSp()
  {
    this.mop = 37;
    this.moq = 17;
  }

  public dSp(int paramInt1, int paramInt2)
  {
    if (paramInt1 == 0) {
      throw new IllegalArgumentException("HashCodeBuilder requires a non zero initial value");
    }
    if (paramInt1 % 2 == 0) {
      throw new IllegalArgumentException("HashCodeBuilder requires an odd initial value");
    }
    if (paramInt2 == 0) {
      throw new IllegalArgumentException("HashCodeBuilder requires a non zero multiplier");
    }
    if (paramInt2 % 2 == 0) {
      throw new IllegalArgumentException("HashCodeBuilder requires an odd multiplier");
    }
    this.mop = paramInt2;
    this.moq = paramInt1;
  }

  public dSp lt(boolean paramBoolean)
  {
    this.moq = (this.moq * this.mop + (paramBoolean ? 0 : 1));
    return this;
  }

  public dSp h(boolean[] paramArrayOfBoolean)
  {
    if (paramArrayOfBoolean == null)
      this.moq *= this.mop;
    else {
      for (int k : paramArrayOfBoolean) {
        lt(k);
      }
    }
    return this;
  }

  public dSp fW(byte paramByte)
  {
    this.moq = (this.moq * this.mop + paramByte);
    return this;
  }

  public dSp aQ(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null)
      this.moq *= this.mop;
    else {
      for (byte b : paramArrayOfByte) {
        fW(b);
      }
    }
    return this;
  }

  public dSp Z(char paramChar)
  {
    this.moq = (this.moq * this.mop + paramChar);
    return this;
  }

  public dSp i(char[] paramArrayOfChar)
  {
    if (paramArrayOfChar == null)
      this.moq *= this.mop;
    else {
      for (char c : paramArrayOfChar) {
        Z(c);
      }
    }
    return this;
  }

  public dSp Y(double paramDouble)
  {
    return kV(Double.doubleToLongBits(paramDouble));
  }

  public dSp i(double[] paramArrayOfDouble)
  {
    if (paramArrayOfDouble == null)
      this.moq *= this.mop;
    else {
      for (double d : paramArrayOfDouble) {
        Y(d);
      }
    }
    return this;
  }

  public dSp dF(float paramFloat)
  {
    this.moq = (this.moq * this.mop + Float.floatToIntBits(paramFloat));
    return this;
  }

  public dSp R(float[] paramArrayOfFloat)
  {
    if (paramArrayOfFloat == null)
      this.moq *= this.mop;
    else {
      for (float f : paramArrayOfFloat) {
        dF(f);
      }
    }
    return this;
  }

  public dSp DQ(int paramInt)
  {
    this.moq = (this.moq * this.mop + paramInt);
    return this;
  }

  public dSp ae(int[] paramArrayOfInt)
  {
    if (paramArrayOfInt == null)
      this.moq *= this.mop;
    else {
      for (int k : paramArrayOfInt) {
        DQ(k);
      }
    }
    return this;
  }

  public dSp kV(long paramLong)
  {
    this.moq = (this.moq * this.mop + (int)(paramLong ^ paramLong >> 32));
    return this;
  }

  public dSp q(long[] paramArrayOfLong)
  {
    if (paramArrayOfLong == null)
      this.moq *= this.mop;
    else {
      for (long l : paramArrayOfLong) {
        kV(l);
      }
    }
    return this;
  }

  public dSp bC(Object paramObject)
  {
    if (paramObject == null) {
      this.moq *= this.mop;
    }
    else if (paramObject.getClass().isArray())
    {
      if ((paramObject instanceof long[]))
        q((long[])paramObject);
      else if ((paramObject instanceof int[]))
        ae((int[])paramObject);
      else if ((paramObject instanceof short[]))
        t((short[])paramObject);
      else if ((paramObject instanceof char[]))
        i((char[])paramObject);
      else if ((paramObject instanceof byte[]))
        aQ((byte[])paramObject);
      else if ((paramObject instanceof double[]))
        i((double[])paramObject);
      else if ((paramObject instanceof float[]))
        R((float[])paramObject);
      else if ((paramObject instanceof boolean[])) {
        h((boolean[])paramObject);
      }
      else
        E((Object[])paramObject);
    }
    else {
      this.moq = (this.moq * this.mop + paramObject.hashCode());
    }

    return this;
  }

  public dSp E(Object[] paramArrayOfObject)
  {
    if (paramArrayOfObject == null)
      this.moq *= this.mop;
    else {
      for (Object localObject : paramArrayOfObject) {
        bC(localObject);
      }
    }
    return this;
  }

  public dSp eO(short paramShort)
  {
    this.moq = (this.moq * this.mop + paramShort);
    return this;
  }

  public dSp t(short[] paramArrayOfShort)
  {
    if (paramArrayOfShort == null)
      this.moq *= this.mop;
    else {
      for (short s : paramArrayOfShort) {
        eO(s);
      }
    }
    return this;
  }

  public dSp DR(int paramInt)
  {
    this.moq = (this.moq * this.mop + paramInt);
    return this;
  }

  public int dsT()
  {
    return this.moq;
  }

  public Integer aaM()
  {
    return Integer.valueOf(dsT());
  }

  public int hashCode()
  {
    return dsT();
  }
}