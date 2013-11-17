public final class apU
{
  private int dwA;
  private long dwB;

  public apU()
  {
  }

  public apU(int paramInt, long paramLong)
  {
    this.dwA = paramInt;
    this.dwB = paramLong;
  }

  public int aBP() {
    return this.dwA;
  }

  public void ju(int paramInt) {
    this.dwA = paramInt;
  }

  public long aBQ() {
    return this.dwB;
  }

  public void cY(long paramLong) {
    this.dwB = paramLong;
  }

  public boolean equals(Object paramObject)
  {
    if (this == paramObject)
      return true;
    if (!(paramObject instanceof apU)) {
      return false;
    }
    apU localapU = (apU)paramObject;

    return (this.dwA == localapU.dwA) && (this.dwB == localapU.dwB);
  }

  public int hashCode()
  {
    int i = this.dwA;
    i = 31 * i + (int)(this.dwB ^ this.dwB >>> 32);
    return i;
  }

  public String toString()
  {
    return "IntLongPair{m_first=" + this.dwA + ", m_second=" + this.dwB + '}';
  }
}