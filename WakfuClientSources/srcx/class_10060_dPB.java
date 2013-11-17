public class dPB extends dte
{
  private short TD;

  public dPB(short paramShort)
  {
    this.TD = paramShort;
  }

  public boolean isValid()
  {
    return this.TD >= 0;
  }

  public void execute()
  {
    aIG localaIG = new aIG();
    localaIG.bM((byte)3);
    localaIG.bf((short)37);
    localaIG.bg(this.TD);

    cyx localcyx = byv.bFN().aJK();
    if (localcyx != null)
      localcyx.d(localaIG);
    else
      cth.cqP().err("Pour accéder à ces commandes il faut être connecté !");
  }
}