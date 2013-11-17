public enum dzm
{
  private final byte hV;

  private dzm(byte arg3)
  {
    byte b;
    this.hV = b;
  }

  public byte bJ() {
    return this.hV;
  }

  public static dzm fF(byte paramByte) {
    for (dzm localdzm : values()) {
      if (localdzm.bJ() == paramByte) {
        return localdzm;
      }
    }
    return lFI;
  }
}