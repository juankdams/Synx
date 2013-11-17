public abstract class cbv extends aOm
{
  private long ctZ;
  private long gcc;
  public static final int blX = 2147483647;

  public long getDuration()
  {
    return this.ctZ;
  }

  public void cE(long paramLong) {
    this.ctZ = paramLong;
  }

  public long ccG() {
    return this.gcc;
  }

  public void hi(long paramLong) {
    this.gcc = paramLong;
  }

  public void cfs() {
    this.ctZ = 2147483647L;
  }

  public boolean isInfinite() {
    return this.ctZ == 2147483647L;
  }

  public boolean apR() {
    return this.gcc + this.ctZ > dDE.dft().bcy();
  }

  public void aJ()
  {
    super.aJ();
    this.ctZ = 0L;
    this.gcc = 0L;
  }
}