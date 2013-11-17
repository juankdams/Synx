public final class dyH extends dte
{
  private final int dFY;
  private final int lFl;
  private final long cQG;

  public dyH(int paramInt1, int paramInt2, long paramLong)
  {
    this.dFY = paramInt1;
    this.lFl = paramInt2;
    this.cQG = paramLong;
  }

  public boolean isValid()
  {
    return true;
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
    localaIG.bf((short)160);
    localaIG.mH(this.dFY);
    localaIG.mH(this.lFl);
    localaIG.dU(this.cQG);
    localcyx.d(localaIG);
  }
}