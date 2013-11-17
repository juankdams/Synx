class bEV
{
  private float gzT;
  private float gzU;
  private float gzV;
  private long gzW;
  private long gzX;

  bEV(float paramFloat)
  {
    this.gzT = paramFloat;
    this.gzV = paramFloat;
    this.gzU = paramFloat;
    this.gzW = 0L;
    this.gzX = 0L;
  }

  void set(float paramFloat) {
    this.gzT = paramFloat;
    this.gzV = paramFloat;
    this.gzU = paramFloat;
    this.gzW = 0L;
    this.gzX = 0L;
  }

  void a(float paramFloat, long paramLong1, long paramLong2) {
    this.gzV = paramFloat;
    this.gzU = this.gzT;
    this.gzX = Math.max(paramLong1, 1L);
    this.gzW = paramLong2;
  }

  float bMS() {
    return this.gzT;
  }

  public float bMT() {
    return this.gzV;
  }

  boolean gz(long paramLong) {
    return paramLong > this.gzW + this.gzX;
  }

  void K(long paramLong) {
    long l = paramLong - this.gzW;
    if (l < this.gzX) {
      float f = (float)l / (float)this.gzX;
      this.gzT = bCO.s(this.gzU, this.gzV, f);
    } else {
      this.gzT = this.gzV;
    }
  }
}