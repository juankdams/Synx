public class cYm
{
  public float aOR;
  public float aOS;

  public cYm()
  {
  }

  public cYm(cYm paramcYm)
  {
    b(paramcYm);
  }

  public cYm(float paramFloat1, float paramFloat2) {
    ae(paramFloat1, paramFloat2);
  }

  public final boolean equals(Object paramObject)
  {
    if (this == paramObject)
      return true;
    if ((paramObject == null) || (getClass() != paramObject.getClass())) {
      return false;
    }
    cYm localcYm = (cYm)paramObject;

    return (this.aOR == localcYm.aOR) && (this.aOS == localcYm.aOS);
  }

  public final int hashCode()
  {
    long l = 31L * (31L + ()this.aOR) + ()this.aOS;
    return (int)(l ^ l >> 32);
  }

  public String toString()
  {
    return "{Point2i : (" + this.aOR + ", " + this.aOS + ") @" + Integer.toHexString(hashCode()) + "}";
  }

  public final boolean al(float paramFloat1, float paramFloat2)
  {
    return (this.aOR == paramFloat1) && (this.aOS == paramFloat2);
  }

  public final boolean a(cYm paramcYm) {
    return (this.aOR == paramcYm.aOR) && (this.aOS == paramcYm.aOS);
  }

  public final void ae(float paramFloat1, float paramFloat2) {
    this.aOR = paramFloat1;
    this.aOS = paramFloat2;
  }

  public final void b(cYm paramcYm) {
    this.aOR = paramcYm.aOR;
    this.aOS = paramcYm.aOS;
  }

  public final float getX() {
    return this.aOR;
  }

  public final float getY() {
    return this.aOS;
  }

  public final void setX(float paramFloat) {
    this.aOR = paramFloat;
  }

  public final void setY(float paramFloat) {
    this.aOS = paramFloat;
  }
}