package Effects;
public abstract class dVg extends doX implements aSO //class_10731_dVg
{
  protected transient int[] mtW;
  protected aSO mtX;

  public dVg()
  {
    this.mtX = this;
  }

  public dVg(int paramInt)
  {
    super(paramInt);
    this.mtX = this;
  }

  public dVg(int paramInt, float paramFloat)
  {
    super(paramInt, paramFloat);
    this.mtX = this;
  }

  public dVg(aSO paramaSO)
  {
    this.mtX = paramaSO;
  }

  public dVg(int paramInt, aSO paramaSO)
  {
    super(paramInt);
    this.mtX = paramaSO;
  }

  public dVg(int paramInt, float paramFloat, aSO paramaSO)
  {
    super(paramInt, paramFloat);
    this.mtX = paramaSO;
  }

  public Object clone()
  {
    dVg localdVg = (dVg)super.clone();
    localdVg.mtW = ((int[])this.mtW.clone());
    return localdVg;
  }

  protected int aO(int paramInt)
  {
    int i = super.aO(paramInt);
    this.mtW = new int[i];
    return i;
  }

  public boolean contains(int paramInt)
  {
    return uK(paramInt) >= 0;
  }

  public boolean g(cIw paramcIw)
  {
    byte[] arrayOfByte = this.lpp;
    int[] arrayOfInt = this.mtW;
    for (int i = arrayOfInt.length; i-- > 0; ) {
      if ((arrayOfByte[i] == 1) && (!paramcIw.R(arrayOfInt[i]))) {
        return false;
      }
    }
    return true;
  }

  protected void aQ(int paramInt)
  {
    this.mtW[paramInt] = 0;
    super.aQ(paramInt);
  }

  protected int uK(int paramInt)
  {
    byte[] arrayOfByte = this.lpp;
    int[] arrayOfInt = this.mtW;
    int m = arrayOfByte.length;
    int i = this.mtX.nR(paramInt) & 0x7FFFFFFF;
    int k = i % m;

    if ((arrayOfByte[k] != 0) && ((arrayOfByte[k] == 2) || (arrayOfInt[k] != paramInt)))
    {
      int j = 1 + i % (m - 2);
      do
      {
        k -= j;
        if (k < 0)
          k += m;
      }
      while ((arrayOfByte[k] != 0) && ((arrayOfByte[k] == 2) || (arrayOfInt[k] != paramInt)));
    }

    return arrayOfByte[k] == 0 ? -1 : k;
  }

  protected int Ej(int paramInt)
  {
    byte[] arrayOfByte = this.lpp;
    int[] arrayOfInt = this.mtW;
    int m = arrayOfByte.length;
    int i = this.mtX.nR(paramInt) & 0x7FFFFFFF;
    int k = i % m;

    if (arrayOfByte[k] == 0)
      return k;
    if ((arrayOfByte[k] == 1) && (arrayOfInt[k] == paramInt)) {
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
      while ((arrayOfByte[k] == 1) && (arrayOfInt[k] != paramInt));
    }

    if (arrayOfByte[k] == 2) {
      int n = k;
      while ((arrayOfByte[k] != 0) && ((arrayOfByte[k] == 2) || (arrayOfInt[k] != paramInt)))
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

  public final int nR(int paramInt)
  {
    return asd.jV(paramInt);
  }
}