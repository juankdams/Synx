public class rY extends oe
{
  public rY(bbp parambbp1, float paramFloat1, float paramFloat2, bbp parambbp2, int paramInt1, int paramInt2, ddp paramddp)
  {
    super(Float.valueOf(paramFloat1), Float.valueOf(paramFloat2), parambbp2, paramInt1, paramInt2, paramddp);
  }

  public boolean aH(int paramInt)
  {
    if (!super.aH(paramInt)) {
      return false;
    }

    if (this.dRn != null) {
      float f = this.dRn.a(((Float)this.iJh).floatValue(), ((Float)this.iJi).floatValue(), this.bmM, this.aKS);

      if (f <= bbp.a(this.bai)) {
        bbp.a(this.bai, f);
      }
    }

    return true;
  }
}