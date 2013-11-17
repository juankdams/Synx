import java.util.ArrayList;
import java.util.List;

public class dbA extends cGj
{
  public static final String kTz = "time";
  public static final String kTA = "items";
  public static final String kTB = "playerName";
  public static final String gbB = "kamas";
  private dxL bXQ;
  private String bjj;
  private List kTC = new ArrayList();
  private long aVv;
  public final String[] bF = { "time", "items", "playerName", "kamas" };

  public dbA(dxL paramdxL, String paramString, long paramLong)
  {
    this.bXQ = paramdxL;
    this.bjj = paramString;
    this.aVv = paramLong;
  }

  public void g(int paramInt, short paramShort) {
    this.kTC.add(new cDm(paramInt, paramShort));
  }

  public int getNumItems()
  {
    return this.kTC.size();
  }

  public String[] getFields() {
    return this.bF;
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("time"))
      return bU.fH().b(this.bXQ);
    if (paramString.equals("items"))
      return this.kTC;
    if (paramString.equals("playerName"))
      return this.bjj;
    if (paramString.equals("kamas")) {
      return Long.valueOf(this.aVv);
    }
    return null;
  }

  public dxL VN() {
    return this.bXQ;
  }

  public long wH() {
    return this.aVv;
  }
}