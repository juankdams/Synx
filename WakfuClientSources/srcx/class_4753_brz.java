import com.ankamagames.wakfu.client.WakfuClientInstance;
import com.ankamagames.wakfu.client.console.command.display.AlphaMaskCommand;

final class brz
  implements dLo
{
  brz(bmz parambmz, boolean paramBoolean)
  {
  }

  public void valid()
  {
    WakfuClientInstance.awy().awB().a(this.fNa, this.cKe);
    dWe.dvA().a(WakfuClientInstance.awy().awB(), new String[] { this.fNa.getKey() });
  }

  public void cancel() {
    boolean bool = WakfuClientInstance.awy().awB().a(this.fNa);
    AlphaMaskCommand.eU(bool);
  }
}