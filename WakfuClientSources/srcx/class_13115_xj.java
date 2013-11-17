public enum xj
  implements aqm, ccI
{
  private final int aWH;
  private final String aKM;
  private final dJC bpC;

  private xj(int paramdJC, String arg4, dJC arg5)
  {
    this.aWH = paramdJC;
    Object localObject1;
    this.aKM = localObject1;
    Object localObject2;
    this.bpC = localObject2;
  }

  public int xj() {
    return this.aWH;
  }

  public String bK() {
    return this.aKM;
  }

  public String bL() {
    return this.aKM;
  }

  public qM aF() {
    return this.bpC;
  }

  public static xj dA(int paramInt) {
    for (xj localxj : values()) {
      if (localxj.xj() == paramInt) {
        return localxj;
      }
    }
    return null;
  }

  public String bN() {
    return null;
  }
}