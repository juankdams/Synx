public abstract class dNT extends Number
  implements arr
{
  private int size;
  private Number mes;
  private boolean met;
  private long value;

  public dNT(int paramInt)
  {
    this(paramInt, 0L, false);
  }

  public dNT(int paramInt, boolean paramBoolean)
  {
    this(paramInt, 0L, paramBoolean);
  }

  public dNT(int paramInt, long paramLong)
  {
    this(paramInt, paramLong, false);
  }

  public dNT(int paramInt, long paramLong, boolean paramBoolean)
  {
    this.size = paramInt;
    this.met = paramBoolean;
    fM(paramLong);
  }

  public void fM(long paramLong)
  {
    long l1 = paramLong;
    this.value = paramLong;
    switch (this.size) {
    case 1:
      if (this.met) this.value = (paramLong & 0xFF);
      l1 = (byte)(int)paramLong;
      this.mes = new Byte((byte)(int)paramLong);
      break;
    case 2:
      if (this.met) this.value = (paramLong & 0xFFFF);
      l1 = (short)(int)paramLong;
      this.mes = new Short((short)(int)paramLong);
      break;
    case 4:
      if (this.met) this.value = (paramLong & 0xFFFFFFFF);
      l1 = (int)paramLong;
      this.mes = new Integer((int)paramLong);
      break;
    case 8:
      this.mes = new Long(paramLong);
      break;
    case 3:
    case 5:
    case 6:
    case 7:
    default:
      throw new IllegalArgumentException("Unsupported size: " + this.size);
    }
    if (this.size < 8) {
      long l2 = (1L << this.size * 8) - 1L ^ 0xFFFFFFFF;
      if (((paramLong < 0L) && (l1 != paramLong)) || ((paramLong >= 0L) && ((l2 & paramLong) != 0L)))
      {
        throw new IllegalArgumentException("Argument value 0x" + Long.toHexString(paramLong) + " exceeds native capacity (" + this.size + " bytes) mask=0x" + Long.toHexString(l2));
      }
    }
  }

  public Object aDQ()
  {
    return this.mes;
  }

  public Object a(Object paramObject, hT paramhT)
  {
    long l = paramObject == null ? 0L : ((Number)paramObject).longValue();
    try
    {
      dNT localdNT = (dNT)getClass().newInstance();
      localdNT.fM(l);
      return localdNT;
    }
    catch (InstantiationException localInstantiationException) {
      throw new IllegalArgumentException("Can't instantiate " + getClass());
    }
    catch (IllegalAccessException localIllegalAccessException) {
    }
    throw new IllegalArgumentException("Not allowed to instantiate " + getClass());
  }

  public Class WJ()
  {
    return this.mes.getClass();
  }

  public int intValue() {
    return (int)this.value;
  }

  public long longValue() {
    return this.value;
  }

  public float floatValue() {
    return this.mes.floatValue();
  }

  public double doubleValue() {
    return this.mes.doubleValue();
  }

  public boolean equals(Object paramObject) {
    return ((paramObject instanceof dNT)) && (this.mes.equals(((dNT)paramObject).mes));
  }

  public String toString()
  {
    return this.mes.toString();
  }

  public int hashCode() {
    return this.mes.hashCode();
  }
}