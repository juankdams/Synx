public class en extends cGj
{
  public static final String bC = "name";
  public static final String ayB = "checked";
  public static final String[] bF = { "name", "checked" };
  private final cnm ayC;
  private boolean ayD;

  public en(cnm paramcnm)
  {
    this.ayC = paramcnm;
  }

  public String[] getFields() {
    return bF;
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("name"))
      return bU.fH().getString(this.ayC.name());
    if (paramString.equals("checked")) {
      return Boolean.valueOf(this.ayD);
    }
    return null;
  }

  public void setChecked(boolean paramBoolean) {
    this.ayD = paramBoolean;
    dLE.doY().a(this, new String[] { "checked" });
  }

  public boolean isChecked() {
    return this.ayD;
  }

  public cnm lj() {
    return this.ayC;
  }
}