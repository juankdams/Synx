public abstract class dai extends doX
  implements dnH
{
  protected transient short[] kOY;
  protected dnH kOZ;

  public dai()
  {
    this.kOZ = this;
  }

  public dai(int paramInt)
  {
    super(paramInt);
    this.kOZ = this;
  }

  public dai(int paramInt, float paramFloat)
  {
    super(paramInt, paramFloat);
    this.kOZ = this;
  }

  public dai(dnH paramdnH)
  {
    this.kOZ = paramdnH;
  }

  public dai(int paramInt, dnH paramdnH)
  {
    super(paramInt);
    this.kOZ = paramdnH;
  }

  public dai(int paramInt, float paramFloat, dnH paramdnH)
  {
    super(paramInt, paramFloat);
    this.kOZ = paramdnH;
  }

  public Object clone()
  {
    dai localdai = (dai)super.clone();
    localdai.kOY = ((short[])this.kOY.clone());
    return localdai;
  }

  protected int aO(int paramInt)
  {
    int i = super.aO(paramInt);
    this.kOY = new short[i];
    return i;
  }

  public boolean contains(short paramShort)
  {
    return dU(paramShort) >= 0;
  }

  public boolean c(dfG paramdfG)
  {
    byte[] arrayOfByte = this.lpp;
    short[] arrayOfShort = this.kOY;
    for (int i = arrayOfShort.length; i-- > 0; ) {
      if ((arrayOfByte[i] == 1) && (!paramdfG.bb(arrayOfShort[i]))) {
        return false;
      }
    }
    return true;
  }

  protected void aQ(int paramInt)
  {
    this.kOY[paramInt] = 0;
    super.aQ(paramInt);
  }

  protected int dU(short paramShort)
  {
    byte[] arrayOfByte = this.lpp;
    short[] arrayOfShort = this.kOY;
    int m = arrayOfByte.length;
    int i = this.kOZ.dW(paramShort) & 0x7FFFFFFF;
    int k = i % m;

    if ((arrayOfByte[k] != 0) && ((arrayOfByte[k] == 2) || (arrayOfShort[k] != paramShort)))
    {
      int j = 1 + i % (m - 2);
      do
      {
        k -= j;
        if (k < 0)
          k += m;
      }
      while ((arrayOfByte[k] != 0) && ((arrayOfByte[k] == 2) || (arrayOfShort[k] != paramShort)));
    }

    return arrayOfByte[k] == 0 ? -1 : k;
  }

  protected int dV(short paramShort)
  {
    byte[] arrayOfByte = this.lpp;
    short[] arrayOfShort = this.kOY;
    int m = arrayOfByte.length;
    int i = this.kOZ.dW(paramShort) & 0x7FFFFFFF;
    int k = i % m;

    if (arrayOfByte[k] == 0)
      return k;
    if ((arrayOfByte[k] == 1) && (arrayOfShort[k] == paramShort)) {
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
      while ((arrayOfByte[k] == 1) && (arrayOfShort[k] != paramShort));
    }

    if (arrayOfByte[k] == 2) {
      int n = k;
      while ((arrayOfByte[k] != 0) && ((arrayOfByte[k] == 2) || (arrayOfShort[k] != paramShort)))
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

  public final int dW(short paramShort)
  {
    return asd.jV(paramShort);
  }
}