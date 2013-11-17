import java.util.ArrayList;
import java.util.Collections;

public class baK extends cGj
{
  public static final String brN = "island";
  public static final String brO = "links";
  private final int brP;
  private final ArrayList fiQ = new ArrayList();

  public baK(int paramInt) {
    this.brP = paramInt;
  }

  public void a(Of paramOf) {
    this.fiQ.add(paramOf);
    Collections.sort(this.fiQ, aLo.bEa);
  }

  public int bpl() {
    return this.brP;
  }

  public String[] getFields() {
    return null;
  }

  public Object getFieldValue(String paramString)
  {
    if (paramString.equals("island"))
      return bU.fH().b(77, this.brP, new Object[0]);
    if (paramString.equals("links")) {
      return this.fiQ;
    }
    return null;
  }
}