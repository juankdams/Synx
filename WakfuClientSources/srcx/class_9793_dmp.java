public class dmp extends dte
{
  private long lkd;

  public dmp(long paramLong)
  {
    this.lkd = paramLong;
  }

  public long cUc() {
    return this.lkd;
  }

  public boolean isValid()
  {
    return true;
  }

  public void execute()
  {
    aIG localaIG = new aIG();
    localaIG.bM((byte)1);
    localaIG.bf((short)47);
    localaIG.dU(this.lkd);

    cyx localcyx = byv.bFN().aJK();
    if (localcyx != null)
      localcyx.d(localaIG);
    else
      cth.cqP().err("Pour accéder à ces commandes il faut être connecté !");
  }
}