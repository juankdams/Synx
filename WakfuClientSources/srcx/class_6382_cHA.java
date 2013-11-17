final class cHA
{
  private float x;
  private float y;
  private float iCD;
  private boolean iCE;

  public void m(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    this.x = paramFloat1;
    this.y = paramFloat2;
    this.iCD = paramFloat3;
  }

  public boolean z(float paramFloat1, float paramFloat2, float paramFloat3) {
    return (this.x == paramFloat1) && (this.y == paramFloat2) && (this.iCD == paramFloat3);
  }
}