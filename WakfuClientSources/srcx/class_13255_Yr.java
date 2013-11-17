public final class Yr
{
  public static final int cJe = -1;
  private int m_firstFree;
  private int[] cJf;
  public int cJg;
  public int cJh;

  public Yr(int paramInt)
  {
    this.cJf = new int[paramInt];
    aka();
  }

  public final int ajZ()
  {
    if (this.m_firstFree >= this.cJf.length) {
      return -1;
    }

    int i = this.m_firstFree;
    this.m_firstFree = this.cJf[this.m_firstFree];

    this.cJg -= 1;
    this.cJh += 1;
    return i;
  }

  public final void hq(int paramInt)
  {
    this.cJf[paramInt] = this.m_firstFree;
    this.m_firstFree = paramInt;

    this.cJg += 1;
    this.cJh -= 1;
  }

  public final void aka()
  {
    this.m_firstFree = 0;
    int i = this.cJf.length;
    for (int j = 0; j < i; j++)
      this.cJf[j] = (j + 1);
    this.cJg = i;
    this.cJh = 0;
  }

  public final int akb()
  {
    return this.cJg;
  }

  public final int akc()
  {
    return this.cJh;
  }

  public final int getSize()
  {
    return this.cJf.length;
  }

  public final void resize(int paramInt)
  {
    if ((!bB) && (paramInt <= this.cJf.length)) throw new AssertionError();
    int[] arrayOfInt = new int[paramInt];
    for (int i = this.cJf.length; i < arrayOfInt.length; i++)
      arrayOfInt[i] = (i + 1);
    System.arraycopy(this.cJf, 0, arrayOfInt, 0, this.cJf.length);
    this.cJf = arrayOfInt;
    this.cJg = (paramInt - this.cJh);
  }
}