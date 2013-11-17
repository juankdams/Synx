public class bLU
{
  public static final String PACKAGE = "wakfu.tutorialBook";

  public static void launchTutorial(cEv paramcEv)
  {
    launchTutorial(paramcEv, (dum)paramcEv.getItemValue());
  }

  public static void launchTutorial(cSx paramcSx, dum paramdum) {
    if (paramdum.btw()) {
      bzu localbzu = new bzu();
      localbzu.d(19149);
      cjO.clE().j(localbzu);
    } else {
      paramdum.launch();
    }
  }

  public static void searchTutorial(cSx paramcSx) {
    aTp localaTp = (aTp)paramcSx.cIl();
    dLE.doY().t("tutorialSearchDirty", Boolean.valueOf(localaTp.getText().length() > 0));

    searchTutorial(paramcSx, localaTp);
  }

  public static void searchTutorial(cSx paramcSx, aTp paramaTp) {
    String str = paramaTp.getText();
    if (str != null) {
      bzu localbzu = new bzu();
      localbzu.d(19370);
      localbzu.a(str);
      cjO.clE().j(localbzu);
    }
  }

  public static void setPreviousTutorialPage(cSx paramcSx) {
    bzu localbzu = new bzu();
    localbzu.d(19371);
    cjO.clE().j(localbzu);
  }

  public static void setNextTutorialPage(cSx paramcSx) {
    bzu localbzu = new bzu();
    localbzu.d(19372);
    cjO.clE().j(localbzu);
  }

  public static void clearSearch(cSx paramcSx, aTp paramaTp) {
    bzu localbzu = new bzu();
    localbzu.d(19370);
    localbzu.a(null);
    cjO.clE().j(localbzu);
    paramaTp.biL();
  }
}