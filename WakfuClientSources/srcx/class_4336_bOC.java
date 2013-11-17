public class bOC extends dte
{
  private String TC;
  private int hY;
  private int hZ;

  public bOC(String paramString, Cs paramCs)
  {
    this.TC = paramString;
    this.hY = ((Integer)paramCs.getFirst()).intValue();
    this.hZ = ((Integer)paramCs.Lp()).intValue();
  }

  public boolean isValid()
  {
    return this.TC != null;
  }

  public void execute()
  {
    aIG localaIG = new aIG();
    localaIG.bM((byte)3);
    localaIG.bf((short)31);
    localaIG.gC(this.TC);
    localaIG.mH(this.hY);
    localaIG.mH(this.hZ);

    cyx localcyx = byv.bFN().aJK();
    if (localcyx != null)
      localcyx.d(localaIG);
    else
      cth.cqP().err("Pour accéder à ces commandes il faut être connecté !");
  }
}