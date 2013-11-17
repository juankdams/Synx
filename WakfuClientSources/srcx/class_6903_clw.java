public class clw extends bWc
{
  protected clw()
  {
  }

  public clw(aVc paramaVc, long paramLong)
  {
    this();
    L(paramaVc);
    O(paramLong);
  }

  protected void b(caT paramcaT)
  {
    paramcaT.a(this);
  }

  public void clean()
  {
    if (this.etJ != null)
      this.etJ.release();
    cbt();
  }
}