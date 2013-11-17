final class Dx extends cRS
{
  private int bIf;
  private int bIi;
  private float bIj;
  private float bIk;
  private float bIl;
  private float bIm;

  void b(float paramFloat1, float paramFloat2, int paramInt1, int paramInt2)
  {
    this.bIf = paramInt1;
    this.bIi = paramInt2;
    float f1 = paramFloat1 * paramFloat1 / (paramInt1 * paramInt1);
    float f2 = paramFloat2 * paramFloat2 / (paramInt2 * paramInt2);
    this.bIj = ((1.0F - f1) * (1.0F - f2));
    this.bIk = ((1.0F - f1) * f2);
    this.bIl = (f1 * (1.0F - f2));
    this.bIm = (f1 * f2);
  }

  float a(int paramInt1, int paramInt2, float paramFloat, float[] paramArrayOfFloat, int paramInt3)
  {
    int i = paramInt1 + this.bIf;
    int j = paramInt2 + this.bIi;
    float f1 = 0.0F;
    float f2 = 0.0F;
    float f3 = 0.0F;
    if ((j >= 0) && (j < paramInt3)) {
      f1 = paramArrayOfFloat[(paramInt1 + j * paramInt3)];
      if ((i >= 0) && (i < paramInt3))
        f3 = paramArrayOfFloat[(i + j * paramInt3)];
    }
    if ((i >= 0) && (i < paramInt3)) {
      f2 = paramArrayOfFloat[(i + paramInt2 * paramInt3)];
    }
    return paramFloat * this.bIj + f1 * this.bIk + f2 * this.bIl + f3 * this.bIm;
  }
}