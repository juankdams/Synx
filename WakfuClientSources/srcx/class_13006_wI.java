public class wI extends ew
{
  private float bmK;
  private float aYl;
  private float bmL;
  private int bmM;

  public wI()
  {
    this.bmK = 5.0F;
    this.bmL = 1500.0F;
    this.aYl = 0.025F;
  }

  public final void start()
  {
    this.bmM = 0;
    coZ localcoZ = new coZ(1.0F);
    e(localcoZ);
  }

  public void update(int paramInt) {
    super.update(paramInt);
    this.bmM += paramInt;

    float f1 = this.bmK * xP();
    float f2 = this.bmM / this.bmL * 1.570796F;
    float f3 = bCO.bH(f2);

    float f4 = !lF() ? 0.0F : f3;
    float f5 = !lG() ? 0.0F : f3;
    this.cHC.g(f1 * f4, f1 * f5);
    this.cHC.G(xP() * this.aYl * (bCO.bH(0.7F * f2) - 0.5F));
  }

  public void a(float paramFloat1, float paramFloat2, float paramFloat3) {
    this.bmL = paramFloat1;
    this.bmK = paramFloat2;
    this.aYl = paramFloat3;
  }
}