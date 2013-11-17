public class aTC
{
  public static final String PACKAGE = "wakfu.playerGift";

  public static void packageListOffset(cSx paramcSx, ccG paramccG, String paramString)
  {
    float f = bUD.getFloat(paramString);
    paramccG.setListOffset(paramccG.getOffset() + f);
  }

  public static void consumeOneGift(cSx paramcSx, ddO paramddO) {
    bei localbei = new bei(paramddO);
    localbei.c(false);
    localbei.d(16622);
    cjO.clE().j(localbei);
  }

  public static void consumeAllGifts(cSx paramcSx, ddO paramddO) {
    bei localbei = new bei(paramddO);
    localbei.c(true);
    localbei.d(16622);
    cjO.clE().j(localbei);
  }

  public static void selectGiftPackage(cEv paramcEv) {
    cYY localcYY = new cYY((bsf)paramcEv.getItemValue());
    localcYY.d(16623);
    cjO.clE().j(localcYY);
  }

  public static void showItemDetailPopup(cEv paramcEv) {
    ddO localddO = (ddO)paramcEv.getItemValue();
    cDS.showPopup(localddO.Hu(), 0);
  }

  public static void hideItemDetailPopup(cEv paramcEv) {
    ddO localddO = (ddO)paramcEv.getItemValue();
    cDS.hidePopup(paramcEv, localddO.Hu());
  }

  public static void openCloseDialog(cSx paramcSx) {
    bzu.cf((short)16620);
  }

  public static void openItemDetails(cSx paramcSx, ddO paramddO, bpn parambpn) {
    if (((dMr)paramcSx).getButton() != 1) {
      bVw localbVw = paramddO.Hu();
      gA localgA = new gA(localbVw.getId());
      localgA.b(localbVw);
      Object localObject;
      if (localgA.nI()) {
        localObject = new dkW(new ckV(localgA));
        ((ace)localObject).d(16430);
      } else {
        localObject = new cER();
        ((ace)localObject).d(16415);
        ((ace)localObject).a(localgA);
      }

      ((ace)localObject).dX(parambpn == null ? null : parambpn.getElementMap().getId());
      cjO.clE().j((cWG)localObject);
    }
  }
}