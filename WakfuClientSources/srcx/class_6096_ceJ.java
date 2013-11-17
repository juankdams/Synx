public class ceJ extends cGj
  implements aZH
{
  public static final String NAME = "name";
  public static final String aLh = "description";
  public static final String ciu = "iconUrl";
  private final dxL bXQ;
  private dic hzi;
  private dyT hzj;

  public ceJ(dxL paramdxL)
  {
    this.bXQ = new cYq(paramdxL);
  }

  public void a(dic paramdic) {
    this.hzi = paramdic;

    Ww();

    dLE.doY().a(this, new String[] { "name", "description" });
  }

  private void Ww()
  {
    if (this.hzi == null);
  }

  public dic chH()
  {
    return this.hzi;
  }

  public dxL VN() {
    return this.bXQ;
  }

  public String[] getFields() {
    return null;
  }

  public Object getFieldValue(String paramString) {
    if (this.hzi == null)
      return null;
    if (paramString.equals("name"))
      return this.hzi.getName();
    if (paramString.equals("description"))
      return this.hzi.getDescription();
    if (paramString.equals("iconUrl")) {
      return this.hzj != null ? this.hzj.getUrl() : null;
    }
    return null;
  }

  public void x(String paramString1, String paramString2) {
    dLE.doY().a(this, new String[] { paramString1 });
  }
}