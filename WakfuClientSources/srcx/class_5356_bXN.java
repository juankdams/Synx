public class bXN extends dte
{
  private final bcB hnK;

  public bXN(bcB parambcB)
  {
    this.hnK = parambcB;
  }

  public boolean isValid()
  {
    return true;
  }

  public void execute()
  {
    switch (cos.hVQ[this.hnK.ordinal()]) {
    case 1:
      cth.cqP().log("help : this screen");
      cth.cqP().log("status : displays status of the Gameplay Stats Manager");
      cth.cqP().log("pause : prevents gameplay statistics from being processed");
      cth.cqP().log("resume : resume statistics process");
      break;
    case 2:
      cS((short)151);
      break;
    case 3:
      cS((short)152);
      break;
    case 4:
      cS((short)153);
    }
  }

  private void cS(short paramShort)
  {
    aIG localaIG = new aIG();
    localaIG.bM((byte)2);
    localaIG.bf(paramShort);

    cyx localcyx = byv.bFN().aJK();
    if (localcyx != null)
      localcyx.d(localaIG);
    else
      cth.cqP().err("Pour accéder à ces commandes il faut être connecté !");
  }
}