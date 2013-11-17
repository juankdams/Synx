public class azs extends dte
{
  private final int dQF;

  public azs(int paramInt)
  {
    this.dQF = paramInt;
  }

  public boolean isValid()
  {
    return true;
  }

  public void execute()
  {
    aIG localaIG = new aIG();
    localaIG.bf((short)118);
    localaIG.bM((byte)3);
    localaIG.mH(this.dQF);

    cyx localcyx = byv.bFN().aJK();
    if (localcyx != null)
      localcyx.d(localaIG);
    else
      cth.cqP().err("Pour accéder à ces commandes il faut être connecté !");
  }
}