public class dSq
{
  public static final String PACKAGE = "wakfu.arcadeDungeon";

  public static void closeArcadeDungeonDetailSmallDialog(cSx paramcSx)
  {
    dLE.doY().t("arcadeDungeonDetailsVisible", Boolean.valueOf(false));
  }

  public static void onArcadeDungeonCheckBoxOver(cSx paramcSx, dOc paramdOc)
  {
    paramdOc.setVisible(true);
  }

  public static void onArcadeDungeonCheckBoxOut(cSx paramcSx, dOc paramdOc) {
    br localbr = (br)paramcSx.cIl();
    if (!localbr.getSelected())
      paramdOc.setVisible(false);
  }

  public static void openCloseArcadeDungeonSmallDialog(dbi paramdbi, dOc paramdOc)
  {
    paramdOc.setVisible(paramdbi.isSelected());
  }

  public static void showItemDetails(cEv paramcEv, dRq paramdRq)
  {
    Object localObject2 = paramcEv.getItemValue();
    Object localObject1;
    if ((localObject2 instanceof CY)) {
      localObject3 = (CY)localObject2;
      cLE localcLE = ((CY)localObject3).Me();
      if (localcLE.cEJ() != aqF.dyk) {
        anG localanG = (anG)paramdRq.getElementMap().fi("rewardPopup");
        if ((paramcEv.mp() == CH.bGg) && (!bsP.getInstance().isDragging())) {
          dLE.doY().t("desc.reward", ((CY)localObject3).getDescription());
          ayw.popup(localanG, (dOc)paramcEv.cIl());
        } else if (paramcEv.mp() == CH.bGf) {
          ayw.closePopup(paramcEv, localanG);
          dLE.doY().t("desc.reward", null);
        }
        return;
      }
      localObject1 = Hh.QM().dh(localcLE.getValue());
    } else {
      localObject1 = (bVw)localObject2;
    }
    Object localObject3 = (anG)paramdRq.getElementMap().fi("itemDetailPopup");
    if ((paramcEv.mp() == CH.bGg) && (!bsP.getInstance().isDragging()))
    {
      dLE.doY().t("itemPopupDetail", localObject1);
      dLE.doY().t("isFromShortcut", Boolean.valueOf(false));
      ayw.popup((anG)localObject3, (dOc)paramcEv.cIl());
    } else if (paramcEv.mp() == CH.bGf) {
      dLE.doY().t("itemPopupDetail", null);
      dLE.doY().t("isFromShortcut", Boolean.valueOf(false));

      dLE.doY().t("isFromEquipedShortcut", Boolean.valueOf(false));
      ayw.closePopup(paramcEv, (anG)localObject3);
    }
  }
}