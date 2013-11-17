import java.util.List;

public class dMb extends cGj
{
  public static final String bXO = "sales";
  public static final String mcm = "hasSales";
  public static final String mcn = "hasPrevious";
  public static final String mco = "hasNext";
  public static final String mcp = "pageNumberDesc";
  private List mcq;
  private int aPg;
  private int mcr;

  public dMb(List paramList)
  {
    this.mcq = paramList;
    this.mcr = this.mcq.size();
  }

  public void dpg() {
    if (this.aPg + 1 >= this.mcr) {
      return;
    }

    this.aPg += 1;

    dLE.doY().a(this, new String[] { "hasNext", "hasPrevious", "pageNumberDesc", "sales" });
  }

  public void dph()
  {
    if (this.aPg - 1 < 0) {
      return;
    }

    this.aPg -= 1;

    dLE.doY().a(this, new String[] { "hasNext", "hasPrevious", "pageNumberDesc", "sales" });
  }

  public String[] getFields()
  {
    return null;
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("hasSales"))
      return Boolean.valueOf(this.mcr > 0);
    if (paramString.equals("hasNext"))
      return Boolean.valueOf(this.aPg + 1 < this.mcr);
    if (paramString.equals("hasPrevious"))
      return Boolean.valueOf(this.aPg > 0);
    if (paramString.equals("pageNumberDesc"))
      return bU.fH().getString("pageNumber", new Object[] { Integer.valueOf(this.aPg + 1), Integer.valueOf(this.mcr) });
    if (paramString.equals("sales")) {
      return (this.mcq != null) && (this.mcq.size() > this.aPg) ? (Ll)this.mcq.get(this.aPg) : null;
    }

    return null;
  }
}