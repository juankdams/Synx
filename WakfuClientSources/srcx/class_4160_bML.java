public class bML extends cde
{
  private long[] gcM;

  public bML()
  {
    this(10);
  }

  public bML(int paramInt) {
    super(paramInt);

    this.gcM = new long[paramInt];
  }

  public boolean aV(int paramInt)
  {
    int i = this.fcT.length;
    if (!super.aV(paramInt)) {
      return false;
    }

    long[] arrayOfLong = this.gcM;
    this.gcM = new long[paramInt];
    System.arraycopy(arrayOfLong, 0, this.gcM, 0, i);

    return true;
  }

  public void q(int paramInt, long paramLong) {
    qx();
    int i = uL(paramInt);

    if (i < 0) {
      i = -i - 1;
    }
    else {
      this.m_size += 1;
      this.fcT[i] = paramInt;
    }

    this.gcM[i] = paramLong;
  }

  public long remove(int paramInt) {
    if (this.m_size == 0) {
      return 0L;
    }

    int i = uK(paramInt);
    if (i < 0) {
      return 0L;
    }

    long l = this.gcM[i];

    this.fcT[i] = this.fcT[(this.m_size - 1)];
    this.gcM[i] = this.gcM[(this.m_size - 1)];

    this.m_size -= 1;

    return l;
  }

  public long get(int paramInt) {
    int i = uK(paramInt);
    if (i < 0) {
      return 0L;
    }

    return this.gcM[i];
  }

  public long qU(int paramInt) {
    return this.gcM[paramInt];
  }

  public void compact()
  {
    super.compact();

    long[] arrayOfLong = this.gcM;
    this.gcM = new long[this.m_size];
    System.arraycopy(arrayOfLong, 0, this.gcM, 0, this.m_size);
  }
}