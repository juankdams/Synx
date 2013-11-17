class ga
{
  float aDu = 1.0F;
  float aDv = 1.0F;

  private ga b(float paramFloat1, float paramFloat2)
  {
    this.aDu = paramFloat1;
    this.aDv = paramFloat2;
    return this;
  }

  private ga nb() {
    this.aDu = 0.0F;
    this.aDv = 0.0F;
    return this;
  }
}