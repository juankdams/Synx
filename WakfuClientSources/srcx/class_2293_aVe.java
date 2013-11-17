public enum aVe
  implements ccI
{
  private byte hV;
  private String bWr;

  private aVe(byte arg3, String arg4)
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

  public static aVe cu(byte paramByte) {
    aVe[] arrayOfaVe = values();
    for (int i = 0; i < arrayOfaVe.length; i++) {
      aVe localaVe = arrayOfaVe[i];
      if (localaVe.hV == paramByte)
        return localaVe;
    }
    return null;
  }
}