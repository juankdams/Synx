public enum ms
  implements ccI
{
  private byte hV;
  private String aKM;

  private ms(int arg3, String arg4)
  {
    int i;
    this.hV = ((byte)i);
    Object localObject;
    this.aKM = localObject;
  }

  public String bK() {
    return String.valueOf(this.hV);
  }

  public String bL() {
    return this.aKM;
  }

  public byte bJ() {
    return this.hV;
  }

  public static ms w(byte paramByte) {
    for (ms localms : values())
      if (localms.bJ() == paramByte)
        return localms;
    return null;
  }

  public String bN() {
    return null;
  }
}