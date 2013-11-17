public class ayD extends dte
{
  private String TC;
  private String bea;

  public ayD(String paramString)
  {
    this(paramString, "");
  }

  public ayD(String paramString1, String paramString2) {
    this.TC = paramString1;
    this.bea = paramString2;
  }

  public boolean isValid()
  {
    return this.TC != null;
  }

  public void execute()
  {
    aIG localaIG = new aIG();
    localaIG.bM((byte)2);
    localaIG.bf((short)7);
    localaIG.gC(this.TC);
    localaIG.gC(this.bea);

    cyx localcyx = byv.bFN().aJK();
    if (localcyx != null)
      localcyx.d(localaIG);
    else
      cth.cqP().err("Pour accéder à ces commandes il faut être connecté !");
  }
}