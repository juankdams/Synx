public class bvM
{
  private int dwA;
  private Object bEZ;

  public bvM()
  {
  }

  public bvM(int paramInt, Object paramObject)
  {
    this.dwA = paramInt;
    this.bEZ = paramObject;
  }

  public int aBP() {
    return this.dwA;
  }

  public void ju(int paramInt) {
    this.dwA = paramInt;
  }

  public Object Lp() {
    return this.bEZ;
  }

  public void x(Object paramObject) {
    this.bEZ = paramObject;
  }

  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true;
    if (!(paramObject instanceof bvM)) {
      return false;
    }
    bvM localbvM = (bvM)paramObject;

    if (this.dwA != localbvM.dwA)
      return false;
    if (this.bEZ != null ? !this.bEZ.equals(localbvM.bEZ) : localbvM.bEZ != null) {
      return false;
    }
    return true;
  }

  public int hashCode() {
    int i = this.dwA;
    i = 31 * i + (this.bEZ != null ? this.bEZ.hashCode() : 0);
    return i;
  }

  public String toString()
  {
    return "IntObjectPair{m_first=" + this.dwA + ", m_second=" + this.bEZ + '}';
  }
}