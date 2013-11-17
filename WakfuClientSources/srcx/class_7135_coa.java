public class coa extends ddp
{
  public float a(float paramFloat1, float paramFloat2, int paramInt1, int paramInt2)
  {
    float f1 = paramInt1 / paramInt2 / 2.0F;

    float f2 = (0.5F - f1) * (1.0F - 2.0F * Math.abs(0.5F - f1));

    f1 = (f1 - f2) * 2.0F;

    return paramFloat1 + (paramFloat2 - paramFloat1) * f1;
  }
}