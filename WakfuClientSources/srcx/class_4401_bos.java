public class bos extends dte
{
  private long Tj;
  private int fHT;
  private int fHU;

  public bos(long paramLong, int paramInt1, int paramInt2)
  {
    this.Tj = paramLong;
    this.fHT = paramInt1;
    this.fHU = paramInt2;
  }

  public boolean isValid()
  {
    return true;
  }

  public void execute()
  {
    aIG localaIG = new aIG();
    localaIG.bM((byte)3);
    localaIG.bf((short)12);
    localaIG.dU(this.Tj);
    localaIG.mH(this.fHT);
    localaIG.mH(this.fHU);

    cyx localcyx = byv.bFN().aJK();
    if (localcyx != null)
      localcyx.d(localaIG);
    else
      cth.cqP().err("Pour accéder à ces commandes il faut être connecté !");
  }
}