public class aYZ extends dte
{
  private byte ffD;

  public aYZ(byte paramByte)
  {
    this.ffD = paramByte;
  }

  public boolean isValid()
  {
    return (this.ffD == 0) || (this.ffD == 1) || (this.ffD == 2);
  }

  public void execute()
  {
    aIG localaIG = new aIG();
    localaIG.bM((byte)1);
    localaIG.bf((short)4);
    localaIG.bN(this.ffD);

    cyx localcyx = byv.bFN().aJK();
    if (localcyx != null)
      localcyx.d(localaIG);
    else
      cth.cqP().err("Pour accéder à ces commandes il faut être connecté !");
  }
}