public class dr extends dte
{
  private String TC;
  private int hY;
  private int hZ;
  private short TD;

  public dr(String paramString, Cs paramCs, short paramShort)
  {
    this.TC = paramString;
    this.hY = ((Integer)paramCs.getFirst()).intValue();
    this.hZ = ((Integer)paramCs.Lp()).intValue();
    this.TD = paramShort;
  }

  public boolean isValid()
  {
    return this.TC != null;
  }

  public void execute()
  {
    aIG localaIG = new aIG();
    localaIG.bM((byte)3);
    localaIG.bf((short)32);
    localaIG.gC(this.TC);
    localaIG.mH(this.hY);
    localaIG.mH(this.hZ);
    localaIG.bg(this.TD);

    cyx localcyx = byv.bFN().aJK();
    if (localcyx != null)
      localcyx.d(localaIG);
    else
      cth.cqP().err("Pour accéder à ces commandes il faut être connecté !");
  }
}