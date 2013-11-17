public class dUh extends dte
{
  private static final byte liu = 0;
  private static final byte liv = 1;
  private static final byte liw = 2;
  private final byte lix;

  public dUh()
  {
    this.lix = 0;
  }

  public dUh(boolean paramBoolean) {
    this.lix = (paramBoolean ? 1 : 2);
  }

  public dUh(long paramLong, boolean paramBoolean) {
    this.lix = (paramBoolean ? 1 : 2);
  }

  public boolean isValid()
  {
    return true;
  }

  public void execute()
  {
    aIG localaIG = new aIG();
    localaIG.bM((byte)2);
    localaIG.bf((short)139);
    localaIG.bN(this.lix);

    cyx localcyx = byv.bFN().aJK();
    if (localcyx != null)
      localcyx.d(localaIG);
    else
      cth.cqP().err("Pour accéder à ces commandes il faut être connecté !");
  }
}