public class auG extends cGj
{
  public static final String ciu = "iconUrl";
  public static final String NAME = "name";
  public static final String aLh = "description";
  public static final String dHB = "size";
  private final dED dHC;
  private int m_size;

  public auG(dED paramdED)
  {
    this.dHC = paramdED;
    this.m_size = 0;
  }

  public String[] getFields() {
    return null;
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("name"))
      return bU.fH().b(130, this.dHC.dge(), new Object[0]);
    if (paramString.equals("description"))
      return bU.fH().b(132, this.dHC.dge(), new Object[0]);
    if (paramString.equals("iconUrl"))
      return ay.bd().a("krosmoz.figureIconsPath", "defaultIconPath", new Object[] { Integer.valueOf(this.dHC.dge()) });
    if (paramString.equals("size")) {
      return Integer.valueOf(this.m_size);
    }

    return null;
  }

  public dED aGR() {
    return this.dHC;
  }

  public void reset() {
    setSize(0);
  }

  void aGS() {
    setSize(this.m_size + 1);
  }

  void aGT() {
    setSize(this.m_size - 1);
  }

  void setSize(int paramInt) {
    this.m_size = paramInt;
    dLE.doY().a(this, new String[] { "size" });
  }
}