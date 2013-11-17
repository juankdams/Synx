public class bnd
  implements dBv
{
  public static final String bC = "name";
  public static final String RH = "iconUrl";
  public static final String fFV = "itemType";
  protected ya fFW;
  public final String[] bF = { "name", "iconUrl", "itemType" };

  public bnd(ya paramya)
  {
    this.fFW = paramya;
  }

  public String[] getFields()
  {
    return this.bF;
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("name"))
      return this.fFW == null ? bU.fH().getString("all") : this.fFW.getName();
    if (paramString.equals("iconUrl"))
      return ay.bd().b(this.fFW == null ? -1 : this.fFW.nc());
    if (paramString.equals("itemType")) {
      return this.fFW;
    }
    return null;
  }

  public void a(String paramString, Object paramObject)
  {
  }

  public void b(String paramString, Object paramObject)
  {
  }

  public void c(String paramString, Object paramObject)
  {
  }

  public boolean l(String paramString) {
    return false;
  }

  public ya bxx() {
    return this.fFW;
  }

  public boolean equals(Object paramObject) {
    if (!(paramObject instanceof bnd))
      return false;
    return this.fFW == ((bnd)paramObject).bxx();
  }
}