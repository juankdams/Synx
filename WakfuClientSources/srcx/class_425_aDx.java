public class aDx
{
  public float aOR;
  public float aOS;
  public float aOT;
  public float dYq;

  public aDx()
  {
  }

  public aDx(aDx paramaDx)
  {
    b(paramaDx);
  }

  public aDx(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) {
    h(paramFloat1, paramFloat2, paramFloat3, paramFloat4);
  }

  public final void h(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) {
    this.aOR = paramFloat1;
    this.aOS = paramFloat2;
    this.aOT = paramFloat3;
    this.dYq = paramFloat4;
  }

  public final void a(aDx paramaDx) {
    b(paramaDx);
  }

  public final void setX(float paramFloat) {
    this.aOR = paramFloat;
  }

  public final void setY(float paramFloat) {
    this.aOS = paramFloat;
  }

  public final void aK(float paramFloat) {
    this.aOT = paramFloat;
  }

  public final void aL(float paramFloat) {
    this.dYq = paramFloat;
  }

  public final void b(aDx paramaDx) {
    this.aOR = paramaDx.aOR;
    this.aOS = paramaDx.aOS;
    this.aOT = paramaDx.aOT;
    this.dYq = paramaDx.dYq;
  }

  public final float getX() {
    return this.aOR;
  }

  public final float getY() {
    return this.aOS;
  }

  public final float aCv() {
    return this.aOT;
  }

  public final float aPI() {
    return this.dYq;
  }

  public final boolean c(aDx paramaDx) {
    return (bCO.X(this.aOR, paramaDx.aOR)) && (bCO.X(this.aOS, paramaDx.aOS)) && (bCO.X(this.aOT, paramaDx.aOT)) && (bCO.X(this.dYq, paramaDx.dYq));
  }
}