class aVm extends oe
{
  private int eXy;

  public aVm(jq paramjq, Float paramFloat1, Float paramFloat2, int paramInt1, int paramInt2, ddp paramddp, int paramInt3)
  {
    super(paramFloat1, paramFloat2, paramjq, paramInt1, paramInt2, paramddp);
    yc(paramInt3);
    ip(false);
  }

  public boolean aH(int paramInt) {
    if (!super.aH(paramInt)) {
      return false;
    }

    if (this.dRn == null) {
      return true;
    }

    float f = this.dRn.a(((Float)this.iJh).floatValue(), ((Float)this.iJi).floatValue(), this.bmM, this.aKS);
    double d1 = 4.71238898038469D;
    double d2 = 1.570796326794897D;
    if ((this.eXy == 0) && (f >= 1.570796326794897D)) {
      this.eXy += 1;
      jq.a(this.eXz);
    } else if ((this.eXy == 1) && (f < 1.570796326794897D)) {
      this.eXy = 0;
    }

    jq.c(this.eXz).b(jq.b(this.eXz) ? cEi.ixK : cEi.ixL, f);

    return true;
  }

  public void nv() {
    super.nv();
    jq.c(this.eXz).b(jq.b(this.eXz) ? cEi.ixK : cEi.ixL, ((Float)this.iJi).floatValue());
  }
}