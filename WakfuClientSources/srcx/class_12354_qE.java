public enum qE
{
  private final byte hV;

  private qE(byte arg3)
  {
    byte b;
    this.hV = b;
  }

  public byte bJ() {
    return this.hV;
  }

  public static qE z(byte paramByte) {
    for (qE localqE : values()) {
      if (localqE.hV == paramByte) {
        return localqE;
      }
    }
    return null;
  }
}