public abstract class dKc
  implements aDq
{
  protected byz bSY;

  protected dKc()
  {
    this.bSY = byv.bFN().bFO();
  }

  public boolean cancel()
  {
    return a(false, true);
  }

  protected boolean e(aCH paramaCH) {
    return paramaCH.K(this.bSY);
  }

  public abstract boolean a(boolean paramBoolean1, boolean paramBoolean2);

  public boolean ga()
  {
    return false;
  }
}