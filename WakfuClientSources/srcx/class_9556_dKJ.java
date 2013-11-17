public class dKJ extends cGj
{
  public static final String bC = "name";
  public static final String bHJ = "id";
  public static final String eMT = "selected";
  public static final String lZk = "style";
  public static final String[] bF = { "name", "id", "selected", "style" };
  private byte hV;
  private boolean dBi;

  public dKJ(byte paramByte)
  {
    this.hV = paramByte;
  }

  public String[] getFields() {
    return bF;
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("name"))
      return getName();
    if (paramString.equals("id"))
      return Byte.valueOf(this.hV);
    if (paramString.equals("style"))
      return "filter" + this.hV;
    if (paramString.equals("selected")) {
      return Boolean.valueOf(this.dBi);
    }
    return null;
  }

  private String getName() {
    return bU.fH().getString("landMark.type." + this.hV);
  }

  public byte bJ() {
    return this.hV;
  }

  public void fN(byte paramByte) {
    if (paramByte == this.hV) {
      return;
    }
    this.hV = paramByte;
    dLE.doY().a(this, new String[] { "name" });
  }

  public boolean p(dwn paramdwn) {
    return this.dBi;
  }

  public void setSelected(boolean paramBoolean) {
    if (paramBoolean == this.dBi) {
      return;
    }
    this.dBi = paramBoolean;
    dLE.doY().a(this, new String[] { "selected" });
  }
}