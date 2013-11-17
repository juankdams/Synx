public class zB extends dte
{
  private short TD;
  private int hY;
  private int hZ;
  private boolean bun;

  public zB(Cs paramCs, short paramShort)
  {
    this.TD = paramShort;
    if ((paramCs != null) && (paramCs.getFirst() != null) && (paramCs.Lp() != null)) {
      this.bun = true;
      this.hY = ((Integer)paramCs.getFirst()).intValue();
      this.hZ = ((Integer)paramCs.Lp()).intValue();
    } else {
      this.bun = false;
    }
  }

  public boolean isValid()
  {
    return this.bun;
  }

  public void execute()
  {
    aIG localaIG = new aIG();
    localaIG.bM((byte)3);
    localaIG.bf((short)22);
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