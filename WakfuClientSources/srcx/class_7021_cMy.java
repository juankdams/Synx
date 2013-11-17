public class cMy extends oe
{
  private bPw aKP;

  public cMy(Float paramFloat1, Float paramFloat2, dOc paramdOc, int paramInt1, int paramInt2, ddp paramddp, bPw parambPw, int paramInt3)
  {
    super(paramFloat1, paramFloat2, paramdOc, paramInt1, paramInt2, paramddp);
    this.aKP = parambPw;
    yc(paramInt3);
  }

  public boolean aH(int paramInt) {
    if (!super.aH(paramInt)) {
      return false;
    }

    if (this.dRn == null) {
      return true;
    }

    float f = this.dRn.a(((Float)this.iJh).floatValue(), ((Float)this.iJi).floatValue(), this.bmM, this.aKS);

    this.aKP.c(f, f, 1.0F);

    return true;
  }

  public void nv() {
    super.nv();
    this.aKP.c(((Float)this.iJi).floatValue(), 1.0F, 1.0F);
  }
}