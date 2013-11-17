public final class csh
  implements Runnable
{
  private long Rc;
  private boolean cLW;

  public csh(aWc paramaWc, long paramLong, boolean paramBoolean)
  {
    this.Rc = paramLong;
    this.cLW = paramBoolean;
  }

  public void run() {
    this.ejv.g(this.Rc, this.cLW);
  }
}