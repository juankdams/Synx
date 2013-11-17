import java.util.ArrayList;

public class Pc extends cGj
{
  public static final String cgO = "text";
  public static final String RH = "iconUrl";
  public static final String cgP = "overIconsUrl";
  public final String[] bF = { "text", "iconUrl", "overIconsUrl" };
  private final ArrayList cgQ;
  private final String cgR;
  private final String hi;

  private Pc(dD paramdD, String paramString1, String paramString2, ArrayList paramArrayList)
  {
    this.cgQ = paramArrayList;
    this.cgR = paramString2;
    this.hi = paramString1;
  }

  public String getIconURL() {
    return this.cgR;
  }

  public String getText() {
    return this.hi;
  }

  public String[] getFields() {
    return null;
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("text")) {
      return this.hi;
    }
    if (paramString.equals("iconUrl")) {
      return this.cgR;
    }
    if (paramString.equals("overIconsUrl")) {
      return this.cgQ;
    }
    return null;
  }
}