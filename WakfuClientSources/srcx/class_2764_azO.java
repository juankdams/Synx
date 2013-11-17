public enum azO
  implements ccI
{
  public final byte hV;
  public final String dRV;

  private azO(int arg3, String arg4)
  {
    int i;
    this.hV = ((byte)i);
    Object localObject;
    this.dRV = localObject;
  }

  public byte bJ() {
    return this.hV;
  }

  public static byte aLH() {
    int i = -1;
    for (azO localazO : values()) {
      if (localazO.hV > i) {
        i = localazO.hV;
      }
    }
    return (byte)(i + 1);
  }

  public String bK() {
    return toString();
  }

  public String bL() {
    return toString();
  }

  public static azO bu(byte paramByte)
  {
    for (azO localazO : values()) {
      if (localazO.hV == paramByte) {
        return localazO;
      }
    }
    return null;
  }

  public String bN() {
    return bL();
  }
}