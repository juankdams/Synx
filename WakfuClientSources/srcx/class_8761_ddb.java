public class ddb extends caQ
{
  public ddb(ZG paramZG, cbI paramcbI, float paramFloat1, boolean paramBoolean, float paramFloat2)
  {
    super(paramZG, paramcbI, paramFloat1, paramBoolean, paramFloat2);
  }

  public void i(cEi paramcEi) {
    float f1 = paramcEi.getX();
    float f2 = f1 < -2.0F ? f1 + 2.0F : f1 > 2.0F ? f1 - 2.0F : 0.0F;
    float f3 = paramcEi.getY();
    float f4 = f3 < -2.0F ? f3 + 2.0F : f3 > 2.0F ? f3 - 2.0F : 0.0F;
    float f5 = paramcEi.aCv();
    float f6 = f5 < -2.0F ? f5 + 2.0F : f5 > 2.0F ? f5 - 2.0F : 1.0F;
    this.hrz.f(f2, f4, f6);
  }
}