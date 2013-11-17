public enum cfY
  implements Kf, ccI
{
  private final byte aNc;
  private final String aKM;

  private cfY(int arg3, String arg4)
  {
    Object localObject;
    this.aKM = localObject;
    int i;
    this.aNc = ((byte)i);
  }

  public byte bJ() {
    return this.aNc;
  }

  public byte rQ() {
    return 1;
  }

  public static cfY vg(int paramInt) {
    for (cfY localcfY : values()) {
      if (localcfY.bJ() == paramInt) {
        return localcfY;
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