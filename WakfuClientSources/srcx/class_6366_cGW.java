import java.util.List;
import org.apache.log4j.Logger;

public class cGW extends dKf
{
  private static final Logger K = Logger.getLogger(cGW.class);

  public cGW(int paramInt) {
    super(paramInt);
  }

  public void c(String[] paramArrayOfString) {
  }

  public boolean f(gA paramgA) {
    byz localbyz = byv.bFN().bFO();

    if (localbyz.bGP().iS(paramgA.oj()) == null) {
      K.error("[ItemAction] On essaye de lancer une action avec un item qui n'est pas dans les bags");
      return false;
    }

    int i = 0;
    List localList = localbyz.bFW().bto();
    for (int j = 0; j < localList.size(); j++) {
      bPD localbPD = (bPD)localList.get(j);
      if ((localbPD.bWk() == null) || (localbPD.bWk().bRg()))
      {
        i = 1;
        break;
      }
    }
    if (i == 0) {
      K.warn("Tentative d'utilisation d'un item de reduction de DEAD_STATE sans en avoir");
      return false;
    }

    bZ(paramgA.oj());
    return true;
  }

  public void clear()
  {
  }
}