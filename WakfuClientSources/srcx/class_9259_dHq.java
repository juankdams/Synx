public class dHq extends dte
{
  private int lSu;
  private final int eaJ;

  public dHq(int paramInt)
  {
    this.lSu = paramInt;
    this.eaJ = 1;
  }

  public dHq(int paramInt1, int paramInt2) {
    this.lSu = paramInt1;
    this.eaJ = paramInt2;
  }

  public boolean isValid()
  {
    return true;
  }

  public void execute()
  {
    aIG localaIG = new aIG();
    localaIG.bM((byte)3);
    localaIG.bf((short)93);
    localaIG.mH(this.lSu);
    localaIG.mH(this.eaJ);

    cyx localcyx = byv.bFN().aJK();
    if (localcyx != null)
      localcyx.d(localaIG);
    else
      cth.cqP().err("Pour accéder à ces commandes il faut être connecté !");
  }
}