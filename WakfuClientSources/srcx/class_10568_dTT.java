import com.ankamagames.wakfu.client.console.command.debug.FloodChatCommand;
import java.util.ArrayList;

public class dTT
  implements Runnable
{
  public dTT(FloodChatCommand paramFloodChatCommand, ArrayList paramArrayList)
  {
  }

  public void run()
  {
    String str = (String)this.mqZ.get(bCO.sf(this.mqZ.size()));
    aEe localaEe = new aEe(str);
    localaEe.mm(4);
    CM.LV().a(localaEe);
  }
}