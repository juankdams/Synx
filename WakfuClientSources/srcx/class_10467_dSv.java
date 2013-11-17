public class dSv
{
  protected final int aPq;
  protected final boolean mov;

  public dSv(boolean paramBoolean, int paramInt)
  {
    this.mov = paramBoolean;
    this.aPq = paramInt;
  }

  public int tc() {
    return this.aPq;
  }

  public boolean dsU() {
    return this.mov;
  }

  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject == null) || (getClass() != paramObject.getClass())) {
      return false;
    }

    dSv localdSv = (dSv)paramObject;

    return (this.mov == localdSv.mov) && (this.aPq == localdSv.aPq);
  }

  public int hashCode()
  {
    return 31 * this.aPq + (this.mov ? 1 : 0);
  }
}