public class bKZ extends coZ
{
  private final int fwI;
  private final int gOK;
  private final int cTU;
  private int bmM;

  public bKZ(int paramInt1, int paramInt2, int paramInt3)
  {
    super(1.0F);
    this.fwI = paramInt1;
    this.gOK = paramInt2;
    this.cTU = paramInt3;
  }

  public bKZ(int paramInt1, int paramInt2, int paramInt3, float paramFloat) {
    this(paramInt1, paramInt2, paramInt3);
    if ((!bB) && ((paramFloat < 0.0F) || (paramFloat > 1.0F))) throw new AssertionError();
    this.bmM = ((int)bCO.s(0.0F, paramInt1, paramFloat));
  }

  public boolean dT(int paramInt) {
    this.bmM += paramInt;
    if (this.bmM > this.fwI + this.gOK + this.cTU)
      return false;
    return super.dT(paramInt);
  }

  public float xP() {
    float f = bCO.t(bTg(), 0.0F, 1.0F);
    return super.xP() * f;
  }

  private float bTg() {
    float f = this.bmM;

    if (f < this.fwI) {
      return f / this.fwI;
    }
    f -= this.fwI;

    if (f < this.gOK) {
      return 1.0F;
    }
    f -= this.gOK;

    if (f < this.cTU) {
      return 1.0F - f / this.cTU;
    }
    return 0.0F;
  }
}