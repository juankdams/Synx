public class amg extends dte
{
  private int ie;
  private byte doI;
  private long doJ;

  public amg(byte paramByte)
  {
    this.doI = paramByte;
  }

  public amg(int paramInt, byte paramByte) {
    this.ie = paramInt;
    this.doI = paramByte;
  }

  public amg(int paramInt, byte paramByte, long paramLong) {
    this.ie = paramInt;
    this.doI = paramByte;
    this.doJ = paramLong;
  }

  public boolean isValid()
  {
    return true;
  }

  public void execute()
  {
    aIG localaIG = new aIG();
    switch (this.doI) {
    case 1:
    case 2:
    case 9:
    case 11:
    case 12:
    case 13:
    case 14:
      localaIG.bM((byte)3);
      break;
    case 3:
    case 4:
    case 5:
    case 10:
      localaIG.bM((byte)6);
      break;
    case 15:
      OQ();
      return;
    case 6:
    case 7:
    case 8:
    }
    int i;
    if (this.ie < 0) {
      localObject = byv.bFN().bFO();
      if (localObject == null)
        return;
      i = ((byz)localObject).cJf().bP();
    } else {
      i = this.ie;
    }

    localaIG.bf((short)74);
    localaIG.mH(i);
    localaIG.bN(this.doI);
    localaIG.dU(this.doJ);

    Object localObject = byv.bFN().aJK();
    if (localObject != null)
      ((cyx)localObject).d(localaIG);
    else
      cth.cqP().err("Pour accéder à ces commandes il faut être connecté !");
  }

  private void OQ()
  {
    log("\"\" : info de base sur la nation (id, vote)");
    log("set nationId : change la nation du personnage en nation d'id nationId");
    log("vote info : Info de vote de notre nation");
    log("vote info nationId : Info de vote de nationId");
    log("vote start : demarre un vote sur notre nation");
    log("vote start nationId : demarre un vote sur nationId");
    log("vote end : termine le vote en cours sur notre nation");
    log("vote end nationId : termine le vote en cours sur nationId");
    log("cp amount : ajoute amount point de citoyenneté envers notre nation");
    log("al nationId alignementId : change l'alignement de notre nation envers nationId");
    log("(goInPrison | gp) nationId : declenche l'évenement d'envoi en prison vers nationId");
    log("(offenseRem | or) nationId : retire l'offense envers la nation nationId");
    log("(offenseAdd | oa) nationId : active l'offense envers la nation nationId");
    log("switchPasseport | sp : Active/désactive le passeport");
  }
}