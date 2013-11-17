public final class crV
{
  private static final int ibC = 10;
  private int[] ibD;
  private int ibE;
  private int m_size;
  private int ibF;

  public crV()
  {
    this.ibD = new int[10];
    this.ibE = 10;
    this.m_size = 0;
    this.ibF = 10;
  }

  public crV(crV paramcrV) {
    this.ibE = (this.m_size = paramcrV.m_size);
    this.ibD = new int[paramcrV.m_size];
    this.ibF = paramcrV.ibF;
  }

  public crV(int paramInt) {
    if (paramInt < 0)
      throw new IllegalArgumentException("La taille du tableau doit être >= 0");
    this.ibD = new int[paramInt];
    this.ibE = paramInt;
    this.m_size = 0;
    this.ibF = 10;
  }

  public crV(int paramInt1, int paramInt2) {
    if (paramInt1 < 0)
      throw new IllegalArgumentException("La taille du tableau doit être >= 0");
    if (paramInt2 < 1) {
      throw new IllegalArgumentException("L'incrément de taille growth doit être >= 1");
    }
    this.ibD = new int[paramInt1];
    this.ibE = paramInt1;
    this.m_size = 0;
    this.ibF = paramInt2;
  }

  public void wl(int paramInt) {
    ensureCapacity(this.m_size + 1);
    this.ibD[this.m_size] = paramInt;
    this.m_size += 1;
  }

  public void P(int[] paramArrayOfInt) {
    int i = paramArrayOfInt.length;
    ensureCapacity(this.m_size + i);
    System.arraycopy(paramArrayOfInt, 0, this.ibD, this.m_size, i);
    this.m_size += i;
  }

  public void l(int[] paramArrayOfInt, int paramInt) {
    ensureCapacity(this.m_size + paramInt);
    System.arraycopy(paramArrayOfInt, 0, this.ibD, this.m_size, paramInt);
    this.m_size += paramInt;
  }

  public void f(int[] paramArrayOfInt, int paramInt1, int paramInt2) {
    ensureCapacity(this.m_size + paramInt2);
    System.arraycopy(paramArrayOfInt, paramInt1, this.ibD, this.m_size, paramInt2);
    this.m_size += paramInt2;
  }

  public void a(crV paramcrV) {
    f(paramcrV.ibD, 0, paramcrV.m_size);
  }

  public void remove(int paramInt)
  {
    if ((paramInt < 0) || (paramInt >= this.m_size)) {
      throw new ArrayIndexOutOfBoundsException("Can't remove value outside of range (0, size). Size =" + this.m_size + " index : " + paramInt);
    }
    if (paramInt == this.m_size - 1) {
      this.m_size -= 1;
      return;
    }

    System.arraycopy(this.ibD, paramInt + 1, this.ibD, paramInt, this.m_size - paramInt - 1);
    this.m_size -= 1;
  }

  public int wm(int paramInt) {
    return this.ibD[paramInt];
  }

  public int get(int paramInt) {
    if (paramInt >= this.m_size)
      throw new ArrayIndexOutOfBoundsException();
    return this.ibD[paramInt];
  }

  public int size() {
    return this.m_size;
  }

  public void clear()
  {
    this.m_size = 0;
  }

  public int[] cqr()
  {
    return this.ibD;
  }

  public int[] toArray()
  {
    int[] arrayOfInt = new int[this.m_size];
    System.arraycopy(this.ibD, 0, arrayOfInt, 0, this.m_size);
    return arrayOfInt;
  }

  private void ensureCapacity(int paramInt) {
    if (paramInt > this.ibE)
    {
      this.ibE = (paramInt + this.ibF);
      int[] arrayOfInt = new int[this.ibE];
      System.arraycopy(this.ibD, 0, arrayOfInt, 0, this.m_size);
      this.ibD = arrayOfInt;
    }
  }
}