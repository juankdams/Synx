public class cri extends dte
{
  private final int eru;
  private static int iaK = 1000000;

  public cri(int paramInt)
  {
    this.eru = paramInt;
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

    if (Math.abs(this.eru) > iaK) {
      cth.cqP().err("Unable to add this amount. max amount at a time is " + iaK);
      return;
    }
    try
    {
      aIG localaIG = new aIG();
      localaIG.bM((byte)3);
      localaIG.bf((short)25);
      localaIG.mH(this.eru);
      localcyx.d(localaIG);
    } catch (Exception localException) {
      cth.cqP().err("Error trying to add kamas to wallet : " + localException);
    }
  }
}