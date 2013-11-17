import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class TZ extends cGj
{
  public static final String bC = "name";
  public static final String bsP = "level";
  public static final String cxm = "loots";
  public final String[] bF = { "name", "level", "loots" };

  private final List cxn = new ArrayList();

  private TZ(dQY paramdQY) {  } 
  public String[] getFields() { return this.bF; }

  public Object getFieldValue(String paramString)
  {
    if (paramString.equals("name"))
      return byv.bFN().bFO().getName();
    if (paramString.equals("level"))
      return Short.valueOf(byv.bFN().bFO().nU());
    if (paramString.equals("loots")) {
      return this.cxn.isEmpty() ? null : Collections.unmodifiableCollection(this.cxn);
    }
    return null;
  }

  public void m(int paramInt, short paramShort) {
    this.cxn.add(new cDm(paramInt, paramShort));
  }

  public void a(cDm paramcDm) {
    if (!this.cxn.contains(paramcDm))
      this.cxn.add(paramcDm);
  }
}