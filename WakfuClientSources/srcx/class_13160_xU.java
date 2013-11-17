public enum xU
{
  private byte hV;

  private xU(byte arg3)
  {
    byte b;
    this.hV = b;
  }

  public String fJ() {
    try {
      return String.format(ay.bd().getString("windForceIconsPath"), new Object[] { Integer.valueOf(ordinal()) }); } catch (bdh localbdh) {
    }
    return null;
  }

  public byte bJ()
  {
    return this.hV;
  }
}