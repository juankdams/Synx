public class gt
{
  public static final String PACKAGE = "wakfu.webShop";

  public static void first(cSx paramcSx, dPS paramdPS)
  {
    paramdPS.dqZ();
  }

  public static void previous(cSx paramcSx, dPS paramdPS) {
    paramdPS.dph();
  }

  public static void next(cSx paramcSx, dPS paramdPS) {
    paramdPS.dpg();
  }

  public static void last(cSx paramcSx, dPS paramdPS) {
    paramdPS.dra();
  }

  public static void selectCategory(arS paramarS, dPS paramdPS) {
    if (paramarS.getSelected())
      paramdPS.d((acM)paramarS.getValue());
  }

  public static void search1(dbi paramdbi, dPS paramdPS) {
    if (paramdbi.isSelected());
  }

  public static void search2(dbi paramdbi, dPS paramdPS)
  {
    if (paramdbi.isSelected());
  }

  public static void search3(dbi paramdbi, dPS paramdPS)
  {
    if (paramdbi.isSelected());
  }

  public static void search4(dbi paramdbi, dPS paramdPS)
  {
    if (paramdbi.isSelected());
  }

  public static void search(cSx paramcSx, dPS paramdPS, duS paramduS)
  {
    paramdPS.rL(paramduS.getText());
  }

  public static void resetSearch(cSx paramcSx, dPS paramdPS, duS paramduS) {
    paramduS.setText("");
    paramdPS.rL("");
  }

  public static void quickBuy(cSx paramcSx, dPS paramdPS, aet paramaet) {
    paramdPS.a(paramaet);
  }

  public static void openItemDescription(dMr paramdMr, bVw parambVw) {
    if (paramdMr.getButton() == 3)
      eX.sendOpenCloseItemDetailMessage(paramdMr.cIl().getElementMap().coP(), parambVw);
  }

  public static void openArticleDescription(cSx paramcSx, aet paramaet)
  {
    dLE.doY().t("webShop.article", paramaet);
    if (!cBQ.cxL().mZ("webShopArticleDialog"))
      cBQ.cxL().a("webShopArticleDialog", VV.dJ("webShopArticleDialog"), 32768L, (short)10000);
  }
}