import java.util.Collection;
import org.apache.log4j.Logger;

public class cpm
  implements cjh
{
  public static final Logger K = Logger.getLogger(cpm.class);

  private static final cpm hYx = new cpm();

  public static cpm coW() {
    return hYx;
  }

  public void a(Su paramSu, dRK paramdRK1, dRK paramdRK2, dRK paramdRK3)
  {
    if (paramSu == null) {
      return;
    }
    arl localarl = paramSu.aeQ();
    if (localarl == null) {
      return;
    }
    Collection localCollection = localarl.LC().bbj();
    if (localCollection == null) {
      return;
    }
    for (cjK localcjK : localCollection)
      if ((localcjK.axG() == paramSu) && 
        (localcjK.getType() == xj.bpk.xj()))
      {
        paramdRK1.Q(localcjK.fa(), localcjK.fb(), localcjK.fc());
      }
  }
}