public class cEl
{
  public float aOR;
  public float aOS;

  public cEl()
  {
    this(0.0F, 0.0F);
  }

  public cEl(cEl paramcEl) {
    this(paramcEl.aOR, paramcEl.aOS);
  }

  public cEl(float[] paramArrayOfFloat) {
    this(paramArrayOfFloat[0], paramArrayOfFloat[1]);
  }

  public cEl(cYm paramcYm1, cYm paramcYm2) {
    this.aOR = (paramcYm2.getX() - paramcYm1.getX());
    this.aOS = (paramcYm2.getY() - paramcYm1.getY());
  }

  public cEl(float paramFloat1, float paramFloat2) {
    this.aOR = paramFloat1;
    this.aOS = paramFloat2;
  }

  public cEl(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    this.aOR = (paramInt3 - paramInt1);
    this.aOS = (paramInt4 - paramInt2);
  }

  public void f(float[] paramArrayOfFloat) {
    this.aOR = paramArrayOfFloat[0];
    this.aOS = paramArrayOfFloat[1];
  }

  public void ae(float paramFloat1, float paramFloat2) {
    this.aOR = paramFloat1;
    this.aOS = paramFloat2;
  }

  public void a(cEl paramcEl) {
    this.aOR = paramcEl.aOR;
    this.aOS = paramcEl.aOS;
  }

  public float getX() {
    return this.aOR;
  }

  public void setX(float paramFloat) {
    this.aOR = paramFloat;
  }

  public float getY() {
    return this.aOS;
  }

  public void setY(float paramFloat) {
    this.aOS = paramFloat;
  }

  public cEl b(cEl paramcEl) {
    return new cEl(paramcEl.aOR + this.aOR, paramcEl.aOS + this.aOS);
  }

  public void c(cEl paramcEl) {
    this.aOR += paramcEl.aOR;
    this.aOS += paramcEl.aOS;
  }

  public final float d(cEl paramcEl) {
    float f1 = this.aOR - paramcEl.aOR;
    float f2 = this.aOS - paramcEl.aOS;
    return f1 * f1 + f2 * f2;
  }

  public cEl e(cEl paramcEl) {
    return new cEl(this.aOR - paramcEl.aOR, this.aOS - paramcEl.aOS);
  }

  public void f(cEl paramcEl) {
    this.aOR -= paramcEl.aOR;
    this.aOS -= paramcEl.aOS;
  }

  public cEl g(cEl paramcEl) {
    return new cEl(this.aOR * paramcEl.aOR + this.aOR * paramcEl.aOS, this.aOS * paramcEl.aOR + this.aOS * paramcEl.aOS);
  }

  public cEl cK(float paramFloat)
  {
    return new cEl(paramFloat * this.aOR, paramFloat * this.aOS);
  }

  public void cL(float paramFloat) {
    this.aOR *= paramFloat;
    this.aOS *= paramFloat;
  }

  public cEl cM(float paramFloat) {
    return new cEl((int)(paramFloat * this.aOR), (int)(paramFloat * this.aOS));
  }

  public float h(cEl paramcEl) {
    return this.aOR * paramcEl.aOS - paramcEl.aOR * this.aOS;
  }

  public float i(cEl paramcEl) {
    return this.aOR * paramcEl.aOR + this.aOS * paramcEl.aOS;
  }

  public float czP() {
    return ag(this.aOR, this.aOS);
  }

  public float czQ() {
    return af(this.aOR, this.aOS);
  }

  public cEl czY() {
    return cK(1.0F / czQ());
  }

  public void czT() {
    float f1 = czQ();
    if (f1 == 0.0F)
      f1 = 0.001F;
    float f2 = 1.0F / f1;
    this.aOR *= f2;
    this.aOS *= f2;
  }

  public boolean equals(Object paramObject)
  {
    if ((paramObject == null) || (!(paramObject instanceof cEl)))
      return false;
    cEl localcEl = (cEl)paramObject;
    return (localcEl.aOR == this.aOR) && (localcEl.aOS == this.aOS);
  }

  public String toString()
  {
    return "V2 : [" + this.aOR + " ; " + this.aOS + "]";
  }

  public int hashCode()
  {
    long l = 31L * (31L + ()this.aOR) + ()this.aOS;
    return (int)(l ^ l >> 32);
  }

  public static float af(float paramFloat1, float paramFloat2) {
    return bCO.bK(paramFloat1 * paramFloat1 + paramFloat2 * paramFloat2);
  }

  public static float ag(float paramFloat1, float paramFloat2) {
    return paramFloat1 * paramFloat1 + paramFloat2 * paramFloat2;
  }
}