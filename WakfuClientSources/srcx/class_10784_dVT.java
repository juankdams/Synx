class dVT
  implements aSO
{
  private final cTD mvk;

  dVT(int paramInt)
  {
    this.mvk = new cTD(paramInt, 0.9F, this);
  }

  public int nR(int paramInt) {
    return paramInt;
  }

  public void b(float[] paramArrayOfFloat, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    for (int i = 0; i < paramInt2; i++) {
      int j = i * paramInt1;
      for (int k = 0; k < paramInt1; k++)
        c(paramInt3 + k, paramInt4 + i, paramArrayOfFloat[(k + j)]);
    }
  }

  private void c(int paramInt1, int paramInt2, float paramFloat)
  {
    int i = V(paramInt1, paramInt2);
    float f = this.mvk.get(i);
    if (f != 0.0F)
      this.mvk.m(i, paramFloat * f);
    else
      this.mvk.m(i, paramFloat);
  }

  public final void reset()
  {
    this.mvk.clear();
  }

  public void a(int paramInt1, int paramInt2, float[] paramArrayOfFloat) {
    float f = this.mvk.get(V(paramInt1, paramInt2));
    if (f != 0.0F) {
      paramArrayOfFloat[0] *= f;
      paramArrayOfFloat[1] *= f;
      paramArrayOfFloat[2] *= f;
    }
  }

  public void normalize()
  {
    this.mvk.a(new agI(this));
  }

  static int V(int paramInt1, int paramInt2)
  {
    return paramInt1 & 0xFFFF | paramInt2 << 16;
  }
}