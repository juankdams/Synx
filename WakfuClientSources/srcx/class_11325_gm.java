public class gm extends cKq
{
  private final bNa aDX;
  private final boolean aDY;

  public gm(bNa parambNa1, bNa parambNa2, dKW paramdKW, int paramInt1, int paramInt2, int paramInt3, ddp paramddp)
  {
    this(parambNa1, parambNa2, paramdKW, paramInt1, paramInt2, paramInt3, true, paramddp);
  }

  public gm(bNa parambNa1, bNa parambNa2, dKW paramdKW, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean, ddp paramddp)
  {
    be(parambNa1);
    bf(parambNa2);
    a((LM)paramdKW);
    setDelay(paramInt1);
    setDuration(paramInt2);
    yc(paramInt3);
    setTweenFunction(paramddp);

    this.aDX = paramdKW.getModulationColor();
    this.aDY = paramBoolean;
  }

  public boolean aH(int paramInt)
  {
    if (!super.aH(paramInt)) {
      return false;
    }

    if (this.dRn == null) {
      return true;
    }

    float f1 = this.dRn.a(((bNa)this.iJh).QC(), ((bNa)this.iJi).QC(), this.bmM, this.aKS);
    float f2 = this.dRn.a(((bNa)this.iJh).QD(), ((bNa)this.iJi).QD(), this.bmM, this.aKS);
    float f3 = this.dRn.a(((bNa)this.iJh).QE(), ((bNa)this.iJi).QE(), this.bmM, this.aKS);
    float f4 = this.dRn.a(((bNa)this.iJh).getAlpha(), ((bNa)this.iJi).getAlpha(), this.bmM, this.aKS);

    bNa localbNa = new bNa(f1, f2, f3, f4);

    ((dKW)this.iJj).setModulationColor(localbNa);

    return true;
  }

  public void nv()
  {
    if (this.aDY)
      ((dKW)this.iJj).setModulationColor(this.aDX);
    else {
      ((dKW)this.iJj).setModulationColor((bNa)this.iJi);
    }
    super.nv();
  }

  public String toString() {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("[ModulationColorTween] ").append(this.iJh).append(" -> ").append(this.iJi);
    return localStringBuilder.toString();
  }
}