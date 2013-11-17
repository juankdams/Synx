public class daH
  implements dVX
{
  private final long bkH;
  private final boolean hqb;

  public daH(long paramLong)
  {
    this(paramLong, false);
  }

  public daH(long paramLong, boolean paramBoolean) {
    this.hqb = paramBoolean;
    this.bkH = paramLong;
  }

  public boolean j(dsj paramdsj) {
    boolean bool = paramdsj.oj() == this.bkH;
    return this.hqb ? false : !bool ? true : bool;
  }
}