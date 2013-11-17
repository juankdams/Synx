public enum aWQ
{
  private static final dPx fch;
  private final byte hV;

  private aWQ(byte arg3)
  {
    byte b;
    this.hV = b;
  }

  public byte bJ() {
    return this.hV;
  }

  public static aWQ cv(byte paramByte) {
    return (aWQ)fch.bf(paramByte);
  }

  static
  {
    fch = new dPx();

    for (aWQ localaWQ : values())
      fch.c(localaWQ.bJ(), localaWQ);
  }
}