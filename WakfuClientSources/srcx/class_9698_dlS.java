public enum dlS
{
  private final byte hV;
  private final String lju;

  private dlS(int arg3, String arg4)
  {
    int i;
    this.hV = bCO.gn(i);
    Object localObject;
    this.lju = localObject;
  }

  public byte bJ() {
    return this.hV;
  }

  public String cTv()
  {
    return this.lju;
  }

  public String fJ() {
    return ay.bd().a("currencyIconUrl", "defaultIconPath", new Object[] { Byte.valueOf(this.hV) });
  }

  public String getDescription()
  {
    return "";
  }
}