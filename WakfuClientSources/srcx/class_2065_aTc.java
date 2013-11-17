import org.apache.log4j.Logger;

public class aTc extends oe
{
  private static Logger K = Logger.getLogger(aTc.class);

  private int eQq = -2147483648; private int eQr = 2147483647;
  private int eQs;
  private int eQt;
  private float eQu = 1.4E-45F; private float eQv = 1.4E-45F;

  public aTc(float paramFloat1, float paramFloat2, int paramInt1, int paramInt2, int paramInt3, int paramInt4, dOc paramdOc, int paramInt5, int paramInt6, ddp paramddp)
  {
    super(null, null, paramdOc, paramInt5, paramInt6, paramddp);
    this.eQq = paramInt1;
    this.eQr = paramInt2;
    this.eQs = paramInt3;
    this.eQt = paramInt4;
    this.eQu = paramFloat1;
    this.eQv = paramFloat2;
  }

  public boolean aH(int paramInt)
  {
    if (!super.aH(paramInt)) {
      return false;
    }

    if (this.dRn != null)
    {
      int k;
      if (this.eQq != -2147483648)
        k = (int)this.dRn.a(this.eQq, this.eQr, Math.min(this.bmM, this.aKS / 2), this.aKS / 2);
      else
        k = this.eQr;
      double d;
      if ((this.bmM < this.aKS / 2) && (this.eQu != 1.4E-45F))
        d = this.eQu;
      else if ((this.eQu != 1.4E-45F) && (this.bmM >= this.aKS / 2))
        d = this.dRn.a(this.eQu, this.eQv, 2 * (this.bmM - this.aKS / 2), this.aKS);
      else {
        d = this.eQv;
      }

      int i = (int)(k * Math.cos(d)) + this.eQs;
      int j = (int)(k * Math.sin(d)) + this.eQt;

      getWidget().setPosition(i, j, true);
    }

    return true;
  }

  public void nv()
  {
    int i = (int)(this.eQr * Math.cos(this.eQv)) + this.eQs;
    int j = (int)(this.eQr * Math.sin(this.eQv)) + this.eQt;

    getWidget().setPosition(i, j, true);
    super.nv();
  }
}