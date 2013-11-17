public class XW extends dte
{
  private final long bji;

  public XW(long paramLong)
  {
    this.bji = paramLong;
  }

  public boolean isValid()
  {
    return this.bji > 0L;
  }

  public void execute()
  {
    aIG localaIG = new aIG();
    localaIG.bM((byte)1);
    localaIG.bf((short)58);
    localaIG.dU(this.bji);

    cyx localcyx = byv.bFN().aJK();
    if (localcyx != null)
      localcyx.d(localaIG);
    else
      cth.cqP().err("Pour accéder à ces commandes il faut être connecté !");
  }
}