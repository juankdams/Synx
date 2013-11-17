public final class aAv
  implements cbI
{
  private final float aOR;
  private final float aOS;
  private final float aOT;
  private final boolean dSV;
  private final int aVh;
  public static final double dSW = 4.8D;

  public aAv(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    this(paramFloat1, paramFloat2, paramFloat3, false, 0);
  }

  public aAv(float paramFloat1, float paramFloat2, float paramFloat3, boolean paramBoolean) {
    this(paramFloat1, paramFloat2, paramFloat3, paramBoolean, 0);
  }

  public aAv(float paramFloat1, float paramFloat2, float paramFloat3, boolean paramBoolean, int paramInt) {
    this.aOR = paramFloat1;
    this.aOS = paramFloat2;
    this.aOT = paramFloat3;
    this.dSV = paramBoolean;
    this.aVh = paramInt;
  }

  public float OZ() {
    return this.aOR - this.aOS;
  }

  public float Pa() {
    return -(this.aOR + this.aOS);
  }

  public float Pb() {
    return (float)(this.aOT / 4.8D);
  }

  public boolean Pc() {
    return this.dSV;
  }

  public int ca() {
    return this.aVh;
  }
}