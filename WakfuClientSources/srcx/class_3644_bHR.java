public class bHR extends dte
{
  private final int cAK;

  public bHR(int paramInt)
  {
    this.cAK = paramInt;
  }

  public boolean isValid()
  {
    return this.cAK >= 0;
  }

  public void execute()
  {
    aIG localaIG = new aIG();
    localaIG.bM((byte)3);
    localaIG.bf((short)52);
    localaIG.mH(this.cAK);

    cyx localcyx = byv.bFN().aJK();
    if (localcyx != null)
      localcyx.d(localaIG);
    else
      cth.cqP().err("Pour accéder à ces commandes il faut être connecté !");
  }
}