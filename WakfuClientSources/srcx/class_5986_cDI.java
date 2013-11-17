public enum cDI
  implements ccI
{
  private final byte hV;

  private cDI(int arg3)
  {
    int j;
    this.hV = ((byte)j);
  }

  public byte bJ() {
    return this.hV;
  }

  public static cDI ef(byte paramByte) {
    for (cDI localcDI : values()) {
      if (localcDI.hV == paramByte)
        return localcDI;
    }
    return null;
  }

  public String bK() {
    return Byte.toString(bJ());
  }

  public String bL() {
    return name();
  }

  public String bN() {
    return name();
  }
}