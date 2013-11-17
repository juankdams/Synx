import java.util.HashMap;
import org.apache.log4j.Logger;

public class ccz
{
  private static final Logger K = Logger.getLogger(ccz.class);

  static final ccz huw = new ccz();

  private static final cMc hux = new dUA();
  private static final String fzs = "type";
  private static final String huy = "version";
  static final String huz = "setProperty";
  static final String huA = "resetChat";
  private final HashMap huB = new HashMap();

  private ccz() {
    this.huB.put("setProperty", new bUa());
    this.huB.put("resetChat", new czf());
  }

  cMc a(K paramK, int paramInt)
  {
    K localK = paramK.e("type");
    if (localK == null) {
      K.warn("Action sans type");
      return hux;
    }

    int i = B(paramK);
    if (i <= paramInt) {
      return hux;
    }
    String str = localK.getStringValue();
    cMc localcMc1 = (cMc)this.huB.get(str);
    if (localcMc1 == null) {
      K.warn("Type d'action inexistant : " + str);
      return hux;
    }

    cMc localcMc2 = localcMc1.caj();
    localcMc2.A(paramK);
    return localcMc2;
  }

  private static int B(K paramK) {
    K localK = paramK.e("version");
    if (localK == null) {
      K.warn("Action sans numéro de version");
      return -1;
    }

    return localK.getIntValue();
  }

  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("CheckerActionFactory{}");
    return localStringBuilder.toString();
  }
}