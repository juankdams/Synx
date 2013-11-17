public class wV extends dte
{
  private String TC;

  public wV(String paramString)
  {
    this.TC = paramString;
  }

  public boolean isValid()
  {
    return this.TC != null;
  }

  public void execute()
  {
    aIG localaIG = new aIG();
    localaIG.bM((byte)3);
    localaIG.bf((short)2);
    localaIG.gC(this.TC);

    cyx localcyx = byv.bFN().aJK();
    if (localcyx != null)
      localcyx.d(localaIG);
    else
      cth.cqP().err("Pour accéder à ces commandes il faut être connecté !");
  }
}