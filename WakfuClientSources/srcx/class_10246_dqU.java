public enum dqU
  implements ccI
{
  private final byte hV;
  private final String aKM;

  private dqU(int arg3, String arg4)
  {
    int i;
    this.hV = ((byte)i);
    Object localObject;
    this.aKM = localObject;
  }

  public byte bJ() {
    return this.hV;
  }

  public String bK() {
    return String.valueOf(this.hV);
  }

  public String bL() {
    return this.aKM;
  }

  public String bN() {
    return null;
  }

  public static dqU fx(byte paramByte) {
    dqU[] arrayOfdqU = values();
    for (int i = 0; i < arrayOfdqU.length; i++) {
      dqU localdqU = arrayOfdqU[i];
      if (localdqU.hV == paramByte)
        return localdqU;
    }
    return null;
  }
}