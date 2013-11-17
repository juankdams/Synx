import java.util.Collection;
import org.apache.log4j.Logger;

public final class cZx
  implements brG
{
  private static final Logger K = Logger.getLogger(cZx.class);

  public boolean c(aPH paramaPH) {
    boolean bool = false;
    cpy localcpy = new cpy();

    Collection localCollection = paramaPH.bgK();
    for (dhJ localdhJ : localCollection) {
      if (localdhJ.Fx() == -1) {
        K.error(paramaPH.ha("[FIGHT_REFACTOR] On a un fighter inPlay avec un teamId à -1 " + localdhJ + " - " + bBd.rV(8)));
      }
      else {
        localcpy.dP(localdhJ.Fx());
        bool |= localcpy.size() >= paramaPH.bgB();

        if (bool)
          break;
      }
    }
    return bool;
  }
}