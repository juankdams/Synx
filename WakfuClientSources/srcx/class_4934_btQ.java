public class btQ extends kn
{
  private long[] gcM;

  public btQ()
  {
    this(10);
  }

  public btQ(int paramInt) {
    super(paramInt);

    this.gcM = new long[paramInt];
  }

  public boolean aV(int paramInt)
  {
    int i = this.aNM.length;
    if (!super.aV(paramInt)) {
      return false;
    }

    long[] arrayOfLong = this.gcM;
    this.gcM = new long[paramInt];
    System.arraycopy(arrayOfLong, 0, this.gcM, 0, i);

    return true;
  }

  public void B(long paramLong1, long paramLong2) {
    qx();
    int i = M(paramLong1);

    if (i < 0) {
      i = -i - 1;
    }
    else {
      this.m_size += 1;
      this.aNM[i] = paramLong1;
    }

    this.gcM[i] = paramLong2;
  }

  public long gc(long paramLong) {
    if (this.m_size == 0) {
      return 0L;
    }

    int i = L(paramLong);
    if (i < 0) {
      return 0L;
    }

    return qT(i);
  }

  public long qT(int paramInt) {
    long l = this.gcM[paramInt];

    this.aNM[paramInt] = this.aNM[(this.m_size - 1)];
    this.gcM[paramInt] = this.gcM[(this.m_size - 1)];

    this.m_size -= 1;

    return l;
  }

  public long gd(long paramLong) {
    int i = L(paramLong);
    if (i < 0) {
      return 0L;
    }

    return this.gcM[i];
  }

  public long qU(int paramInt) {
    return this.gcM[paramInt];
  }
}