public enum jn
  implements ccI
{
  private final byte hV;
  private final String aKM;

  private jn(byte arg3, String arg4)
  {
    byte b;
    this.hV = b;
    Object localObject;
    this.aKM = localObject;
  }

  public String bK() {
    return String.valueOf(this.hV);
  }

  public String bL() {
    return this.aKM;
  }

  public String bN() {
    return null;
  }

  public static jn r(byte paramByte) {
    for (jn localjn : values()) {
      if (localjn.hV == paramByte) {
        return localjn;
      }
    }
    return null;
  }
}