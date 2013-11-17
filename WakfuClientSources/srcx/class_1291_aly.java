public enum aly
  implements ccI
{
  private static final alz dmq;
  private final byte hV;

  private aly(byte arg3)
  {
    byte b;
    this.hV = b;
  }

  public byte bJ() {
    return this.hV;
  }

  public String bK() {
    return String.valueOf(this.hV);
  }

  public String bL() {
    return toString();
  }

  public String bN() {
    return toString();
  }

  public static aly bd(byte paramByte) {
    return (aly)dmq.bf(paramByte);
  }

  static
  {
    dmq = new alz();

    for (aly localaly : values())
      dmq.a(localaly.hV, localaly);
  }
}