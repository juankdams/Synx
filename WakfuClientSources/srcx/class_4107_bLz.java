public class bLz extends dte
{
  private String TC;

  public bLz(String paramString)
  {
    this.TC = paramString;
  }

  public boolean isValid()
  {
    return (this.TC != null) && (!this.TC.equals(""));
  }

  public void execute()
  {
    aIG localaIG = new aIG();
    localaIG.bM((byte)2);
    localaIG.bf((short)1);
    localaIG.gC(this.TC);

    cyx localcyx = byv.bFN().aJK();
    if (localcyx != null)
      localcyx.d(localaIG);
    else
      cth.cqP().err("Pour accéder à ces commandes il faut être connecté !");
  }
}