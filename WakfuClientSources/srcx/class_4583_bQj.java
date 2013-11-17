import com.ankamagames.wakfu.client.WakfuClientInstance;

final class bQj extends dbJ
{
  int bmM = 0;

  bQj(String paramString1, String paramString2, cgR paramcgR1, cgR paramcgR2)
  {
    super(paramString1, paramString2, paramcgR1);
  }

  public void update(int paramInt)
  {
    this.bmM += paramInt;

    super.update(paramInt);
    float f1 = this.bmM * 0.0011F;
    float f2 = this.bmM * 0.0013F;

    this.gYq.a("gDistordLow", -f1 * 0.0013F, f1 * 0.0011F);
    this.gYq.a("gDistordHigh", f2 * 0.011F + f2 * 0.023F, f2 * 0.013F);

    aWe localaWe = WakfuClientInstance.awy().Dg().cKV();
    this.gYq.b("camera", localaWe.yf() / 1024.0F, localaWe.yg() / 1024.0F, localaWe.getZoomFactor());
  }
}