public class azh
{
  private P dQn = null;
  private int dQo;
  private int hY;
  private int hZ;

  public azh(String paramString, int paramInt1, int paramInt2)
  {
    hf localhf = adF.c(paramString, paramInt1, paramInt2);
    if (localhf != null) {
      if ((localhf instanceof cdM)) {
        ((cdM)localhf).cgD();
      }
      this.dQn = bsB.b(localhf);
    }
    this.dQn.setColor(0.8F, 0.8F, 0.8F, 1.0F);
  }

  public void a(bSr parambSr, int paramInt1, int paramInt2) {
    this.dQn.begin3DRendering();
    this.dQo = this.dQn.as();

    this.hY = (paramInt1 - parambSr.bZm() / 2);
    this.hZ = ((int)(0.5F * parambSr.bZn()) - paramInt2 - this.dQo);
  }

  public void fT(String paramString) {
    b(paramString, null);
  }

  public void b(String paramString, float[] paramArrayOfFloat) {
    if (paramArrayOfFloat != null)
      this.dQn.setColor(paramArrayOfFloat[0], paramArrayOfFloat[1], paramArrayOfFloat[2], paramArrayOfFloat[3]);
    else {
      this.dQn.setColor(1.0F, 1.0F, 1.0F, 1.0F);
    }
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