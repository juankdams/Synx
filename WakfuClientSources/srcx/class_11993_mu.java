public final class mu
  implements cqz
{
  private final int hY;
  private final int hZ;
  private final short aOl;

  public mu(cYk paramcYk)
  {
    this.hY = paramcYk.getX();
    this.hZ = paramcYk.getY();
    this.aOl = paramcYk.IB();
  }

  public mu(cqz paramcqz) {
    this.hY = paramcqz.fa();
    this.hZ = paramcqz.fb();
    this.aOl = paramcqz.fc();
  }

  public float getWorldX() {
    return fa();
  }

  public float getWorldY() {
    return fb();
  }

  public float getAltitude() {
    return fc();
  }

  public int fa() {
    return this.hY;
  }

  public int fb() {
    return this.hZ;
  }

  public short fc() {
    return this.aOl;
  }

  public boolean equals(Object paramObject)
  {
    if (this == paramObject)
      return true;
    if ((paramObject == null) || (getClass() != paramObject.getClass())) {
      return false;
    }
    mu localmu = (mu)paramObject;

    if (this.hY != localmu.hY)
      return false;
    if (this.hZ != localmu.hZ)
      return false;
    if (this.aOl != localmu.aOl) {
      return false;
    }
    return true;
  }

  public int hashCode()
  {
    int i = this.hY;
    i = 31 * i + this.hZ;
    i = 31 * i + this.aOl;
    return i;
  }
}