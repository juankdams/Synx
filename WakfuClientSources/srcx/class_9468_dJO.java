public enum dJO
  implements ccI
{
  private final short aDx;
  public static final dJO[] lWi = { lVv, lWa, lWb, lWc, lWd, lWe, lWf, lWg };

  public static final dJO[] lWj = new dJO[0];

  private dJO(int arg3)
  {
    int j;
    this.aDx = bCO.go(j);
  }

  public static dJO eH(short paramShort)
  {
    for (dJO localdJO : values()) {
      if (localdJO.aDx == paramShort) {
        return localdJO;
      }
    }
    return null;
  }

  public short dja() {
    return this.aDx;
  }

  public String bN() {
    return null;
  }

  public String bK() {
    return String.valueOf(this.aDx);
  }

  public String bL() {
    return name();
  }
}