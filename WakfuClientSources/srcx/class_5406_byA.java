import com.ankamagames.wakfu.client.WakfuClientInstance;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.log4j.Logger;

public class byA extends cNB
{
  public static final String PACKAGE = "wakfu.equipment";
  public static final String bwu = "_AnimStatique";
  private static long cfv;
  protected static final Logger K = Logger.getLogger(byA.class);
  private static bpn glW;
  private static czv fyP;
  private static final ArrayList glX = new ArrayList();

  public static void addListener(cjM paramcjM) {
    glX.add(paramcjM);
  }

  public static void removeListener(cjM paramcjM) {
    glX.remove(paramcjM);
  }

  public static void inventoryDragItem(bvN parambvN, gA paramgA)
  {
    cRs localcRs = byv.bFN().bFO().bGP().iQ(paramgA.oj());
    if (localcRs != null)
      inventoryDragItem(parambvN, ((bCJ)localcRs).bLg());
  }

  public static void inventoryDragItem(bvN parambvN, col paramcol)
  {
    bCJ localbCJ = paramcol.aQC();
    Object localObject = parambvN.getValue();
    if ((localObject != null) && ((localObject instanceof gA)))
    {
      if (cBQ.cxL().mZ("splitStackDialog")) {
        cBQ.cxL().mW("splitStackDialog");
      }

      gA localgA = (gA)localObject;

      short s = localbCJ.il(localgA.oj());

      cfv = localgA.oj();
      aTs.setSourceUniqueId(localbCJ.EN());
      aTs.setSourcePosition((byte)s);

      dLE.doY().t("exchange.sourceBag", localbCJ);
      dLE.doY().t("exchange.sourcePosition", Short.valueOf(s));

      onDragItem(localgA);

      if ((byv.bFN().c(bAO.bJl())) && (bAO.bJl().bJs() == 1))
        bAO.bJl().bJn();
    }
  }

  public static void dropItem(cSx paramcSx)
  {
    dLE.doY().removeProperty("exchange.sourceBag");
    dLE.doY().removeProperty("exchange.sourcePosition");

    if ((byv.bFN().c(bAO.bJl())) && (bAO.bJl().bJs() == 1)) {
      bAO.bJl().bJo();
    }

    if ((paramcSx instanceof Qa)) {
      onDropItem();
    }
    else if ((paramcSx instanceof cTo))
      onDropItem();
  }

  public static void onDropItem()
  {
    aCg.aOq().aOx();
    aQw.bhd().aRK();
    aFx.aRI().aRK();

    ArrayList localArrayList = new ArrayList();
    cDA localcDA = cBQ.cxL().coO();

    cpa localcpa1 = localcDA.nf("equipmentDialog");
    if (localcpa1 != null) {
      localArrayList.add(localcpa1);
    }

    cpa localcpa2 = localcDA.nf("stuffPreviewDialog");
    if (localcpa2 != null) {
      localArrayList.add(localcpa2);
    }

    for (cpa localcpa3 : localArrayList) {
      for (azO localazO : azO.values()) {
        dOc localdOc = (dOc)localcpa3.fi("equipDisabled" + localazO.hV);
        if ((localdOc != null) && (localdOc.getVisible())) {
          localdOc.setVisible(false);
        }
      }
    }

    int i = 0; for (int j = glX.size(); i < j; i++)
      ((cjM)glX.get(i)).clD();
  }

  public static void onDragItem(gA paramgA)
  {
    aCg.aOq().F(paramgA);
    aQw.bhd().H(paramgA);
    aFx.aRI().H(paramgA);

    byz localbyz = byv.bFN().bFO();
    if (aYP.feK.bnR() != null) {
      return;
    }

    azO[] arrayOfazO1 = paramgA.oi().bKn().nh();
    if (arrayOfazO1.length > 0)
    {
      ArrayList localArrayList = new ArrayList();
      cDA localcDA = cBQ.cxL().coO();

      cpa localcpa1 = localcDA.nf("equipmentDialog");
      if (localcpa1 != null) {
        localArrayList.add(localcpa1);
      }

      cpa localcpa2 = localcDA.nf("stuffPreviewDialog");
      if (localcpa2 != null) {
        localArrayList.add(localcpa2);
      }

      for (cpa localcpa3 : localArrayList)
      {
        for (azO localazO1 : azO.values()) {
          dOc localdOc = (dOc)localcpa3.fi("equipDisabled" + localazO1.hV);
          if (localdOc != null) {
            int n = 0;

            if (!localbyz.isDead()) {
              for (azO localazO2 : arrayOfazO1) {
                if (localazO2.hV == localazO1.hV) {
                  n = 1;
                }
              }
            }

            localdOc.setVisible(true);
            if (n == 0)
              localdOc.setStyle("itemDisabled");
            else {
              localdOc.setStyle("itemEnabled");
            }
          }
        }
      }
    }

    int i = 0; for (int j = glX.size(); i < j; i++)
      ((cjM)glX.get(i)).al(paramgA);
  }

  public static void equipmentDragItem(cSx paramcSx, String paramString)
  {
    if ((paramcSx instanceof bvN))
    {
      if (cBQ.cxL().mZ("splitStackDialog")) {
        cBQ.cxL().mW("splitStackDialog");
      }

      bvN localbvN = (bvN)paramcSx;
      if ((localbvN.getValue() != null) && ((localbvN.getValue() instanceof gA))) {
        cfv = ((gA)localbvN.getValue()).oj();
        aTs.setSourceUniqueId(2L);
        aTs.setSourcePosition(Byte.valueOf(paramString).byteValue());

        dLE.doY().t("exchange.sourceBag", byv.bFN().bFO().ayJ());
        dLE.doY().t("exchange.sourcePosition", Byte.valueOf(aTs.getSourcePosition()));

        gA localgA = (gA)localbvN.getValue();
        onDragItem(localgA);
      }
    }
  }

  public static void itemDropOut(cTo paramcTo)
  {
    dropItem(paramcTo);
    if ((paramcTo.getValue() instanceof cty)) {
      return;
    }

    byz localbyz = byv.bFN().bFO();

    if (aYP.feK.bnR() != null)
      return;
    Object localObject;
    if (!bGP.gDv.a(new aGH[] { localbyz }))
    {
      localObject = bU.fH().getString("error.playerNotSubscribed");
      aEe localaEe = new aEe((String)localObject);
      localaEe.mm(3);
      CM.LV().a(localaEe);
      return;
    }

    if ((paramcTo.getValue() instanceof gA)) {
      localObject = (gA)paramcTo.getValue();
      if (bsP.getInstance().getWidget(paramcTo.getScreenX(), paramcTo.getScreenY()) == bsP.getInstance())
      {
        if (((gA)localObject).oj() == cfv) {
          boolean bool1 = paramcTo.eA();
          boolean bool2 = WakfuClientInstance.awy().awB().a(bmz.fEE);

          if ((((gA)localObject).or()) || ((((gA)localObject).oi().a(Aq.bvR) != null) && (!((gA)localObject).oi().a(Aq.bvR).i(localbyz, localbyz.ML(), localObject, localbyz.bEY()))) || ((((gA)localObject).oi().a(Aq.bvS) != null) && (!((gA)localObject).oi().a(Aq.bvS).i(localbyz, localbyz.ML(), localObject, localbyz.bEY()))))
          {
            dtY.aR((gA)localObject);
          }
          else
          {
            czW localczW;
            if ((((gA)localObject).nP() > 1) && (((bool1) && (!bool2)) || ((!bool1) && (bool2))))
            {
              aTs.setMaxQuantity(((gA)localObject).nP());
              aTs.setItem((gA)localObject);
              aTs.setMessageType((short)16820);
              localczW = new czW();
              localczW.setItem((gA)localObject);
              localczW.W((short)paramcTo.getScreenX());
              localczW.X((short)paramcTo.getScreenY());
              localczW.d(16821);
              cjO.clE().j(localczW);
            } else {
              localczW = new czW();
              localczW.setSourceUniqueId(aTs.getSourceUniqueId());
              localczW.setItem((gA)localObject);
              localczW.l((short)-1);
              localczW.d(16820);
              cjO.clE().j(localczW);
            }
          }
        }
      }
    }
  }

  public static void dropBag(cSx paramcSx)
  {
    if (!(paramcSx instanceof Qa)) {
      return;
    }

    onDropItem();

    Qa localQa = (Qa)paramcSx;
    Object localObject1 = localQa.getValue();
    if (localObject1 == null)
      return;
    Object localObject2;
    Object localObject3;
    if ((localObject1 instanceof gA)) {
      localObject2 = (gA)localObject1;
      byte b2;
      if ((((gA)localObject2).ol().nc() == 218) || (((gA)localObject2).ol().nc() == 399)) {
        localObject3 = aYP.feK.bnR();
        if ((localObject3 != null) && 
          (((gA)localObject2).oj() == ((aqa)localObject3).bPa()))
        {
          localObject4 = new bVD();
          ((bVD)localObject4).d(16811);
          ((bVD)localObject4).setExchangeId(((aqa)localObject3).getId());
          ((bVD)localObject4).setItem((gA)localObject2);
          ((bVD)localObject4).uh(((gA)localObject2).nP());
          cjO.clE().j((cWG)localObject4);
          ((aqa)localObject3).gH(-1L);
          return;
        }

        Object localObject4 = localQa.abO().getRenderableParent();
        b2 = (byte)(((axU)localObject4).getCollection().getTableIndex((axU)localObject4) + 1);

        byte b3 = aTs.getSourcePosition();

        czW localczW1 = new czW();
        localczW1.setItem((gA)localObject2);
        localczW1.setSourcePosition(b3);
        localczW1.cz(b2);
        localczW1.setSourceUniqueId(aTs.getSourceUniqueId());
        localczW1.d(17710);
        cjO.clE().j(localczW1);
      } else {
        localObject3 = localQa.abO().getRenderableParent();
        byte b1 = (byte)(((axU)localObject3).getCollection().getTableIndex((axU)localObject3) + 1);

        b2 = aTs.getSourcePosition();
        cRs localcRs = byv.bFN().bFO().bGP().er(b1);
        if (localcRs != null) {
          aTs.setDestinationUniqueId(localcRs.EN());
          int i = localcRs.aM((gA)localObject2);
          if (i == -1) {
            i = localcRs.bQI();
          }
          if (i == -1) {
            cBQ.cxL().a(bU.fH().getString("error.bagFull"), Cn.et(1), 1027L, 102, 1);

            return;
          }

          aTs.setDestinationPosition(Byte.valueOf((byte)i));

          boolean bool1 = localQa.eA();
          boolean bool2 = WakfuClientInstance.awy().awB().a(bmz.fEE);

          int j = (((gA)localObject2).nP() > 1) && (((bool1) && (!bool2)) || ((!bool1) && (bool2))) ? 1 : 0;
          czW localczW2;
          if (j != 0) {
            aTs.setDestinationUniqueId(localcRs.EN());
            aTs.setMaxQuantity(((gA)localObject2).nP());
            aTs.setItem((gA)localObject2);
            aTs.setMessageType((short)16804);
            localczW2 = new czW();
            localczW2.setItem((gA)localObject2);
            localczW2.W((short)localQa.getScreenX());
            localczW2.X((short)localQa.getScreenY());
            localczW2.d(16821);
            cjO.clE().j(localczW2);
          } else {
            localczW2 = new czW();
            localczW2.setSourcePosition(b2);
            localczW2.setSourceUniqueId(aTs.getSourceUniqueId());
            localczW2.setDestinationUniqueId(localcRs.EN());
            localczW2.cz(aTs.getDestinationPosition());
            localczW2.setItem((gA)localObject2);
            localczW2.l((short)-1);
            localczW2.d(16804);
            cjO.clE().j(localczW2);
          }
        }
      }
    } else if ((localObject1 instanceof col)) {
      localObject2 = ((col)localObject1).aQC();
      localObject3 = new bzu();
      axU localaxU = localQa.abO().getRenderableParent();
      ((bzu)localObject3).a((byte)(localaxU.getCollection().getTableIndex(localaxU) + 1));
      ((bzu)localObject3).c(((bCJ)localObject2).EN());
      ((bzu)localObject3).d(17712);
      cjO.clE().j((cWG)localObject3);
    }
  }

  public static void equipmentDropItem(cSx paramcSx, String paramString)
  {
    aTs.setDestinationUniqueId(2L);
    aTs.setDestinationPosition(Byte.valueOf(paramString));
    if ((paramcSx instanceof Qa)) {
      Qa localQa = (Qa)paramcSx;
      if ((localQa.getValue() != null) && ((localQa.getValue() instanceof gA))) {
        gA localgA = (gA)localQa.getValue();

        dropItem(paramcSx);
        Object localObject2;
        if (byv.bFN().bFO().bGZ())
        {
          localObject1 = dLE.doY().getProperty("temporaryInventory.currentDragItemId");
          if ((localObject1 != null) && (localgA.oj() == ((bbo)localObject1).getLong())) {
            localObject2 = new czW();
            ((czW)localObject2).d(16825);
            ((czW)localObject2).setItem(localgA);
            ((czW)localObject2).l(localgA.nP());
            ((czW)localObject2).setDestinationUniqueId(aTs.getDestinationUniqueId());
            ((czW)localObject2).cz(aTs.getDestinationPosition());
            cjO.clE().j((cWG)localObject2);
            return;
          }
        }

        Object localObject1 = aYP.feK.bnR();

        if (localObject1 != null)
        {
          if (localgA.oj() == ((aqa)localObject1).bPa())
          {
            localObject2 = new bVD();
            ((bVD)localObject2).d(16811);
            ((bVD)localObject2).setExchangeId(((aqa)localObject1).getId());
            ((bVD)localObject2).setItem(localgA);
            ((bVD)localObject2).uh(localgA.nP());
            cjO.clE().j((cWG)localObject2);
            ((aqa)localObject1).gH(-1L);
          }
        } else if (localgA.oj() == cfv) {
          localObject2 = new czW();
          ((czW)localObject2).l((short)1);
          ((czW)localObject2).setSourceUniqueId(aTs.getSourceUniqueId());
          ((czW)localObject2).setDestinationUniqueId(2L);
          ((czW)localObject2).cz(aTs.getDestinationPosition());
          ((czW)localObject2).setSourcePosition(aTs.getSourcePosition());
          ((czW)localObject2).setSourceUniqueId(aTs.getSourceUniqueId());
          ((czW)localObject2).setDestinationUniqueId(aTs.getDestinationUniqueId());
          ((czW)localObject2).setItem(localgA);
          ((czW)localObject2).d(16804);
          cjO.clE().j((cWG)localObject2);
        }
      }
    }
  }

  public static void equipmentDropItem(cSx paramcSx) {
    equipmentDropItem(paramcSx, "-1");
  }

  public static void inventoryDropItem(Qa paramQa)
  {
    Object localObject = paramQa.getValue();
    if (localObject == null) {
      return;
    }

    bCJ localbCJ1 = null;
    bMD localbMD = byv.bFN().bFO().bGP();
    gA localgA = null;
    if ((localObject instanceof col)) {
      bCJ localbCJ2 = ((col)localObject).aQC();
      if (localbCJ2.EN() == 2L) {
        czW localczW = new czW();
        localczW.cz((byte)-1);
        localczW.setDestinationUniqueId(-1L);
        localczW.setSourceUniqueId(localbCJ2.EN());
        localczW.d(17711);
        cjO.clE().j(localczW);
      }
      return;
    }
    if ((localObject instanceof gA))
      localgA = (gA)paramQa.getValue();
    else if ((localObject instanceof BG)) {
      localgA = ((BG)paramQa.getValue()).getItem();
    }
    localbCJ1 = (bCJ)localbMD.ar(localgA);
    if (localbCJ1 == null) {
      localbCJ1 = (bCJ)localbMD.ao(localgA);
    }
    if (localbCJ1 != null)
      inventoryDropItem(paramQa, localbCJ1.bLg(), (byte)localbCJ1.bQI());
  }

  public static void inventoryDropItem(cSx paramcSx, col paramcol)
  {
    inventoryDropItem(paramcSx, paramcol, (byte)-1);
  }

  public static void inventoryDropItem(cSx paramcSx, col paramcol, byte paramByte)
  {
    bCJ localbCJ = paramcol.aQC();
    if ((paramcSx instanceof Qa)) {
      Qa localQa = (Qa)paramcSx;
      aTs.setDestinationUniqueId(localbCJ.EN());
      if (paramByte == -1) {
        localObject1 = localQa.abO().getRenderableParent();
        paramByte = (byte)((axU)localObject1).getCollection().getTableIndex((axU)localObject1);
      }
      aTs.setDestinationPosition(Byte.valueOf(paramByte));

      Object localObject1 = localQa.getValue();
      if (localObject1 == null) {
        return;
      }

      boolean bool1 = localQa.eA();
      boolean bool2 = WakfuClientInstance.awy().awB().a(bmz.fEE);
      Object localObject2;
      if ((localObject1 instanceof gA)) {
        localObject2 = (gA)localObject1;
        if (localObject2.equals(bSy.getDraggedItem())) {
          return;
        }
        dropItem(paramcSx);
        if (dHD.getDraggedItemId() != -1L) {
          dHD.setDraggedItemId(-1L);
          return;
        }
        int i = (((gA)localObject2).nP() > 1) && (((bool1) && (!bool2)) || ((!bool1) && (bool2))) ? 1 : 0;

        bbo localbbo = dLE.doY().getProperty("temporaryInventory.currentDragItemId");
        if ((byv.bFN().bFO().bGZ()) && (localbbo != null))
        {
          if (((gA)localObject2).oj() == localbbo.getLong())
          {
            czW localczW;
            if (i != 0) {
              aTs.setMaxQuantity(((gA)localObject2).nP());
              aTs.setItem((gA)localObject2);
              aTs.setMessageType((short)16825);
              localczW = new czW();
              localczW.setItem((gA)localObject2);
              localczW.W((short)localQa.getScreenX());
              localczW.X((short)localQa.getScreenY());
              localczW.d(16821);
              cjO.clE().j(localczW);
            } else {
              localczW = new czW();
              localczW.d(16825);
              localczW.setItem((gA)localObject2);
              localczW.l(((gA)localObject2).nP());
              localczW.setDestinationUniqueId(aTs.getDestinationUniqueId());
              localczW.cz(aTs.getDestinationPosition());
              cjO.clE().j(localczW);
            }
            return;
          }
        }

        short s1 = -1;

        if (((gA)localObject2).oj() == bno.getDraggedItemId()) {
          s1 = 19321;
          bno.setDraggedItemId(-1L);
        } else if (((gA)localObject2).oj() == cCM.getDraggedItemId()) {
          s1 = 19327;
          cCM.setDraggedItemId(-1L); } else {
          if (((gA)localObject2).oj() == dfo.getDraggedItemId()) {
            localObject4 = new czW();
            ((czW)localObject4).c(dfo.getDraggedPetId());
            ((czW)localObject4).cP((short)aTs.getDestinationPosition());
            ((czW)localObject4).setDestinationUniqueId(aTs.getDestinationUniqueId());
            ((czW)localObject4).d(19159);
            cjO.clE().j((cWG)localObject4);
            dfo.resetDraggedItemAndPetId();
            return;
          }if (((gA)localObject2).oj() == cWu.getDraggedItemId()) {
            cWu.setDraggedItemId(-1L);
            localObject4 = localQa.abN().getRenderableParent();
            short s2 = (short)((axU)localObject4).getCollection().getTableIndex((axU)localObject4);
            cWu.removeBook(s2);
            return;
          }if (((gA)localObject2).oj() == lj.getDraggedItemId()) {
            lj.setDraggedItemId(-1L);
            lj.removeItem((cGm)localObject2);
            return;
          }if (((gA)localObject2).oj() == avl.getDraggedItemId()) {
            avl.setDraggedItemId(-1L);
            avl.unequipItem(((gA)localObject2).ok());
            return;
          }
        }

        if (s1 != -1)
        {
          if (i != 0) {
            aTs.setMaxQuantity(((gA)localObject2).nP());
            aTs.setItem((gA)localObject2);
            aTs.setMessageType(s1);
            localObject4 = new czW();
            ((czW)localObject4).setItem((gA)localObject2);
            ((czW)localObject4).W((short)localQa.getScreenX());
            ((czW)localObject4).X((short)localQa.getScreenY());
            ((czW)localObject4).d(16821);
            cjO.clE().j((cWG)localObject4);
          } else {
            localObject4 = new czW();
            ((czW)localObject4).d(s1);
            ((czW)localObject4).setItem((gA)localObject2);
            ((czW)localObject4).l(((gA)localObject2).nP());
            ((czW)localObject4).setDestinationUniqueId(aTs.getDestinationUniqueId());
            ((czW)localObject4).cz(aTs.getDestinationPosition());
            cjO.clE().j((cWG)localObject4);
          }
          return;
        }

        Object localObject4 = aYP.feK.bnR();
        Object localObject5;
        if (localObject4 != null)
        {
          if (((gA)localObject2).oj() == ((aqa)localObject4).bPa())
          {
            if (i != 0) {
              aTs.setMaxQuantity(((gA)localObject2).nP());
              aTs.setItem((gA)localObject2);
              aTs.setExchangeId(((aqa)localObject4).getId());
              aTs.setMessageType((short)16811);
              localObject5 = new czW();
              ((czW)localObject5).setItem((gA)localObject2);
              ((czW)localObject5).W((short)localQa.getScreenX());
              ((czW)localObject5).X((short)localQa.getScreenY());
              ((czW)localObject5).d(16821);
              cjO.clE().j((cWG)localObject5);
            }
            else
            {
              localObject5 = new bVD();
              ((bVD)localObject5).d(16811);
              ((bVD)localObject5).setExchangeId(((aqa)localObject4).getId());
              ((bVD)localObject5).setItem((gA)localObject2);
              ((bVD)localObject5).uh(((gA)localObject2).nP());
              cjO.clE().j((cWG)localObject5);
            }
            ((aqa)localObject4).gH(-1L);
          }

        }
        else if (((gA)localObject2).oj() == cfv)
        {
          if ((aTs.getSourcePosition() == aTs.getDestinationPosition()) && (localbCJ.EN() == aTs.getSourceUniqueId()))
          {
            return;
          }

          if (i != 0) {
            aTs.setDestinationUniqueId(localbCJ.EN());
            aTs.setMaxQuantity(((gA)localObject2).nP());
            aTs.setItem((gA)localObject2);
            aTs.setMessageType((short)16804);
            localObject5 = new czW();
            ((czW)localObject5).setItem((gA)localObject2);
            ((czW)localObject5).W((short)localQa.getScreenX());
            ((czW)localObject5).X((short)localQa.getScreenY());
            ((czW)localObject5).d(16821);
            cjO.clE().j((cWG)localObject5);
          } else {
            localObject5 = new czW();
            ((czW)localObject5).cz(aTs.getDestinationPosition());
            ((czW)localObject5).setSourcePosition(aTs.getSourcePosition());
            ((czW)localObject5).setSourceUniqueId(aTs.getSourceUniqueId());
            ((czW)localObject5).setDestinationUniqueId(localbCJ.EN());
            ((czW)localObject5).setItem((gA)localObject2);
            ((czW)localObject5).l((short)-1);
            ((czW)localObject5).d(16804);
            cjO.clE().j((cWG)localObject5);
          }
        }
      }
      else
      {
        Object localObject3;
        if ((localObject1 instanceof BG)) {
          localObject2 = (BG)localObject1;

          if ((((BG)localObject2).nP() > 1) && (((bool1) && (!bool2)) || ((!bool1) && (bool2))))
          {
            aTs.setMaxQuantity(((BG)localObject2).nP());
            aTs.setMerchantItem((BG)localObject2);
            aTs.setMessageType((short)17305);
            localObject3 = new czW();
            ((czW)localObject3).setItem(((BG)localObject2).getItem());
            ((czW)localObject3).W((short)localQa.getScreenX());
            ((czW)localObject3).X((short)localQa.getScreenY());
            ((czW)localObject3).d(16821);
            cjO.clE().j((cWG)localObject3);
          }
          else {
            localObject3 = new cHE();
            ((cHE)localObject3).setMerchantItem((BG)localObject2);
            ((cHE)localObject3).aC((short)aTs.getDestinationPosition());
            ((cHE)localObject3).iJ(aTs.getDestinationUniqueId());
            ((cHE)localObject3).d(17305);
            cjO.clE().j((cWG)localObject3);
          }
        }
        else if ((localObject1 instanceof col)) {
          localObject2 = ((col)localObject1).aQC();
          localObject3 = new czW();
          ((czW)localObject3).cz(aTs.getDestinationPosition());
          ((czW)localObject3).setDestinationUniqueId(localbCJ.EN());
          ((czW)localObject3).setSourceUniqueId(((bCJ)localObject2).EN());
          ((czW)localObject3).d(17711);
          cjO.clE().j((cWG)localObject3);
        } else if ((localObject1 instanceof dui)) {
          localObject2 = (dui)localObject1;
          localObject3 = new czW();
          ((czW)localObject3).setDestinationUniqueId(aTs.getDestinationUniqueId());
          ((czW)localObject3).cz(aTs.getDestinationPosition());
          ((czW)localObject3).setDestinationUniqueId(localbCJ.EN());
          ((czW)localObject3).setItem(((dui)localObject2).bYK());
          ((czW)localObject3).a(((dui)localObject2).dad());
          ((czW)localObject3).l((short)1);
          ((czW)localObject3).d(17008);
          cjO.clE().j((cWG)localObject3);
        }
      }
    }
  }

  public static void changeItemBackground(dMr paramdMr, bpn parambpn, Object paramObject, anG paramanG) { if ((paramObject instanceof chd)) {
      paramObject = ((chd)paramObject).cjm();
    }
    if ((paramObject instanceof gA))
      changeItemBackground(paramdMr, (dBv)paramObject, (gA)paramObject, null, parambpn, paramanG);
  }

  public static void onItemDoubleClick(cEv paramcEv)
  {
    gA localgA = (gA)paramcEv.getItemValue();
    cRs localcRs = byv.bFN().bFO().bGP().iQ(localgA.oj());
    if (localcRs != null)
      onItemDoubleClick(paramcEv, ((bCJ)localcRs).bLg());
  }

  public static void changeItemBackground(dMr paramdMr, String paramString, bpn parambpn)
  {
    changeItemBackground(paramdMr, null, null, paramString, parambpn, null);
  }

  public static void changeItemBackground(dMr paramdMr, bpn parambpn, anG paramanG)
  {
  }

  public static void changeItemBackground(dMr paramdMr, dBv paramdBv, gA paramgA, String paramString, bpn parambpn, anG paramanG)
  {
    String str = "";
    dOc localdOc1 = (dOc)paramdMr.cIl();

    byz localbyz = byv.bFN().bFO();
    if ((aYP.feK.bnR() != null) && ((dLE.doY().rv("exchange.sourceBag") instanceof bCJ)))
    {
      return;
    }

    if (paramString != null)
      paramgA = (gA)localbyz.ayJ().dB(Short.parseShort(paramString));
    int i;
    if (paramgA != null) {
      i = 0;
      if (paramdMr.mp() == CH.bGs) {
        i = 1;
        if (paramgA.oi().bKk() != 0)
          str = "itemSetSelectedBackground";
        else
          str = "itemSelectedBackground";
      }
      else if (paramdMr.mp() == CH.bGt) {
        str = cQI.aH(paramgA);
      }
      localdOc1.setStyle(str);
      if (paramgA.oi().bKk() != 0)
      {
        bZH localbZH = localbyz.ayJ();
        for (gA localgA : localbZH) {
          if (localgA.oi().bKk() == paramgA.oi().bKk()) {
            int j = localbyz.ayJ().n(localgA);
            cpa localcpa = parambpn.getElementMap();
            axU localaxU = (axU)localcpa.fi("EquipRC" + j);
            if (localaxU != null) {
              dOc localdOc2 = (dOc)localaxU.getInnerElementMap().fi("Equip" + j);
              if (localdOc2 != null) {
                if (i != 0)
                  str = "itemSetSelectedBackground";
                else {
                  str = cQI.c(localgA, localcpa.getId());
                }
                localdOc2.setStyle(str);
              }
            }
          }
        }
      }
    }
    if (paramanG != null)
      if (paramdMr.mp() == CH.bGs)
        cDS.showPopup(paramdMr, paramgA, paramanG, localdOc1);
      else
        cDS.closePopup(paramdMr);
  }

  public static void onItemDoubleClick(cEv paramcEv, col paramcol)
  {
    if ((paramcEv.getItemValue() instanceof cty)) {
      return;
    }

    if (cBQ.cxL().mZ("splitStackDialog")) {
      cBQ.cxL().mW("splitStackDialog");
    }

    gA localgA = (gA)paramcEv.getItemValue();

    if (localgA.nI()) {
      if (byv.bFN().bFO().ayJ().dC(azO.dRT.hV)) {
        return;
      }
      if (kta != null) {
        cancelPetDetailRunner();
      }

    }

    byz localbyz = byv.bFN().bFO();
    aTs.setDestinationPosition(Byte.valueOf((byte)-1));
    aqa localaqa = aYP.feK.bnR();
    Object localObject2;
    if (localaqa != null)
    {
      short s = localbyz.bGP().iQ(localgA.oj()).il(localgA.oj());

      dLE.doY().t("exchange.sourceBag", paramcol.aQC());
      dLE.doY().t("exchange.sourcePosition", Short.valueOf(s));

      localObject2 = new bVD();
      ((bVD)localObject2).d(16810);
      ((bVD)localObject2).setExchangeId(localaqa.getId());
      ((bVD)localObject2).setItem(localgA);
      ((bVD)localObject2).uh(localgA.nP());
      cjO.clE().j((cWG)localObject2);
    }
    else
    {
      Object localObject1;
      if (cBQ.cxL().mZ("recycleDialog")) {
        if (!localgA.ol().nl()) {
          return;
        }
        localObject1 = new bzu();
        ((bzu)localObject1).d(19140);
        ((bzu)localObject1).c(localgA.oj());
        cjO.clE().j((cWG)localObject1);
      } else if (cBQ.cxL().mZ("seedSpreaderDialog")) {
        if (cQI.aB(localgA)) {
          return;
        }
        localObject1 = new czW();
        ((czW)localObject1).c(localgA.oj());
        ((czW)localObject1).l(localgA.nP());
        ((czW)localObject1).d(19342);
        cjO.clE().j((cWG)localObject1);
      } else if (cBQ.cxL().mZ("havenWorldResourcesCollectorDialog")) {
        if (cQI.aA(localgA)) {
          return;
        }
        localObject1 = new czW();
        ((czW)localObject1).c(localgA.oj());
        ((czW)localObject1).l(localgA.nP());
        ((czW)localObject1).d(19364);
        cjO.clE().j((cWG)localObject1);
      } else if (cBQ.cxL().mZ("storageBoxDialog")) {
        localObject1 = new czW();
        ((czW)localObject1).c(localgA.oj());
        ((czW)localObject1).ar(localgA.nP());
        ((czW)localObject1).cz(aTs.getDestinationPosition());
        ((czW)localObject1).d(19326);
        cjO.clE().j((cWG)localObject1);
      } else if (cBQ.cxL().mZ("freeCollectMachineDialog")) {
        localObject1 = new czW();
        ((czW)localObject1).c(localgA.oj());
        ((czW)localObject1).ar(localgA.nP());
        ((czW)localObject1).d(19320);
        cjO.clE().j((cWG)localObject1);
      } else if (byv.bFN().c(bLT.bTA())) {
        localObject1 = new clI(localbyz);

        if (!bGP.gDx.a(new aGH[] { localObject1 }))
        {
          localObject2 = bU.fH().getString("error.playerNotSubscribed");
          aEe localaEe = new aEe((String)localObject2);
          localaEe.mm(3);
          CM.LV().a(localaEe);
          return;
        }
        boolean bool1 = paramcEv.eA();
        boolean bool2 = WakfuClientInstance.awy().awB().a(bmz.fEE);
        Object localObject3;
        if ((localgA.nP() > 1) && (((bool1) && (!bool2)) || ((!bool1) && (bool2))))
        {
          aTs.setMaxQuantity(localgA.nP());
          aTs.setItem(localgA);
          aTs.setMessageType((short)17304);

          localObject3 = new czW();
          ((czW)localObject3).setItem(localgA);
          ((czW)localObject3).W((short)paramcEv.getScreenX());
          ((czW)localObject3).X((short)paramcEv.getScreenY());
          ((czW)localObject3).d(16821);
          cjO.clE().j((cWG)localObject3);
        } else {
          localObject3 = new cHE();
          ((cHE)localObject3).setItem(localgA);
          ((cHE)localObject3).aC((short)aTs.getDestinationPosition());
          ((cHE)localObject3).d(17304);
          cjO.clE().j((cWG)localObject3);
        }
      } else if (localgA.oi().bKw()) {
        addToEquipment(paramcEv, paramcol.aQC());
        onChangeEquipement(localbyz);
      } else if (localgA.oi().bKn().nh().length == 0) {
        bAq.useUsableItem(localgA, true);
      }
    }
  }

  public static void addToEquipment(cEv paramcEv, bCJ parambCJ)
  {
    if (aYP.feK.bnR() != null) {
      K.error("Erreur : impossible de modifier l'équipement en échange");
      return;
    }
    Object localObject = paramcEv.getItemValue();

    if ((localObject != null) && ((localObject instanceof gA)))
      addToEquipment((gA)localObject, parambCJ);
  }

  public static void addToEquipment(gA paramgA, bCJ parambCJ)
  {
    if ((paramgA.ol().nc() == 218) || (paramgA.ol().nc() == 399)) {
      localczW = new czW();
      localczW.setItem(paramgA);
      localczW.setSourcePosition(aTs.getSourcePosition());
      localczW.cz((byte)-1);
      localczW.setSourceUniqueId(parambCJ.EN());
      localczW.d(17710);
      cjO.clE().j(localczW);
      return;
    }

    czW localczW = new czW();
    localczW.setItem(paramgA);
    localczW.cP((short)-1);
    localczW.setSourceUniqueId(parambCJ.EN());
    localczW.setDestinationUniqueId(2L);
    localczW.d(16800);
    cjO.clE().j(localczW);
  }

  public static void onEquipmentDoubleClick(cEv paramcEv, String paramString)
  {
    gA localgA = (gA)paramcEv.getItemValue();

    if (localgA.nI()) {
      if (byv.bFN().bFO().ayJ().dC(azO.dRT.hV)) {
        return;
      }
      if (kta != null) {
        cancelPetDetailRunner();
      }

    }

    byz localbyz = byv.bFN().bFO();
    aqa localaqa = aYP.feK.bnR();

    if (localaqa == null) {
      onChangeEquipement(localbyz);
      unEquip(paramcEv, paramString);
      return;
    }

    dLE.doY().t("exchange.sourceBag", byv.bFN().bFO().ayJ());
    dLE.doY().t("exchange.sourcePosition", paramString);

    bVD localbVD = new bVD();
    localbVD.d(16810);
    localbVD.setExchangeId(localaqa.getId());
    localbVD.setItem(localgA);
    localbVD.uh(localgA.nP());
    cjO.clE().j(localbVD);
  }

  public static void unEquip(cEv paramcEv, String paramString)
  {
    if (aYP.feK.bnR() != null) {
      return;
    }

    Object localObject = paramcEv.getItemValue();
    if ((localObject != null) && ((localObject instanceof gA))) {
      czW localczW = new czW();
      localczW.setItem((gA)localObject);
      localczW.cP(Short.valueOf(paramString).shortValue());
      localczW.d(16803);
      cjO.clE().j(localczW);
    }
  }

  public static void closeWindow(cSx paramcSx, bCJ parambCJ)
  {
    if (paramcSx.mp() == CH.bGw) {
      ajw localajw = new ajw();
      localajw.d(16418);
      localajw.a(parambCJ);
      cjO.clE().j(localajw);
    }
  }

  public static void closeWindow(cSx paramcSx)
  {
    if (paramcSx.mp() == CH.bGw) {
      ajw localajw = new ajw();
      localajw.d(16418);
      localajw.a(null);
      cjO.clE().j(localajw);
    }
  }

  public static void unequipInventory(cEv paramcEv) {
    bCJ localbCJ = ((col)paramcEv.getItemValue()).aQC();
    czW localczW = new czW();
    localczW.cz((byte)-1);
    localczW.setDestinationUniqueId(-1L);
    localczW.setSourceUniqueId(localbCJ.EN());
    localczW.d(17711);
    cjO.clE().j(localczW);
  }

  public static void minimizeMaximizeDialog(cSx paramcSx, bpn parambpn)
  {
    if (paramcSx.mp() == CH.bGx) {
      dOc localdOc1 = (dOc)parambpn.getElementMap().fi("contentWindow");
      dOc localdOc2 = (dOc)parambpn.getElementMap().fi("barCloseButton");

      if (!localdOc1.getVisible())
        parambpn.setPrefSize(new Or(0, 0));
      else {
        parambpn.setPrefSize(new Or(0, localdOc1.getHeight()));
      }

      localdOc1.setVisible(!localdOc1.getVisible());
      localdOc2.setVisible(!localdOc2.getVisible());
    }
  }

  public static void showInfos(cSx paramcSx, bpn parambpn, String paramString)
  {
    if (paramcSx.mp() == CH.bGw) {
      dOc localdOc1 = (dOc)parambpn.getElementMap().fi(paramString + "Info");
      localdOc1.setVisible(!localdOc1.getVisible());
      dOc localdOc2 = (dOc)parambpn.getElementMap().fi(paramString + "Button");
      if (localdOc2.getStyle().equals("add"))
        localdOc2.setStyle("remove");
      else
        localdOc2.setStyle("add");
    }
  }

  public static void addToShortcuts(cEv paramcEv)
  {
    if ((paramcEv.getItemValue() instanceof cty)) {
      return;
    }
    if ((paramcEv.getItemValue() instanceof col)) {
      return;
    }

    gA localgA = (gA)paramcEv.getItemValue();

    if ((paramcEv.getButton() != 1) || (!paramcEv.ey()))
    {
      return;
    }

    if ((localgA == null) || ((localgA.oi().bKn().nh().length == 0) && (!localgA.isUsable())))
    {
      return;
    }

    cMa localcMa = new cMa();
    localcMa.setItem(localgA);
    localcMa.yx(-1);
    localcMa.setPosition(-1);
    localcMa.d(16700);
    localcMa.c(true);
    cjO.clE().j(localcMa);
  }

  public static void showItemDetailPopup(cEv paramcEv, bpn parambpn)
  {
    Object localObject = paramcEv.getItemValue();
    cDS.showPopup((dBv)localObject, 500);
  }

  public static void showSetDetailPopup(cSx paramcSx, Short paramShort, String paramString, anG paramanG)
  {
    dLB localdLB = bCc.bKN().cm(paramShort.shortValue());

    if (Boolean.parseBoolean(paramString))
      cDS.showPopup(paramcSx, localdLB, paramanG);
    else
      ayw.closePopup(paramcSx, paramanG);
  }

  public static void showCharacterDetailPopup(cSx paramcSx, bpn parambpn)
  {
    anG localanG = (anG)parambpn.getElementMap().fi("characterDetailPopup");
    if ((paramcSx.mp() == CH.bGs) && (!bsP.getInstance().isDragging()))
      ayw.popup(paramcSx, localanG);
    else if (paramcSx.mp() == CH.bGt)
      ayw.closePopup(paramcSx, localanG);
  }

  public static void changeSetBonusList(arS paramarS, dLB paramdLB, cWk paramcWk)
  {
    if ((paramarS.getSelected()) && (paramdLB != null) && (paramcWk != null)) {
      int i = 0;
      if ((paramarS.getValue() instanceof Integer)) {
        i = ((Integer)paramarS.getValue()).intValue();
      }
      paramcWk.setText(paramdLB.CS(i));
    }
  }

  public static void selectPet(cSx paramcSx) {
    dLE.doY().a("itemDetail", null, "equipmentDialog");
  }

  public static void equipItem(cSx paramcSx, Object paramObject)
  {
    bMD localbMD;
    gA localgA;
    bCJ localbCJ;
    Object localObject2;
    if ((paramcSx.mp() == CH.bGw) && (paramObject != null))
    {
      if (aYP.feK.bnR() != null) {
        K.info("Un échange est en cours ! On ne peut pas s'équiper! ");
        return;
      }

      localbMD = byv.bFN().bFO().bGP();
      Object localObject1;
      if ((paramObject instanceof gA)) {
        localObject1 = (gA)paramObject;
        localgA = (gA)localbMD.ye(((gA)localObject1).oi().getId());
        localbCJ = (bCJ)localbMD.yg(((gA)localObject1).oi().getId());

        if (localgA != null)
        {
          localObject2 = new czW();
          ((czW)localObject2).setItem(localgA);
          ((czW)localObject2).cP((short)-1);
          ((czW)localObject2).setSourceUniqueId(localbCJ.EN());
          ((czW)localObject2).setDestinationUniqueId(2L);
          ((czW)localObject2).d(16800);
          cjO.clE().j((cWG)localObject2);
        }
      }
      else if ((paramObject instanceof bVw)) {
        localObject1 = (bVw)paramObject;
        localgA = (gA)localbMD.ye(((bVw)localObject1).getId());
        localbCJ = (bCJ)localbMD.yg(((bVw)localObject1).getId());

        if (localgA != null)
        {
          localObject2 = new czW();
          ((czW)localObject2).setItem(localgA);
          ((czW)localObject2).cP((short)-1);
          ((czW)localObject2).setSourceUniqueId(localbCJ.EN());
          ((czW)localObject2).setDestinationUniqueId(2L);
          ((czW)localObject2).d(16800);
          cjO.clE().j((cWG)localObject2);
        }
      }
      else if ((paramObject instanceof dLB)) {
        localObject1 = (dLB)paramObject;
        for (localObject2 = ((dLB)localObject1).iterator(); ((Iterator)localObject2).hasNext(); ) { bVw localbVw = (bVw)((Iterator)localObject2).next();
          localgA = (gA)localbMD.ye(localbVw.getId());
          localbCJ = (bCJ)localbMD.yg(localbVw.getId());

          if (localgA != null)
          {
            czW localczW = new czW();
            localczW.setItem(localgA);
            localczW.cP((short)-1);
            localczW.setSourceUniqueId(localbCJ.EN());
            localczW.setDestinationUniqueId(2L);
            localczW.d(16800);
            cjO.clE().j(localczW);
          }
        }
      }
    }
  }

  public static void equipmentDragItemPreview(cSx paramcSx, String paramString)
  {
    if ((paramcSx instanceof bvN)) {
      bvN localbvN = (bvN)paramcSx;
      if ((localbvN.getValue() != null) && ((localbvN.getValue() instanceof gA))) {
        cfv = ((gA)localbvN.getValue()).oj();
        aTs.setSourceUniqueId(2L);
        aTs.setSourcePosition(Byte.valueOf(paramString).byteValue());

        gA localgA = (gA)localbvN.getValue();
        onDragItem(localgA);
      }
    }
  }

  public static void onMouseOverBag(cSx paramcSx, anG paramanG)
  {
    ayw.popup(paramcSx, paramanG);
    dOc localdOc = (dOc)paramcSx.cIl();
    localdOc.setStyle("itemSelectedBackground");
  }

  public static void onMouseOutBag(cSx paramcSx, anG paramanG)
  {
    ayw.closePopup(paramcSx, paramanG);
    dOc localdOc = (dOc)paramcSx.cIl();
    localdOc.setStyle("itemBackground");
  }

  public static void deleteItem(cSx paramcSx) {
    gA localgA = (gA)dLE.doY().br("itemDetail", "equipmentDialog");

    czW localczW = new czW();
    localczW.setItem(localgA);
    localczW.d(16827);
    cjO.clE().j(localczW);

    biy localbiy = (biy)paramcSx.cIl();
    dFr localdFr = localbiy.getAppearance();
    localdFr.exit();
  }

  public static void regenWith(cSx paramcSx) {
    gA localgA = (gA)dLE.doY().br("itemDetail", "equipmentDialog");
    czW localczW = new czW();
    localczW.setItem(localgA);
    localczW.d(16828);
    cjO.clE().j(localczW);
  }

  public static void checkFilter(cSx paramcSx, dVm paramdVm) {
    byv.bFN().bFO().bGP().a(paramdVm.dvo());
  }

  public static void onMouseOverFilter(cEv paramcEv) {
    if (((dVm)paramcEv.getItemValue()).dvo().equals(byv.bFN().bFO().bGP().bUj())) {
      return;
    }
    fyP = (czv)((axU)paramcEv.cIk()).getInnerElementMap().fi("image");
    ((cwP)fyP.getLayoutData()).setYOffset(1);
    fyP.getContainer().cfM();
  }

  public static void onMouseOutFilter(cEv paramcEv) {
    if (fyP == null) {
      return;
    }
    ((cwP)fyP.getLayoutData()).setYOffset(-2);
    fyP.getContainer().cfM();
    fyP = null;
  }

  public static void useItem(cSx paramcSx) {
    gA localgA = (gA)dLE.doY().br("itemDetail", "equipmentDialog");
    if (bAq.useUsableItem(localgA, true)) {
      dLE.doY().a("itemDetail", null, "equipmentDialog");
      biy localbiy = (biy)paramcSx.cIl();
      localbiy.getAppearance().exit();
    }
  }

  public static void onChangeEquipement(bKm parambKm)
  {
  }
}