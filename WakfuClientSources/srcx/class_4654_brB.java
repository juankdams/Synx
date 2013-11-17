import com.ankamagames.wakfu.client.WakfuClientInstance;

final class brB
  implements dLo
{
  brB(bmz parambmz)
  {
  }

  public void valid()
  {
    boolean bool = WakfuClientInstance.awy().awB().a(this.fNc);
    WakfuClientInstance.awy().awB().a(this.fNc, !bool);
  }

  public void cancel() {
    dWe.dvA().a(WakfuClientInstance.awy().awB(), new String[] { this.fNc.getKey() });
  }
}