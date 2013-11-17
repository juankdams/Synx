public abstract class aBq extends doX
  implements dCx
{
  protected transient long[] dVd;
  protected dCx dVe;

  public aBq()
  {
    this.dVe = this;
  }

  public aBq(int paramInt)
  {
    super(paramInt);
    this.dVe = this;
  }

  public aBq(int paramInt, float paramFloat)
  {
    super(paramInt, paramFloat);
    this.dVe = this;
  }

  public aBq(dCx paramdCx)
  {
    this.dVe = paramdCx;
  }

  public aBq(int paramInt, dCx paramdCx)
  {
    super(paramInt);
    this.dVe = paramdCx;
  }

  public aBq(int paramInt, float paramFloat, dCx paramdCx)
  {
    super(paramInt, paramFloat);
    this.dVe = paramdCx;
  }

  public Object clone()
  {
    aBq localaBq = (aBq)super.clone();
    localaBq.dVd = ((long[])this.dVd.clone());
    return localaBq;
  }

  protected int aO(int paramInt)
  {
    int i = super.aO(paramInt);
    this.dVd = new long[i];
    return i;
  }

  public boolean N(long paramLong)
  {
    return L(paramLong) >= 0;
  }

  public boolean b(CE paramCE)
  {
    byte[] arrayOfByte = this.lpp;
    long[] arrayOfLong = this.dVd;
    for (int i = arrayOfLong.length; i-- > 0; ) {
      if ((arrayOfByte[i] == 1) && (!paramCE.Q(arrayOfLong[i]))) {
        return false;
      }
    }
    return true;
  }

  protected void aQ(int paramInt)
  {
    this.dVd[paramInt] = 0L;
    super.aQ(paramInt);
  }

  protected int L(long paramLong)
  {
    byte[] arrayOfByte = this.lpp;
    long[] arrayOfLong = this.dVd;
    int m = arrayOfByte.length;
    int i = this.dVe.dM(paramLong) & 0x7FFFFFFF;
    int k = i % m;

    if ((arrayOfByte[k] != 0) && ((arrayOfByte[k] == 2) || (arrayOfLong[k] != paramLong)))
    {
      int j = 1 + i % (m - 2);
      do
      {
        k -= j;
        if (k < 0)
          k += m;
      }
      while ((arrayOfByte[k] != 0) && ((arrayOfByte[k] == 2) || (arrayOfLong[k] != paramLong)));
    }

    return arrayOfByte[k] == 0 ? -1 : k;
  }

  protected int dL(long paramLong)
  {
    byte[] arrayOfByte = this.lpp;
    long[] arrayOfLong = this.dVd;
    int m = arrayOfByte.length;
    int i = this.dVe.dM(paramLong) & 0x7FFFFFFF;
    int k = i % m;

    if (arrayOfByte[k] == 0)
      return k;
    if ((arrayOfByte[k] == 1) && (arrayOfLong[k] == paramLong)) {
      return -k - 1;
    }

    int j = 1 + i % (m - 2);

    if (arrayOfByte[k] != 2)
    {
      do
      {
        k -= j;
        if (k < 0)
          k += m;
      }
      while ((arrayOfByte[k] == 1) && (arrayOfLong[k] != paramLong));
    }

    if (arrayOfByte[k] == 2) {
      int n = k;
      while ((arrayOfByte[k] != 0) && ((arrayOfByte[k] == 2) || (arrayOfLong[k] != paramLong)))
      {
        k -= j;
        if (k < 0) {
          k += m;
        }
      }
      return arrayOfByte[k] == 1 ? -k - 1 : n;
    }

    return arrayOfByte[k] == 1 ? -k - 1 : k;
  }

  public final int dM(long paramLong)
  {
    return asd.dm(paramLong);
  }
}