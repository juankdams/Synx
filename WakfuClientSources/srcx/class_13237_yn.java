import java.util.ArrayList;

public class yn extends cGj
{
  public static final String brN = "island";
  public static final String brO = "links";
  private final int brP;
  private final ArrayList brQ = new ArrayList();

  public yn(int paramInt) {
    this.brP = paramInt;
  }

  public void a(dAs paramdAs) {
    this.brQ.add(paramdAs);
  }

  public String[] getFields() {
    return null;
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("island"))
      return Hd();
    if (paramString.equals("links")) {
      return this.brQ;
    }
    return null;
  }

  public String Hd() {
    return bU.fH().b(77, this.brP, new Object[0]);
  }

  public ArrayList He() {
    return this.brQ;
  }
}