public final class cYB extends dte
{
  public static final int HELP = 0;
  public static final int kMa = 1;
  public static final int kMb = 2;
  public static final int Za = 3;
  private int aLs;
  private String[] aLt;

  public cYB(int paramInt, String[] paramArrayOfString)
  {
    this.aLs = paramInt;
    this.aLt = paramArrayOfString;
  }

  public boolean isValid() {
    switch (this.aLs) {
    case 1:
      return this.aLt.length == 1;
    case 2:
      return (this.aLt.length == 1) || (this.aLt.length == 0);
    case 3:
      return this.aLt.length == 2;
    case 0:
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
        Q(localcyx);
        break;
      case 2:
        R(localcyx);
        break;
      case 3:
        S(localcyx);
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
    log("(--learn | -l) + Id_métier : Permet d'apprendre un métier.\r\n(--addXp | -ax) + Id_métier + xp : Permet d'ajouter ou de retirer de l'XP à un métier\r\n(--help | -h) : Affiche cet aide");
  }

  private void Q(cyx paramcyx)
  {
    aIG localaIG = new aIG();
    localaIG.bM((byte)3);
    localaIG.bf((short)97);
    localaIG.mH(Integer.parseInt(this.aLt[0]));
    paramcyx.d(localaIG);
  }

  private void R(cyx paramcyx) {
    aIG localaIG = new aIG();
    localaIG.bM((byte)3);
    localaIG.bf((short)98);
    localaIG.mH(this.aLt.length == 0 ? -1 : Integer.parseInt(this.aLt[0]));
    paramcyx.d(localaIG);
  }

  private void S(cyx paramcyx) {
    aIG localaIG = new aIG();
    localaIG.bM((byte)3);
    localaIG.bf((short)99);
    localaIG.mH(Integer.parseInt(this.aLt[0]));
    localaIG.dU(Long.parseLong(this.aLt[1]));
    paramcyx.d(localaIG);
  }
}