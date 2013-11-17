public class zY
{
  public static final String PACKAGE = "wakfu.blindBox";

  public static void showItemDetails(cEv paramcEv, dRq paramdRq)
  {
    bVw localbVw = (bVw)paramcEv.getItemValue();
    anG localanG = (anG)paramdRq.getElementMap().fi("itemDetailPopup");
    if ((paramcEv.mp() == CH.bGg) && (!bsP.getInstance().isDragging()))
    {
      dLE.doY().t("itemPopupDetail", localbVw);
      dLE.doY().t("isFromShortcut", Boolean.valueOf(false));
      ayw.popup(localanG, (dOc)paramcEv.cIl());
    } else if (paramcEv.mp() == CH.bGf) {
      dLE.doY().t("itemPopupDetail", null);
      dLE.doY().t("isFromShortcut", Boolean.valueOf(false));

      dLE.doY().t("isFromEquipedShortcut", Boolean.valueOf(false));
      ayw.closePopup(paramcEv, localanG);
    }
  }
}