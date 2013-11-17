public class bkd
  implements dBv
{
  public static final String bHJ = "id";
  public static final String RI = "description";
  public static final String[] bF = { "id", "description" };
  private short aDx;

  public bkd(short paramShort)
  {
    this.aDx = paramShort;
  }

  public short nc() {
    return this.aDx;
  }

  public void bP(short paramShort) {
    this.aDx = paramShort;
    dLE.doY().a(this, new String[] { "id", "description" });
  }

  private String bvh() {
    String str = getDescription();
    if (str == null) {
      return bU.fH().getString("player.title.no.title");
    }

    return str;
  }

  public String getDescription() {
    if (this.aDx == -1) {
      return null;
    }
    return bU.fH().b(34, this.aDx, new Object[0]);
  }

  public String[] getFields() {
    return bF;
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("id"))
      return Short.valueOf(this.aDx);
    if (paramString.equals("description")) {
      return bvh();
    }
    return null;
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