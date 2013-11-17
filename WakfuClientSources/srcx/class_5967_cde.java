public abstract class cde
{
  protected int[] fcT;
  protected int m_size;

  protected cde(int paramInt)
  {
    this.fcT = new int[paramInt];

    this.m_size = 0;
  }

  public boolean aV(int paramInt) {
    if (paramInt > this.fcT.length) {
      int[] arrayOfInt = this.fcT;
      this.fcT = new int[paramInt];
      System.arraycopy(arrayOfInt, 0, this.fcT, 0, arrayOfInt.length);

      return true;
    }

    return false;
  }

  protected final int uK(int paramInt) {
    for (int i = this.m_size - 1; i >= 0; i--) {
      if (paramInt == this.fcT[i]) {
        return i;
      }
    }

    return -1;
  }

  protected final int uL(int paramInt) {
    for (int i = this.m_size - 1; i >= 0; i--) {
      if (paramInt == this.fcT[i]) {
        return -i - 1;
      }
    }

    return this.m_size;
  }

  protected final void qx() {
    if (this.m_size == this.fcT.length)
      aV(this.fcT.length * 2);
  }

  public final boolean contains(int paramInt)
  {
    return uK(paramInt) != -1;
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

  public final int uM(int paramInt) {
    return this.fcT[paramInt];
  }

  public void compact() {
    int[] arrayOfInt = this.fcT;
    this.fcT = new int[this.m_size];
    System.arraycopy(arrayOfInt, 0, this.fcT, 0, this.m_size);
  }

  public final int[] qe() {
    int i = size();
    int[] arrayOfInt = new int[i];
    for (int j = 0; j < i; j++) {
      arrayOfInt[j] = uM(j);
    }
    return arrayOfInt;
  }

  public final boolean isEmpty() {
    return size() == 0;
  }
}