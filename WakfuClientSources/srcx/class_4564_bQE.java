public final class bQE
{
  private long gYX;
  private int gYY;

  public bQE()
  {
  }

  public bQE(long paramLong, int paramInt)
  {
    this.gYX = paramLong;
    this.gYY = paramInt;
  }

  public long bXC() {
    return this.gYX;
  }

  public void gW(long paramLong) {
    this.gYX = paramLong;
  }

  public int getSecond() {
    return this.gYY;
  }

  public void setSecond(int paramInt) {
    this.gYY = paramInt;
  }

  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true;
    if (!(paramObject instanceof bQE)) {
      return false;
    }
    bQE localbQE = (bQE)paramObject;

    return (this.gYX == localbQE.gYX) && (this.gYY == localbQE.gYY);
  }

  public int hashCode()
  {
    int i = (int)(this.gYX ^ this.gYX >>> 32);
    i = 31 * i + this.gYY;
    return i;
  }

  public String toString()
  {
    return "LongIntPair{m_first=" + this.gYX + ", m_second=" + this.gYY + '}';
  }
}