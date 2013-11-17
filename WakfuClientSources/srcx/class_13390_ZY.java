public enum ZY
  implements ccI
{
  private final byte bkM;

  public static ZY aC(byte paramByte)
  {
    for (ZY localZY : values()) {
      if (localZY.bkM == paramByte) {
        return localZY;
      }
    }
    return cMO;
  }

  private ZY(byte arg3)
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