public class asI extends oe
{
  private int dCv;
  private int dCw;
  private int dCx;
  private int dCy;

  public asI(bhd parambhd, int paramInt1, int paramInt2, int paramInt3)
  {
    super(Boolean.valueOf(true), Boolean.valueOf(false), parambhd, 0, paramInt3, ddp.kWH);

    this.dCv = parambhd.fvw;
    this.dCx = parambhd.fvx;
    this.dCw = paramInt1;
    this.dCy = paramInt2;
  }

  public boolean aH(int paramInt)
  {
    super.aH(paramInt);

    if (this.dRn != null) {
      int i = (int)this.dRn.a(this.dCv, this.dCw, this.bmM, this.aKS);
      int j = (int)this.dRn.a(this.dCx, this.dCy, this.bmM, this.aKS);

      this.brB.setDeltaX(i);
      this.brB.setDeltaY(j);
    }

    return true;
  }

  public void nv()
  {
    super.nv();
  }
}