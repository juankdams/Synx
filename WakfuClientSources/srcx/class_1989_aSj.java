import com.ankamagames.wakfu.client.WakfuClientInstance;
import java.util.ArrayList;
import org.apache.log4j.Logger;

public class aSj
{
  public static final String PACKAGE = "wakfu.exchange";
  private static final Logger K = Logger.getLogger(aSj.class);
  private static dUd das;

  public static void setReadyForExchange(cSx paramcSx, Long paramLong)
  {
    byz localbyz = byv.bFN().bFO();
    aqa localaqa = aYP.feK.bnR();

    aTp localaTp = (aTp)paramcSx.cIl().getElementMap().fi("exchangeKamasEditor");

    String str = localaTp.getText();
    cPO localcPO = (cPO)localaqa.gI(localbyz.getId());
    int i = str.length() == 0 ? 0 : Integer.parseInt(str);
    if (localcPO.cHk() != i) {
      return;
    }

    if (localaqa.azu() == 0)
    {
      QH localQH = new QH();
      localQH.setExchangeId(paramLong.longValue());
      cjO.clE().j(localQH);
    }
    else
    {
      showErrorMessage(localaqa);
    }
  }

  public static void dragItem(bvN parambvN, Long paramLong)
  {
    if (cBQ.cxL().mZ("splitStackDialog")) {
      cBQ.cxL().mW("splitStackDialog");
    }

    Object localObject = parambvN.getValue();
    if ((localObject != null) && ((localObject instanceof gA))) {
      gA localgA = (gA)localObject;
      aqa localaqa = aYP.feK.bnR();

      if (localaqa != null)
        localaqa.gH(localgA.oj());
    }
  }

  public static void dropItem(Qa paramQa, Long paramLong)
  {
    dGx.dhr().unlock();
    Object localObject1 = paramQa.getValue();
    if ((localObject1 != null) && ((localObject1 instanceof gA))) {
      gA localgA = (gA)paramQa.getValue();
      aqa localaqa = aYP.feK.bnR();

      if (localaqa.bPa() == localgA.oj()) {
        return;
      }

      boolean bool1 = paramQa.eA();
      boolean bool2 = WakfuClientInstance.awy().awB().a(bmz.fEE);
      Object localObject2;
      if (!bQs.bXv().ad(localgA)) {
        localObject2 = bU.fH().getString("exchange.itemUnexchangeable");
        aEe localaEe = new aEe((String)localObject2);
        localaEe.mm(3);
        CM.LV().ez(3).a(localaEe);
        return;
      }

      if ((localgA.nP() > 1) && (((bool1) && (!bool2)) || ((!bool1) && (bool2))))
      {
        aTs.setMaxQuantity(localgA.nP());
        aTs.setItem(localgA);
        aTs.setExchangeId(paramLong.longValue());
        aTs.setMessageType((short)16810);
        localObject2 = new czW();
        ((czW)localObject2).setItem(localgA);
        ((czW)localObject2).W((short)paramQa.getScreenX());
        ((czW)localObject2).X((short)paramQa.getScreenY());
        ((czW)localObject2).d(16821);
        cjO.clE().j((cWG)localObject2);
      }
      else {
        localObject2 = new bVD();
        ((bVD)localObject2).d(16810);
        ((bVD)localObject2).setExchangeId(paramLong.longValue());
        ((bVD)localObject2).setItem((gA)localObject1);
        ((bVD)localObject2).uh(localgA.nP());
        cjO.clE().j((cWG)localObject2);
      }
    }
  }

  public static void dropOut(cSx paramcSx, Long paramLong)
  {
    if ((paramcSx instanceof cTo)) {
      cTo localcTo = (cTo)paramcSx;
      Object localObject1 = localcTo.getValue();
      if ((localObject1 != null) && ((localObject1 instanceof gA))) {
        gA localgA = (gA)localObject1;

        boolean bool1 = localcTo.eA();
        boolean bool2 = WakfuClientInstance.awy().awB().a(bmz.fEE);
        Object localObject2;
        if (((localgA.nP() > 1) && (bool1) && (!bool2)) || ((!bool1) && (bool2)))
        {
          aTs.setMaxQuantity(localgA.nP());
          aTs.setItem(localgA);
          aTs.setExchangeId(paramLong.longValue());
          aTs.setMessageType((short)16811);
          localObject2 = new czW();
          ((czW)localObject2).setItem(localgA);
          ((czW)localObject2).W((short)localcTo.getScreenX());
          ((czW)localObject2).X((short)localcTo.getScreenY());
          ((czW)localObject2).d(16821);
          cjO.clE().j((cWG)localObject2);
        }
        else
        {
          localObject2 = new bVD();
          ((bVD)localObject2).d(16811);
          ((bVD)localObject2).setExchangeId(paramLong.longValue());
          ((bVD)localObject2).setItem(localgA);
          ((bVD)localObject2).uh(localgA.nP());
          cjO.clE().j((cWG)localObject2);
        }
      }
    }
  }

  public static void removeItem(cEv paramcEv, Long paramLong)
  {
    Object localObject = paramcEv.getItemValue();
    if ((localObject != null) && ((localObject instanceof gA))) {
      gA localgA = (gA)localObject;

      bVD localbVD = new bVD();
      localbVD.d(16811);
      localbVD.setExchangeId(paramLong.longValue());
      localbVD.setItem(localgA);
      localbVD.uh(localgA.nP());
      cjO.clE().j(localbVD);
    }
  }

  public static void exchangeMoney(Gy paramGy, Long paramLong) {
    if (!paramGy.getFocused())
      exchangeMoney((aTp)paramGy.cIk(), paramLong);
  }

  public static void exchangeMoney(ctH paramctH, Long paramLong)
  {
    if (paramctH.getKeyCode() == 10)
      zC.Ip().e(null);
  }

  public static void exchangeMoney(aTp paramaTp, Long paramLong)
  {
    bfC localbfC = new bfC();
    String str = paramaTp.getText();
    localbfC.ps(str.length() == 0 ? 0 : Integer.parseInt(str));
    localbfC.setExchangeId(paramLong.longValue());
    localbfC.d(16823);
    cjO.clE().j(localbfC);
  }

  public static void openItemDetailWindow(cEv paramcEv, bpn parambpn)
  {
    if (paramcEv.getButton() == 3) {
      Object localObject = paramcEv.getItemValue();
      if ((localObject instanceof gA))
        eX.sendOpenCloseItemDetailMessage(parambpn.getElementMap().getId(), (gA)localObject);
      else if ((localObject instanceof bVw))
        eX.sendOpenCloseItemDetailMessage(parambpn.getElementMap().getId(), (bVw)localObject);
    }
  }

  public static void showItemDetailPopup(cEv paramcEv, bpn parambpn)
  {
    Object localObject = paramcEv.getItemValue();
    bVw localbVw;
    if ((localObject instanceof gA)) {
      localbVw = (bVw)((gA)localObject).oi();
    } else {
      K.error("Erreur, ceci n'est pas un item !");
      return;
    }

    czM localczM = localbVw.cbh();
    anG localanG1;
    if (((localczM.cwD().equals("")) && (localczM.cwF().equals("")) && (localbVw.bKk() == 0)) || ((localczM.cwD() == null) && (localczM.cwF() == null)))
    {
      localanG1 = (anG)parambpn.getElementMap().fi("itemSimplePopup");
    }
    else localanG1 = (anG)parambpn.getElementMap().fi("itemDetailPopup");

    anG localanG2 = localanG1;

    if (((paramcEv.mp() == CH.bGs) || (paramcEv.mp() == CH.bGg)) && (!bsP.getInstance().isDragging())) {
      das = new daF(localObject, localanG2, parambpn);

      cAo.cxf().a(das, 0L, -1, 1);
    } else if ((paramcEv.mp() == CH.bGt) || (paramcEv.mp() == CH.bGf)) {
      if (das != null) {
        cAo.cxf().b(das);
        das = null;
      } else {
        ayw.closePopup(paramcEv, localanG1);
      }
    }
  }

  public static void showErrorMessage(aqa paramaqa)
  {
    if (paramaqa.azu() == 0) {
      K.error("On veut afficher un message d'erreur pour un échange valide");
      return;
    }
    dqD localdqD;
    String str1;
    if (paramaqa.azu() == 1) {
      localdqD = paramaqa.bPb();
      str1 = "inventoryFull";
    } else if (paramaqa.azu() == 2) {
      localdqD = paramaqa.bPc();
      str1 = "inventoryFull";
    } else if (paramaqa.azu() == 3) {
      localdqD = paramaqa.bPb();
      str1 = "objectDoesntExist";
    } else {
      localdqD = paramaqa.bPc();
      str1 = "objectDoesntExist";
    }

    String str2 = bU.fH().getString("exchange.error." + str1, new Object[] { localdqD.getName() });
    cBQ.cxL().a(str2, Cn.et(1), 1027L, 102, 1);
  }

  public static void closeExchangeDialog(cSx paramcSx, Long paramLong)
  {
    int i = 0;
    Object localObject;
    switch (daD.cab[paramcSx.mp().ordinal()]) {
    case 1:
    case 2:
      break;
    case 3:
      localObject = (ctH)paramcSx;
      i = ((ctH)localObject).getKeyCode() == 27 ? 1 : 0;
      break;
    case 4:
      i = 1;
    }

    if (i != 0)
    {
      localObject = new bzu();
      ((bzu)localObject).d(16812);
      ((bzu)localObject).c(paramLong.longValue());
      cjO.clE().j((cWG)localObject);
    }
  }

  public static void onMouseOverExhange(cSx paramcSx)
  {
    if (bsP.getInstance().isDragging()) {
      aNL localaNL = bsP.getInstance().getDragged().getParent();
      if ((localaNL instanceof axU)) {
        axU localaxU = (axU)localaNL;
        if ((localaxU.getItemValue() instanceof gA)) {
          gA localgA = (gA)localaxU.getItemValue();
          if (!bQs.bXv().ad(localgA))
            dGx.dhr().a(duv.lyu, true);
        }
      }
    }
  }
}