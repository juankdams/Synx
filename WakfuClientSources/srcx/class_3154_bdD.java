public enum bdD
  implements ccI
{
  private final short aDx;
  private final String aKM;
  private final boolean fpC;
  private final int fpD;
  private final int fpE;
  private final int fpF;
  private final int fpG;

  private bdD(short paramBoolean, String paramInt1, boolean paramInt2, int paramInt3, int paramInt4, int arg8, int arg9)
  {
    this.aDx = paramBoolean;
    this.fpC = paramInt2;
    this.aKM = (paramInt1 + (this.fpC ? " (double)" : ""));
    this.fpD = paramInt4;
    this.fpE = paramInt3;
    int i;
    this.fpF = i;
    int j;
    this.fpG = j;
  }

  private bdD(short paramBoolean, String paramInt1, boolean paramInt2, int arg6, int arg7)
  {
    this(paramBoolean, paramInt1, paramInt2, i, j, 600120, 600121);
  }

  private bdD(short arg3, String arg4) {
    this(s, str, false, 25, 25);
  }

  public int getId() {
    return this.aDx;
  }

  public boolean brI() {
    return this.fpC;
  }

  public int brJ() {
    return this.fpD;
  }

  public int brK() {
    return this.fpE;
  }

  public int brL() {
    return this.fpF;
  }

  public int brM() {
    return this.fpG;
  }

  public String bK() {
    return Integer.toString(this.aDx);
  }

  public String bL() {
    return this.aKM;
  }

  public String bN() {
    return null;
  }

  public static bdD bJ(short paramShort) {
    for (bdD localbdD : values()) {
      if (localbdD.getId() == paramShort) {
        return localbdD;
      }
    }
    return null;
  }
}