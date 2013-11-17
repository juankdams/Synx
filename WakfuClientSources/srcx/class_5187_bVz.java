public class bVz
  implements dBv
{
  public static final String cgO = "text";
  public static final String RH = "iconUrl";
  public static final String epo = "visible";
  private final int aw;
  private final aMh hhI;
  private boolean aYZ = false;

  public static final String[] bF = { "text", "visible" };

  public bVz(int paramInt, aMh paramaMh) {
    this.aw = paramInt;
    this.hhI = paramaMh;
  }

  public String[] getFields() {
    return bF;
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("text")) {
      switch (this.aw) {
      case -2:
        return "[...]";
      case -1:
        return bU.fH().getString("dialogEnd");
      }

      return bU.fH().b(76, this.aw, new Object[0]);
    }

    if (paramString.equals("iconUrl")) {
      if (this.hhI == aMh.erd)
        return null;
      return ay.bd().E(this.hhI.getId());
    }if (paramString.equals("visible")) {
      return Boolean.valueOf(this.aYZ);
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

  public int getId() {
    return this.aw;
  }

  public void setVisible(boolean paramBoolean) {
    this.aYZ = paramBoolean;
    dLE.doY().a(this, new String[] { "visible" });
  }
}