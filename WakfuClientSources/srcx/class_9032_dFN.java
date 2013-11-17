public enum dFN
  implements ccI
{
  private final byte hV;

  private dFN(byte arg3)
  {
    byte b;
    this.hV = b;
  }

  public byte bJ() {
    return this.hV;
  }

  public static dFN fI(byte paramByte) {
    dFN[] arrayOfdFN = values();
    for (int i = 0; i < arrayOfdFN.length; i++) {
      dFN localdFN = arrayOfdFN[i];
      if (localdFN.hV == paramByte)
        return localdFN;
    }
    return null;
  }

  public String toString()
  {
    return name() + " (" + this.hV + ")";
  }

  public String bK()
  {
    return String.valueOf(this.hV);
  }

  public String bL() {
    return name();
  }

  public String bN() {
    return null;
  }
}