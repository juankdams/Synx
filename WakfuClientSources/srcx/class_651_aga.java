import java.util.ArrayList;

public class aga extends cKq
{
  private ArrayList bcw;

  public aga(bNa parambNa1, bNa parambNa2, ArrayList paramArrayList, int paramInt1, int paramInt2, int paramInt3, ddp paramddp)
  {
    be(parambNa1);
    bf(parambNa2);
    this.bcw = paramArrayList;
    setDelay(paramInt1);
    setDuration(paramInt2);
    yc(paramInt3);
    setTweenFunction(paramddp);
  }

  public boolean aH(int paramInt)
  {
    if (!super.aH(paramInt)) {
      return false;
    }

    if (this.dRn != null) {
      bNa localbNa1 = (bNa)this.iJh;
      bNa localbNa2 = (bNa)this.iJi;

      float f1 = this.dRn.a(localbNa1.QC(), localbNa2.QC(), this.bmM, this.aKS);
      float f2 = this.dRn.a(localbNa1.QD(), localbNa2.QD(), this.bmM, this.aKS);
      float f3 = this.dRn.a(localbNa1.QE(), localbNa2.QE(), this.bmM, this.aKS);
      float f4 = this.dRn.a(localbNa1.getAlpha(), localbNa2.getAlpha(), this.bmM, this.aKS);

      bNa localbNa3 = new bNa(f1, f2, f3, f4);

      for (int i = this.bcw.size() - 1; i >= 0; i--) {
        ((dKW)this.bcw.get(i)).setModulationColor(localbNa3);
      }
    }

    return true;
  }

  public void nv()
  {
    for (int i = this.bcw.size() - 1; i >= 0; i--) {
      ((dKW)this.bcw.get(i)).setModulationColor((bNa)this.iJi);
    }
    super.nv();
  }

  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("[ModulationColorListTween] ").append(this.iJh).append(" -> ").append(this.iJi);
    return localStringBuilder.toString();
  }
}