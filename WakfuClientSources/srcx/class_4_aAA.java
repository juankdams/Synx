public enum aAA
  implements ccI
{
  private final Lc dTs;
  private final String aKM;
  private final String bWr;

  private aAA(Lc paramString2, String arg4, String arg5)
  {
    this.dTs = paramString2;
    Object localObject1;
    this.aKM = localObject1;
    Object localObject2;
    this.bWr = localObject2;
  }

  public static aAA ly(int paramInt) {
    for (aAA localaAA : values()) {
      if (paramInt == localaAA.getId()) {
        return localaAA;
      }
    }

    return null;
  }

  public int getId() {
    return this.dTs.wx();
  }

  public String bK() {
    return Integer.toString(this.dTs.wx());
  }

  public String bL() {
    return this.aKM;
  }

  public String bN() {
    return this.bWr;
  }

  public cWT aMA() {
    return this.dTs.VA();
  }
}