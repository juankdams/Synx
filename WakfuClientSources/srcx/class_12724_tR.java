public enum tR
  implements cRA
{
  private final short bgp;
  private final dfN bgq;
  private final aYk bgr;

  private tR(short arg3, dfN arg4)
  {
    this(s, localdfN, aYk.fdN);
  }

  private tR(short paramaYk, dfN arg4, aYk arg5) {
    this.bgp = paramaYk;
    Object localObject1;
    this.bgq = localObject1;
    Object localObject2;
    this.bgr = localObject2;
  }

  public String bK() {
    return Short.toString(this.bgp);
  }

  public String bL() {
    return toString();
  }

  public short Cr() {
    return this.bgp;
  }

  public aYk Cs() {
    return this.bgr;
  }

  public dfN Ct() {
    return this.bgq;
  }

  public static tR v(short paramShort)
  {
    for (tR localtR : values()) {
      if (localtR.bgp == paramShort) {
        return localtR;
      }
    }
    return null;
  }

  public String bN() {
    return bL();
  }
}