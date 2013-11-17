public enum bIg
{
  private byte hV;
  private static final int gHr = 3;

  private bIg(byte arg3)
  {
    byte b;
    this.hV = b;
  }

  public byte bJ() {
    return this.hV;
  }

  public static bIg dp(byte paramByte) {
    for (bIg localbIg : values()) {
      if (localbIg.hV == paramByte)
        return localbIg;
    }
    return null;
  }

  public static bIg sY(int paramInt) {
    bIg[] arrayOfbIg = values();
    if ((arrayOfbIg.length < paramInt) || (paramInt >= 3))
      return null;
    return arrayOfbIg[paramInt];
  }

  public static bIg sZ(int paramInt) {
    bIg[] arrayOfbIg = values();
    int i = paramInt + 3;
    if ((arrayOfbIg.length < i) || (i < 3))
      return null;
    return arrayOfbIg[i];
  }

  public boolean fM() {
    return ordinal() < 3;
  }
}