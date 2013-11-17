public class cQh extends dte
{
  private long dOf;
  private long iI = -9223372036854775808L;
  private String bea;

  public cQh(long paramLong1, long paramLong2, String paramString)
  {
    this.dOf = paramLong1;
    this.iI = paramLong2;
    this.bea = paramString;
  }

  public boolean isValid()
  {
    return (this.dOf > 0L) && (this.bea != null) && (this.iI > -9223372036854775808L);
  }

  public void execute()
  {
    aIG localaIG = new aIG();
    localaIG.bM((byte)1);
    localaIG.bf((short)105);
    localaIG.dU(this.dOf);
    localaIG.dU(this.iI);
    localaIG.gC(this.bea);

    cyx localcyx = byv.bFN().aJK();
    if (localcyx != null)
      localcyx.d(localaIG);
    else
      cth.cqP().err("Pour accéder à ces commandes il faut être connecté !");
  }
}