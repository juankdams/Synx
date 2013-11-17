public enum aFp
  implements dBv
{
  private static final String NAME = "name";
  private final byte hV;

  private aFp(byte arg3)
  {
    byte b;
    this.hV = b;
  }

  public byte bJ()
  {
    return this.hV;
  }

  public static aFp bH(byte paramByte) {
    for (aFp localaFp : values()) {
      if (localaFp.hV == paramByte) {
        return localaFp;
      }
    }
    return null;
  }

  public String[] getFields()
  {
    return null;
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("name")) {
      return bU.fH().getString("options.graphicalPresetsLevel." + this.hV);
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
}