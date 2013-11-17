public class dkX extends dte
{
  private static final byte liu = 0;
  private static final byte liv = 1;
  private static final byte liw = 2;
  private final long bji;
  private final byte lix;

  public dkX()
  {
    this.bji = byv.bFN().bFO().sN();
    this.lix = 0;
  }

  public dkX(boolean paramBoolean) {
    this.bji = byv.bFN().bFO().sN();
    this.lix = (paramBoolean ? 1 : 2);
  }

  public dkX(long paramLong, boolean paramBoolean) {
    this.bji = paramLong;
    this.lix = (paramBoolean ? 1 : 2);
  }

  public boolean isValid()
  {
    return this.bji > 0L;
  }

  public void execute()
  {
    aIG localaIG = new aIG();
    localaIG.bM((byte)2);
    localaIG.bf((short)109);
    localaIG.bN(this.lix);
    localaIG.dU(this.bji);

    cyx localcyx = byv.bFN().aJK();
    if (localcyx != null)
      localcyx.d(localaIG);
    else
      cth.cqP().err("Pour accéder à ces commandes il faut être connecté !");
  }
}