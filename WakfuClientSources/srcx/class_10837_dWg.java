class dWg
  implements aiT
{
  private final dQx bMM = new dQx(0, 0, 0, 0);
  private final aoL mvr;

  dWg(int paramInt)
  {
    this.mvr = new aoL(paramInt, 0.9F);
  }

  public final void reset() {
    this.mvr.clear();
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, float[] paramArrayOfFloat) {
    float[] arrayOfFloat = (float[])this.mvr.get(ao(paramInt1, paramInt2, paramInt3));
    if (arrayOfFloat != null) {
      paramArrayOfFloat[0] += arrayOfFloat[0] + arrayOfFloat[3];
      paramArrayOfFloat[1] += arrayOfFloat[1] + arrayOfFloat[4];
      paramArrayOfFloat[2] += arrayOfFloat[2] + arrayOfFloat[5];
    }
  }

  static long ao(int paramInt1, int paramInt2, int paramInt3)
  {
    return bCO.cN(paramInt1, paramInt2);
  }

  public dQx Pf() {
    return this.bMM;
  }

  public void setBounds(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    this.bMM.set(paramInt1, paramInt1 + paramInt3, paramInt2, paramInt2 + paramInt4);
  }

  public void a(int paramInt1, int paramInt2, int paramInt3, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6) {
    long l = ao(paramInt1, paramInt2, paramInt3);
    float[] arrayOfFloat = (float[])this.mvr.get(l);
    if (arrayOfFloat != null) {
      arrayOfFloat[0] += paramFloat1;
      arrayOfFloat[1] += paramFloat2;
      arrayOfFloat[2] += paramFloat3;

      arrayOfFloat[3] += paramFloat4;
      arrayOfFloat[4] += paramFloat5;
      arrayOfFloat[5] += paramFloat6;
    } else {
      this.mvr.put(l, new float[] { paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6 });
    }
  }
}