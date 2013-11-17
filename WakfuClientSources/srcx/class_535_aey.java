public class aey extends dte
{
  private final String cVS;

  public aey(String paramString)
  {
    this.cVS = paramString;
  }

  public boolean isValid() {
    return true;
  }

  public void execute() {
    aIG localaIG = new aIG();
    localaIG.bM((byte)3);
    localaIG.bf((short)63);
    localaIG.gC(this.cVS);

    cyx localcyx = byv.bFN().aJK();
    if (localcyx != null)
      localcyx.d(localaIG);
    else
      cth.cqP().err("Pour accéder à ces commandes il faut être connecté !");
  }
}