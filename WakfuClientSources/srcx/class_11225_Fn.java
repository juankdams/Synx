public final class Fn extends dte
{
  public static final int HELP = 0;
  public static final int bME = 1;
  private int aLs;
  private String[] aLt;

  public Fn(int paramInt, String[] paramArrayOfString)
  {
    this.aLs = paramInt;
    this.aLt = ((String[])paramArrayOfString.clone());
  }

  public boolean isValid() {
    switch (this.aLs) {
    case 0:
      return true;
    case 1:
      return this.aLt.length == 1;
    }
    return false;
  }

  public void execute() {
    cyx localcyx = byv.bFN().aJK();
    if (localcyx == null) {
      cth.cqP().err("Pour accéder à ces commandes il faut être connecté!");
      return;
    }
    try
    {
      switch (this.aLs) {
      case 0:
        OQ();
        break;
      case 1:
        d(localcyx);
      }
    }
    catch (Exception localException) {
      cth.cqP().err("Problème d'une commande" + localException);
    }
  }

  private void d(cyx paramcyx) {
    aIG localaIG = new aIG();
    localaIG.bM((byte)3);
    localaIG.bf((short)162);
    localaIG.bN(Byte.parseByte(this.aLt[0]));
    paramcyx.d(localaIG);
  }

  private void OQ() {
    log("'character'|'ch' 'setSex' sexId");
  }
}