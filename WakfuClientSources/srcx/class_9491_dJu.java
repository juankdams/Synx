public class dJu extends cih
{
  public static final short lUZ = 3;
  public static final short iop = 2;
  public static final short ioo = 1;
  private final long lVa;
  private final int aJA;
  private final int lVb;
  private final int lVc;
  private final boolean cxI;
  private final int lVd;
  private final long lVe;
  private final bZA aB;

  public dJu(int paramInt1, int paramInt2, long paramLong1, int paramInt3, int paramInt4, int paramInt5, boolean paramBoolean, int paramInt6, long paramLong2, bZA parambZA, aPb paramaPb, int paramInt7)
  {
    super(paramInt1, paramInt2, paramaPb, paramInt7);
    this.lVa = paramLong1;
    this.aJA = paramInt3;
    this.lVb = paramInt4;
    this.lVc = paramInt5;
    this.cxI = paramBoolean;
    this.lVd = paramInt6;
    this.lVe = paramLong2;
    this.aB = parambZA;
  }

  public bZA F() {
    return this.aB;
  }

  public long zW() {
    return this.lVa;
  }

  public int qW() {
    return this.aJA;
  }

  public int diN() {
    return this.lVb;
  }

  public int diO() {
    return this.lVc;
  }

  public boolean ahy() {
    return this.cxI;
  }

  public boolean diP() {
    return diN() > 0;
  }

  public int diQ() {
    return this.lVd;
  }

  public long diR() {
    return this.lVe;
  }
}