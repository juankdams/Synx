public enum bMn
  implements ccI
{
  private final byte bkM;

  public static bMn dt(byte paramByte)
  {
    for (bMn localbMn : values()) {
      if (localbMn.bkM == paramByte) {
        return localbMn;
      }
    }
    return gPH;
  }

  private bMn(byte arg3)
  {
    byte b;
    this.bkM = b;
  }

  public String bK() {
    return Byte.toString(this.bkM);
  }

  public String bL()
  {
    return toString();
  }

  public String bN() {
    return null;
  }
}