public enum cZR
  implements ccI
{
  private byte hV;
  private String aGE;

  private cZR(byte arg3, String arg4)
  {
    byte b;
    this.hV = b;
    Object localObject;
    this.aGE = localObject;
  }

  public String bK() {
    return String.valueOf(this.hV);
  }

  public String bL() {
    return this.aGE;
  }

  public String bN() {
    return null;
  }

  public static cZR eO(byte paramByte) {
    for (cZR localcZR : values()) {
      if (localcZR.hV == paramByte) {
        return localcZR;
      }
    }

    return null;
  }
}