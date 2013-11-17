public class Of extends cGj
  implements cNg
{
  public static final String bC = "name";
  public static final String bsQ = "price";
  public static final String ceY = "isActivated";
  public static final String ceZ = "isEnabled";
  public static final String[] bF = { "name", "price" };
  private final long cfa;
  private final bVn cfb;

  public Of(bVn parambVn, long paramLong)
  {
    this.cfb = parambVn;
    this.cfa = paramLong;
  }

  public String[] getFields() {
    return bF;
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("name"))
      return getName();
    if (paramString.equals("price"))
      return Integer.valueOf(qW());
    if (paramString.equals("isEnabled"))
      return Boolean.valueOf(isEnabled());
    if (paramString.equals("isActivated")) {
      return Boolean.valueOf(isActive());
    }
    return null;
  }

  public long getId() {
    return this.cfb.cbe() == this.cfa ? this.cfb.cbd() : this.cfb.cbe();
  }

  public String getName() {
    return bU.fH().b(36, (int)getId(), new Object[0]);
  }

  public boolean isEnabled() {
    return true;
  }

  public boolean isActive()
  {
    return true;
  }

  public int qW() {
    return this.cfb.qW();
  }
}