public class bpB extends dte
{
  private boolean bun;
  private int hY;
  private int hZ;

  public bpB(Cs paramCs)
  {
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
    return (this.bun) && (!bBc.f(byv.bFN().bFO().bSu().bOR(), bBc.gto));
  }

  public void execute()
  {
    aIG localaIG = new aIG();
    localaIG.bM((byte)3);
    localaIG.bf((short)6);
    localaIG.mH(this.hY);
    localaIG.mH(this.hZ);

    cyx localcyx = byv.bFN().aJK();
    if (localcyx != null)
      localcyx.d(localaIG);
    else
      cth.cqP().err("Pour accéder à ces commandes il faut être connecté !");
  }
}