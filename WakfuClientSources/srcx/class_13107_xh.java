public class xh extends dte
{
  private long bpg;

  public xh(long paramLong)
  {
    this.bpg = paramLong;
  }

  public boolean isValid()
  {
    return this.bpg > 0L;
  }

  public void execute()
  {
    cyx localcyx = byv.bFN().aJK();
    if (localcyx == null) {
      cth.cqP().err("Pour accéder à ces commandes il faut être connecté !");
      return;
    }

    aIG localaIG = new aIG();
    localaIG.bM((byte)3);
    localaIG.bf((short)33);
    localaIG.dU(this.bpg);
    localcyx.d(localaIG);
  }
}