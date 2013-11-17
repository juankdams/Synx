public enum bTI
  implements ccI
{
  public static final byte hfd = 0;
  public static final byte hfe = 1;
  public static final byte hff = 2;
  public static final byte hfg = 3;
  public static final byte hfh = 4;
  public static final byte hfi = 5;
  public static final byte hfj = 9;
  private final byte hV;
  private final eu hfk;
  private final eu hfl;
  private final eu hfm;
  private final boolean hfn;
  private final int hfo;

  public static bTI dx(byte paramByte)
  {
    for (bTI localbTI : values()) {
      if (localbTI.bJ() == paramByte) {
        return localbTI;
      }
    }
    return null;
  }

  private bTI(byte parameu2, eu parameu3, eu paramInt, eu paramBoolean, int arg7, boolean arg8)
  {
    this.hV = parameu2;
    this.hfk = parameu3;
    this.hfl = paramInt;
    if (this.hfl != null) {
      this.hfl.a(this);
    }
    this.hfm = paramBoolean;
    if (this.hfm != null)
      this.hfm.a(this);
    int i;
    this.hfo = i;
    boolean bool;
    this.hfn = bool;
  }

  public String bK()
  {
    return Byte.toString(bJ());
  }

  public String bL() {
    return toString();
  }

  public String bN() {
    return null;
  }

  public byte bJ() {
    return this.hV;
  }

  public eu bZR() {
    return this.hfk;
  }

  public eu bZS() {
    return this.hfl;
  }

  public eu bZT() {
    return this.hfm;
  }

  public boolean bZU() {
    return this.hfk != null;
  }

  public boolean bZV() {
    return this.hfn;
  }

  public int bZW() {
    return this.hfo;
  }
}