public class aMG extends dte
{
  private final String esb;

  public aMG()
  {
    this.esb = "";
  }

  public aMG(String paramString) {
    this.esb = paramString;
  }

  public boolean isValid()
  {
    return true;
  }

  public void execute()
  {
    aIG localaIG = new aIG();
    localaIG.bM((byte)2);
    localaIG.bf((short)50);
    localaIG.gC(this.esb);

    cyx localcyx = byv.bFN().aJK();
    if (localcyx != null)
      localcyx.d(localaIG);
    else
      cth.cqP().err("Pour accéder à ces commandes il faut être connecté !");
  }
}