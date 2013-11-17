public enum ajD
  implements ccI
{
  private final short aDx;
  private final String aKM;
  private final cFI cIj;

  private ajD(short paramcFI, String arg4, cFI arg5)
  {
    this.aDx = paramcFI;
    Object localObject1;
    this.aKM = localObject1;
    Object localObject2;
    this.cIj = localObject2;
  }

  public short nc() {
    return this.aDx;
  }

  public String bK() {
    return Integer.toString(this.aDx);
  }

  public String bL() {
    return this.aKM;
  }

  public cFI ajJ() {
    return this.cIj;
  }

  public String bN() {
    return null;
  }

  public static ajD aD(short paramShort) {
    for (ajD localajD : values())
      if (localajD.nc() == paramShort)
        return localajD;
    return null;
  }

  public static ajD c(cFI paramcFI) {
    for (ajD localajD : values())
      if (localajD.ajJ() == paramcFI)
        return localajD;
    return diX;
  }
}