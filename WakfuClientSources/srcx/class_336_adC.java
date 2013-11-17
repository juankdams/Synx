public class adC extends coZ
{
  private final int cTU;
  private int bmM;

  public adC(int paramInt)
  {
    super(1.0F);
    this.cTU = paramInt;
  }

  public adC(int paramInt, float paramFloat) {
    this(paramInt);
    if ((!bB) && ((paramFloat < 0.0F) || (paramFloat > 1.0F))) throw new AssertionError();
    this.bmM = ((int)bCO.s(this.cTU, 0.0F, paramFloat));
  }

  public boolean dT(int paramInt) {
    this.bmM += paramInt;
    if (this.bmM > this.cTU)
      return false;
    return super.dT(paramInt);
  }

  public float xP() {
    float f = bCO.t((this.cTU - this.bmM) / this.cTU, 0.0F, 1.0F);
    return super.xP() * f;
  }
}