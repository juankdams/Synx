public enum aIm
  implements Kf, ccI
{
  private final byte aNc;
  private final String aKM;

  private aIm(byte arg3, String arg4)
  {
    byte b;
    this.aNc = b;
    Object localObject;
    this.aKM = localObject;
  }

  public String bK() {
    return String.valueOf(this.aNc);
  }

  public String bL() {
    return this.aKM;
  }

  public String bN() {
    return null;
  }

  public byte bJ() {
    return this.aNc;
  }

  public byte rQ() {
    return 4;
  }

  public static aIm mF(int paramInt) {
    for (aIm localaIm : values()) {
      if (localaIm.aNc == paramInt)
        return localaIm;
    }
    return null;
  }
}