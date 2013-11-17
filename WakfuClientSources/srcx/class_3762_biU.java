public class biU extends oe
{
  public biU(Float paramFloat1, Float paramFloat2, duS paramduS, int paramInt1, int paramInt2, ddp paramddp)
  {
    super(paramFloat1, paramFloat2, paramduS, paramInt1, paramInt2, paramddp);
  }

  public duS buJ() {
    return (duS)super.getWidget();
  }

  public boolean aH(int paramInt) {
    if (!super.aH(paramInt)) {
      return false;
    }

    if (this.dRn != null)
    {
      float f = this.dRn.a(((Float)this.iJh).floatValue(), ((Float)this.iJi).floatValue(), this.bmM, this.aKS);

      buJ().setZoom(f);
    }

    return true;
  }

  public void nv() {
    buJ().setZoom(((Float)this.iJi).floatValue());
  }
}