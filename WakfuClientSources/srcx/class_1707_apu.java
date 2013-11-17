public class apu extends dte
{
  private int aKS;

  public apu(int paramInt)
  {
    this.aKS = paramInt;
  }

  public boolean isValid()
  {
    return (this.aKS > 999) || (this.aKS == -1);
  }

  public void execute()
  {
    aIG localaIG = new aIG();
    localaIG.bM((byte)3);
    localaIG.bf((short)18);
    localaIG.mH(this.aKS);

    cyx localcyx = byv.bFN().aJK();
    if (localcyx != null)
      localcyx.d(localaIG);
    else
      cth.cqP().err("Pour accéder à ces commandes il faut être connecté !");
  }
}