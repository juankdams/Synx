public enum anz
  implements ccI
{
  private final byte drg;

  private anz(byte arg3)
  {
    byte b;
    this.drg = b;
  }

  public byte azZ() {
    return this.drg;
  }

  public String bK()
  {
    return String.valueOf(this.drg);
  }

  public String bL() {
    return name();
  }

  public String bN() {
    return null;
  }

  public static anz bh(byte paramByte) {
    for (anz localanz : values()) {
      if (localanz.drg == paramByte) {
        return localanz;
      }
    }
    return null;
  }
}