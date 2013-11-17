public enum cAT
  implements ccI
{
  private final short aDx;
  private final String aKM;

  private cAT(short arg3, String arg4)
  {
    short s;
    this.aDx = s;
    Object localObject;
    this.aKM = localObject;
  }

  public int getId() {
    return this.aDx;
  }

  public String bK() {
    return Integer.toString(this.aDx);
  }

  public String bL() {
    return this.aKM;
  }

  public String bN() {
    return null;
  }

  public static cAT dr(short paramShort) {
    for (cAT localcAT : values())
      if (localcAT.getId() == paramShort)
        return localcAT;
    return null;
  }
}