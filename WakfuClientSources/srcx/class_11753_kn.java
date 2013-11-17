public abstract class kn
{
  protected long[] aNM;
  protected int m_size;

  protected kn(int paramInt)
  {
    this.aNM = new long[paramInt];

    this.m_size = 0;
  }

  public boolean aV(int paramInt) {
    if (paramInt > this.aNM.length) {
      int i = this.aNM.length;
      long[] arrayOfLong = this.aNM;
      this.aNM = new long[paramInt];
      System.arraycopy(arrayOfLong, 0, this.aNM, 0, i);

      return true;
    }

    return false;
  }

  protected int L(long paramLong) {
    for (int i = this.m_size - 1; i >= 0; i--) {
      if (paramLong == this.aNM[i]) {
        return i;
      }
    }

    return -1;
  }

  protected int M(long paramLong) {
    for (int i = this.m_size - 1; i >= 0; i--) {
      if (paramLong == this.aNM[i]) {
        return -i - 1;
      }
    }

    return this.m_size;
  }

  protected void qx() {
    if (this.m_size == this.aNM.length)
      aV(this.aNM.length * 2);
  }

  public final boolean N(long paramLong)
  {
    return L(paramLong) != -1;
  }

  public void reset()
  {
    this.m_size = 0;
  }

  public void clear() {
    this.m_size = 0;
  }

  public int size() {
    return this.m_size;
  }

  public long bl(int paramInt) {
    return this.aNM[paramInt];
  }
}