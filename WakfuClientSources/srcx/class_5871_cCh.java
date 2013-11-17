public class cCh extends dte
{
  private final int bbC;
  private final String bjj;

  public cCh(int paramInt, String paramString)
  {
    this.bbC = paramInt;
    this.bjj = paramString;
  }

  public boolean isValid()
  {
    return true;
  }

  public void execute()
  {
    cyx localcyx = byv.bFN().aJK();
    if (localcyx == null) {
      cth.cqP().err("Pour accéder à ces commandes il faut être connecté !");
      return;
    }

    if (!bU.fH().ed(34, this.bbC)) {
      cth.cqP().err("Titre inconnu id=" + this.bbC);
      return;
    }

    aIG localaIG = new aIG();
    localaIG.bM((byte)3);
    localaIG.bf((short)135);
    localaIG.mH(this.bbC);
    localaIG.gC(this.bjj);
    localcyx.d(localaIG);
  }
}