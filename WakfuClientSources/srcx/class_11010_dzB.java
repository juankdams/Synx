public class dzB extends dte
{
  private int cGS;
  private short cZu;

  public dzB(int paramInt, short paramShort)
  {
    this.cGS = paramInt;
    this.cZu = paramShort;
  }

  public boolean isValid()
  {
    return (this.cZu >= 0) && (this.cZu <= 100);
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
    localaIG.bf((short)26);
    localaIG.mH(this.cGS);
    localaIG.bg(this.cZu);
    localcyx.d(localaIG);

    dLE.doY().a(byv.bFN().bFO(), byv.bFN().bFO().getFields());
  }
}