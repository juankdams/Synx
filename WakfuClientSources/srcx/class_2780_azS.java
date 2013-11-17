public enum azS
{
  private final bHk dSd;
  private final byte hV;
  private final String aLm;

  private azS(byte parambHk, String arg4, bHk arg5)
  {
    Object localObject2;
    this.dSd = localObject2;
    Object localObject1;
    this.aLm = localObject1;
    this.hV = parambHk;
  }

  public static azS bv(byte paramByte) {
    for (azS localazS : values()) {
      if (localazS.bJ() == paramByte) {
        return localazS;
      }
    }

    return null;
  }

  public byte bJ() {
    return this.hV;
  }

  public String getDescription() {
    return this.aLm;
  }

  public ML ayR() {
    return this.dSd.ayR();
  }

  public String toString() {
    return this.aLm;
  }
}