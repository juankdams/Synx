import com.ankamagames.wakfu.client.WakfuClientInstance;
import com.ankamagames.wakfu.client.console.command.display.DisplayHpBarCommand;

final class bry
  implements dLo
{
  bry(bmz parambmz, boolean paramBoolean)
  {
  }

  public void valid()
  {
    WakfuClientInstance.awy().awB().a(this.fMZ, this.cKe);
    dWe.dvA().a(WakfuClientInstance.awy().awB(), new String[] { this.fMZ.getKey() });
  }

  public void cancel() {
    boolean bool = WakfuClientInstance.awy().awB().a(this.fMZ);
    DisplayHpBarCommand.dh(bool);
  }
}