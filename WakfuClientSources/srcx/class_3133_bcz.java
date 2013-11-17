public enum bcz
{
  private final byte hV;
  private final short fmG;
  private final short fmH;

  private bcz(byte arg3, short arg4)
  {
    byte b;
    this.hV = b;
    short s;
    this.fmG = s;
    this.fmH = -1;
  }

  private bcz(byte paramShort2, short arg4, short arg5) {
    this.hV = paramShort2;
    short s1;
    this.fmG = s1;
    short s2;
    this.fmH = s2;
  }

  public byte bJ() {
    return this.hV;
  }

  public short bqH() {
    return this.fmG;
  }

  public static bcz bH(short paramShort) {
    bcz[] arrayOfbcz = values();
    for (int i = 0; i < arrayOfbcz.length; i++) {
      bcz localbcz = arrayOfbcz[i];
      if ((localbcz.fmG == paramShort) || (localbcz.fmH == paramShort))
        return localbcz;
    }
    return null;
  }

  public static bcz bI(short paramShort) {
    bcz[] arrayOfbcz = values();
    for (int i = 0; i < arrayOfbcz.length; i++) {
      bcz localbcz = arrayOfbcz[i];
      if (localbcz.hV == paramShort)
        return localbcz;
    }
    return null;
  }

  public boolean bqI() {
    switch (bzw.cKb[ordinal()]) {
    case 1:
    case 2:
    case 3:
      return true;
    }
    return false;
  }
}