import java.util.List;

public class Ll
  implements dBv
{
  public static final String bXN = "date";
  public static final String bXO = "sales";
  public static final String bXP = "totalSales";
  private dxL bXQ;
  private final Ej bXR = new Ej(new aAC(this));

  public static final String[] bF = { "date", "sales" };

  public Ll(dxL paramdxL)
  {
    this.bXQ = new cYq(paramdxL);
  }

  public void a(dbA paramdbA) {
    this.bXR.add(paramdbA);
  }

  public String[] getFields()
  {
    return bF;
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("date")) {
      return this.bXQ.equals(Long.valueOf(dDE.dft().VN().cLT())) ? bU.fH().getString("flea.salesLog.today") : bU.fH().a(this.bXQ);
    }

    if (paramString.equals("sales"))
      return this.bXR;
    if (paramString.equals("totalSales")) {
      int i = 0;
      for (int j = this.bXR.size() - 1; j >= 0; j--) {
        i = (int)(i + ((dbA)this.bXR.get(j)).wH());
      }
      return Integer.valueOf(i);
    }
    return null;
  }

  public int VL() {
    int i = 0;
    for (int j = this.bXR.size() - 1; j >= 0; j--) {
      i += ((dbA)this.bXR.get(j)).getNumItems();
    }

    return i;
  }

  public List VM() {
    return this.bXR;
  }

  public dxL VN() {
    return this.bXQ;
  }

  public void a(String paramString, Object paramObject) {
  }

  public void b(String paramString, Object paramObject) {
  }

  public void c(String paramString, Object paramObject) {
  }

  public boolean l(String paramString) {
    return false;
  }
}