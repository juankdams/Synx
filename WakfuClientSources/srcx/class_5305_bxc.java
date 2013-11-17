public final class bxc extends dte
{
  private long iI;
  private int bFx;
  private int bFy;
  private boolean bFz;

  public bxc(long paramLong, int paramInt1, int paramInt2)
  {
    this(paramLong, paramInt1, paramInt2, true);
  }

  public bxc(long paramLong, int paramInt1, int paramInt2, boolean paramBoolean) {
    this.iI = paramLong;
    this.bFx = paramInt1;
    this.bFy = paramInt2;
    this.bFz = paramBoolean;
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
    try
    {
      aIG localaIG = new aIG();
      localaIG.bM((byte)3);
      localaIG.bf((short)43);
      localaIG.dU(this.iI);
      localaIG.mH(this.bFx);
      localaIG.mH(this.bFy);
      localaIG.dt(this.bFz);
      localcyx.d(localaIG);
    } catch (Exception localException) {
      cth.cqP().err("Error trying to play aps : " + localException);
    }
  }
}