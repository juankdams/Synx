import java.util.ArrayList;

public class azL extends Kc
{
  private final ArrayList biK = new ArrayList();

  private final float[] dRm = new float[4];
  private int bmM;
  private int aKS;
  private final ddp dRn = ddp.kWG;

  public void d(bNa parambNa)
  {
    this.biK.add(parambNa);
  }

  public void setDuration(int paramInt)
  {
    this.aKS = paramInt;
  }

  public int getDuration()
  {
    return this.aKS;
  }

  public void cz(int paramInt)
  {
    if (this.biK.size() < 2) {
      return;
    }

    this.bmM += paramInt;
    if (this.bmM >= this.aKS) {
      this.bmM = 0;
      this.biK.add(this.biK.remove(0));
    }

    bNa localbNa1 = (bNa)this.biK.get(0);
    bNa localbNa2 = (bNa)this.biK.get(1);

    this.dRm[0] = this.dRn.a(localbNa1.QC(), localbNa2.QC(), this.bmM, this.aKS);
    this.dRm[1] = this.dRn.a(localbNa1.QD(), localbNa2.QD(), this.bmM, this.aKS);
    this.dRm[2] = this.dRn.a(localbNa1.QE(), localbNa2.QE(), this.bmM, this.aKS);
    this.dRm[3] = this.dRn.a(localbNa1.getAlpha(), localbNa2.getAlpha(), this.bmM, this.aKS);

    g(this.dRm);
  }

  public void bc() {
    super.bc();

    this.biK.clear();
  }
}