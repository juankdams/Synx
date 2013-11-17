public enum Ka
  implements ccI
{
  private static final cSR bWo;
  public final byte bUy;
  public final byte bWp;
  private final int bWq;
  private final String bWr;

  private Ka(byte paramString, int arg4, String arg5)
  {
    this.bUy = paramString;
    this.bWp = bCO.gn(1 << paramString);
    int i;
    this.bWq = i;
    Object localObject;
    this.bWr = localObject;
  }

  public int UJ() {
    return this.bWq;
  }

  public String bK() {
    return Integer.toString(this.bWq);
  }

  public String bL() {
    return name();
  }

  public String bN() {
    return this.bWr;
  }

  public static Ka fv(int paramInt) {
    return (Ka)bWo.get(paramInt);
  }

  public static Ka UK() {
    return bWg;
  }

  static
  {
    bWo = new cSR();

    for (Ka localKa : values())
      bWo.put(localKa.bWq, localKa);
  }
}