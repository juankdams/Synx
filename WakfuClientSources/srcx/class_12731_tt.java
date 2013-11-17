public class tt extends dte
{
  private final long bdY;
  private final int bdZ;
  private final String m_name;
  private final String bea;
  private final int aKS;

  public tt(long paramLong, int paramInt1, String paramString1, String paramString2, int paramInt2)
  {
    this.bdY = paramLong;
    this.bdZ = paramInt1;
    this.m_name = paramString1;
    this.bea = paramString2;
    this.aKS = paramInt2;
  }

  public boolean isValid()
  {
    return (this.bdY > 0L) && (this.bdZ > 0) && (this.m_name != null) && (this.bea != null) && (this.aKS >= -1);
  }

  public void execute()
  {
    aIG localaIG = new aIG();
    localaIG.bM((byte)1);
    localaIG.bf((short)57);
    localaIG.dU(this.bdY);
    localaIG.mH(this.bdZ);
    localaIG.gC(this.m_name);
    localaIG.gC(this.bea);
    localaIG.mH(this.aKS);

    cyx localcyx = byv.bFN().aJK();
    if (localcyx != null)
      localcyx.d(localaIG);
    else
      cth.cqP().err("Pour accéder à ces commandes il faut être connecté !");
  }
}