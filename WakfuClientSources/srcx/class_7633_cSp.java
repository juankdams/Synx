public enum cSp
  implements ccI
{
  private byte hV;
  private String bWr;

  private cSp(byte arg3, String arg4)
  {
    byte b;
    this.hV = b;
    Object localObject;
    this.bWr = localObject;
  }

  public String bK() {
    return Byte.toString(this.hV);
  }

  public String bL() {
    return name();
  }

  public String bN() {
    return this.bWr;
  }

  public byte bJ() {
    return this.hV;
  }

  public static cSp eE(byte paramByte) {
    cSp[] arrayOfcSp = values();
    for (int i = 0; i < arrayOfcSp.length; i++) {
      cSp localcSp = arrayOfcSp[i];
      if (localcSp.hV == paramByte)
        return localcSp;
    }
    return null;
  }
}