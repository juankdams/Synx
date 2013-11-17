import java.util.ArrayList;

public class mt extends cGj
{
  public static final String NAME = "name";
  public static final String OPENED = "opened";
  public static final String aQD = "bonuses";
  private boolean aGX = false;
  private final ArrayList aQE;
  private final int aQF;

  public mt(int paramInt, ArrayList paramArrayList)
  {
    this.aQF = paramInt;
    this.aQE = paramArrayList;
    this.aGX = (paramInt == 1);
  }

  public int getLevel() {
    return this.aQF;
  }

  public String[] getFields() {
    return new String[0];
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("name")) {
      return bU.fH().getString("levelParam", new Object[] { Integer.valueOf(this.aQF) });
    }
    if (paramString.equals("opened")) {
      return Boolean.valueOf(this.aGX);
    }
    if (paramString.equals("bonuses")) {
      return this.aQE;
    }
    return null;
  }

  public void ub() {
    this.aGX = (!this.aGX);
    dLE.doY().a(this, new String[] { "opened" });
  }
}