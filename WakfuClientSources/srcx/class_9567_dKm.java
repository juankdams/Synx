public enum dKm
  implements Kf, ccI
{
  private byte aNc;
  private String aKM;
  private cfY lXX = null;

  private dKm(int arg3, String arg4)
  {
    int i;
    this.aNc = ((byte)i);
    Object localObject;
    this.aKM = localObject;
  }

  private dKm(int paramcfY, String arg4, cfY arg5) {
    this.aNc = ((byte)paramcfY);
    Object localObject1;
    this.aKM = localObject1;
    Object localObject2;
    this.lXX = localObject2;
  }

  public byte rQ() {
    return 0;
  }

  public byte bJ() {
    return this.aNc;
  }

  public cfY djm() {
    return this.lXX;
  }

  public static dKm CM(int paramInt) {
    for (dKm localdKm : values()) {
      if (localdKm.bJ() == paramInt) {
        return localdKm;
      }
    }
    return null;
  }

  public String bK() {
    return String.valueOf(this.aNc);
  }

  public String bL() {
    return this.aKM;
  }

  public String bN() {
    return null;
  }
}