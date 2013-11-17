public class ddo
  implements dGy
{
  private final long cSN;
  private long RY;

  public ddo(long paramLong)
  {
    this.cSN = paramLong;
  }

  public long gv() {
    return this.RY;
  }

  public boolean c(cuF paramcuF) {
    if (paramcuF.bS(this.cSN) == null) {
      return true;
    }
    this.RY = paramcuF.EN();
    return false;
  }

  public String toString()
  {
    return "FindBuildingFromElementUid{m_elementUid=" + this.cSN + ", m_buildingUid=" + this.RY + '}';
  }
}