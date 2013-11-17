public enum avB
  implements dSc
{
  private byte hV;
  private int aAq;
  private int aAr;
  private int aAs;
  private int aAt;
  private int aAv;

  private avB(int paramInt3, int paramInt4, int paramInt5, int paramInt6, int arg7, int arg8)
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
    return 1;
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
    return true;
  }

  public boolean isNegative() {
    return false;
  }

  public int lD() {
    return -1;
  }

  public static avB b(Byte paramByte) {
    for (avB localavB : values()) {
      if (localavB.bJ() == paramByte.byteValue())
        return localavB;
    }
    return null;
  }
}