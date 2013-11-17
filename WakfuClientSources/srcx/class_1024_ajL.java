public class ajL extends dte
{
  private int cGS;
  private long bpg;

  public ajL(int paramInt, long paramLong)
  {
    this.cGS = paramInt;
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
    localaIG.bf((short)24);
    localaIG.mH(this.cGS);
    localaIG.dU(this.bpg);
    localcyx.d(localaIG);

    dLE.doY().a(byv.bFN().bFO(), byv.bFN().bFO().getFields());
  }
}