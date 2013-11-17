final class Dv extends cRS
{
  private int bIf;
  private float bIg;
  private float bIh;

  void b(float paramFloat1, float paramFloat2, int paramInt1, int paramInt2)
  {
    this.bIf = paramInt1;
    this.bIh = (paramFloat1 * paramFloat1 / (paramInt1 * paramInt1));
    this.bIg = (1.0F - this.bIh);
  }

  float a(int paramInt1, int paramInt2, float paramFloat, float[] paramArrayOfFloat, int paramInt3)
  {
    int i = paramInt1 + this.bIf;

    float f = 0.0F;
    if ((i >= 0) && (i < paramInt3)) {
      f = paramArrayOfFloat[(i + paramInt2 * paramInt3)];
    }

    return paramFloat * this.bIg + f * this.bIh;
  }
}