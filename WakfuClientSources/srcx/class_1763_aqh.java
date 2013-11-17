public enum aqh
  implements ccI
{
  private static final Xg dxJ;
  private final int aw;
  private final String aKM;
  private final String bWr;
  private final int dxK;

  private aqh(int paramString1, int paramString2, String arg5, String arg6)
  {
    this.aw = paramString1;
    this.dxK = paramString2;
    Object localObject1;
    this.aKM = localObject1;
    Object localObject2;
    this.bWr = localObject2;
  }

  public String bK() {
    return Integer.toString(this.aw);
  }

  public String bL() {
    return this.aKM;
  }

  public String bN() {
    return this.bWr;
  }

  public int getId() {
    return this.aw;
  }

  public int aCn() {
    return this.dxK;
  }

  public static aqh jw(int paramInt) {
    return (aqh)dxJ.get(paramInt);
  }

  static
  {
    dxJ = new Xg();

    for (aqh localaqh : values())
      dxJ.put(localaqh.getId(), localaqh);
  }
}