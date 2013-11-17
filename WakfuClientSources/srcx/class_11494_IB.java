public class IB extends dte
{
  public static final byte bRy = 1;
  public static final byte bRz = 2;
  public static final byte bRA = 3;
  private final byte bRB;
  private final int bRC;

  public IB(byte paramByte)
  {
    this.bRB = paramByte;
    this.bRC = -1;
  }

  public IB(byte paramByte, int paramInt) {
    this.bRB = paramByte;
    this.bRC = paramInt;
  }

  public boolean isValid()
  {
    return true;
  }

  public void execute()
  {
    aIG localaIG = new aIG();
    localaIG.bM((byte)3);
    localaIG.bf((short)81);
    localaIG.bN(this.bRB);
    localaIG.mH(this.bRC);

    cyx localcyx = byv.bFN().aJK();
    if (localcyx != null)
      localcyx.d(localaIG);
    else
      cth.cqP().err("Pour accéder à ces commandes il faut être connecté !");
  }
}