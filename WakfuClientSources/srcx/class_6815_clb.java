public class clb extends ciH
{
  public clb()
  {
    this(0L);
  }

  public clb(long paramLong) {
    super(8);
    fM(paramLong);
  }

  public void fM(long paramLong) {
    sF().setLong(0L, paramLong);
  }

  public long getValue() {
    return sF().getLong(0L);
  }
}