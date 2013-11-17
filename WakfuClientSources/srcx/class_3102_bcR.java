public enum bcR
  implements ccI
{
  private final String aKM;
  private final int aWH;
  private final cOB fne;

  private bcR(int paramcOB, String arg4, cOB arg5)
  {
    this.aWH = paramcOB;
    Object localObject1;
    this.aKM = localObject1;
    Object localObject2;
    this.fne = localObject2;
  }

  public cOB bqS() {
    return this.fne;
  }

  public String bK() {
    return Integer.valueOf(this.aWH).toString();
  }

  public String bL() {
    return this.aKM;
  }

  public int xj() {
    return this.aWH;
  }

  public static bcR oU(int paramInt) {
    bcR[] arrayOfbcR1 = values();
    for (bcR localbcR : arrayOfbcR1) {
      if (localbcR.xj() == paramInt) {
        return localbcR;
      }
    }
    return null;
  }

  public String bN() {
    return null;
  }
}