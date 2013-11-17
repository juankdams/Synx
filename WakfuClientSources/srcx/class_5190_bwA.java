public enum bwA
  implements ccI
{
  private static final cSR ggV;
  private final int aw;
  private final int ggW;
  private final boolean ggX;
  private final String aLm;

  private bwA(int paramBoolean, int paramString, boolean arg5, String arg6)
  {
    this.aw = paramBoolean;
    this.ggW = paramString;
    boolean bool;
    this.ggX = bool;
    Object localObject;
    this.aLm = localObject;
  }

  public int getId() {
    return this.aw;
  }

  public int bEi() {
    return this.ggW;
  }

  public String getDescription() {
    return this.aLm;
  }

  public String bK() {
    return String.valueOf(this.aw);
  }

  public String bL() {
    return this.aLm;
  }

  public String bN() {
    return "multiplicateur x" + this.ggW;
  }

  public boolean bEj() {
    return this.ggX;
  }

  public static bwA rr(int paramInt) {
    return (bwA)ggV.get(paramInt);
  }

  static
  {
    ggV = new cSR();

    for (bwA localbwA : values())
      ggV.put(localbwA.getId(), localbwA);
  }
}