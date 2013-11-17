import java.util.ArrayList;

public class cDS
{
  public static final String PACKAGE = "wakfu.popupInfos";

  public static void showPopup(cSx paramcSx, dBv paramdBv, anG paramanG)
  {
    showPopup(paramcSx, paramdBv, paramanG, null);
  }

  public static void showPopup(cSx paramcSx, dBv paramdBv, anG paramanG, dOc paramdOc) {
    if ((paramdBv instanceof dKD)) {
      f((dKD)paramdBv);
    } else if ((paramdBv instanceof aMp)) {
      dLE.doY().t("osamodasSymbiot.describedCreature", paramdBv);
    } else if (((paramdBv instanceof dLB)) || ((paramdBv instanceof gA)) || ((paramdBv instanceof bVw)) || ((paramdBv instanceof cDm))) {
      dLE.doY().t("itemPopupDetail", paramdBv);
    }
    else
    {
      Object localObject;
      if ((paramdBv instanceof bzm)) {
        localObject = (bzm)paramdBv;
        if ((((bzm)localObject).aoo() instanceof gA))
          dLE.doY().t("itemPopupDetail", ((bzm)localObject).aoo());
      }
      else if ((paramdBv instanceof brO)) {
        dLE.doY().a("describedRunningEffect", paramdBv, paramcSx.cIl().getElementMap());
      } else if ((paramdBv instanceof bbS)) {
        localObject = (bbS)paramdBv;
        dLE.doY().a("displayedAchievement", localObject, paramcSx.cIl().getElementMap());
      } else if ((paramdBv instanceof cod)) {
        localObject = (cod)paramdBv;
        dLE.doY().a("displayedAchievement", aUi.eUP.nW(((cod)localObject).yC()), paramcSx.cIl().getElementMap());
      } else if ((paramdBv instanceof OR)) {
        dLE.doY().t("climateDetail", paramdBv);
      } else if ((paramdBv instanceof cfm)) {
        dLE.doY().t("overRecipe", paramdBv);
      }
    }
    if (paramdOc == null)
      ayw.popup(paramcSx, paramanG);
    else
      ayw.popup(paramcSx, paramanG, paramdOc);
  }

  public static void showPopup(cEv paramcEv, anG paramanG, dOc paramdOc)
  {
    Object localObject = paramcEv.getItemValue();

    if ((localObject instanceof dBv))
      showPopup(paramcEv, (dBv)localObject, paramanG, paramdOc);
  }

  public static void showPopup(cEv paramcEv, anG paramanG)
  {
    showPopup(paramcEv, paramanG, null);
  }

  public static void closePopup(cSx paramcSx) {
    bsP.getInstance().getPopupContainer().hide();
    dLE.doY().removeProperty("describedSpell");
    dLE.doY().removeProperty("currentDescribedContainer");
    dLE.doY().removeProperty("handsOfWeapon");
    dLE.doY().removeProperty("itemPopupDetail");
    dLE.doY().removeProperty("isFromEquipedShortcut");
    dLE.doY().removeProperty("isFromShortcut");
    dLE.doY().removeProperty("currentDescribedChallenge");
    bsP.getInstance().getPopupContainer().hide();
  }

  private static void f(dKD paramdKD)
  {
    byz localbyz = byv.bFN().bFO();
    Object localObject1 = localbyz;
    if ((localbyz.adF()) && (localbyz.aeQ() != null)) {
      if ((localbyz.aeQ().aDp().AP()) && 
        (localbyz.aeQ().aDp().Ia().getId() == localbyz.getId())) {
        localObject1 = localbyz.aeQ().aDp().Ia();
      }

      if (localObject1 == null)
        localObject1 = localbyz;
    }
    Object localObject2;
    if (paramdKD.asL() == bKq.gNe) {
      localObject2 = ((Su)localObject1).bV(paramdKD.oj());
      dLE.doY().t("describedSpell", localObject2);
    }

    if (paramdKD.asL() == bKq.gNh) {
      if (!bsP.getInstance().isDragging())
      {
        if (paramdKD.ok() == 2145) {
          localObject2 = new gA(-1L);
          bBn localbBn = Hh.QM().dh(2145);
          ((gA)localObject2).b(localbBn);
          ((gA)localObject2).l((short)1);
        } else {
          localObject2 = (gA)localbyz.ayJ().ci(paramdKD.oj());
          if (localObject2 == null) {
            localObject2 = localbyz.bHr().iS(paramdKD.oj());
          }
        }
        dLE.doY().t("handsOfWeapon", "twoHands");

        dLE.doY().t("itemPopupDetail", localObject2);
        dLE.doY().t("isFromEquipedShortcut", Boolean.valueOf(true));
      }
      else {
        dLE.doY().t("itemPopupDetail", null);
        dLE.doY().t("isFromEquipedShortcut", Boolean.valueOf(false));

        dLE.doY().t("isFromShortcut", Boolean.valueOf(false));
        dLE.doY().t("handsOfWeapon", "none");
      }

    }

    if (paramdKD.asL() == bKq.gNg)
    {
      localObject2 = (gA)byv.bFN().bFO().ayJ().hh(paramdKD.ok());
      if (localObject2 != null)
      {
        int i = byv.bFN().bFO().ayJ().il(((gA)localObject2).oj());
        if ((i == 15) || (i == 16))
        {
          if (!bsP.getInstance().isDragging())
          {
            if (i == 15)
            {
              if (((gA)localObject2).oi().bKm()) {
                dLE.doY().t("handsOfWeapon", "twoHands");
              }
              else {
                dLE.doY().t("handsOfWeapon", "rightHand");
              }

            }
            else if (i == 16) {
              dLE.doY().t("handsOfWeapon", "leftHand");
            }

            dLE.doY().t("itemPopupDetail", localObject2);
            dLE.doY().t("isFromEquipedShortcut", Boolean.valueOf(true));
          } else {
            dLE.doY().t("itemPopupDetail", null);
            dLE.doY().t("isFromEquipedShortcut", Boolean.valueOf(false));

            dLE.doY().t("isFromShortcut", Boolean.valueOf(false));
            dLE.doY().t("handsOfWeapon", "none");
          }

        }
        else
        {
          dLE.doY().t("isFromShortcut", Boolean.valueOf(false));

          if (((gA)localObject2).isUsable())
            dLE.doY().t("isFromEquipedShortcut", Boolean.valueOf(true));
          else {
            dLE.doY().t("isFromEquipedShortcut", Boolean.valueOf(false));
          }

          dLE.doY().t("itemPopupDetail", localObject2);
        }
      }
      else {
        localObject2 = (gA)byv.bFN().bFO().bGP().ye(paramdKD.ok());

        if (localObject2 != null)
        {
          bVw localbVw = (bVw)((gA)localObject2).oi();

          czM localczM = localbVw.cbh();
          if (((localczM.cwD().equals("")) && (localbVw.bKk() == 0) && (localczM.cwF().equals(""))) || ((localczM.cwD() == null) && (localczM.cwF() == null)))
          {
            dLE.doY().t("itemPopupDetail", localObject2);
            dLE.doY().t("isFromShortcut", Boolean.valueOf(true));
          }
          else if (!bsP.getInstance().isDragging())
          {
            dLE.doY().t("itemPopupDetail", localObject2);
            dLE.doY().t("isFromShortcut", Boolean.valueOf(true));
          } else {
            dLE.doY().t("itemPopupDetail", null);
            dLE.doY().t("isFromShortcut", Boolean.valueOf(false));

            dLE.doY().t("isFromEquipedShortcut", Boolean.valueOf(false));
          }
        }
      }
    }
  }

  public static void showPopup(cSx paramcSx, dBv paramdBv, String paramString)
  {
    showPopup(paramdBv, Integer.parseInt(paramString));
  }

  public static void showPopup(dBv paramdBv, int paramInt) {
    Bs localBs = new Bs(paramdBv);
    localBs.e(paramInt);
    localBs.d(19300);
    cjO.clE().j(localBs);
  }

  public static void hidePopup(cEv paramcEv) {
    Object localObject = paramcEv.getItemValue();
    if ((localObject instanceof dBv))
      hidePopup(paramcEv, (dBv)localObject);
  }

  public static void hidePopup(cSx paramcSx, dBv paramdBv)
  {
    Bs localBs = new Bs(paramdBv);
    localBs.d(19301);
    cjO.clE().j(localBs);
  }
}