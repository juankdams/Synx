public abstract class cxw extends aRw
{
  protected long bkH;
  protected long htC;
  protected long ilv;
  protected long ilw;

  public abstract byte[] encode();

  public abstract int getId();

  public void hQ(long paramLong)
  {
    this.bkH = paramLong;
  }

  public void hR(long paramLong) {
    this.htC = paramLong;
  }

  public void hS(long paramLong) {
    this.ilw = paramLong;
  }

  public void hT(long paramLong)
  {
    this.ilv = paramLong;
  }
}