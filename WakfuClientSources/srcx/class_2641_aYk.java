public enum aYk
  implements ccI
{
  private final byte bkM;

  private aYk(byte arg3)
  {
    byte b;
    this.bkM = b;
  }

  public byte getType() {
    return this.bkM;
  }

  public static aYk cx(byte paramByte)
  {
    for (aYk localaYk : values()) {
      if (localaYk.bkM == paramByte) {
        return localaYk;
      }
    }
    return null;
  }

  public String bK() {
    return String.valueOf(this.bkM);
  }

  public String bL() {
    return name();
  }

  public String bN() {
    return null;
  }
}