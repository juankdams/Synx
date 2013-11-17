public final class GW extends dte
{
  private final short bPl;

  public GW(short paramShort)
  {
    this.bPl = paramShort;
  }

  public boolean isValid()
  {
    return true;
  }

  public void execute()
  {
    cyx localcyx = byv.bFN().aJK();
    if (localcyx == null) {
      cth.cqP().err("Pour accéder à ces commandes il faut être connecté!");
      return;
    }

    aIG localaIG = new aIG();
    localaIG.bM((byte)3);
    localaIG.bf(this.bPl);
    localcyx.d(localaIG);
  }
}