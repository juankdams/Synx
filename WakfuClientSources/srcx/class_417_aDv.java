class aDv extends oe
{
  private boolean aKV = false;

  private aDv(alP paramalP) {
  }

  private aDv(alP paramalP1, float paramFloat1, float paramFloat2, alP paramalP2, int paramInt1, int paramInt2, ddp paramddp) {
    super(Float.valueOf(paramFloat1), Float.valueOf(paramFloat2), paramalP2, paramInt1, paramInt2, paramddp);
  }

  public void E(float paramFloat1, float paramFloat2) {
    if (this.aKV) {
      this.aKS += 500;
      this.iJi = Float.valueOf(paramFloat2);
    }

    this.aKV = true;
  }

  public boolean aH(int paramInt)
  {
    if (!super.aH(paramInt)) {
      return false;
    }

    if ((this.dRn != null) && 
      ((this.iJh instanceof Float)) && ((this.iJi instanceof Float))) {
      alP.a(this.dYo, this.dRn.a(((Float)this.iJh).floatValue(), ((Float)this.iJi).floatValue(), this.bmM, this.aKS));
      this.dYo.ayz();
    }

    return true;
  }

  public void nv() {
    alP.a(this.dYo, ((Float)this.iJi).floatValue());
    this.dYo.ayz();
    super.nv();
  }

  public String toString() {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("[ProgressBarTween] ").append(this.iJh).append(" -> ").append(this.iJi);
    return localStringBuilder.toString();
  }
}