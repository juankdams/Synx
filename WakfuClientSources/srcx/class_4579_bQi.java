import com.ankamagames.wakfu.client.WakfuClientInstance;

final class bQi extends dbJ
{
  bQi(String paramString1, String paramString2, cgR paramcgR1, cgR paramcgR2)
  {
    super(paramString1, paramString2, paramcgR1);
  }
  public void update(int paramInt) {
    super.update(paramInt);

    dSz localdSz = WakfuClientInstance.awy().Dg();

    this.gYq.a("screen_size", localdSz.MH(), localdSz.MI());
    aWe localaWe = localdSz.cKV();
    this.gYq.b("camera", localaWe.yf(), localaWe.yg(), localaWe.getZoomFactor());
  }
}