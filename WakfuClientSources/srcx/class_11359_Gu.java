public final class Gu extends dte
{
  private long iI;
  private String bOG;

  public Gu(long paramLong, String paramString)
  {
    this.iI = paramLong;
    this.bOG = paramString;
  }

  public boolean isValid()
  {
    return (this.bOG != null) && (this.iI != 0L);
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
      localaIG.bf((short)42);
      localaIG.dU(this.iI);
      localaIG.gC(this.bOG);
      localcyx.d(localaIG);
    } catch (Exception localException) {
      cth.cqP().err("Error trying to play animation : " + localException);
    }
  }
}