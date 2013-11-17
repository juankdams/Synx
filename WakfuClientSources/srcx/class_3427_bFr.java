public class bFr
{
  private final int aJy;
  private final int aJz;
  public static final bFr gAs = new bFr(-1, -1);

  static bFr cR(int paramInt1, int paramInt2)
  {
    if ((paramInt1 == -1) && (paramInt2 == -1))
      return gAs;
    return new bFr(paramInt1, paramInt2);
  }

  private bFr(int paramInt1, int paramInt2) {
    this.aJy = paramInt1;
    this.aJz = paramInt2;
  }

  public int getStart() {
    return this.aJy;
  }

  public int qV() {
    return this.aJz;
  }

  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true;
    if ((paramObject == null) || (getClass() != paramObject.getClass())) {
      return false;
    }
    bFr localbFr = (bFr)paramObject;

    if (this.aJz != localbFr.aJz)
      return false;
    if (this.aJy != localbFr.aJy) {
      return false;
    }
    return true;
  }

  public int hashCode() {
    int i = this.aJy;
    i = 31 * i + this.aJz;
    return i;
  }
}