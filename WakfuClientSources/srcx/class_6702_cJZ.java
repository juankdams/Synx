public abstract class cJZ
  implements amB
{
  protected final long aTz;
  protected final byte gBM;
  protected final bZA aB;
  protected final boolean geW;
  private final boolean iIA;
  protected final long ctZ;

  protected cJZ(long paramLong1, byte paramByte, bZA parambZA, boolean paramBoolean1, boolean paramBoolean2, long paramLong2)
  {
    this.aTz = paramLong1;
    this.gBM = paramByte;
    this.aB = parambZA;
    this.geW = paramBoolean1;
    this.iIA = paramBoolean2;
    this.ctZ = paramLong2;
  }

  public long getId() {
    return this.aTz;
  }

  public byte xH() {
    return this.gBM;
  }

  public boolean cDS() {
    return this.iIA;
  }
}