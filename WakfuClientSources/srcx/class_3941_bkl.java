public class bkl
{
  private P dQn = null;
  private int dQo;
  private int hY;
  private int hZ;

  public bkl(String paramString, int paramInt1, int paramInt2)
  {
    this(adF.c(paramString, paramInt1, paramInt2));
  }

  public bkl() {
    this("COPRGTL", 4, 11);
  }

  public bkl(hf paramhf) {
    this.dQn = bsB.b(paramhf);
    this.dQn.setColor(0.8F, 0.8F, 0.8F, 1.0F);
  }

  public void a(bSr parambSr, int paramInt1, int paramInt2) {
    this.dQn.begin3DRendering();
    this.dQo = this.dQn.as();
    this.dQn.setColor(1.0F, 1.0F, 1.0F, 1.0F);

    this.hY = (paramInt1 - parambSr.bZm() / 2);
    this.hZ = ((int)(1.5F * parambSr.bZn()) - paramInt2 - this.dQo);
  }

  public void fT(String paramString)
  {
    this.dQn.a(paramString.toCharArray(), this.hY, this.hZ);
    this.hZ -= this.dQo;
  }

  public void drawText(String paramString, int paramInt1, int paramInt2) {
    this.dQn.a(paramString.toCharArray(), this.hY + paramInt1, this.hZ - paramInt2);
  }

  public void end() {
    this.dQn.endRendering();
  }
}