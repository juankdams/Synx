public class dCB extends dte
{
  private long dOf;
  private boolean lKW;
  private int aMR;

  public dCB(long paramLong, boolean paramBoolean, int paramInt)
  {
    this.dOf = paramLong;
    this.lKW = paramBoolean;
    this.aMR = paramInt;
  }

  public boolean isValid()
  {
    return (this.dOf > 0L) && ((!this.lKW) || (this.aMR > 0));
  }

  public void execute()
  {
    aIG localaIG = new aIG();
    localaIG.bM((byte)1);
    localaIG.bf((short)49);
    localaIG.dU(this.dOf);
    localaIG.dt(this.lKW);
    localaIG.mH(this.aMR);

    cyx localcyx = byv.bFN().aJK();
    if (localcyx != null)
      localcyx.d(localaIG);
    else
      cth.cqP().err("Pour accéder à ces commandes il faut être connecté !");
  }
}