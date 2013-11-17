public enum aGX
  implements ccI
{
  private byte hV;
  private String bWr;

  private aGX(byte arg3, String arg4)
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

  public static aGX bJ(byte paramByte) {
    aGX[] arrayOfaGX = values();
    for (int i = 0; i < arrayOfaGX.length; i++) {
      aGX localaGX = arrayOfaGX[i];
      if (localaGX.hV == paramByte)
        return localaGX;
    }
    return null;
  }
}