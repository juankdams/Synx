public final class dEZ extends dte
{
  public static final int HELP = 0;
  public static final int lOr = 1;
  public static final int lOs = 2;
  private int aLs;
  private String[] aLt;

  public dEZ(int paramInt, String[] paramArrayOfString)
  {
    this.aLt = paramArrayOfString;
    this.aLs = paramInt;
  }

  public boolean isValid() {
    switch (this.aLs) {
    case 1:
      return this.aLt.length == 1;
    case 0:
    case 2:
      return true;
    }
    return false;
  }

  public void execute() {
    cyx localcyx = byv.bFN().aJK();
    if (localcyx == null) {
      cth.cqP().err("Pour accéder à ces commandes il faut être connecté !");
      return;
    }
    try {
      switch (this.aLs) {
      case 1:
        W(localcyx);
        break;
      case 2:
        X(localcyx);
        break;
      case 0:
        OQ();
      }
    }
    catch (Exception localException) {
      cth.cqP().err("Problème lors de l'execution d'une commande de check " + localException);
    }
  }

  private void OQ() {
    log("(--userGroup | -u) Donne des informations sur les UserGroup de la partition courante.\r\n");
  }

  private void W(cyx paramcyx) {
    aIG localaIG = new aIG();
    localaIG.bM((byte)3);
    localaIG.bf((short)95);
    localaIG.mH(Integer.parseInt(this.aLt[0]));
    paramcyx.d(localaIG);
  }

  private void X(cyx paramcyx) {
    aIG localaIG = new aIG();
    localaIG.bM((byte)3);
    localaIG.bf((short)96);
    paramcyx.d(localaIG);
  }
}