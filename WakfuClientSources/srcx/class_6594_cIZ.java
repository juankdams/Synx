public enum cIZ
{
  private static final dPx iHe;
  private byte hV;

  private cIZ(byte arg3)
  {
    byte b;
    this.hV = b;
  }

  public byte bJ() {
    return this.hV;
  }

  public static cIZ el(int paramInt1, int paramInt2) {
    if (paramInt2 == 0)
      return iHa;
    if (paramInt1 == 0)
      return iHb;
    if (paramInt1 == paramInt2) {
      return iHd;
    }
    return iHc;
  }

  public static cIZ em(byte paramByte) {
    return (cIZ)iHe.bf(paramByte);
  }

  static
  {
    iHe = new dPx();

    for (cIZ localcIZ : values())
      iHe.c(localcIZ.bJ(), localcIZ);
  }
}