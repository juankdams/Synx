public enum bbG
  implements ccI
{
  public final byte hV;
  private final String aKM;

  private bbG(byte arg3, String arg4)
  {
    byte b;
    this.hV = b;
    Object localObject;
    this.aKM = localObject;
  }

  public String bK() {
    return Integer.toString(this.hV);
  }

  public String bL() {
    return this.aKM;
  }

  public String bN() {
    return this.aKM;
  }

  public static bbG cD(byte paramByte) {
    for (bbG localbbG : values()) {
      if (localbbG.hV == paramByte) {
        return localbbG;
      }
    }
    return null;
  }
}