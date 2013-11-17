public final class drF extends dte
{
  public static final int HELP = 0;
  public static final int RESET = 1;
  private final int aLs;

  public drF(int paramInt)
  {
    this.aLs = paramInt;
  }

  public boolean isValid()
  {
    return true;
  }

  public void execute()
  {
    cyx localcyx = byv.bFN().aJK();
    if (localcyx == null) {
      cth.cqP().err("Pour accéder à ces commandes il faut être connecté!");
      return;
    }
    try {
      switch (this.aLs) {
      case 0:
        OQ();
        break;
      case 1:
        reset();
      }
    }
    catch (Exception localException) {
      cth.cqP().err("Problème d'une commande" + localException);
    }
  }

  private static void reset() {
    Bo(1);
  }

  private static void OQ() {
    log("-help | -h : aide");
    log("-reset | -r : supprime les objets de l'inventaire (pas de l'inventaire de quete");
  }

  private static void Bo(int paramInt) {
    cyx localcyx = byv.bFN().aJK();
    if (localcyx == null) {
      cth.cqP().err("Pour accéder à ces commandes il faut être connecté !");
      return;
    }

    aIG localaIG = new aIG();
    localaIG.bM((byte)3);
    localaIG.bf((short)143);
    localaIG.mH(paramInt);
    localcyx.d(localaIG);
  }
}