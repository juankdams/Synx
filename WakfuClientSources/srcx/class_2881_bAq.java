import java.util.ArrayList;
import org.apache.log4j.Logger;

public class bAq
{
  public static final String PACKAGE = "wakfu.shortcutBar";
  private static final Logger K = Logger.getLogger(bAq.class);

  public static boolean gpk = true;

  private static long duf = 500L;
  private static long bYL = -1L;
  private static byte gpl;
  private static int gpm;

  public static void closeShortcutBarDialog(cSx paramcSx)
  {
    bzu.cf((short)16405);
  }

  public static void openCloseAdditionalShortcutBar(cSx paramcSx, Byte paramByte) {
    byte b = (byte)(paramByte.byteValue() - byv.bFN().bFO().bGD().cWy().aRP());
    zV.IH().M(b);
  }

  public static void setSouthEastDirection(cSx paramcSx)
  {
    arl localarl = byv.bFN().bFO().aeQ();

    if (localarl != null)
    {
      if (!dLE.doY().getBooleanProperty("isInFightPlacement")) {
        if ((localarl.aDp().Ia() == byv.bFN().bFO()) || (localarl.aDp().Ia().adL() == byv.bFN().bFO()))
        {
          bzu.cf((short)18004);
        }

      }
      else if (!localarl.aDp().AP()) {
        K.info("Changement d'orientation inutile en phase de placement. Aucune action effecutée");
      }

    }
    else
    {
      bzu.cf((short)16708);
    }
  }

  public static void setSouthWestDirection(cSx paramcSx)
  {
    arl localarl = byv.bFN().bFO().aeQ();

    if (localarl != null)
    {
      if (!dLE.doY().getBooleanProperty("isInFightPlacement")) {
        if ((localarl.aDp().Ia() == byv.bFN().bFO()) || (localarl.aDp().Ia().adL() == byv.bFN().bFO()))
        {
          bzu.cf((short)18005);
        }

      }
      else if (!localarl.aDp().AP()) {
        K.info("Changement d'orientation inutile en phase de placement. Aucune action effecutée");
      }

    }
    else
    {
      bzu.cf((short)16709);
    }
  }

  public static void setNorthWestDirection(cSx paramcSx)
  {
    arl localarl = byv.bFN().bFO().aeQ();

    if (localarl != null)
    {
      if (!dLE.doY().getBooleanProperty("isInFightPlacement")) {
        if ((localarl.aDp().Ia() == byv.bFN().bFO()) || (localarl.aDp().Ia().adL() == byv.bFN().bFO()))
        {
          bzu.cf((short)18003);
        }

      }
      else if (!localarl.aDp().AP()) {
        K.info("Changement d'orientation inutile en phase de placement. Aucune action effecutée");
      }

    }
    else
    {
      bzu.cf((short)16707);
    }
  }

  public static void setNorthEastDirection(cSx paramcSx)
  {
    arl localarl = byv.bFN().bFO().aeQ();

    if (localarl != null)
    {
      if (!dLE.doY().getBooleanProperty("isInFightPlacement")) {
        if ((localarl.aDp().Ia() == byv.bFN().bFO()) || (localarl.aDp().Ia().adL() == byv.bFN().bFO()))
        {
          bzu.cf((short)18006);
        }

      }
      else if (!localarl.aDp().AP()) {
        K.info("Changement d'orientation inutile en phase de placement. Aucune action effecutée");
      }

    }
    else
    {
      bzu.cf((short)16710);
    }
  }

  public static void openCloseSpellInventoryDialog(cSx paramcSx)
  {
    bzu.cf((short)16406);
  }

  public static void openCloseFightActions(cSx paramcSx)
  {
    bzu.cf((short)16434);
  }

  public static void openCloseItemInventoryDialog(cSx paramcSx)
  {
    bzu.cf((short)16419);
  }

  public static void openCloseKardsInventoryDialog(cSx paramcSx)
  {
    bzu.cf((short)16423);
  }

  public static void openCloseSecondaryShortcutBar(cSx paramcSx, Integer paramInteger) {
    bzu localbzu = new bzu();
    localbzu.d(16408);
    localbzu.e(paramInteger.intValue());
    cjO.clE().j(localbzu);
  }

  public static void dropItem(cSx paramcSx, Byte paramByte)
  {
    if ((paramcSx instanceof Qa))
    {
      byA.onDropItem();

      Qa localQa = (Qa)paramcSx;
      int i = localQa.cIl().getRenderableParent().getCollection().getTableIndex(localQa.cIl().getRenderableParent());

      byz localbyz = byv.bFN().bFO();
      dpr localdpr = localbyz.bGD();
      aFy localaFy = localdpr.fu(paramByte.byteValue()).azo();
      Object localObject;
      if ((localQa.getValue() instanceof gA)) {
        localObject = (gA)localQa.getValue();
        bVw localbVw = (bVw)((gA)localObject).oi();
        byA.onDropItem();
        int j = (((gA)localObject).on()) && (localaFy == aFy.ebG) ? 1 : 0;
        int k = (localaFy == aFy.ebH) && (((gA)localObject).om()) ? 1 : 0;
        if ((j == 0) && (k == 0)) {
          return;
        }

        cMa localcMa = new cMa();
        localcMa.setItem(localObject);
        localcMa.yx(paramByte.byteValue());
        localcMa.setPosition(i);
        localcMa.d(16700);
        localcMa.c(true);
        cjO.clE().j(localcMa);
        return;
      }

      if ((localQa.getValue() instanceof apX)) {
        localObject = (apX)localQa.getValue();

        if (!((dSR)((apX)localObject).bsL()).bHY())
          localQa.setValue(localbyz.bV(((apX)localQa.getValue()).oj()));
        else {
          return;
        }

      }

      if (localQa.getValue() != null) {
        localObject = new cMa();
        ((cMa)localObject).setItem(localQa.getValue());
        ((cMa)localObject).yx(paramByte.byteValue());
        ((cMa)localObject).setPosition(i);
        ((cMa)localObject).ey(gpl);
        ((cMa)localObject).yy(gpm);
        ((cMa)localObject).d(16700);
        ((cMa)localObject).c(true);
        cjO.clE().j((cWG)localObject);
      }
    }
    gpl = -1;
    gpm = -1;
  }

  public static void dragItem(cSx paramcSx, Byte paramByte)
  {
    if ((paramcSx instanceof bvN)) {
      bvN localbvN = (bvN)paramcSx;
      int i = localbvN.cIl().getRenderableParent().getCollection().getItemIndex(localbvN.getValue());
      if (localbvN.getValue() != null) {
        cMa localcMa = new cMa();
        localcMa.setItem(localbvN.getValue());
        localcMa.yx(paramByte.byteValue());
        gpl = paramByte.byteValue();
        gpm = i;
        localcMa.setPosition(i);
        localcMa.d(16701);
        cjO.clE().j(localcMa);
      }
    }
  }

  public static void dropOutItem(cSx paramcSx, Byte paramByte)
  {
    if ((paramcSx instanceof cTo)) {
      cTo localcTo = (cTo)paramcSx;
      if (localcTo.getValue() != null) {
        cMa localcMa = new cMa();
        localcMa.setItem(localcTo.getValue());
        localcMa.yx(paramByte.byteValue());
        localcMa.setPosition(gpm);
        localcMa.d(16702);
        cjO.clE().j(localcMa);
      }
    }
    gpl = -1;
    gpm = -1;
  }

  public static void addItem(cEv paramcEv, Integer paramInteger)
  {
    cMa localcMa = new cMa();
    localcMa.setItem(paramcEv.getItemValue());
    localcMa.yx(paramInteger.intValue());
    localcMa.setPosition(-1);
    localcMa.d(16700);
    localcMa.c(true);
    cjO.clE().j(localcMa);
  }

  public static void selectPreviousShortcutBar(dMr paramdMr)
  {
    if (paramdMr.getButton() == 1)
      bzu.cf((short)16704);
  }

  public static void selectNextShortcutBar(dMr paramdMr)
  {
    if (paramdMr.getButton() == 1)
      bzu.cf((short)16703);
  }

  public static void useItem(cEv paramcEv)
  {
    if ((paramcEv.getItemValue() != null) && ((paramcEv.getItemValue() instanceof dKD))) {
      dKD localdKD = (dKD)paramcEv.getItemValue();
      useItem(paramcEv, localdKD, false);
    }
  }

  public static void doubleClickItem(cEv paramcEv)
  {
    if ((paramcEv.getItemValue() != null) && ((paramcEv.getItemValue() instanceof dKD))) {
      dKD localdKD = (dKD)paramcEv.getItemValue();
      useItem(paramcEv, localdKD, true);
    }
  }

  public static void selectSpell(cEv paramcEv, apX paramapX)
  {
    byz localbyz = byv.bFN().bFO();
    Object localObject1 = localbyz;
    Object localObject2;
    if ((paramcEv != null) && (paramcEv.getButton() == 3)) {
      if (paramapX == null) {
        K.error("On tente d'utiliser un sort null dans les barres raccourcis !!! ");
        return;
      }
      localObject2 = paramcEv.cIk().getElementMap();
      if (localObject2 != null) {
        sw.openSpellDescription(3, paramapX, ((cpa)localObject2).getId());
      }
    }
    else if ((localbyz.adF()) && (localbyz.aeQ() != null)) {
      if (paramapX == null) {
        K.error("On tente d'utiliser un sort null dans les barres raccourcis !!! ");
        return;
      }
      localObject1 = localbyz.aeQ().aDp().Ia();
      if (localObject1 == null) {
        localObject1 = localbyz;
      }

      localObject2 = (dSR)paramapX.bsL();
      if (localObject2 == null) {
        K.error("spell null pour le spellLevel de type " + paramapX.getType() + "(uniqueId=" + paramapX.oj() + ")");
        return;
      }
      Object localObject3;
      if (((dSR)localObject2).vC()) {
        localObject3 = new GU();
        ((GU)localObject3).b(((Su)localObject1).bV(paramapX.oj()));
        byte b = azO.dRM.hV;
        gA localgA = (gA)((Su)localObject1).ayJ().dB((short)b);
        ((GU)localObject3).V(b);
        ((GU)localObject3).setItem(localgA);
        ((GU)localObject3).d(18012);
        cjO.clE().j((cWG)localObject3);
      } else {
        localObject3 = new aSP();
        ((aSP)localObject3).b(((Su)localObject1).bV(paramapX.oj()));
        ((aSP)localObject3).d(18002);
        if (((dSR)localObject2).getId() == 787)
        {
          if (!cBQ.cxL().mZ("osamodasSymbiotDialog")) {
            byv.bFN().a(bJI.bRn());
          }
          else
          {
            cjO.clE().j((cWG)localObject3);
          }
        }
        else cjO.clE().j((cWG)localObject3);
      }
    }
  }

  public static void useLeftHandWeapon(cEv paramcEv)
  {
    dKD localdKD = (dKD)paramcEv.getItemValue();
    if ((localdKD == null) || (!localdKD.isUsable())) {
      return;
    }
    bzu.cf((short)16441);
  }

  public static void useRightHandWeapon(cEv paramcEv) {
    dKD localdKD = (dKD)paramcEv.getItemValue();
    if ((localdKD == null) || (!localdKD.isUsable())) {
      return;
    }
    bzu.cf((short)16442);
  }

  public static void useItem(cEv paramcEv, dKD paramdKD, boolean paramBoolean)
  {
    if ((paramdKD != null) && (paramdKD.isUsable()))
    {
      if ((bYL == -1L) || (System.currentTimeMillis() - bYL >= duf))
        bYL = System.currentTimeMillis();
      else if (System.currentTimeMillis() - bYL < duf) {
        return;
      }
      byz localbyz = byv.bFN().bFO();
      Object localObject1;
      Object localObject2;
      switch (aqe.cOV[paramdKD.asL().ordinal()]) {
      case 1:
        if (paramBoolean) {
          return;
        }
        localObject1 = bmJ.fFu.qg(paramdKD.ok());
        localObject2 = new cQb();
        ((cQb)localObject2).setMessage(((cC)localObject1).gp());
        cjO.clE().j((cWG)localObject2);
        break;
      case 2:
        if (paramBoolean) {
          return;
        }
        localObject1 = localbyz.aeQ();
        localObject2 = localbyz;
        if (localObject1 != null) {
          localObject2 = ((arl)localObject1).aDp().Ia();
          if ((localObject2 == null) || (((Su)localObject2).adL() != localbyz)) {
            localObject2 = localbyz;
          }
        }

        selectSpell(paramcEv, ((Su)localObject2).bV(paramdKD.oj()));
        break;
      case 3:
        if (paramBoolean) {
          return;
        }
        localObject1 = new cGl();

        localObject2 = (bVw)Hh.QM().dh(2145);
        gA localgA = new gA(-1L);
        localgA.b((bBn)localObject2);
        localgA.l((short)1);
        ((cGl)localObject1).e(localgA, localObject2.bKn().nh()[0].hV);
        ((cGl)localObject1).d(18009);
        cjO.clE().j((cWG)localObject1);
        break;
      case 4:
        if ((paramcEv == null) || (paramcEv.getButton() == 1)) {
          localObject1 = (gA)localbyz.bGP().ye(paramdKD.ok());
          if (localObject1 == null) {
            return;
          }
          useUsableItem((gA)localObject1, paramBoolean);
        }break;
      case 5:
        if (paramBoolean) {
          return;
        }
        switch (paramdKD.azu())
        {
        case 2:
        case 4:
        case 5:
          if ((paramcEv == null) || (paramcEv.getButton() == 1)) {
            localObject1 = (gA)localbyz.bGP().ye(paramdKD.ok());
            if (localObject1 == null) {
              localObject1 = (gA)localbyz.ayJ().hh(paramdKD.ok());
            }
            if ((localObject1 != null) && (((gA)localObject1).isActive()))
              a(paramdKD, (gA)localObject1, localbyz, paramBoolean);
          }
          break;
        case 3:
          a(paramdKD);
          break;
        case 0:
          b(paramdKD);
        case 1:
        }
        break;
      }
    }
  }

  private static boolean a(gA paramgA, Aq paramAq)
  {
    return paramgA.oi().a(paramAq) != null;
  }

  private static boolean a(gA paramgA, byz parambyz, Aq paramAq) {
    bZA localbZA = paramgA.oi().a(paramAq);
    return (localbZA == null) || (localbZA.i(parambyz, parambyz.ML(), paramgA, parambyz.bEY()));
  }

  private static void a(dKD paramdKD, gA paramgA, byz parambyz, boolean paramBoolean)
  {
    adx localadx = paramgA.oi().bKr();
    if ((localadx != null) && (!parambyz.adF())) {
      if (a(paramgA, parambyz, Aq.bvO)) {
        bOU.gUc.b(new ctD(paramgA.oi()));
        ((dKf)localadx).f(paramgA);
      }
      return;
    }
    Object localObject;
    if (parambyz.adF()) {
      if (((paramgA.om()) && (!a(paramgA, Aq.bvP))) || (a(paramgA, parambyz, Aq.bvP)))
      {
        localObject = new cGl();
        if (paramdKD.azu() == 2)
          try {
            ((cGl)localObject).e(paramgA, paramgA.oi().bKn().nh()[0].bJ());
          } catch (Exception localException) {
            ((cGl)localObject).e(paramgA, (byte)-1);
          }
        else {
          ((cGl)localObject).e(paramgA, (byte)-1);
        }
        ((cGl)localObject).d(18009);
        cjO.clE().j((cWG)localObject);
      }
      return;
    }

    if (((paramgA.on()) && (!a(paramgA, Aq.bvO))) || (a(paramgA, parambyz, Aq.bvO)))
    {
      localObject = new bqw(paramgA, (byte)paramdKD.ok(), paramBoolean);
      ((bqw)localObject).d(16712);
      cjO.clE().j((cWG)localObject);
      return;
    }
    if (paramdKD.azu() == 2) {
      a(paramdKD);
      return;
    }

    b(paramdKD);
  }

  private static void a(gA paramgA, byz parambyz, boolean paramBoolean) {
    if (parambyz.adF()) {
      localObject = new cGl();
      try {
        azO[] arrayOfazO = paramgA.oi().bKn().nh();
        ((cGl)localObject).e(paramgA, (byte)(arrayOfazO.length > 0 ? arrayOfazO[0].hV : -1));
      } catch (Exception localException) {
        ((cGl)localObject).e(paramgA, (byte)-1);
      }
      ((cGl)localObject).d(18009);
      cjO.clE().j((cWG)localObject);
      return;
    }

    Object localObject = new bqw(paramgA, (byte)paramgA.ok(), paramBoolean);
    ((bqw)localObject).d(16712);
    cjO.clE().j((cWG)localObject);
  }

  private static void a(dKD paramdKD)
  {
    byz localbyz = byv.bFN().bFO();
    if (localbyz.adF())
    {
      return;
    }
    gA localgA = (gA)localbyz.ayJ().hh(paramdKD.ok());

    if ((localgA != null) && (localgA.isActive())) {
      czW localczW = new czW();
      localczW.setItem(localgA);
      localczW.cP((short)-1);
      localczW.d(16803);
      cjO.clE().j(localczW);
      byA.onChangeEquipement(localbyz);
    }
  }

  private static void b(dKD paramdKD) {
    byz localbyz = byv.bFN().bFO();
    cRs localcRs = localbyz.bGP().yg(paramdKD.ok());
    if (localcRs != null) {
      gA localgA = localcRs.yT(paramdKD.ok());
      if ((((bVw)localgA.oi()).cbh().cwA()) && ((localcRs instanceof bCJ)))
      {
        byA.addToEquipment(localgA, (bCJ)localcRs);
        byA.onChangeEquipement(localbyz);
      }
    }
  }

  public static boolean useUsableItem(gA paramgA, boolean paramBoolean) {
    byz localbyz = byv.bFN().bFO();
    if (localbyz.isDead()) {
      avW.aIb().a(6, 3, new Object[0]);
      return false;
    }

    if ((paramgA != null) && (paramgA.isActive()) && (cQI.aI(paramgA))) {
      a(paramgA, localbyz, paramBoolean);
      return true;
    }

    if (cBF.isG.xo(paramgA.ok()))
      avW.aIb().a(64, 3, new Object[0]);
    else {
      avW.aIb().a(61, 3, new Object[0]);
    }

    return false;
  }

  public static void openCloseShortcutDescription(cEv paramcEv, dRq paramdRq)
  {
    if ((paramcEv.getItemValue() != null) && ((paramcEv.getItemValue() instanceof ahg))) {
      paramdRq = (dRq)paramcEv.cIl();

      byz localbyz = byv.bFN().bFO();
      Object localObject1 = localbyz;
      if ((localbyz.adF()) && (localbyz.aeQ() != null)) {
        if (localbyz.aeQ().aDp().AP()) {
          localObject2 = localbyz.aeQ().aDp().Ia();
          int i = (!((Su)localObject2).cQJ()) && (((Su)localObject2).adL() == localbyz) ? 1 : 0;
          if ((((Su)localObject2).getId() == localbyz.getId()) || (i != 0)) {
            localObject1 = localObject2;
          }
        }
        if (localObject1 == null) {
          localObject1 = localbyz;
        }
      }

      Object localObject2 = (ahg)paramcEv.getItemValue();
      Object localObject3;
      Object localObject4;
      if (((ahg)localObject2).asL() == bKq.gNe) {
        localObject3 = ((Su)localObject1).bV(((ahg)localObject2).oj());
        dLE.doY().t("describedSpell", localObject3);
        localObject4 = (anG)paramdRq.getElementMap().fi("spellDetailPopup");
        if ((paramcEv.mp() == CH.bGg) && (!bsP.getInstance().isDragging()))
          ayw.popup((anG)localObject4, paramdRq);
        else if (paramcEv.mp() == CH.bGf)
          ayw.closePopup(paramcEv, (anG)localObject4);
      }
      Object localObject6;
      if (((ahg)localObject2).asL() == bKq.gNh)
      {
        localObject3 = (anG)paramdRq.getElementMap().fi("itemDetailPopup");
        if ((paramcEv.mp() == CH.bGg) && (!bsP.getInstance().isDragging()))
        {
          if (((ahg)localObject2).ok() == 2145) {
            localObject4 = new gA(-1L);
            localObject6 = Hh.QM().dh(2145);
            ((gA)localObject4).b((bBn)localObject6);
            ((gA)localObject4).l((short)1);
          } else {
            localObject4 = (gA)localbyz.ayJ().ci(((ahg)localObject2).oj());
            if (localObject4 == null) {
              localObject4 = localbyz.bGP().iS(((ahg)localObject2).oj());
            }
          }
          dLE.doY().t("handsOfWeapon", "twoHands");

          dLE.doY().t("itemPopupDetail", localObject4);
          dLE.doY().t("isFromEquipedShortcut", Boolean.valueOf(true));
          ayw.popup((anG)localObject3, paramdRq);
        }
        else if (paramcEv.mp() == CH.bGf) {
          dLE.doY().t("itemPopupDetail", null);
          dLE.doY().t("isFromEquipedShortcut", Boolean.valueOf(false));

          dLE.doY().t("isFromShortcut", Boolean.valueOf(false));
          dLE.doY().t("handsOfWeapon", "none");
          ayw.closePopup(paramcEv, (anG)localObject3);
        }

      }

      if (((ahg)localObject2).asL() == bKq.gNi) {
        localObject3 = bmJ.fFu.qg(((ahg)localObject2).ok());
        dLE.doY().t("currentDescribedEmote", localObject3);
        localObject4 = (anG)paramdRq.getElementMap().fi("emotePopup");
        if ((paramcEv.mp() == CH.bGg) && (!bsP.getInstance().isDragging()))
          ayw.popup((anG)localObject4, paramdRq);
        else if (paramcEv.mp() == CH.bGf)
          ayw.closePopup(paramcEv, (anG)localObject4);
      }
      Object localObject5;
      if (((ahg)localObject2).asL() == bKq.gNg)
      {
        localObject3 = (gA)byv.bFN().bFO().ayJ().hh(((ahg)localObject2).ok());
        if (localObject3 != null) {
          int j = byv.bFN().bFO().ayJ().il(((gA)localObject3).oj());

          if ((j == 15) || (j == 16))
          {
            if (((gA)localObject3).ol().nc() == 121) {
              K.info("Lampe");
            }
            else
            {
              localObject6 = (anG)paramdRq.getElementMap().fi("itemDetailPopup");
              if ((paramcEv.mp() == CH.bGg) && (!bsP.getInstance().isDragging()))
              {
                if (j == 15)
                {
                  if (((gA)localObject3).oi().bKm()) {
                    dLE.doY().t("handsOfWeapon", "twoHands");
                  }
                  else {
                    dLE.doY().t("handsOfWeapon", "rightHand");
                  }

                }
                else if (j == 16) {
                  dLE.doY().t("handsOfWeapon", "leftHand");
                }

                dLE.doY().t("itemPopupDetail", localObject3);
                dLE.doY().t("isFromEquipedShortcut", Boolean.valueOf(true));
                ayw.popup((anG)localObject6, paramdRq);
              }
              else if (paramcEv.mp() == CH.bGf) {
                dLE.doY().t("itemPopupDetail", null);
                dLE.doY().t("isFromEquipedShortcut", Boolean.valueOf(false));

                dLE.doY().t("isFromShortcut", Boolean.valueOf(false));
                dLE.doY().t("handsOfWeapon", "none");
                ayw.closePopup(paramcEv, (anG)localObject6);
              }

            }

          }
          else
          {
            dLE.doY().t("isFromShortcut", Boolean.valueOf(false));

            if (((gA)localObject3).isUsable())
              dLE.doY().t("isFromEquipedShortcut", Boolean.valueOf(true));
            else {
              dLE.doY().t("isFromEquipedShortcut", Boolean.valueOf(false));
            }

            localObject6 = (anG)paramdRq.getElementMap().fi("itemDetailPopup");
            if ((paramcEv.mp() == CH.bGg) && (!bsP.getInstance().isDragging()))
            {
              dLE.doY().t("itemPopupDetail", localObject3);
              ayw.popup((anG)localObject6, paramdRq);
            } else if (paramcEv.mp() == CH.bGf) {
              dLE.doY().t("itemPopupDetail", null);
              ayw.closePopup(paramcEv, (anG)localObject6);
            }
          }
        }
        else {
          localObject3 = (gA)byv.bFN().bFO().bGP().ye(((ahg)localObject2).ok());

          if (localObject3 != null)
          {
            localObject5 = (bVw)((gA)localObject3).oi();

            localObject6 = ((bVw)localObject5).cbh();
            anG localanG;
            if (((((czM)localObject6).cwD().equals("")) && (((bVw)localObject5).bKk() == 0) && (((czM)localObject6).cwF().equals(""))) || ((((czM)localObject6).cwD() == null) && (((czM)localObject6).cwF() == null)))
            {
              localanG = (anG)paramdRq.getElementMap().fi("itemSimplePopup");
              if ((paramcEv.mp() == CH.bGg) && (!bsP.getInstance().isDragging()))
              {
                dLE.doY().t("itemPopupDetail", localObject3);
                dLE.doY().t("isFromShortcut", Boolean.valueOf(true));
                ayw.popup(localanG, paramdRq);
              } else if (paramcEv.mp() == CH.bGf) {
                dLE.doY().t("itemPopupDetail", null);
                dLE.doY().t("isFromShortcut", Boolean.valueOf(false));
                ayw.closePopup(paramcEv, localanG);
              }

            }
            else
            {
              localanG = (anG)paramdRq.getElementMap().fi("itemDetailPopup");
              if ((paramcEv.mp() == CH.bGg) && (!bsP.getInstance().isDragging()))
              {
                dLE.doY().t("itemPopupDetail", localObject3);
                dLE.doY().t("isFromShortcut", Boolean.valueOf(true));
                ayw.popup(localanG, paramdRq);
              } else if (paramcEv.mp() == CH.bGf) {
                dLE.doY().t("itemPopupDetail", null);
                dLE.doY().t("isFromShortcut", Boolean.valueOf(false));

                dLE.doY().t("isFromEquipedShortcut", Boolean.valueOf(false));
                ayw.closePopup(paramcEv, localanG);
              }
            }
          }
        }
      } else if (bKq.gNf == ((ahg)localObject2).asL()) {
        localObject3 = (bVw)Hh.QM().dh(((ahg)localObject2).ok());
        if (localObject3 == null) {
          return;
        }

        localObject5 = ((bVw)localObject3).cbh();
        if (((((czM)localObject5).cwD().equals("")) && (((bVw)localObject3).bKk() == 0) && (((czM)localObject5).cwF().equals(""))) || ((((czM)localObject5).cwD() == null) && (((czM)localObject5).cwF() == null)))
        {
          localObject6 = (anG)paramdRq.getElementMap().fi("itemSimplePopup");
          if ((paramcEv.mp() == CH.bGg) && (!bsP.getInstance().isDragging()))
          {
            dLE.doY().t("itemPopupDetail", localObject3);
            dLE.doY().t("isFromShortcut", Boolean.valueOf(true));
            ayw.popup((anG)localObject6, paramdRq);
          } else if (paramcEv.mp() == CH.bGf) {
            dLE.doY().t("itemPopupDetail", null);
            dLE.doY().t("isFromShortcut", Boolean.valueOf(false));
            ayw.closePopup(paramcEv, (anG)localObject6);
          }

        }
        else
        {
          localObject6 = (anG)paramdRq.getElementMap().fi("itemDetailPopup");
          if ((paramcEv.mp() == CH.bGg) && (!bsP.getInstance().isDragging()))
          {
            dLE.doY().t("itemPopupDetail", localObject3);
            dLE.doY().t("isFromShortcut", Boolean.valueOf(true));
            ayw.popup((anG)localObject6, paramdRq);
          } else if (paramcEv.mp() == CH.bGf) {
            dLE.doY().t("itemPopupDetail", null);
            dLE.doY().t("isFromShortcut", Boolean.valueOf(false));

            dLE.doY().t("isFromEquipedShortcut", Boolean.valueOf(false));
            ayw.closePopup(paramcEv, (anG)localObject6);
          }
        }
      }
    }
  }

  public static void toggleShortcutBarMode(cSx paramcSx)
  {
    bzu localbzu = new bzu();
    if (byv.bFN().bFO().bGD().cWy() == aFy.ebH)
      localbzu.d(16432);
    else {
      localbzu.d(16433);
    }
    cjO.clE().j(localbzu);
  }

  public static void openEmotesInventory(dbi paramdbi) {
    boolean bool = paramdbi.isSelected();
    if ((!bool) && (byv.bFN().c(zM.ID())))
      byv.bFN().b(zM.ID());
    else if ((bool) && (!byv.bFN().c(zM.ID()))) {
      byv.bFN().a(zM.ID());
    }
    Bf.Kk().at(bool);
  }

  public static void displaySpellDescription(cSx paramcSx, apX paramapX)
  {
  }
}