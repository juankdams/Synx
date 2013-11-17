public class aQJ extends dte
{
  private int aI;
  private final int aJ;

  public aQJ(int paramInt)
  {
    this.aI = paramInt;
    this.aJ = 1;
  }

  public aQJ(int paramInt1, int paramInt2) {
    this.aI = paramInt1;
    this.aJ = paramInt2;
  }

  public boolean isValid()
  {
    return true;
  }

  public void execute()
  {
    aIG localaIG = new aIG();
    localaIG.bM((byte)3);
    localaIG.bf((short)92);
    localaIG.mH(this.aI);
    localaIG.mH(this.aJ);

    cyx localcyx = byv.bFN().aJK();
    if (localcyx != null)
      localcyx.d(localaIG);
    else
      cth.cqP().err("Pour accéder à ces commandes il faut être connecté !");
  }
}