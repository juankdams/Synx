import com.ankamagames.wakfu.client.WakfuClientInstance;

final class Ze
  implements dLo
{
  Ze(yR paramyR, boolean paramBoolean)
  {
  }

  public void valid()
  {
    WakfuClientInstance.awy().awB().a(this.cKd, this.cKe);
    dWe.dvA().a(WakfuClientInstance.awy().awB(), new String[] { this.cKd.getKey() });
  }

  public void cancel() {
    boolean bool = WakfuClientInstance.awy().awB().a(this.cKd);
    aWc.blo().eq(bool);
  }
}