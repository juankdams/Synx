public enum bZb
  implements ccI
{
  private final int aw;
  private final String aKM;
  private final String bWr;

  private bZb(int paramString2, String arg4, String arg5)
  {
    this.aw = paramString2;
    Object localObject1;
    this.aKM = localObject1;
    Object localObject2;
    this.bWr = localObject2;
  }

  public static bZb up(int paramInt) {
    for (bZb localbZb : values()) {
      if (localbZb.aw == paramInt)
        return localbZb;
    }
    return hpp;
  }

  public String bK()
  {
    return Integer.toString(this.aw);
  }

  public String bL() {
    return this.aKM;
  }

  public String bN() {
    return this.bWr;
  }
}