public enum akP
  implements ccI
{
  private final byte hV;
  private final String dlE;
  private final String dcI;

  private akP(byte paramString2, String arg4, String arg5)
  {
    this.hV = paramString2;
    Object localObject1;
    this.dlE = localObject1;
    Object localObject2;
    this.dcI = localObject2;
  }

  public static akP bb(byte paramByte) {
    for (akP localakP : values()) {
      if (localakP.hV == paramByte) {
        return localakP;
      }
    }

    return null;
  }

  public byte bJ() {
    return this.hV;
  }

  public String getStyle() {
    return this.dlE;
  }

  public String agf() {
    return this.dcI;
  }

  public String bK() {
    return String.valueOf(this.hV);
  }

  public String bL() {
    return name();
  }

  public String bN() {
    return null;
  }
}