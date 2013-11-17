public enum ajP
{
  private final byte hV;

  private ajP(byte arg3)
  {
    byte b;
    this.hV = b;
  }

  public byte bJ() {
    return this.hV;
  }

  public static ajP ba(byte paramByte) {
    for (ajP localajP : values()) {
      if (localajP.hV == paramByte) {
        return localajP;
      }
    }
    return null;
  }
}