class cvm extends cGj
{
  public static final String bHJ = "id";
  public static final String bC = "name";
  public static final String ifW = "granted";
  private final long aTz;
  private final String m_name;
  private final String[] bF = { "id", "name", "granted" };

  private cvm(aui paramaui, dym paramdym)
  {
    this.m_name = paramdym.getName();
    this.aTz = paramdym.getId();
  }

  public String[] getFields()
  {
    return this.bF;
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("name"))
      return this.m_name;
    if (paramString.equals("id"))
      return Long.valueOf(this.aTz);
    if (paramString.equals("granted")) {
      return Boolean.valueOf(aui.b(this.ifX).hN(this.aTz).a(Ka.fv(aui.a(this.ifX))));
    }
    return null;
  }

  public void cte() {
    dLE.doY().a(this, new String[] { "granted" });
  }
}