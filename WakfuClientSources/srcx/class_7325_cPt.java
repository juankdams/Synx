class cPt extends oe
{
  private int kyz;
  private int kyA;
  private boolean aYZ;

  cPt(int paramInt1, int paramInt2, dOc paramdOc, int paramInt3, int paramInt4, ddp paramddp, boolean paramBoolean)
  {
    super(null, null, paramdOc, paramInt3, paramInt4, paramddp);
    this.kyz = paramInt1;
    this.kyA = paramInt2;
    this.aYZ = paramBoolean;
  }

  public boolean aH(int paramInt)
  {
    if (!super.aH(paramInt)) {
      return false;
    }

    if (this.dRn != null) {
      dOc localdOc = getWidget();
      int i = aFG.ecn.ba(localdOc.getWidth(), localdOc.getContainer().getWidth());
      int j = (int)this.dRn.a(this.kyz, this.kyA, this.bmM, this.aKS);

      getWidget().setPosition(i, j, true);
    }

    return true;
  }

  public void nv() {
    dOc localdOc = (dOc)this.iJj;
    int i = aFG.ecn.ba(localdOc.getWidth(), localdOc.getContainer().getWidth());

    getWidget().setPosition(i, this.kyA, true);
    getWidget().setVisible(this.aYZ);
    super.nv();
  }
}