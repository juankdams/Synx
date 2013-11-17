public class bhQ extends coZ
{
  private final int fwI;
  private int bmM;

  public bhQ(int paramInt)
  {
    super(1.0F);
    this.fwI = paramInt;
  }

  public bhQ(int paramInt, float paramFloat) {
    this(paramInt);
    if ((!bB) && ((paramFloat < 0.0F) || (paramFloat > 1.0F))) throw new AssertionError();
    this.bmM = ((int)bCO.s(0.0F, paramInt, paramFloat));
  }

  public boolean dT(int paramInt) {
    this.bmM += paramInt;
    return super.dT(paramInt);
  }

  public float xP() {
    float f = bCO.t(this.bmM / this.fwI, 0.0F, 1.0F);
    return super.xP() * f;
  }
}