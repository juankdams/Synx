public class dHx extends oe
{
  private int lxM;
  private int kyz;
  private int lxN;
  private int kyA;

  public dHx(int paramInt1, int paramInt2, int paramInt3, int paramInt4, dOc paramdOc, int paramInt5, int paramInt6, ddp paramddp)
  {
    super(null, null, paramdOc, paramInt5, paramInt6, paramddp);
    this.lxM = paramInt1;
    this.kyz = paramInt2;
    this.lxN = paramInt3;
    this.kyA = paramInt4;
  }

  public boolean aH(int paramInt)
  {
    if (!super.aH(paramInt)) {
      return false;
    }

    if (this.dRn != null)
    {
      int i = (int)this.dRn.a(this.lxM, this.lxN, this.bmM, this.aKS);
      int j = (int)this.dRn.a(this.kyz, this.kyA, this.bmM, this.aKS);

      getWidget().setPosition(i, j, true);
    }

    return true;
  }

  public void nv()
  {
    getWidget().setPosition(this.lxN, this.kyA, true);
    super.nv();
  }

  public String toString() {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("[PositionTween] (").append(this.lxM).append(", ").append(this.kyz).append(") -> (").append(this.lxN).append(", ").append(this.kyA).append(")");
    return localStringBuilder.toString();
  }
}