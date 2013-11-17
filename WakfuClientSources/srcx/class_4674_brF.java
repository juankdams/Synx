import com.ankamagames.wakfu.client.WakfuClientInstance;

final class brF
  implements dLo
{
  brF(bmz parambmz, boolean paramBoolean)
  {
  }

  public void valid()
  {
    WakfuClientInstance.awy().awB().a(this.fNw, this.cKe);
    dWe.dvA().a(WakfuClientInstance.awy().awB(), new String[] { this.fNw.getKey() });
  }

  public void cancel() {
    boolean bool = WakfuClientInstance.awy().awB().a(this.fNw);
    dtV.proceedHideFightOccluders(bool);
  }
}