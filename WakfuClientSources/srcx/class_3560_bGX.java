public enum bGX
  implements ccI
{
  private final int aw;
  private final String aKM;
  private final String bWr;
  private final ga gEe;

  private bGX(int paramString2, String paramga, String arg5, ga arg6)
  {
    this.aw = paramString2;
    this.aKM = paramga;
    Object localObject1;
    this.bWr = localObject1;
    Object localObject2;
    this.gEe = localObject2;
  }

  public static bGX sU(int paramInt) {
    for (bGX localbGX : values()) {
      if (localbGX.aw == paramInt)
        return localbGX;
    }
    return gEa;
  }

  public float bOE()
  {
    return this.gEe.aDu;
  }

  public float bOF()
  {
    return this.gEe.aDv;
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
}