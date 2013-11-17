import java.util.Locale;

public class XO extends cGj
{
  public static final String TEXT = "text";
  public static final String ciu = "iconUrl";
  private cFI cIj;

  private XO(cFI paramcFI)
  {
    this.cIj = paramcFI;
  }

  public String[] getFields() {
    return null;
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("iconUrl"))
      return bU.a(this.cIj);
    if (paramString.equals("text")) {
      return this.cIj.cAZ().getLanguage().toUpperCase();
    }
    return null;
  }

  public cFI ajJ() {
    return this.cIj;
  }
}