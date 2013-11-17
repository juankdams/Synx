public enum aRQ
  implements ccI
{
  private final byte hV;

  private aRQ(byte arg3)
  {
    byte b;
    this.hV = b;
  }

  public byte bJ() {
    return this.hV;
  }

  public static aRQ cq(byte paramByte) {
    for (aRQ localaRQ : values()) {
      if (localaRQ.hV == paramByte) {
        return localaRQ;
      }
    }
    return null;
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