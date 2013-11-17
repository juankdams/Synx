public class sT
  implements bWB
{
  private static volatile Jo bcB = Jo.bTb;
  private final StringBuffer bcC;
  private final Object object;
  private final Jo bcD;

  public static Jo At()
  {
    return bcB;
  }

  public static void a(Jo paramJo)
  {
    if (paramJo == null) {
      throw new IllegalArgumentException("The style must not be null");
    }
    bcB = paramJo;
  }

  public static String t(Object paramObject)
  {
    return cAg.toString(paramObject);
  }

  public static String a(Object paramObject, Jo paramJo)
  {
    return cAg.b(paramObject, paramJo);
  }

  public static String a(Object paramObject, Jo paramJo, boolean paramBoolean)
  {
    return cAg.a(paramObject, paramJo, paramBoolean, false, null);
  }

  public static String a(Object paramObject, Jo paramJo, boolean paramBoolean, Class paramClass)
  {
    return cAg.a(paramObject, paramJo, paramBoolean, false, paramClass);
  }

  public sT(Object paramObject)
  {
    this(paramObject, null, null);
  }

  public sT(Object paramObject, Jo paramJo)
  {
    this(paramObject, paramJo, null);
  }

  public sT(Object paramObject, Jo paramJo, StringBuffer paramStringBuffer)
  {
    if (paramJo == null) {
      paramJo = At();
    }
    if (paramStringBuffer == null) {
      paramStringBuffer = new StringBuffer(512);
    }
    this.bcC = paramStringBuffer;
    this.bcD = paramJo;
    this.object = paramObject;

    paramJo.a(paramStringBuffer, paramObject);
  }

  public sT W(boolean paramBoolean)
  {
    this.bcD.a(this.bcC, null, paramBoolean);
    return this;
  }

  public sT a(boolean[] paramArrayOfBoolean)
  {
    this.bcD.a(this.bcC, null, paramArrayOfBoolean, null);
    return this;
  }

  public sT F(byte paramByte)
  {
    this.bcD.a(this.bcC, null, paramByte);
    return this;
  }

  public sT j(byte[] paramArrayOfByte)
  {
    this.bcD.a(this.bcC, null, paramArrayOfByte, null);
    return this;
  }

  public sT f(char paramChar)
  {
    this.bcD.a(this.bcC, null, paramChar);
    return this;
  }

  public sT a(char[] paramArrayOfChar)
  {
    this.bcD.a(this.bcC, null, paramArrayOfChar, null);
    return this;
  }

  public sT c(double paramDouble)
  {
    this.bcD.a(this.bcC, null, paramDouble);
    return this;
  }

  public sT a(double[] paramArrayOfDouble)
  {
    this.bcD.a(this.bcC, null, paramArrayOfDouble, null);
    return this;
  }

  public sT I(float paramFloat)
  {
    this.bcD.a(this.bcC, null, paramFloat);
    return this;
  }

  public sT b(float[] paramArrayOfFloat)
  {
    this.bcD.a(this.bcC, null, paramArrayOfFloat, null);
    return this;
  }

  public sT cP(int paramInt)
  {
    this.bcD.a(this.bcC, null, paramInt);
    return this;
  }

  public sT f(int[] paramArrayOfInt)
  {
    this.bcD.a(this.bcC, null, paramArrayOfInt, null);
    return this;
  }

  public sT aa(long paramLong)
  {
    this.bcD.a(this.bcC, null, paramLong);
    return this;
  }

  public sT b(long[] paramArrayOfLong)
  {
    this.bcD.a(this.bcC, null, paramArrayOfLong, null);
    return this;
  }

  public sT u(Object paramObject)
  {
    this.bcD.a(this.bcC, null, paramObject, null);
    return this;
  }

  public sT a(Object[] paramArrayOfObject)
  {
    this.bcD.a(this.bcC, null, paramArrayOfObject, null);
    return this;
  }

  public sT u(short paramShort)
  {
    this.bcD.a(this.bcC, null, paramShort);
    return this;
  }

  public sT a(short[] paramArrayOfShort)
  {
    this.bcD.a(this.bcC, null, paramArrayOfShort, null);
    return this;
  }

  public sT d(String paramString, boolean paramBoolean)
  {
    this.bcD.a(this.bcC, paramString, paramBoolean);
    return this;
  }

  public sT a(String paramString, boolean[] paramArrayOfBoolean)
  {
    this.bcD.a(this.bcC, paramString, paramArrayOfBoolean, null);
    return this;
  }

  public sT a(String paramString, boolean[] paramArrayOfBoolean, boolean paramBoolean)
  {
    this.bcD.a(this.bcC, paramString, paramArrayOfBoolean, Boolean.valueOf(paramBoolean));
    return this;
  }

  public sT a(String paramString, byte paramByte)
  {
    this.bcD.a(this.bcC, paramString, paramByte);
    return this;
  }

  public sT a(String paramString, byte[] paramArrayOfByte)
  {
    this.bcD.a(this.bcC, paramString, paramArrayOfByte, null);
    return this;
  }

  public sT a(String paramString, byte[] paramArrayOfByte, boolean paramBoolean)
  {
    this.bcD.a(this.bcC, paramString, paramArrayOfByte, Boolean.valueOf(paramBoolean));
    return this;
  }

  public sT a(String paramString, char paramChar)
  {
    this.bcD.a(this.bcC, paramString, paramChar);
    return this;
  }

  public sT a(String paramString, char[] paramArrayOfChar)
  {
    this.bcD.a(this.bcC, paramString, paramArrayOfChar, null);
    return this;
  }

  public sT a(String paramString, char[] paramArrayOfChar, boolean paramBoolean)
  {
    this.bcD.a(this.bcC, paramString, paramArrayOfChar, Boolean.valueOf(paramBoolean));
    return this;
  }

  public sT a(String paramString, double paramDouble)
  {
    this.bcD.a(this.bcC, paramString, paramDouble);
    return this;
  }

  public sT a(String paramString, double[] paramArrayOfDouble)
  {
    this.bcD.a(this.bcC, paramString, paramArrayOfDouble, null);
    return this;
  }

  public sT a(String paramString, double[] paramArrayOfDouble, boolean paramBoolean)
  {
    this.bcD.a(this.bcC, paramString, paramArrayOfDouble, Boolean.valueOf(paramBoolean));
    return this;
  }

  public sT a(String paramString, float paramFloat)
  {
    this.bcD.a(this.bcC, paramString, paramFloat);
    return this;
  }

  public sT a(String paramString, float[] paramArrayOfFloat)
  {
    this.bcD.a(this.bcC, paramString, paramArrayOfFloat, null);
    return this;
  }

  public sT a(String paramString, float[] paramArrayOfFloat, boolean paramBoolean)
  {
    this.bcD.a(this.bcC, paramString, paramArrayOfFloat, Boolean.valueOf(paramBoolean));
    return this;
  }

  public sT e(String paramString, int paramInt)
  {
    this.bcD.a(this.bcC, paramString, paramInt);
    return this;
  }

  public sT b(String paramString, int[] paramArrayOfInt)
  {
    this.bcD.a(this.bcC, paramString, paramArrayOfInt, null);
    return this;
  }

  public sT a(String paramString, int[] paramArrayOfInt, boolean paramBoolean)
  {
    this.bcD.a(this.bcC, paramString, paramArrayOfInt, Boolean.valueOf(paramBoolean));
    return this;
  }

  public sT a(String paramString, long paramLong)
  {
    this.bcD.a(this.bcC, paramString, paramLong);
    return this;
  }

  public sT a(String paramString, long[] paramArrayOfLong)
  {
    this.bcD.a(this.bcC, paramString, paramArrayOfLong, null);
    return this;
  }

  public sT a(String paramString, long[] paramArrayOfLong, boolean paramBoolean)
  {
    this.bcD.a(this.bcC, paramString, paramArrayOfLong, Boolean.valueOf(paramBoolean));
    return this;
  }

  public sT e(String paramString, Object paramObject)
  {
    this.bcD.a(this.bcC, paramString, paramObject, null);
    return this;
  }

  public sT a(String paramString, Object paramObject, boolean paramBoolean)
  {
    this.bcD.a(this.bcC, paramString, paramObject, Boolean.valueOf(paramBoolean));
    return this;
  }

  public sT c(String paramString, Object[] paramArrayOfObject)
  {
    this.bcD.a(this.bcC, paramString, paramArrayOfObject, null);
    return this;
  }

  public sT a(String paramString, Object[] paramArrayOfObject, boolean paramBoolean)
  {
    this.bcD.a(this.bcC, paramString, paramArrayOfObject, Boolean.valueOf(paramBoolean));
    return this;
  }

  public sT a(String paramString, short paramShort)
  {
    this.bcD.a(this.bcC, paramString, paramShort);
    return this;
  }

  public sT a(String paramString, short[] paramArrayOfShort)
  {
    this.bcD.a(this.bcC, paramString, paramArrayOfShort, null);
    return this;
  }

  public sT a(String paramString, short[] paramArrayOfShort, boolean paramBoolean)
  {
    this.bcD.a(this.bcC, paramString, paramArrayOfShort, Boolean.valueOf(paramBoolean));
    return this;
  }

  public sT v(Object paramObject)
  {
    aqV.e(Au(), paramObject);
    return this;
  }

  public sT ay(String paramString)
  {
    if (paramString != null) {
      this.bcD.a(this.bcC, paramString);
    }
    return this;
  }

  public sT az(String paramString)
  {
    if (paramString != null) {
      this.bcD.b(this.bcC, paramString);
    }
    return this;
  }

  public Object getObject()
  {
    return this.object;
  }

  public StringBuffer Au()
  {
    return this.bcC;
  }

  public Jo Av()
  {
    return this.bcD;
  }

  public String toString()
  {
    if (getObject() == null)
      Au().append(Av().Tu());
    else {
      this.bcD.b(Au(), getObject());
    }
    return Au().toString();
  }

  public String Aw()
  {
    return toString();
  }
}