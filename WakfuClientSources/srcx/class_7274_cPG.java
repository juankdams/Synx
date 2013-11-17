public class cPG
  implements dBv
{
  private final String m_name;
  private boolean bur;
  private bNa bPo;
  private final int aw;
  public static final String bC = "name";
  public static final String eMS = "enabled";
  public static final String eok = "color";
  public final String[] bF = { "name", "enabled", "color" };

  public cPG(String paramString, boolean paramBoolean, bNa parambNa, int paramInt)
  {
    this.m_name = paramString;
    this.bur = paramBoolean;
    this.bPo = parambNa;
    this.aw = paramInt;
  }

  public String[] getFields() {
    return this.bF;
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("name"))
      return this.m_name;
    if (paramString.equals("enabled"))
      return Boolean.valueOf(this.bur);
    if (paramString.equals("color")) {
      return this.bPo;
    }
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

  public bNa getColor() {
    return this.bPo;
  }

  public String getName() {
    return this.m_name;
  }

  public int getId() {
    return this.aw;
  }
}