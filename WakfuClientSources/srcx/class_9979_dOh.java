public enum dOh
{
  private final byte hV;
  private boolean mfS;

  private dOh(byte arg3, boolean arg4)
  {
    byte b;
    this.hV = b;
    boolean bool;
    this.mfS = bool;
  }

  public boolean dqi() {
    return this.mfS;
  }

  public byte bJ() {
    return this.hV;
  }

  public static dOh fS(byte paramByte) {
    for (dOh localdOh : values())
      if (localdOh.hV == paramByte)
        return localdOh;
    return mfP;
  }
}