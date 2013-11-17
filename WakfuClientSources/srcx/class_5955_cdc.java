public enum cdc
{
  private final byte hV;

  private cdc(byte arg3)
  {
    byte b;
    this.hV = b;
  }

  public byte bJ() {
    return this.hV;
  }

  public static cdc dD(byte paramByte) {
    for (cdc localcdc : values()) {
      if (localcdc.hV == paramByte) {
        return localcdc;
      }
    }
    return null;
  }
}