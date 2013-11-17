import org.apache.log4j.Logger;

final class cFw
  implements bWH
{
  private static final Logger K = Logger.getLogger(cFw.class);

  public boolean a(bsh parambsh) {
    byte b = parambsh.Kh();
    bIK localbIK = bIK.dq(b);
    if (localbIK == null) {
      K.error("ID d'erreur de création de combat inconnue : " + b);
      return false;
    }
    K.info("Erreur de creation de combat " + localbIK);

    c(localbIK);
    b(localbIK);
    return false;
  }

  private void b(bIK parambIK) {
    String str = null;
    switch (cFO.iAM[parambIK.ordinal()]) {
    case 1:
      str = bU.fH().getString("fight.protector.already.ended");
      break;
    case 2:
      str = bU.fH().getString("attacked.protector.joinInFight");
      break;
    case 3:
      str = bU.fH().getString("attacked.protector.joinInFight");
    }

    if (str != null)
      nm(str);
  }

  private void nm(String paramString) {
    cBQ.cxL().a(paramString, Cn.et(1), 3L, 102, 1);
  }

  private void c(bIK parambIK)
  {
    String str;
    switch (cFO.iAM[parambIK.ordinal()]) {
    case 4:
      str = bU.fH().getString("fight.impossible.battleground.creation");
      break;
    case 5:
    case 6:
    case 7:
      str = bU.fH().getString("systemNotification.instanceConfig.cannotFight");
      break;
    case 8:
      str = bU.fH().getString("systemNotification.moderatedZone.cannotFight");
      break;
    case 9:
      str = bU.fH().getString("fight.creation.no.path.between.fighters");
      break;
    case 10:
    case 11:
      str = bU.fH().getString("fight.creation.target.busy");
      break;
    default:
      str = bU.fH().getString("fight.creation.error");
      K.info("Création du combat impossible : " + parambIK);
    }

    if (str != null)
      nn(str);
  }

  private void nn(String paramString) {
    aEe localaEe = new aEe(paramString);
    localaEe.mm(3);
    CM.LV().a(localaEe);
  }

  public void h(czN paramczN)
  {
  }

  public int azS() {
    return 7998;
  }

  public void jl(int paramInt)
  {
  }
}