import java.util.ArrayList;
import java.util.Collections;

public class TL extends cGj
{
  private aMY cwW;
  public static final String cwX = "entries";
  public static final String[] bF = { "entries" };
  private ArrayList cwY;

  public TL(aMY paramaMY)
  {
    this.cwW = paramaMY;
    this.cwY = new ArrayList();
    this.cwW.F(new aZz(this));
    this.cwW.G(new dCd(this));
    Collections.sort(this.cwY);
  }

  public String[] getFields() {
    return bF;
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("entries"))
      return this.cwY;
    return null;
  }
}