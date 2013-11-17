public abstract class aBN extends doX
  implements bvE
{
  protected transient byte[] dVU;
  protected bvE dVV;

  public aBN()
  {
    this.dVV = this;
  }

  public aBN(int paramInt)
  {
    super(paramInt);
    this.dVV = this;
  }

  public aBN(int paramInt, float paramFloat)
  {
    super(paramInt, paramFloat);
    this.dVV = this;
  }

  public aBN(bvE parambvE)
  {
    this.dVV = parambvE;
  }

  public aBN(int paramInt, bvE parambvE)
  {
    super(paramInt);
    this.dVV = parambvE;
  }

  public aBN(int paramInt, float paramFloat, bvE parambvE)
  {
    super(paramInt, paramFloat);
    this.dVV = parambvE;
  }

  public Object clone()
  {
    aBN localaBN = (aBN)super.clone();
    localaBN.dVU = ((byte[])this.dVU.clone());
    return localaBN;
  }

  protected int aO(int paramInt)
  {
    int i = super.aO(paramInt);
    this.dVU = new byte[i];
    return i;
  }

  public boolean contains(byte paramByte)
  {
    return j(paramByte) >= 0;
  }

  public boolean c(Tp paramTp)
  {
    byte[] arrayOfByte1 = this.lpp;
    byte[] arrayOfByte2 = this.dVU;
    for (int i = arrayOfByte2.length; i-- > 0; ) {
      if ((arrayOfByte1[i] == 1) && (!paramTp.t(arrayOfByte2[i]))) {
        return false;
      }
    }
    return true;
  }

  protected void aQ(int paramInt)
  {
    this.dVU[paramInt] = 0;
    super.aQ(paramInt);
  }

  protected int j(byte paramByte)
  {
    byte[] arrayOfByte1 = this.lpp;
    byte[] arrayOfByte2 = this.dVU;
    int m = arrayOfByte1.length;
    int i = this.dVV.bx(paramByte) & 0x7FFFFFFF;
    int k = i % m;

    if ((arrayOfByte1[k] != 0) && ((arrayOfByte1[k] == 2) || (arrayOfByte2[k] != paramByte)))
    {
      int j = 1 + i % (m - 2);
      do
      {
        k -= j;
        if (k < 0)
          k += m;
      }
      while ((arrayOfByte1[k] != 0) && ((arrayOfByte1[k] == 2) || (arrayOfByte2[k] != paramByte)));
    }

    return arrayOfByte1[k] == 0 ? -1 : k;
  }

  protected int bw(byte paramByte)
  {
    byte[] arrayOfByte1 = this.lpp;
    byte[] arrayOfByte2 = this.dVU;
    int m = arrayOfByte1.length;
    int i = this.dVV.bx(paramByte) & 0x7FFFFFFF;
    int k = i % m;

    if (arrayOfByte1[k] == 0)
      return k;
    if ((arrayOfByte1[k] == 1) && (arrayOfByte2[k] == paramByte)) {
      return -k - 1;
    }

    int j = 1 + i % (m - 2);

    if (arrayOfByte1[k] != 2)
    {
      do
      {
        k -= j;
        if (k < 0)
          k += m;
      }
      while ((arrayOfByte1[k] == 1) && (arrayOfByte2[k] != paramByte));
    }

    if (arrayOfByte1[k] == 2) {
      int n = k;
      while ((arrayOfByte1[k] != 0) && ((arrayOfByte1[k] == 2) || (arrayOfByte2[k] != paramByte)))
      {
        k -= j;
        if (k < 0) {
          k += m;
        }
      }
      return arrayOfByte1[k] == 1 ? -k - 1 : n;
    }

    return arrayOfByte1[k] == 1 ? -k - 1 : k;
  }

  public final int bx(byte paramByte)
  {
    return asd.jV(paramByte);
  }
}