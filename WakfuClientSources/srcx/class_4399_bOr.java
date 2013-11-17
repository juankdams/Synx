public class bOr extends oe
{
  public bOr(Or paramOr1, Or paramOr2, dOc paramdOc, int paramInt1, int paramInt2, ddp paramddp)
  {
    super(paramOr1, paramOr2, paramdOc, paramInt1, paramInt2, paramddp);
  }

  public boolean aH(int paramInt)
  {
    if (!super.aH(paramInt)) {
      return false;
    }

    if (this.dRn != null)
    {
      Or localOr1 = (Or)this.iJh;
      Or localOr2 = (Or)this.iJi;

      int i = (int)this.dRn.a(localOr1.width, localOr2.width, this.bmM, this.aKS);
      int j = (int)this.dRn.a(localOr1.height, localOr2.height, this.bmM, this.aKS);

      getWidget().setSize(i, j, true);
    }

    return true;
  }

  public void nv()
  {
    Or localOr = (Or)this.iJi;
    getWidget().setSize(localOr.width, localOr.height, true);
    super.nv();
  }

  public String toString() {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("[ResizeTween] ").append(this.iJh).append(" -> ").append(this.iJi);
    return localStringBuilder.toString();
  }
}