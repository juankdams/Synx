import com.ankamagames.baseImpl.graphics.alea.display.DisplayedScreenElement;
import com.ankamagames.framework.graphics.engine.entity.Entity;
import java.util.ArrayList;

public class dkP
{
  public static final dkP lip = new dkP();

  public void clear()
  {
  }

  public boolean a(Entity paramEntity, boolean paramBoolean)
  {
    return true;
  }

  public boolean c(ahm paramahm) {
    return true;
  }

  public void a(adG paramadG, ArrayList paramArrayList) {
    int i = 0; for (int j = paramArrayList.size(); i < j; i++)
      paramadG.b(((DisplayedScreenElement)paramArrayList.get(i)).GG(), true);
  }
}