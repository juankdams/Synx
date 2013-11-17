public enum kc
  implements Kf
{
  private byte aNc;

  private kc(int arg3)
  {
    int j;
    this.aNc = ((byte)j);
  }

  public byte bJ() {
    return this.aNc;
  }

  public byte rQ() {
    return 2;
  }

  public static kc bj(int paramInt) {
    for (kc localkc : values()) {
      if (localkc.bJ() == paramInt)
        return localkc;
    }
    return null;
  }
}