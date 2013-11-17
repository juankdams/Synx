public class cyd
{
  private int bmM;
  private float bvL;
  private float bvM;
  private float buM;
  private float imo;
  private float dmV;

  public void cs(float paramFloat)
  {
    this.imo = paramFloat;
  }

  public void setSpeed(float paramFloat) {
    this.buM = paramFloat;
  }

  public void set(float paramFloat) {
    this.bvL = (this.bvM = this.dmV = paramFloat);
  }

  public float getValue() {
    return this.dmV;
  }

  public void ct(float paramFloat) {
    this.bvL = paramFloat;
    this.bmM = 0;
  }

  public void cu(float paramFloat) {
    this.bvM = paramFloat;
    this.bvL = this.dmV;
    this.bmM = 0;
  }

  public float cvi() {
    return this.bvM;
  }

  public float xd(int paramInt) {
    if (Math.abs(this.bvM - this.dmV) < this.imo) {
      set(this.bvM);
      return this.bvM;
    }

    this.bmM += paramInt;
    float f1 = this.bmM * this.buM / 1000.0F;
    if (f1 > 1.0F) {
      this.dmV = this.bvM;
    } else {
      float f2 = bCO.bF(f1 * 1.570796F);
      this.dmV = (this.bvL + (this.bvM - this.bvL) * f2);
    }
    return this.dmV;
  }
}