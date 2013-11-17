public enum don
  implements dSc
{
  private byte hV;
  private int aAq;
  private int aAr;
  private int aAs;
  private int aAt;
  private int aAv;

  private don(int paramInt3, int paramInt4, int paramInt5, int paramInt6, int arg7, int arg8)
  {
    this.hV = ((byte)paramInt3);
    this.aAq = paramInt4;
    this.aAr = paramInt5;
    this.aAs = paramInt6;
    int i;
    this.aAt = i;
    int j;
    this.aAv = j;
  }

  public byte bJ() {
    return this.hV;
  }

  public byte ln() {
    return 2;
  }

  public int lo() {
    return this.aAq;
  }

  public int lp() {
    return this.aAr;
  }

  public int lq() {
    return this.aAs;
  }

  public int lr() {
    return this.aAt;
  }

  public int getDefaultValue() {
    return this.aAv;
  }

  public boolean isExpandable() {
    return false;
  }

  public boolean isNegative() {
    return false;
  }

  public int lD() {
    return -1;
  }

  public static don c(Byte paramByte) {
    for (don localdon : values()) {
      if (localdon.bJ() == paramByte.byteValue())
        return localdon;
    }
    return null;
  }
}