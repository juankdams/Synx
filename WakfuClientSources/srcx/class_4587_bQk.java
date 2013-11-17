import com.ankamagames.wakfu.client.WakfuClientInstance;

final class bQk extends dbJ
{
  float gYr = 0.0F;
  float gYs = 0.0F;

  bQk(String paramString1, String paramString2, cgR paramcgR1, coZ paramcoZ, cgR paramcgR2)
  {
    super(paramString1, paramString2, paramcgR1);
  }

  public void update(int paramInt)
  {
    super.update(paramInt);
    float f1 = this.gYt.xP();
    float f2 = 1.0F * f1 * paramInt;
    this.gYr += f2 * 0.0011F;
    this.gYs += f2 * 0.0013F;

    this.gYq.setFloat("gStrength", f1);
    this.gYq.a("gDistordLow", this.gYr * 0.0013F, this.gYr * 0.0011F);
    this.gYq.a("gDistordHigh", -(this.gYs * 0.011F + this.gYs * 0.023F), 1.5F * this.gYs * 0.013F);

    aWe localaWe = WakfuClientInstance.awy().Dg().cKV();
    this.gYq.b("camera", localaWe.yf() / 1024.0F, localaWe.yg() / 1024.0F, localaWe.getZoomFactor());
  }
}