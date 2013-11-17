public final class aup extends dte
{
  private short cZu;

  public aup(short paramShort)
  {
    this.cZu = paramShort;
  }

  public boolean isValid()
  {
    return PF.abu().ap(this.cZu);
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
    localaIG.bf((short)44);
    localaIG.bg(this.cZu);
    localcyx.d(localaIG);
  }
}