public class cZf extends ew
{
  private float bmK;
  private float bmL;
  private int bmM;

  public cZf()
  {
    this.bmK = 0.5F;
    this.bmL = 77.0F;
  }

  public void update(int paramInt)
  {
    super.update(paramInt);
    this.bmM += paramInt;

    float f1 = xP() * this.bmK;
    float f2 = this.bmM / this.bmL * 1.570796F;
    float f3 = !lF() ? 0.0F : Math.abs(bCO.bI(f2)) - 1.0F;
    float f4 = !lG() ? 0.0F : -Math.abs(bCO.bH(f2));
    this.cHC.g(f1 * f3, f1 * f4);
  }

  public final void start()
  {
    this.bmM = 0;
    coZ localcoZ = new coZ(1.0F);
    e(localcoZ);
  }

  public final void am(float paramFloat1, float paramFloat2) {
    this.bmL = paramFloat1;
    this.bmK = paramFloat2;
  }
}