public class bXO
{
  public static final String PACKAGE = "wakfu.achievements";

  public static void selectCategory(cEv paramcEv)
  {
    bsO localbsO = new bsO((aMT)paramcEv.getItemValue());
    cjO.clE().j(localbsO);
  }

  public static void displayHistory(cSx paramcSx) {
    bsO localbsO = new bsO(null);
    cjO.clE().j(localbsO);
  }

  public static void selectAchievement(cEv paramcEv) {
    dBo localdBo = new dBo((ckJ)paramcEv.getItemValue());
    cjO.clE().j(localdBo);
  }

  public static void mouseOverAchievementQuickList(cEv paramcEv) {
    dLE.doY().t("overQuickAchievement", paramcEv.getItemValue());
  }

  public static void mouseOutAchievementQuickList(cEv paramcEv) {
    dLE.doY().t("overQuickAchievement", dLE.doY().rv("selectedAchievement"));
  }

  public static void changeRewardBackgroundAndPopup(dMr paramdMr, anG paramanG, dOc paramdOc)
  {
    if (paramdMr.mp() == CH.bGs) {
      paramdOc.setStyle("itemSelectedBackground");
      ayw.popup(paramdMr, paramanG);
    } else if (paramdMr.mp() == CH.bGt) {
      paramdOc.setStyle("itemBackground");
      ayw.closePopup(paramdMr, paramanG);
    }
  }

  public static void changeAchievementFilter(dbi paramdbi, dHX paramdHX) {
    if (paramdbi.isSelected())
      bMK.bUv().a(paramdHX);
  }

  public static void selectLastCompletedAchievement(cSx paramcSx)
  {
    dBo localdBo = new dBo(null);
    cjO.clE().j(localdBo);
  }

  public static void selectPreviousAchievementQuickList(cSx paramcSx) {
    ckJ localckJ = bMK.bUv().bUy().bDk().bdQ();
    if (localckJ == null)
      return;
    dBo localdBo = new dBo(localckJ);
    cjO.clE().j(localdBo);
  }

  public static void selectNextAchievementQuickList(cSx paramcSx) {
    ckJ localckJ = bMK.bUv().bUy().bDk().bdR();
    if (localckJ == null)
      return;
    dBo localdBo = new dBo(localckJ);
    cjO.clE().j(localdBo);
  }

  public static void goBackCategory(cSx paramcSx) {
    bsO localbsO = new bsO(bMK.bUv().bUy().bDk());
    cjO.clE().j(localbsO);
  }

  public static boolean followAchievement(dbi paramdbi, ckJ paramckJ) {
    bzu localbzu = new bzu();
    localbzu.d(16138);
    localbzu.e(paramckJ.getId());
    localbzu.c(paramdbi.isSelected());
    cjO.clE().j(localbzu);
    return true;
  }

  public static void share(cSx paramcSx, ckJ paramckJ) {
    bzu localbzu = new bzu();
    localbzu.d(16139);
    localbzu.e(paramckJ.getId());
    cjO.clE().j(localbzu);
  }
}