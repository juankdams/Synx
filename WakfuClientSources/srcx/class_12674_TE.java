public enum TE
{
  private String aLm;
  private byte hV;
  private byte bkN;

  public static TE at(byte paramByte)
  {
    for (TE localTE : values()) {
      if (localTE.hV == paramByte) {
        return localTE;
      }
    }

    return null;
  }

  private TE(byte paramByte2, String arg4, byte arg5)
  {
    Object localObject;
    this.aLm = localObject;
    this.hV = paramByte2;
    byte b;
    this.bkN = b;
  }

  public String getDescription() {
    return this.aLm;
  }

  public byte bJ() {
    return this.hV;
  }

  public byte ET() {
    return this.bkN;
  }

  public String toString() {
    return this.aLm;
  }
}