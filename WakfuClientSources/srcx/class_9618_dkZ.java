import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class dkZ
  implements bWB
{
  private static final ThreadLocal bTg = new ThreadLocal();

  private boolean liz = true;

  static Set cTa()
  {
    return (Set)bTg.get();
  }

  static aef r(Object paramObject1, Object paramObject2)
  {
    dld localdld1 = new dld(paramObject1);
    dld localdld2 = new dld(paramObject2);
    return aef.e(localdld1, localdld2);
  }

  static boolean s(Object paramObject1, Object paramObject2)
  {
    Set localSet = cTa();
    aef localaef1 = r(paramObject1, paramObject2);
    aef localaef2 = aef.e(localaef1.aqa(), localaef1.aqb());

    return (localSet != null) && ((localSet.contains(localaef1)) || (localSet.contains(localaef2)));
  }

  static void t(Object paramObject1, Object paramObject2)
  {
    synchronized (dkZ.class) {
      if (cTa() == null) {
        bTg.set(new HashSet());
      }
    }

    ??? = cTa();
    aef localaef = r(paramObject1, paramObject2);
    ((Set)???).add(localaef);
  }

  static void u(Object paramObject1, Object paramObject2)
  {
    Set localSet = cTa();
    if (localSet != null) {
      aef localaef = r(paramObject1, paramObject2);
      localSet.remove(localaef);
      synchronized (dkZ.class)
      {
        localSet = cTa();
        if ((localSet != null) && (localSet.isEmpty()))
          bTg.remove();
      }
    }
  }

  public static boolean b(Object paramObject1, Object paramObject2, Collection paramCollection)
  {
    return b(paramObject1, paramObject2, cAg.u(paramCollection));
  }

  public static boolean b(Object paramObject1, Object paramObject2, String[] paramArrayOfString)
  {
    return b(paramObject1, paramObject2, false, null, paramArrayOfString);
  }

  public static boolean b(Object paramObject1, Object paramObject2, boolean paramBoolean)
  {
    return b(paramObject1, paramObject2, paramBoolean, null, new String[0]);
  }

  public static boolean b(Object paramObject1, Object paramObject2, boolean paramBoolean, Class paramClass, String[] paramArrayOfString)
  {
    if (paramObject1 == paramObject2) {
      return true;
    }
    if ((paramObject1 == null) || (paramObject2 == null)) {
      return false;
    }

    Class localClass1 = paramObject1.getClass();
    Class localClass2 = paramObject2.getClass();
    Class localClass3;
    if (localClass1.isInstance(paramObject2)) {
      localClass3 = localClass1;
      if (!localClass2.isInstance(paramObject1))
      {
        localClass3 = localClass2;
      }
    } else if (localClass2.isInstance(paramObject1)) {
      localClass3 = localClass2;
      if (!localClass1.isInstance(paramObject2))
      {
        localClass3 = localClass1;
      }
    }
    else {
      return false;
    }
    dkZ localdkZ = new dkZ();
    try {
      a(paramObject1, paramObject2, localClass3, localdkZ, paramBoolean, paramArrayOfString);
      while ((localClass3.getSuperclass() != null) && (localClass3 != paramClass)) {
        localClass3 = localClass3.getSuperclass();
        a(paramObject1, paramObject2, localClass3, localdkZ, paramBoolean, paramArrayOfString);
      }

    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      return false;
    }
    return localdkZ.cTb();
  }

  private static void a(Object paramObject1, Object paramObject2, Class paramClass, dkZ paramdkZ, boolean paramBoolean, String[] paramArrayOfString)
  {
    if (s(paramObject1, paramObject2)) {
      return;
    }
    try
    {
      t(paramObject1, paramObject2);
      Field[] arrayOfField = paramClass.getDeclaredFields();
      AccessibleObject.setAccessible(arrayOfField, true);
      for (int i = 0; (i < arrayOfField.length) && (paramdkZ.liz); i++) {
        Field localField = arrayOfField[i];
        if ((!aUP.c(paramArrayOfString, localField.getName())) && (localField.getName().indexOf('$') == -1) && ((paramBoolean) || (!Modifier.isTransient(localField.getModifiers()))) && (!Modifier.isStatic(localField.getModifiers())))
        {
          try
          {
            paramdkZ.v(localField.get(paramObject1), localField.get(paramObject2));
          }
          catch (IllegalAccessException localIllegalAccessException)
          {
            throw new InternalError("Unexpected IllegalAccessException");
          }
        }
      }
    } finally {
      u(paramObject1, paramObject2);
    }
  }

  public dkZ jy(boolean paramBoolean)
  {
    if (!this.liz) {
      return this;
    }
    this.liz = paramBoolean;
    return this;
  }

  public dkZ v(Object paramObject1, Object paramObject2)
  {
    if (!this.liz) {
      return this;
    }
    if (paramObject1 == paramObject2) {
      return this;
    }
    if ((paramObject1 == null) || (paramObject2 == null)) {
      jz(false);
      return this;
    }
    Class localClass = paramObject1.getClass();
    if (!localClass.isArray())
    {
      this.liz = paramObject1.equals(paramObject2);
    } else if (paramObject1.getClass() != paramObject2.getClass())
    {
      jz(false);
    }
    else if ((paramObject1 instanceof long[]))
      e((long[])paramObject1, (long[])paramObject2);
    else if ((paramObject1 instanceof int[]))
      g((int[])paramObject1, (int[])paramObject2);
    else if ((paramObject1 instanceof short[]))
      e((short[])paramObject1, (short[])paramObject2);
    else if ((paramObject1 instanceof char[]))
      e((char[])paramObject1, (char[])paramObject2);
    else if ((paramObject1 instanceof byte[]))
      f((byte[])paramObject1, (byte[])paramObject2);
    else if ((paramObject1 instanceof double[]))
      e((double[])paramObject1, (double[])paramObject2);
    else if ((paramObject1 instanceof float[]))
      f((float[])paramObject1, (float[])paramObject2);
    else if ((paramObject1 instanceof boolean[])) {
      e((boolean[])paramObject1, (boolean[])paramObject2);
    }
    else {
      e((Object[])paramObject1, (Object[])paramObject2);
    }
    return this;
  }

  public dkZ H(long paramLong1, long paramLong2)
  {
    if (!this.liz) {
      return this;
    }
    this.liz = (paramLong1 == paramLong2);
    return this;
  }

  public dkZ eI(int paramInt1, int paramInt2)
  {
    if (!this.liz) {
      return this;
    }
    this.liz = (paramInt1 == paramInt2);
    return this;
  }

  public dkZ X(short paramShort1, short paramShort2)
  {
    if (!this.liz) {
      return this;
    }
    this.liz = (paramShort1 == paramShort2);
    return this;
  }

  public dkZ b(char paramChar1, char paramChar2)
  {
    if (!this.liz) {
      return this;
    }
    this.liz = (paramChar1 == paramChar2);
    return this;
  }

  public dkZ p(byte paramByte1, byte paramByte2)
  {
    if (!this.liz) {
      return this;
    }
    this.liz = (paramByte1 == paramByte2);
    return this;
  }

  public dkZ t(double paramDouble1, double paramDouble2)
  {
    if (!this.liz) {
      return this;
    }
    return H(Double.doubleToLongBits(paramDouble1), Double.doubleToLongBits(paramDouble2));
  }

  public dkZ aq(float paramFloat1, float paramFloat2)
  {
    if (!this.liz) {
      return this;
    }
    return eI(Float.floatToIntBits(paramFloat1), Float.floatToIntBits(paramFloat2));
  }

  public dkZ u(boolean paramBoolean1, boolean paramBoolean2)
  {
    if (!this.liz) {
      return this;
    }
    this.liz = (paramBoolean1 == paramBoolean2);
    return this;
  }

  public dkZ e(Object[] paramArrayOfObject1, Object[] paramArrayOfObject2)
  {
    if (!this.liz) {
      return this;
    }
    if (paramArrayOfObject1 == paramArrayOfObject2) {
      return this;
    }
    if ((paramArrayOfObject1 == null) || (paramArrayOfObject2 == null)) {
      jz(false);
      return this;
    }
    if (paramArrayOfObject1.length != paramArrayOfObject2.length) {
      jz(false);
      return this;
    }
    for (int i = 0; (i < paramArrayOfObject1.length) && (this.liz); i++) {
      v(paramArrayOfObject1[i], paramArrayOfObject2[i]);
    }
    return this;
  }

  public dkZ e(long[] paramArrayOfLong1, long[] paramArrayOfLong2)
  {
    if (!this.liz) {
      return this;
    }
    if (paramArrayOfLong1 == paramArrayOfLong2) {
      return this;
    }
    if ((paramArrayOfLong1 == null) || (paramArrayOfLong2 == null)) {
      jz(false);
      return this;
    }
    if (paramArrayOfLong1.length != paramArrayOfLong2.length) {
      jz(false);
      return this;
    }
    for (int i = 0; (i < paramArrayOfLong1.length) && (this.liz); i++) {
      H(paramArrayOfLong1[i], paramArrayOfLong2[i]);
    }
    return this;
  }

  public dkZ g(int[] paramArrayOfInt1, int[] paramArrayOfInt2)
  {
    if (!this.liz) {
      return this;
    }
    if (paramArrayOfInt1 == paramArrayOfInt2) {
      return this;
    }
    if ((paramArrayOfInt1 == null) || (paramArrayOfInt2 == null)) {
      jz(false);
      return this;
    }
    if (paramArrayOfInt1.length != paramArrayOfInt2.length) {
      jz(false);
      return this;
    }
    for (int i = 0; (i < paramArrayOfInt1.length) && (this.liz); i++) {
      eI(paramArrayOfInt1[i], paramArrayOfInt2[i]);
    }
    return this;
  }

  public dkZ e(short[] paramArrayOfShort1, short[] paramArrayOfShort2)
  {
    if (!this.liz) {
      return this;
    }
    if (paramArrayOfShort1 == paramArrayOfShort2) {
      return this;
    }
    if ((paramArrayOfShort1 == null) || (paramArrayOfShort2 == null)) {
      jz(false);
      return this;
    }
    if (paramArrayOfShort1.length != paramArrayOfShort2.length) {
      jz(false);
      return this;
    }
    for (int i = 0; (i < paramArrayOfShort1.length) && (this.liz); i++) {
      X(paramArrayOfShort1[i], paramArrayOfShort2[i]);
    }
    return this;
  }

  public dkZ e(char[] paramArrayOfChar1, char[] paramArrayOfChar2)
  {
    if (!this.liz) {
      return this;
    }
    if (paramArrayOfChar1 == paramArrayOfChar2) {
      return this;
    }
    if ((paramArrayOfChar1 == null) || (paramArrayOfChar2 == null)) {
      jz(false);
      return this;
    }
    if (paramArrayOfChar1.length != paramArrayOfChar2.length) {
      jz(false);
      return this;
    }
    for (int i = 0; (i < paramArrayOfChar1.length) && (this.liz); i++) {
      b(paramArrayOfChar1[i], paramArrayOfChar2[i]);
    }
    return this;
  }

  public dkZ f(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    if (!this.liz) {
      return this;
    }
    if (paramArrayOfByte1 == paramArrayOfByte2) {
      return this;
    }
    if ((paramArrayOfByte1 == null) || (paramArrayOfByte2 == null)) {
      jz(false);
      return this;
    }
    if (paramArrayOfByte1.length != paramArrayOfByte2.length) {
      jz(false);
      return this;
    }
    for (int i = 0; (i < paramArrayOfByte1.length) && (this.liz); i++) {
      p(paramArrayOfByte1[i], paramArrayOfByte2[i]);
    }
    return this;
  }

  public dkZ e(double[] paramArrayOfDouble1, double[] paramArrayOfDouble2)
  {
    if (!this.liz) {
      return this;
    }
    if (paramArrayOfDouble1 == paramArrayOfDouble2) {
      return this;
    }
    if ((paramArrayOfDouble1 == null) || (paramArrayOfDouble2 == null)) {
      jz(false);
      return this;
    }
    if (paramArrayOfDouble1.length != paramArrayOfDouble2.length) {
      jz(false);
      return this;
    }
    for (int i = 0; (i < paramArrayOfDouble1.length) && (this.liz); i++) {
      t(paramArrayOfDouble1[i], paramArrayOfDouble2[i]);
    }
    return this;
  }

  public dkZ f(float[] paramArrayOfFloat1, float[] paramArrayOfFloat2)
  {
    if (!this.liz) {
      return this;
    }
    if (paramArrayOfFloat1 == paramArrayOfFloat2) {
      return this;
    }
    if ((paramArrayOfFloat1 == null) || (paramArrayOfFloat2 == null)) {
      jz(false);
      return this;
    }
    if (paramArrayOfFloat1.length != paramArrayOfFloat2.length) {
      jz(false);
      return this;
    }
    for (int i = 0; (i < paramArrayOfFloat1.length) && (this.liz); i++) {
      aq(paramArrayOfFloat1[i], paramArrayOfFloat2[i]);
    }
    return this;
  }

  public dkZ e(boolean[] paramArrayOfBoolean1, boolean[] paramArrayOfBoolean2)
  {
    if (!this.liz) {
      return this;
    }
    if (paramArrayOfBoolean1 == paramArrayOfBoolean2) {
      return this;
    }
    if ((paramArrayOfBoolean1 == null) || (paramArrayOfBoolean2 == null)) {
      jz(false);
      return this;
    }
    if (paramArrayOfBoolean1.length != paramArrayOfBoolean2.length) {
      jz(false);
      return this;
    }
    for (int i = 0; (i < paramArrayOfBoolean1.length) && (this.liz); i++) {
      u(paramArrayOfBoolean1[i], paramArrayOfBoolean2[i]);
    }
    return this;
  }

  public boolean cTb()
  {
    return this.liz;
  }

  public Boolean cTc()
  {
    return Boolean.valueOf(cTb());
  }

  protected void jz(boolean paramBoolean)
  {
    this.liz = paramBoolean;
  }

  public void reset()
  {
    this.liz = true;
  }
}