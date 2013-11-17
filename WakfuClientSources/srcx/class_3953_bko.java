import java.util.ArrayList;
import org.apache.log4j.Logger;

public class bko extends cGj
{
  private static final Logger K = Logger.getLogger(bko.class);
  public static final String ciu = "iconUrl";
  public static final String czg = "enabled";
  public static final String etc = "items";
  public static final String dCJ = "idString";
  private final aF fAP;
  private final ArrayList cm = new ArrayList();

  public bko(aF paramaF) {
    this.fAP = paramaF;
  }

  public void clear() {
    this.cm.clear();
  }

  public void a(cod paramcod) {
    this.cm.add(paramcod);
  }

  public String[] getFields() {
    return null;
  }

  public boolean isEnabled() {
    return this.cm.size() != 0;
  }

  public void Pq() {
    int i = 0; for (int j = this.cm.size(); i < j; i++)
      ((cod)this.cm.get(i)).Pq();
  }

  public aF EH()
  {
    return this.fAP;
  }

  void Pp() {
    int i = 0; for (int j = this.cm.size(); i < j; i++) {
      cod localcod = (cod)this.cm.get(i);
      localcod.Pp();
    }
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("iconUrl"))
      try {
        return String.format(ay.bd().getString("challengeCategoryIconsPath"), new Object[] { Byte.valueOf(this.fAP.bJ()) });
      } catch (bdh localbdh) {
        K.error("Exception", localbdh);

        return null;
      }
    if (paramString.equals("enabled"))
      return Boolean.valueOf(this.cm.size() > 0);
    if (paramString.equals("items"))
      return this.cm;
    if (paramString.equals("idString")) {
      return String.valueOf(this.fAP.bJ());
    }
    return null;
  }
}