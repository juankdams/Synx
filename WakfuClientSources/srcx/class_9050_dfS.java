import com.ankamagames.wakfu.client.WakfuClientInstance;
import org.apache.log4j.Logger;

public class dfS
{
  public static final String PACKAGE = "wakfu.dimensionalBagFlea";
  private static final Logger K = Logger.getLogger(dfS.class);

  private static boolean laz = false;
  private static dUd das;

  public static void closeDimensionalBagFleaDialog(cSx paramcSx)
  {
    K.error("DimensionalBagFleaDialog.closeDimensionalBagFleaDialog()");

    if (cBQ.cxL().mZ("dimensionalBagFleaDialog"))
      cPv();
  }

  private static final void cPv()
  {
    dLE.doY().t("showRoomBagDetails", Boolean.valueOf(false));
    byv.bFN().b(bLT.bTA());
  }

  public static void setShortAd(cSx paramcSx, dso paramdso)
  {
    if ((paramcSx instanceof Gy)) {
      Gy localGy = (Gy)paramcSx;

      if ((localGy.cIl() == localGy.cIk()) && (!localGy.getFocused()) && 
        (!paramdso.isValid()))
      {
        cBQ.cxL().a(bU.fH().getString("error.flea.invalidAd"), Cn.et(1), 1027L, 102, 1);
      }
    }
  }

  public static void dropItem(cSx paramcSx)
  {
    dGx.dhr().unlock();
    if ((paramcSx instanceof Qa)) {
      byz localbyz = byv.bFN().bFO();
      dVw localdVw = new dVw(localbyz);

      if (!bGP.gDx.a(new aGH[] { localdVw }))
      {
        localObject1 = bU.fH().getString("error.playerNotSubscribed");
        localObject2 = new aEe((String)localObject1);
        ((aEe)localObject2).mm(3);
        CM.LV().a((aEe)localObject2);
        return;
      }

      Object localObject1 = (Qa)paramcSx;
      Object localObject2 = ((Qa)localObject1).getValue();

      axU localaxU = ((Qa)localObject1).abO().getRenderableParent();
      byte b = (byte)localaxU.getCollection().getTableIndex(localaxU);

      if (laz) {
        b = (byte)(b + 1);
      }

      aTs.setDestinationPosition(Byte.valueOf(b));

      if ((localObject2 instanceof BG)) {
        cHE localcHE = new cHE();
        localcHE.setMerchantItem((BG)localObject2);
        localcHE.aC((short)aTs.getDestinationPosition());
        localcHE.d(17307);
        cjO.clE().j(localcHE);
      }
      else if ((localObject2 instanceof gA)) {
        boolean bool1 = ((Qa)localObject1).eA();
        boolean bool2 = WakfuClientInstance.awy().awB().a(bmz.fEE);
        Object localObject3;
        if ((((gA)localObject2).nP() > 1) && (((bool1) && (!bool2)) || ((!bool1) && (bool2))))
        {
          aTs.setMaxQuantity(((gA)localObject2).nP());
          aTs.setItem((gA)localObject2);
          aTs.setMessageType((short)17304);

          localObject3 = new czW();
          ((czW)localObject3).setItem((gA)localObject2);
          ((czW)localObject3).W((short)((Qa)localObject1).getScreenX());
          ((czW)localObject3).X((short)((Qa)localObject1).getScreenY());
          ((czW)localObject3).d(16821);
          cjO.clE().j((cWG)localObject3);
        } else {
          localObject3 = new cHE();
          ((cHE)localObject3).setItem((gA)localObject2);
          ((cHE)localObject3).aC((short)aTs.getDestinationPosition());
          ((cHE)localObject3).d(17304);
          cjO.clE().j((cWG)localObject3);
        }
      }
    }
  }

  public static void itemDropOut(cTo paramcTo)
  {
    if ((paramcTo.getValue() instanceof BG)) {
      BG localBG = (BG)paramcTo.getValue();
      if ((!paramcTo.eA()) || (localBG.nP() <= 1)) {
        cHE localcHE = new cHE();
        localcHE.setMerchantItem(localBG);
        localcHE.d(17305);
        cjO.clE().j(localcHE);
      }
    }
  }

  public static void removeMarketItem(cSx paramcSx, BG paramBG)
  {
    cHE localcHE = new cHE();
    localcHE.setMerchantItem(paramBG);
    localcHE.d(17305);
    cjO.clE().j(localcHE);
  }

  public static void onMouseEnterIntersection(cSx paramcSx, jO paramjO)
  {
    if (bsP.getInstance().isDragging()) {
      paramjO.setColor(bNa.gRy);
      laz = true;
    }
  }

  public static void onMouseExitIntersection(cSx paramcSx, jO paramjO)
  {
    paramjO.setColor(bNa.gRu);
    laz = false;
  }

  public static void showItemDetailPopup(cEv paramcEv, bpn parambpn)
  {
    Object localObject = paramcEv.getItemValue();
    if (!(localObject instanceof BG)) {
      return;
    }
    if (paramcEv.mp() == CH.bGg) {
      anG localanG = (anG)parambpn.getElementMap().fi("itemDetailPopup");
      dLE.doY().t("itemPopupDetail", paramcEv.getItemValue());
      ayw.popup(paramcEv, localanG);
    } else if (paramcEv.mp() == CH.bGf) {
      ayw.closePopup(paramcEv);
    }
  }
}