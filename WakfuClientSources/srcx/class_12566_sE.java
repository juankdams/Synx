import org.apache.log4j.Logger;

public class sE
{
  public static final String PACKAGE = "wakfu.osamodasSymbiot";
  private static final Logger K = Logger.getLogger(sE.class);

  public static void selectCreature(cSx paramcSx)
  {
    if ((paramcSx != null) && (CH.bGd.equals(paramcSx.mp()))) {
      cEv localcEv = (cEv)paramcSx;
      if ((localcEv.getItemValue() instanceof aMp)) {
        byz localbyz = byv.bFN().bFO();
        aMp localaMp = (aMp)localcEv.getItemValue();
        bzu localbzu;
        if (localcEv.getButton() == 1)
        {
          localbzu = new bzu();
          localbzu.d(16814);
          localbzu.a(localbyz.bGo().a(localaMp));
          cjO.clE().j(localbzu);
        }
        else if (localcEv.getButton() == 3) {
          bJI.bRn().a(localaMp);
        } else if (localcEv.getButton() == 507)
        {
          localbzu = new bzu();
          localbzu.d(16815);
          localbzu.a(localbyz.bGo().a(localaMp));
          cjO.clE().j(localbzu);
        }
      }
    }
  }

  public static void selectNextCreature(cSx paramcSx)
  {
    if ((paramcSx != null) && (CH.bGy.equals(paramcSx.mp()))) {
      dMr localdMr = (dMr)paramcSx;

      bzu.cf((short)16815);
    }
  }

  public static boolean validateChangeNameForm(dso paramdso)
  {
    paramdso.cYU();
    bbo localbbo = paramdso.getProperty("osamodasSymbiot.describedCreature");
    if (localbbo != null) {
      String str1 = localbbo.hL("name");
      String str2 = bXy.kF(str1);
      if (!str2.equals(str1))
        localbbo.a("name", str2);
      return eX.checkNameValidity(str1);
    }
    return true;
  }

  public static void setCreatureName(cSx paramcSx, aMp paramaMp, aTp paramaTp)
  {
    if ((paramcSx.mp() == CH.bGw) || ((paramcSx.mp() == CH.bGh) && (((ctH)paramcSx).getKeyCode() == 10))) {
      byz localbyz = byv.bFN().bFO();
      if (paramaTp.isValid()) {
        bzu localbzu = new bzu();
        localbzu.a(paramaTp.getText());
        localbzu.a(localbyz.bGo().a(paramaMp));
        localbzu.d(16817);
        cjO.clE().j(localbzu);
      } else {
        K.warn("Formulaire invalide");
      }
    }
  }

  public static void freeCreature(cSx paramcSx, aMp paramaMp) {
    byz localbyz = byv.bFN().bFO();
    bzu localbzu = new bzu();
    localbzu.a(localbyz.bGo().a(paramaMp));
    localbzu.d(16816);
    cjO.clE().j(localbzu);
  }

  public static void monsterPopup(cSx paramcSx) {
    apX localapX = (apX)byv.bFN().bFO().auK().hh(787);
    if (localapX != null)
      dLE.doY().t("describedSpell", localapX);
  }

  public static void closeMonsterPopup(cSx paramcSx) {
    dLE.doY().t("describedSpell", null);
  }
}