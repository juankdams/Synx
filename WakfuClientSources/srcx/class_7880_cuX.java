public enum cuX
{
  private final byte hV;

  private cuX(byte arg3)
  {
    byte b;
    this.hV = b;
  }

  public byte bJ()
  {
    return this.hV;
  }

  public static cuX dZ(byte paramByte) {
    for (cuX localcuX : values()) {
      if (paramByte == localcuX.hV) {
        return localcuX;
      }
    }
    return null;
  }
}