public class cAZ
{
  public static float isg = 0.4F;
  public static float ish = 700.0F;
  private float isi = 0.0F;
  private float euR;
  private float isj;
  private cUV isk;

  public cAZ(cUV paramcUV)
  {
    this.euR = isg;
    this.isj = ish;
    this.isk = paramcUV;
  }

  public void axZ() {
    if (this.isk == null)
      return;
    this.isi = this.isk.alh();
    this.isk.q(this.euR * this.isk.alh(), this.isj);
  }

  public void nv() {
    if (this.isk == null)
      return;
    this.isk.q(this.isi, this.isj);
  }

  public void cB(float paramFloat)
  {
    this.euR = paramFloat;
  }

  public void cC(float paramFloat) {
    this.isj = paramFloat;
  }

  public void cxy() {
    this.euR = isg;
  }

  public void cxz() {
    this.isj = ish;
  }
}