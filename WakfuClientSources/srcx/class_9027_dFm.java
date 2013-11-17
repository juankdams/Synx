public final class dFm extends dte
{
  private boolean lPc;
  private short lPd;
  private short lPe;

  public dFm(short paramShort1, short paramShort2)
  {
    this.lPd = paramShort1;
    this.lPe = paramShort2;
    this.lPc = false;
  }

  public dFm() {
    this.lPc = true;
  }

  public boolean isValid() {
    return true;
  }

  public void execute() {
    aIG localaIG = new aIG();
    localaIG.bM((byte)1);
    localaIG.bf((short)61);
    localaIG.dt(this.lPc);
    if (!this.lPc) {
      localaIG.bg(this.lPd);
      localaIG.bg(this.lPe);
    }

    cyx localcyx = byv.bFN().aJK();
    if (localcyx != null)
      localcyx.d(localaIG);
    else
      cth.cqP().err("Pour accéder à ces commandes il faut être connecté !");
  }
}