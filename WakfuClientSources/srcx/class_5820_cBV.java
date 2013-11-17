import java.util.ArrayList;

public class cBV extends cHN
  implements dBv
{
  public static final String bC = "name";
  public static final String RH = "iconUrl";
  public static final String RI = "description";
  private int aSg;
  private String m_name;
  private String aLm;

  protected cBV(int paramInt, bZA parambZA, byte paramByte, ArrayList paramArrayList)
  {
    super(paramInt, parambZA, paramByte, paramArrayList);
  }

  public int oc() {
    return this.aSg;
  }

  public void iT(int paramInt) {
    this.aSg = paramInt;
  }

  public String getName() {
    return this.m_name;
  }

  public void setName(String paramString) {
    this.m_name = paramString;
  }

  public String getDescription() {
    return this.aLm;
  }

  public void setDescription(String paramString) {
    this.aLm = paramString;
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("name"))
      return this.m_name;
    if (paramString.equals("iconUrl"))
      return ay.bd().a("protectorBuffsIconsPath", "defaultIconPath", new Object[] { Integer.valueOf(this.aSg) });
    if (paramString.equals("description")) {
      return this.aLm;
    }

    return null;
  }

  public String[] getFields() {
    return null;
  }

  public void a(String paramString, Object paramObject) {
  }

  public void b(String paramString, Object paramObject) {
  }

  public void c(String paramString, Object paramObject) {
  }

  public boolean l(String paramString) {
    return false;
  }
}