public abstract class dBM
{
  protected short[] lJo;
  protected int m_size;

  public dBM(int paramInt)
  {
    this.lJo = new short[paramInt];

    this.m_size = 0;
  }

  public boolean aV(int paramInt) {
    if (paramInt > this.lJo.length) {
      short[] arrayOfShort = this.lJo;
      this.lJo = new short[paramInt];
      System.arraycopy(arrayOfShort, 0, this.lJo, 0, arrayOfShort.length);
      return true;
    }

    return false;
  }

  protected final int dU(short paramShort) {
    for (int i = this.m_size - 1; i >= 0; i--) {
      if (paramShort == this.lJo[i]) {
        return i;
      }
    }

    return -1;
  }

  protected final int eD(short paramShort) {
    for (int i = this.m_size - 1; i >= 0; i--) {
      if (paramShort == this.lJo[i]) {
        return -i - 1;
      }
    }

    return this.m_size;
  }

  protected final void qx() {
    if (this.m_size == this.lJo.length)
      aV(this.lJo.length * 2);
  }

  public final boolean contains(short paramShort)
  {
    return dU(paramShort) != -1;
  }

  public final void reset()
  {
    this.m_size = 0;
  }

  public void clear() {
    this.m_size = 0;
  }

  public final int size() {
    return this.m_size;
  }

  public final short Cq(int paramInt) {
    return this.lJo[paramInt];
  }
}