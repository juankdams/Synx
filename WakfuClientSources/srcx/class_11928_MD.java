public class MD
{
  private int hY;
  private int hZ;

  public MD()
  {
  }

  public MD(MD paramMD)
  {
    b(paramMD);
  }

  public MD(int paramInt1, int paramInt2) {
    set(paramInt1, paramInt2);
  }

  public final boolean equals(Object paramObject)
  {
    if (this == paramObject)
      return true;
    if ((paramObject == null) || (getClass() != paramObject.getClass())) {
      return false;
    }
    MD localMD = (MD)paramObject;

    return (this.hY == localMD.hY) && (this.hZ == localMD.hZ);
  }

  public final int hashCode()
  {
    long l = 31L * (31L + this.hY) + this.hZ;
    return (int)(l ^ l >> 32);
  }

  public String toString()
  {
    return "{Point2i : (" + this.hY + ", " + this.hZ + ") @" + Integer.toHexString(hashCode()) + "}";
  }

  public final boolean ae(int paramInt1, int paramInt2)
  {
    return (this.hY == paramInt1) && (this.hZ == paramInt2);
  }

  public final boolean a(MD paramMD) {
    return (this.hY == paramMD.hY) && (this.hZ == paramMD.hZ);
  }

  public final void set(int paramInt1, int paramInt2) {
    this.hY = paramInt1;
    this.hZ = paramInt2;
  }

  public final void b(MD paramMD) {
    this.hY = paramMD.hY;
    this.hZ = paramMD.hZ;
  }

  public final int getX() {
    return this.hY;
  }

  public final int getY() {
    return this.hZ;
  }

  public final void setX(int paramInt) {
    this.hY = paramInt;
  }

  public final void setY(int paramInt) {
    this.hZ = paramInt;
  }
}