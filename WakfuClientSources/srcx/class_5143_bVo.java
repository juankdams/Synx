import java.util.Collection;
import org.apache.log4j.Logger;

public final class bVo
  implements brG
{
  private static final Logger K = Logger.getLogger(bVo.class);

  public boolean c(aPH paramaPH) {
    int i = 0;
    int j = 0;
    cpy localcpy = new cpy();

    Collection localCollection = paramaPH.bgK();
    for (dhJ localdhJ : localCollection) {
      if (localdhJ.Fx() == -1) {
        K.error(paramaPH.ha("[FIGHT_REFACTOR] On a un fighter inPlay avec un teamId à -1 " + localdhJ + " - " + bBd.rV(8)));
      }
      else {
        localcpy.dP(localdhJ.Fx());
        i |= (localcpy.size() >= paramaPH.bgB() ? 1 : 0);
        j |= (localdhJ.getType() == 0 ? 1 : 0);

        if ((j != 0) && (i != 0))
          break;
      }
    }
    return (i != 0) && (j != 0);
  }
}