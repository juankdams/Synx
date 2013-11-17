import com.ankamagames.wakfu.client.console.command.debug.ListCharacterInfoCommand;
import java.util.ArrayList;

public class aje
  implements bhG
{
  public aje(ListCharacterInfoCommand paramListCharacterInfoCommand, cSR paramcSR)
  {
  }

  public boolean b(long paramLong, Su paramSu)
  {
    int i = paramSu.aJp().nn();
    ArrayList localArrayList = (ArrayList)this.cTM.get(i);
    if (localArrayList == null) {
      localArrayList = new ArrayList();
      this.cTM.put(i, localArrayList);
    }
    localArrayList.add(paramSu);
    return true;
  }
}