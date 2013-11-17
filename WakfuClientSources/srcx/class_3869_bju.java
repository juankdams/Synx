public class bju extends cQd
{
  public static final byte aDG = 4;
  private float fzN;
  private float fzO;

  public float buQ()
  {
    return this.fzN;
  }

  public void bm(float paramFloat)
  {
    this.fzN = paramFloat;
  }

  public float buR() {
    return this.fzO;
  }

  public void bn(float paramFloat) {
    this.fzO = paramFloat;
  }

  public void O(float paramFloat1, float paramFloat2) {
    this.fzN = paramFloat1;
    this.fzO = paramFloat2;
  }

  public boolean aOX() {
    float f = axg.aIP().aIT();
    return (this.fzN <= f) && (f <= this.fzO);
  }

  public byte nq() {
    return 4;
  }

  public void k(aYQ paramaYQ) {
    this.fzN = paramaYQ.readFloat();
    this.fzO = paramaYQ.readFloat();
  }

  public void e(dSw paramdSw) {
    paramdSw.writeFloat(this.fzN);
    paramdSw.writeFloat(this.fzO);
  }

  public String aOY() {
    return "Wakfu (Min : " + this.fzN + ", Max : " + this.fzO + ")";
  }

  public XF ajE()
  {
    bju localbju = new bju();
    localbju.bm(this.fzN);
    localbju.bn(this.fzO);
    localbju.iF(ajF());
    return localbju;
  }
}