import com.ankamagames.wakfu.client.console.command.debug.ListResourceInfoCommand;
import java.util.ArrayList;

public class UI
  implements dGy
{
  public UI(ListResourceInfoCommand paramListResourceInfoCommand, int paramInt1, int paramInt2, bPu parambPu)
  {
  }

  public boolean d(azX paramazX)
  {
    int i = (int)cEl.ag(paramazX.fa() - this.aOU, paramazX.fb() - this.aOV);
    if (i > 200) {
      return true;
    }

    short s = paramazX.aLV().bqt();
    ArrayList localArrayList = (ArrayList)this.cyW.cx(s);
    if (localArrayList == null) {
      localArrayList = new ArrayList();
      this.cyW.c(s, localArrayList);
    }

    localArrayList.add(paramazX);
    return true;
  }
}