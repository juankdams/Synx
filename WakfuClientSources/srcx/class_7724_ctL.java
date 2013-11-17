public class ctL extends dte
{
  private int aRQ;
  private int aNN;

  public ctL(int paramInt1, int paramInt2)
  {
    this.aNN = paramInt2;
    this.aRQ = paramInt1;
  }

  public boolean isValid()
  {
    return true;
  }

  public void execute()
  {
    aIG localaIG = new aIG();
    localaIG.bM((byte)3);
    localaIG.bf((short)19);
    localaIG.mH(this.aRQ);
    localaIG.mH(this.aNN);
    cyx localcyx = byv.bFN().aJK();
    if (localcyx != null)
      localcyx.d(localaIG);
    else
      cth.cqP().err("Pour accéder à ces commandes il faut être connecté !");
  }
}