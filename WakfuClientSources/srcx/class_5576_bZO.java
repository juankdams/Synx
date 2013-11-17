public class bZO
  implements aoH
{
  public int hqu;
  public int hqv;
  public int hqw;
  public int hqx;
  final cYm hqy = new cYm();
  float cas = 1.0F;

  public bZO(int paramInt1, int paramInt2) {
    this.hqu = (-paramInt1);
    this.hqv = paramInt1;
    this.hqw = (-paramInt2);
    this.hqx = paramInt2;
  }

  public void setScale(float paramFloat) {
    this.cas = paramFloat;
  }

  public cYm z(float paramFloat1, float paramFloat2)
  {
    float f3;
    float f1;
    float f2;
    float f4;
    if (Math.abs(paramFloat1) / this.hqv >= Math.abs(paramFloat2) / this.hqx) {
      f3 = this.hqu * this.cas;
      if (paramFloat1 <= f3 - 0.01F) {
        f1 = f3;
        f2 = paramFloat2 * f1 / paramFloat1;
        this.hqy.ae(f1, f2);
        return this.hqy;
      }
      f4 = this.hqv * this.cas;
      if (paramFloat1 >= f4 + 0.01F) {
        f1 = f4;
        f2 = paramFloat2 * f1 / paramFloat1;
        this.hqy.ae(f1, f2);
        return this.hqy;
      }
    } else {
      f3 = this.hqw * this.cas;
      if (paramFloat2 <= f3 - 0.01F) {
        f2 = f3;
        f1 = paramFloat1 * f2 / paramFloat2;
        this.hqy.ae(f1, f2);
        return this.hqy;
      }
      f4 = this.hqx * this.cas;
      if (paramFloat2 >= f4 + 0.01F) {
        f2 = f4;
        f1 = paramFloat1 * f2 / paramFloat2;
        this.hqy.ae(f1, f2);
        return this.hqy;
      }
    }
    return null;
  }
}