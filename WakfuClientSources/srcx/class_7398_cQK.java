public final class cQK extends dte
{
  public static final int HELP = 1;
  public static final int kCB = 2;
  public static final int YW = 3;
  public static final int kCC = 4;
  public static final int kCD = 5;
  private int aLs;
  private String[] aLt;

  public cQK(int paramInt, String[] paramArrayOfString)
  {
    this.aLt = paramArrayOfString;
    this.aLs = paramInt;
  }

  public boolean isValid() {
    switch (this.aLs) {
    case 2:
    case 3:
      return this.aLt.length == 2;
    case 4:
      return this.aLt.length == 1;
    case 5:
      return this.aLt.length == 1;
    case 1:
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
      case 2:
        N(localcyx);
        break;
      case 3:
        O(localcyx);
        break;
      case 4:
        M(localcyx);
        break;
      case 5:
        L(localcyx);
        break;
      case 1:
        OQ();
      }
    }
    catch (Exception localException) {
      cth.cqP().err("Problème lors de l'execution d'une commande de calendrier " + localException);
    }
  }

  private void L(cyx paramcyx) {
    aIG localaIG = new aIG();
    localaIG.bM((byte)3);
    localaIG.bf((short)132);
    localaIG.mH(Integer.parseInt(this.aLt[0]));
    paramcyx.d(localaIG);
  }

  private void M(cyx paramcyx) {
    aIG localaIG = new aIG();
    localaIG.bM((byte)3);
    localaIG.bf((short)133);
    localaIG.mH(Integer.parseInt(this.aLt[0]));
    paramcyx.d(localaIG);
  }

  private void OQ() {
    log("(-changeNation | -cn) protectorId newNationId : change la nation d'un protecteur\r\n(-addMoney | -am) protectorId amount : ajoute de l'argent à un protecteur\r\n(-kamaQuestRatio | -kqr) ratioPercent : Modifie le % de kama mis de coté pour les quetes a kama\r\n(-kamaQuestCd | -kqcd) cdInSecond : modifie le cd de refresh du porte monnaie des quetes a kama\r\n");
  }

  private void N(cyx paramcyx)
  {
    aIG localaIG = new aIG();
    localaIG.bM((byte)3);
    localaIG.bf((short)84);
    localaIG.mH(Integer.parseInt(this.aLt[0]));
    localaIG.mH(Integer.parseInt(this.aLt[1]));
    paramcyx.d(localaIG);
  }

  private void O(cyx paramcyx) {
    aIG localaIG = new aIG();
    localaIG.bM((byte)3);
    localaIG.bf((short)88);
    localaIG.mH(Integer.parseInt(this.aLt[0]));
    localaIG.mH(Integer.parseInt(this.aLt[1]));
    paramcyx.d(localaIG);
  }
}