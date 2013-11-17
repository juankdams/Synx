public class aGp extends dte
{
  public static final int aac = 0;
  public static final int abi = 1;
  public static final int INFO = 2;
  private final int aLs;
  private final long dOf;
  private final int aMR;

  public aGp(int paramInt)
  {
    this(paramInt, -1L, -1);
  }

  public aGp(int paramInt1, long paramLong, int paramInt2) {
    this.aLs = paramInt1;
    this.dOf = paramLong;
    this.aMR = paramInt2;
  }

  public boolean isValid()
  {
    switch (this.aLs) {
    case 0:
      return (this.dOf > 0L) && (this.aMR > 0);
    case 1:
      return (this.dOf > 0L) && (this.aMR == -1);
    case 2:
      return (this.dOf == -1L) && (this.aMR == -1);
    }

    return false;
  }

  public void execute()
  {
    cyx localcyx = byv.bFN().aJK();
    if (localcyx == null) {
      cth.cqP().err("Pour accéder à ces commandes il faut être connecté !");
      return;
    }
    aIG localaIG = new aIG();
    localaIG.bM((byte)2);
    localaIG.bf((short)140);
    localaIG.dU(this.dOf);
    localaIG.mH(this.aMR);
    localcyx.d(localaIG);
  }
}