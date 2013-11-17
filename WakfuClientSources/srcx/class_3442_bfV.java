public class bfV extends dte
{
  private int cGS;
  private short aFe;

  public bfV(int paramInt, short paramShort)
  {
    this.cGS = paramInt;
    this.aFe = paramShort;
  }

  public boolean isValid()
  {
    return this.aFe > 0;
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
    localaIG.bf((short)23);
    localaIG.mH(this.cGS);
    localaIG.bg(this.aFe);
    localcyx.d(localaIG);

    byv.bFN().bFO().bSs().ceJ();
  }
}