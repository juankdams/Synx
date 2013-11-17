public final class bJZ extends dte
{
  private final int Rm;

  public bJZ(int paramInt)
  {
    this.Rm = paramInt;
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

    aIG localaIG = new aIG();
    localaIG.bM((byte)3);
    localaIG.bf((short)134);
    localaIG.mH(this.Rm);
    localcyx.d(localaIG);
  }
}