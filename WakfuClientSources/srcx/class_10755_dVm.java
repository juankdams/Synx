public class dVm extends cGj
{
  public static final String NAME = "name";
  public static final String mud = "icon";
  public static final String mue = "mode";
  public final String[] bF = { "name", "icon", "mode" };
  private final bRN muf;

  public dVm(bRN parambRN)
  {
    this.muf = parambRN;
  }

  public String[] getFields() {
    return this.bF;
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("name"))
      return bU.fH().getString(this.muf.name());
    if (paramString.equals("mode"))
      return this.muf;
    if (paramString.equals("icon")) {
      return ay.bd().b(this.muf.cii);
    }
    return null;
  }

  public bRN dvo() {
    return this.muf;
  }
}