import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Collection;
import java.util.Comparator;

public class ON
  implements bWB
{
  private int cfS;

  public ON()
  {
    this.cfS = 0;
  }

  public static int c(Object paramObject1, Object paramObject2)
  {
    return a(paramObject1, paramObject2, false, null, new String[0]);
  }

  public static int a(Object paramObject1, Object paramObject2, boolean paramBoolean)
  {
    return a(paramObject1, paramObject2, paramBoolean, null, new String[0]);
  }

  public static int a(Object paramObject1, Object paramObject2, Collection paramCollection)
  {
    return a(paramObject1, paramObject2, cAg.u(paramCollection));
  }

  public static int a(Object paramObject1, Object paramObject2, String[] paramArrayOfString)
  {
    return a(paramObject1, paramObject2, false, null, paramArrayOfString);
  }

  public static int a(Object paramObject1, Object paramObject2, boolean paramBoolean, Class paramClass, String[] paramArrayOfString)
  {
    if (paramObject1 == paramObject2) {
      return 0;
    }
    if ((paramObject1 == null) || (paramObject2 == null)) {
      throw new NullPointerException();
    }
    Class localClass = paramObject1.getClass();
    if (!localClass.isInstance(paramObject2)) {
      throw new ClassCastException();
    }
    ON localON = new ON();
    a(paramObject1, paramObject2, localClass, localON, paramBoolean, paramArrayOfString);
    while ((localClass.getSuperclass() != null) && (localClass != paramClass)) {
      localClass = localClass.getSuperclass();
      a(paramObject1, paramObject2, localClass, localON, paramBoolean, paramArrayOfString);
    }
    return localON.aaL();
  }

  private static void a(Object paramObject1, Object paramObject2, Class paramClass, ON paramON, boolean paramBoolean, String[] paramArrayOfString)
  {
    Field[] arrayOfField = paramClass.getDeclaredFields();
    AccessibleObject.setAccessible(arrayOfField, true);
    for (int i = 0; (i < arrayOfField.length) && (paramON.cfS == 0); i++) {
      Field localField = arrayOfField[i];
      if ((!aUP.c(paramArrayOfString, localField.getName())) && (localField.getName().indexOf('$') == -1) && ((paramBoolean) || (!Modifier.isTransient(localField.getModifiers()))) && (!Modifier.isStatic(localField.getModifiers())))
      {
        try
        {
          paramON.d(localField.get(paramObject1), localField.get(paramObject2));
        }
        catch (IllegalAccessException localIllegalAccessException)
        {
          throw new InternalError("Unexpected IllegalAccessException");
        }
      }
    }
  }

  public ON gg(int paramInt)
  {
    if (this.cfS != 0) {
      return this;
    }
    this.cfS = paramInt;
    return this;
  }

  public ON d(Object paramObject1, Object paramObject2)
  {
    return a(paramObject1, paramObject2, null);
  }

  public ON a(Object paramObject1, Object paramObject2, Comparator paramComparator)
  {
    if (this.cfS != 0) {
      return this;
    }
    if (paramObject1 == paramObject2) {
      return this;
    }
    if (paramObject1 == null) {
      this.cfS = -1;
      return this;
    }
    if (paramObject2 == null) {
      this.cfS = 1;
      return this;
    }
    if (paramObject1.getClass().isArray())
    {
      if ((paramObject1 instanceof long[]))
        a((long[])paramObject1, (long[])paramObject2);
      else if ((paramObject1 instanceof int[]))
        a((int[])paramObject1, (int[])paramObject2);
      else if ((paramObject1 instanceof short[]))
        a((short[])paramObject1, (short[])paramObject2);
      else if ((paramObject1 instanceof char[]))
        a((char[])paramObject1, (char[])paramObject2);
      else if ((paramObject1 instanceof byte[]))
        a((byte[])paramObject1, (byte[])paramObject2);
      else if ((paramObject1 instanceof double[]))
        a((double[])paramObject1, (double[])paramObject2);
      else if ((paramObject1 instanceof float[]))
        a((float[])paramObject1, (float[])paramObject2);
      else if ((paramObject1 instanceof boolean[])) {
        a((boolean[])paramObject1, (boolean[])paramObject2);
      }
      else
      {
        a((Object[])paramObject1, (Object[])paramObject2, paramComparator);
      }
    }
    else
    {
      Object localObject;
      if (paramComparator == null)
      {
        localObject = (Comparable)paramObject1;
        this.cfS = ((Comparable)localObject).compareTo(paramObject2);
      }
      else {
        localObject = paramComparator;
        this.cfS = ((Comparator)localObject).compare(paramObject1, paramObject2);
      }
    }
    return this;
  }

  public ON g(long paramLong1, long paramLong2)
  {
    if (this.cfS != 0) {
      return this;
    }
    this.cfS = (paramLong1 > paramLong2 ? 1 : paramLong1 < paramLong2 ? -1 : 0);
    return this;
  }

  public ON ag(int paramInt1, int paramInt2)
  {
    if (this.cfS != 0) {
      return this;
    }
    this.cfS = (paramInt1 > paramInt2 ? 1 : paramInt1 < paramInt2 ? -1 : 0);
    return this;
  }

  public ON i(short paramShort1, short paramShort2)
  {
    if (this.cfS != 0) {
      return this;
    }
    this.cfS = (paramShort1 > paramShort2 ? 1 : paramShort1 < paramShort2 ? -1 : 0);
    return this;
  }

  public ON a(char paramChar1, char paramChar2)
  {
    if (this.cfS != 0) {
      return this;
    }
    this.cfS = (paramChar1 > paramChar2 ? 1 : paramChar1 < paramChar2 ? -1 : 0);
    return this;
  }

  public ON h(byte paramByte1, byte paramByte2)
  {
    if (this.cfS != 0) {
      return this;
    }
    this.cfS = (paramByte1 > paramByte2 ? 1 : paramByte1 < paramByte2 ? -1 : 0);
    return this;
  }

  public ON a(double paramDouble1, double paramDouble2)
  {
    if (this.cfS != 0) {
      return this;
    }
    this.cfS = Double.compare(paramDouble1, paramDouble2);
    return this;
  }

  public ON o(float paramFloat1, float paramFloat2)
  {
    if (this.cfS != 0) {
      return this;
    }
    this.cfS = Float.compare(paramFloat1, paramFloat2);
    return this;
  }

  public ON h(boolean paramBoolean1, boolean paramBoolean2)
  {
    if (this.cfS != 0) {
      return this;
    }
    if (paramBoolean1 == paramBoolean2) {
      return this;
    }
    if (!paramBoolean1)
      this.cfS = -1;
    else {
      this.cfS = 1;
    }
    return this;
  }

  public ON a(Object[] paramArrayOfObject1, Object[] paramArrayOfObject2)
  {
    return a(paramArrayOfObject1, paramArrayOfObject2, null);
  }

  public ON a(Object[] paramArrayOfObject1, Object[] paramArrayOfObject2, Comparator paramComparator)
  {
    if (this.cfS != 0) {
      return this;
    }
    if (paramArrayOfObject1 == paramArrayOfObject2) {
      return this;
    }
    if (paramArrayOfObject1 == null) {
      this.cfS = -1;
      return this;
    }
    if (paramArrayOfObject2 == null) {
      this.cfS = 1;
      return this;
    }
    if (paramArrayOfObject1.length != paramArrayOfObject2.length) {
      this.cfS = (paramArrayOfObject1.length < paramArrayOfObject2.length ? -1 : 1);
      return this;
    }
    for (int i = 0; (i < paramArrayOfObject1.length) && (this.cfS == 0); i++) {
      a(paramArrayOfObject1[i], paramArrayOfObject2[i], paramComparator);
    }
    return this;
  }

  public ON a(long[] paramArrayOfLong1, long[] paramArrayOfLong2)
  {
    if (this.cfS != 0) {
      return this;
    }
    if (paramArrayOfLong1 == paramArrayOfLong2) {
      return this;
    }
    if (paramArrayOfLong1 == null) {
      this.cfS = -1;
      return this;
    }
    if (paramArrayOfLong2 == null) {
      this.cfS = 1;
      return this;
    }
    if (paramArrayOfLong1.length != paramArrayOfLong2.length) {
      this.cfS = (paramArrayOfLong1.length < paramArrayOfLong2.length ? -1 : 1);
      return this;
    }
    for (int i = 0; (i < paramArrayOfLong1.length) && (this.cfS == 0); i++) {
      g(paramArrayOfLong1[i], paramArrayOfLong2[i]);
    }
    return this;
  }

  public ON a(int[] paramArrayOfInt1, int[] paramArrayOfInt2)
  {
    if (this.cfS != 0) {
      return this;
    }
    if (paramArrayOfInt1 == paramArrayOfInt2) {
      return this;
    }
    if (paramArrayOfInt1 == null) {
      this.cfS = -1;
      return this;
    }
    if (paramArrayOfInt2 == null) {
      this.cfS = 1;
      return this;
    }
    if (paramArrayOfInt1.length != paramArrayOfInt2.length) {
      this.cfS = (paramArrayOfInt1.length < paramArrayOfInt2.length ? -1 : 1);
      return this;
    }
    for (int i = 0; (i < paramArrayOfInt1.length) && (this.cfS == 0); i++) {
      ag(paramArrayOfInt1[i], paramArrayOfInt2[i]);
    }
    return this;
  }

  public ON a(short[] paramArrayOfShort1, short[] paramArrayOfShort2)
  {
    if (this.cfS != 0) {
      return this;
    }
    if (paramArrayOfShort1 == paramArrayOfShort2) {
      return this;
    }
    if (paramArrayOfShort1 == null) {
      this.cfS = -1;
      return this;
    }
    if (paramArrayOfShort2 == null) {
      this.cfS = 1;
      return this;
    }
    if (paramArrayOfShort1.length != paramArrayOfShort2.length) {
      this.cfS = (paramArrayOfShort1.length < paramArrayOfShort2.length ? -1 : 1);
      return this;
    }
    for (int i = 0; (i < paramArrayOfShort1.length) && (this.cfS == 0); i++) {
      i(paramArrayOfShort1[i], paramArrayOfShort2[i]);
    }
    return this;
  }

  public ON a(char[] paramArrayOfChar1, char[] paramArrayOfChar2)
  {
    if (this.cfS != 0) {
      return this;
    }
    if (paramArrayOfChar1 == paramArrayOfChar2) {
      return this;
    }
    if (paramArrayOfChar1 == null) {
      this.cfS = -1;
      return this;
    }
    if (paramArrayOfChar2 == null) {
      this.cfS = 1;
      return this;
    }
    if (paramArrayOfChar1.length != paramArrayOfChar2.length) {
      this.cfS = (paramArrayOfChar1.length < paramArrayOfChar2.length ? -1 : 1);
      return this;
    }
    for (int i = 0; (i < paramArrayOfChar1.length) && (this.cfS == 0); i++) {
      a(paramArrayOfChar1[i], paramArrayOfChar2[i]);
    }
    return this;
  }

  public ON a(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    if (this.cfS != 0) {
      return this;
    }
    if (paramArrayOfByte1 == paramArrayOfByte2) {
      return this;
    }
    if (paramArrayOfByte1 == null) {
      this.cfS = -1;
      return this;
    }
    if (paramArrayOfByte2 == null) {
      this.cfS = 1;
      return this;
    }
    if (paramArrayOfByte1.length != paramArrayOfByte2.length) {
      this.cfS = (paramArrayOfByte1.length < paramArrayOfByte2.length ? -1 : 1);
      return this;
    }
    for (int i = 0; (i < paramArrayOfByte1.length) && (this.cfS == 0); i++) {
      h(paramArrayOfByte1[i], paramArrayOfByte2[i]);
    }
    return this;
  }

  public ON a(double[] paramArrayOfDouble1, double[] paramArrayOfDouble2)
  {
    if (this.cfS != 0) {
      return this;
    }
    if (paramArrayOfDouble1 == paramArrayOfDouble2) {
      return this;
    }
    if (paramArrayOfDouble1 == null) {
      this.cfS = -1;
      return this;
    }
    if (paramArrayOfDouble2 == null) {
      this.cfS = 1;
      return this;
    }
    if (paramArrayOfDouble1.length != paramArrayOfDouble2.length) {
      this.cfS = (paramArrayOfDouble1.length < paramArrayOfDouble2.length ? -1 : 1);
      return this;
    }
    for (int i = 0; (i < paramArrayOfDouble1.length) && (this.cfS == 0); i++) {
      a(paramArrayOfDouble1[i], paramArrayOfDouble2[i]);
    }
    return this;
  }

  public ON a(float[] paramArrayOfFloat1, float[] paramArrayOfFloat2)
  {
    if (this.cfS != 0) {
      return this;
    }
    if (paramArrayOfFloat1 == paramArrayOfFloat2) {
      return this;
    }
    if (paramArrayOfFloat1 == null) {
      this.cfS = -1;
      return this;
    }
    if (paramArrayOfFloat2 == null) {
      this.cfS = 1;
      return this;
    }
    if (paramArrayOfFloat1.length != paramArrayOfFloat2.length) {
      this.cfS = (paramArrayOfFloat1.length < paramArrayOfFloat2.length ? -1 : 1);
      return this;
    }
    for (int i = 0; (i < paramArrayOfFloat1.length) && (this.cfS == 0); i++) {
      o(paramArrayOfFloat1[i], paramArrayOfFloat2[i]);
    }
    return this;
  }

  public ON a(boolean[] paramArrayOfBoolean1, boolean[] paramArrayOfBoolean2)
  {
    if (this.cfS != 0) {
      return this;
    }
    if (paramArrayOfBoolean1 == paramArrayOfBoolean2) {
      return this;
    }
    if (paramArrayOfBoolean1 == null) {
      this.cfS = -1;
      return this;
    }
    if (paramArrayOfBoolean2 == null) {
      this.cfS = 1;
      return this;
    }
    if (paramArrayOfBoolean1.length != paramArrayOfBoolean2.length) {
      this.cfS = (paramArrayOfBoolean1.length < paramArrayOfBoolean2.length ? -1 : 1);
      return this;
    }
    for (int i = 0; (i < paramArrayOfBoolean1.length) && (this.cfS == 0); i++) {
      h(paramArrayOfBoolean1[i], paramArrayOfBoolean2[i]);
    }
    return this;
  }

  public int aaL()
  {
    return this.cfS;
  }

  public Integer aaM()
  {
    return Integer.valueOf(aaL());
  }
}