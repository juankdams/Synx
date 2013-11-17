public class zp extends oe
{
  private float btI;
  private float btJ;
  private float btK;
  private float btL;
  private float btM;
  private float btN;

  public zp(bhd parambhd, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, dOc paramdOc, int paramInt1, int paramInt2, ddp paramddp)
  {
    super(Boolean.valueOf(true), Boolean.valueOf(false), paramdOc, paramInt1, paramInt2, paramddp);
    this.btI = paramFloat1;
    this.btK = paramFloat3;
    this.btJ = paramFloat2;
    this.btL = paramFloat4;

    int i = -(bhd.a(parambhd) - parambhd.czl.getContentWidth());
    this.btM = (parambhd.fvw / (i == 0 ? 1 : i));
    int j = bhd.b(parambhd) - parambhd.czl.getContentHeight();
    this.btN = (parambhd.fvx / (j == 0 ? 1 : j));
  }

  public boolean aH(int paramInt)
  {
    super.aH(paramInt);

    if (this.dRn != null) {
      boolean bool = ((Boolean)this.iJh).booleanValue();
      if (!bool) {
        this.btM = this.btI;
        this.btN = this.btK;
      }

      float f1 = bool ? this.btM : this.btJ;
      float f2 = bool ? this.btJ : this.btM;
      float f3 = bool ? this.btN : this.btL;
      float f4 = bool ? this.btL : this.btN;

      float f5 = this.dRn.a(f1, f2, this.bmM, this.aKS);
      float f6 = this.dRn.a(f3, f4, this.bmM, this.aKS);

      this.brB.setDeltaX((int)(-(bhd.a(this.brB) - this.brB.czl.getContentWidth()) * f5));
      this.brB.setDeltaY((int)((bhd.b(this.brB) - this.brB.czl.getContentHeight()) * f6));
    }

    return true;
  }

  public void nv()
  {
    super.nv();
    bhd.a(this.brB, null);
  }
}