final class Dw extends cRS
{
  private int bIi;
  private float bIh;
  private float bIg;

  void b(float paramFloat1, float paramFloat2, int paramInt1, int paramInt2)
  {
    this.bIi = paramInt2;
    this.bIh = (paramFloat2 * paramFloat2 / (paramInt2 * paramInt2));
    this.bIg = (1.0F - this.bIh);
  }

  float a(int paramInt1, int paramInt2, float paramFloat, float[] paramArrayOfFloat, int paramInt3)
  {
    int i = paramInt2 + this.bIi;

    float f = 0.0F;
    if ((i >= 0) && (i < paramInt3)) {
      f = paramArrayOfFloat[(paramInt1 + i * paramInt3)];
    }

    return paramFloat * this.bIg + f * this.bIh;
  }
}