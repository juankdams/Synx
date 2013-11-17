public class cGm extends gA
{
  private short aFe;
  private long aFa;

  public cGm(bBn parambBn)
  {
    super(0L);
    b(parambBn);
  }

  public short nP() {
    return this.aFe;
  }

  public long oj() {
    return this.aFa;
  }

  public void iv(long paramLong) {
    this.aFa = paramLong;
  }

  public void l(short paramShort) {
    this.aFe = paramShort;
    aaj localaaj = aEQ.byy();
    if (localaaj != null)
      localaaj.m(this);
  }
}