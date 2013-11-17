public class cQk extends dte
{
  private int aGf;

  public cQk(int paramInt)
  {
    this.aGf = paramInt;
  }

  public boolean isValid()
  {
    return this.aGf >= -1;
  }

  public void execute()
  {
    aIG localaIG = new aIG();
    localaIG.bM((byte)2);
    localaIG.bf((short)9);
    localaIG.mH(this.aGf);

    cyx localcyx = byv.bFN().aJK();
    if (localcyx != null)
      localcyx.d(localaIG);
    else
      cth.cqP().err("Pour accéder à ces commandes il faut être connecté !");
  }
}