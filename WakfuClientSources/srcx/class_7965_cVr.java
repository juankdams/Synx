public class cVr extends dte
{
  private int bVc;
  private short cZu;

  public cVr(int paramInt, short paramShort)
  {
    this.bVc = paramInt;
    this.cZu = paramShort;
  }

  public boolean isValid()
  {
    return this.cZu > 0;
  }

  public void execute()
  {
    cyx localcyx = byv.bFN().aJK();
    if (localcyx == null) {
      cth.cqP().err("Pour accéder à ces commandes il faut être connecté !");
      return;
    }

    aIG localaIG = new aIG();
    localaIG.bM((byte)3);
    localaIG.bf((short)78);
    localaIG.mH(this.bVc);
    localaIG.bg(this.cZu);
    localcyx.d(localaIG);

    dLE.doY().a(byv.bFN().bFO(), byv.bFN().bFO().getFields());
  }
}