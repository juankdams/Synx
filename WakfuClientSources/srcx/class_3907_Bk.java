public class Bk extends dte
{
  private int bxi;
  private short bxj;

  public Bk(int paramInt, short paramShort)
  {
    this.bxi = paramInt;
    this.bxj = paramShort;
  }

  public boolean isValid()
  {
    return true;
  }

  public void execute()
  {
    aIG localaIG = new aIG();
    localaIG.bM((byte)3);
    localaIG.bf((short)45);
    localaIG.mH(this.bxi);
    localaIG.bg(this.bxj);

    cyx localcyx = byv.bFN().aJK();
    if (localcyx != null)
      localcyx.d(localaIG);
    else
      cth.cqP().err("Pour accéder à ces commandes il faut être connecté !");
  }
}