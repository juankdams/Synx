public enum aon
{
  private short aDx;
  private String dtk;

  private aon(short arg3, String arg4)
  {
    short s;
    this.aDx = s;
    Object localObject;
    this.dtk = localObject;
  }

  public short nc() {
    return this.aDx;
  }

  public String qa() {
    return this.dtk;
  }

  public static aon aG(short paramShort) {
    for (aon localaon : values()) {
      if (localaon.nc() == paramShort)
        return localaon;
    }
    return null;
  }
}