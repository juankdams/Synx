public class azC extends dte
{
  public boolean isValid()
  {
    return true;
  }

  public void execute()
  {
    aIG localaIG = new aIG();
    localaIG.bM((byte)3);
    localaIG.bf((short)15);

    cyx localcyx = byv.bFN().aJK();
    if (localcyx != null)
      localcyx.d(localaIG);
    else
      cth.cqP().err("Pour accéder à ces commandes il faut être connecté !");
  }
}