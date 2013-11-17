import com.ankamagames.wakfu.client.WakfuClientInstance;
import com.ankamagames.wakfu.client.console.command.commonIn.GetPrivateContactCommand;
import org.apache.log4j.Logger;

public class adU
{
  private static final Logger K = Logger.getLogger(adU.class);
  public static final String PACKAGE = "wakfu.chat";
  private static dBv cUL;
  private static jO cUM;
  private static final String cUN = "/w (&quot;.*&quot;|[^&quot;][\\p{L}'-]*[^&quot;])\\s+(.*)(^(.*)$)*";
  private static bjI cUO = new bjI();

  private static dPI cUP = new dPI(null);

  private static final doN cGQ = new dOH();

  public static boolean processInputKeyEvent(ctH paramctH, dso paramdso, dnp paramdnp)
  {
    paramdso.cYU();
    bbo localbbo = paramdso.getProperty("chat").hR("currentView");
    localbbo.bpF();
    String str1 = paramdnp.cUS();

    boolean bool = paramctH.ex();
    String str2;
    switch (paramctH.getKeyCode()) {
    case 10:
      paramdso.cYU();
      str2 = localbbo.hL("input");

      if (str2.length() > 0)
      {
        if ((!str2.startsWith("/")) && (str1 != null) && (str1.length() > 0)) {
          str2 = str1 + " " + str2;
        }

        if (!str2.matches(".*\".*\".*")) {
          localObject = abi.cPt.anI();
          String str3 = null;
          if (str2.matches("/w (&quot;.*&quot;|[^&quot;][\\p{L}'-]*[^&quot;])\\s+(.*)(^(.*)$)*")) {
            str3 = str2.replaceFirst((String)localObject + ' ', "");
            str3 = str3.substring(0, str3.indexOf(' '));
          }
          if ((str3 != null) && (str3.length() > 2)) {
            str2 = str2.replaceFirst(str3, '"' + str3 + '"');
          }
        }
        Object localObject = new cQb();
        ((cQb)localObject).setMessage(str2);
        ((cQb)localObject).b(paramdnp);
        cjO.clE().j((cWG)localObject);

        localbbo.a("input", "");
      }
      else {
        zC.Ip().e(null);
        return true;
      }

      if (WakfuClientInstance.awy().awB().a(bmz.fEK))
        zC.Ip().e(null);
      return true;
    case 27:
      zC.Ip().e(null);
      ((duS)paramctH.cIl()).setText("");
      return true;
    case 38:
      if (bool) {
        GetPrivateContactCommand.aW(false);
        return true;
      }
      str2 = CM.LV().LW().ceN();
      str2 = B(str1, str2);
      localbbo.a("input", str2);
      return true;
    case 40:
      if (bool) {
        GetPrivateContactCommand.aW(false);
        return true;
      }
      str2 = CM.LV().LW().ceO();
      str2 = B(str1, str2);
      localbbo.a("input", str2);
      return true;
    }

    return false;
  }

  private static String B(String paramString1, String paramString2) {
    if (!paramString1.equals("")) {
      if ((paramString2.matches("/w (&quot;.*&quot;|[^&quot;][\\p{L}'-]*[^&quot;])\\s+(.*)(^(.*)$)*")) && (paramString1.matches("/w (&quot;.*&quot;|[^&quot;][\\p{L}'-]*[^&quot;])\\s+(.*)(^(.*)$)*")))
        return paramString2.replaceFirst("(/w \"[a-zA-Z_0-9'-]+\"\\s)", "");
      if ((!paramString2.startsWith("/")) || (paramString2.startsWith(paramString1))) {
        return paramString2.replaceFirst(paramString1 + " ", "");
      }
    }

    return paramString2;
  }

  public static void chooseChannel(arS paramarS, dnp paramdnp)
  {
    ahB localahB = aAx.aMd().c((dju)paramdnp);
    Object localObject;
    if (localahB != null) {
      localObject = new bzu();
      ((bzu)localObject).d(19025);
      ((bzu)localObject).e(localahB.auq());
      cjO.clE().j((cWG)localObject);
    }
    if (paramarS.getValue() != null) {
      localObject = new bUt();
      ((bUt)localObject).a((cgv)paramarS.getValue());
      ((bUt)localObject).b(paramdnp);
      cjO.clE().j((cWG)localObject);
    }
  }

  public static void openCloseContactList(cSx paramcSx)
  {
    bzu.cf((short)19002);
  }

  public static void openCloseEmoteBar(cSx paramcSx)
  {
    bzu.cf((short)19008);
  }

  public static void filterButtonActivation(dMr paramdMr, dnp paramdnp, anG paramanG) {
    if (paramdMr.mp() == CH.bGw)
    {
      dLE.doY().a("chat.popupCurrentView", paramdnp, paramdMr.cIl().getElementMap());
      ayw.openClosePopup(paramdMr, paramanG);
    }
  }

  public static void scrollBarDown(cSx paramcSx, bbp parambbp)
  {
    parambbp.bc(0.0F);
  }

  public static void notifyFocusChange(Gy paramGy, ahB paramahB)
  {
    aTp localaTp = (aTp)paramGy.cIl();
    cpa localcpa = localaTp.getRenderableParent().getElementMap();
    dOc localdOc = zC.Ip().Iq();
    if ((localdOc != null) && (localcpa == localdOc.getElementMap()) && (localdOc.getId() == localaTp.getId()))
      return;
    int i = !paramGy.getFocused() ? 1 : 0;
    int j = paramahB.auq();
    cUO.o(j, (byte)(i != 0 ? 1 : 0));
    bzu localbzu;
    if (i != 0) {
      localaTp.setStyle("dark");
      localbzu = new bzu();
      localbzu.d(19026);
      localbzu.e(j);
      localbzu.c(5000L);
      cjO.clE().j(localbzu);
    } else {
      localaTp.setStyle("light");
      localbzu = new bzu();
      localbzu.d(19025);
      localbzu.e(j);
      cjO.clE().j(localbzu);
    }
  }

  public static void windowFocusChange(Gy paramGy, ahB paramahB) {
    if (paramGy.getFocused())
    {
      if (paramahB != null) {
        bzu localbzu = new bzu();
        localbzu.d(19013);
        localbzu.e(paramahB.auq());
        cjO.clE().j(localbzu);
      }
    }
  }

  public static void addPrivatePipe(cSx paramcSx, dbV paramdbV) {
    addPrivatePipe(paramcSx, paramdbV.aJm());
  }

  public static void addPrivatePipe(cSx paramcSx, String paramString)
  {
    bzu localbzu = new bzu();
    localbzu.d(19061);
    localbzu.a(paramString);
    cjO.clE().j(localbzu);
  }

  public static void closeChat(cSx paramcSx, ahB paramahB) {
    cBQ.cxL().mW(drC.Bn(paramahB.auq()));
    bzu localbzu = new bzu();
    localbzu.d(19062);
    localbzu.e(paramahB.auq());
    cjO.clE().j(localbzu);
  }

  public static void addItem(cSx paramcSx, gA paramgA, dnp paramdnp)
  {
    byA.onDropItem();

    ahB localahB = aAx.aMd().aMi();
    if (paramdnp == null) {
      paramdnp = localahB.auy();
    }

    cpa localcpa = cBQ.cxL().coO().nf(drC.Bn(localahB.auq()));
    if (localcpa == null) {
      return;
    }
    aTp localaTp = (aTp)localcpa.fi("chatInput");
    if (localaTp == null) {
      return;
    }
    String str = " [" + paramgA.getName() + "] ";
    ceb.cgG().ah(paramgA);

    paramdnp.c("input", str);
    dLE.doY().a(paramdnp, new String[] { "input" });
    if (!localaTp.equals(zC.Ip().Iq()))
      zC.Ip().e(localaTp);
  }

  public static void addItem(Qa paramQa, dnp paramdnp)
  {
    if ((paramQa.getValue() instanceof gA))
      addItem(paramQa, (gA)paramQa.getValue(), paramdnp);
  }

  public static void processLinkAction(cSx paramcSx) {
    processLinkAction(paramcSx, null);
  }

  public static void processLinkAction(cSx paramcSx, dnp paramdnp)
  {
    cWk localcWk = (cWk)paramcSx.cIl();
    cDG localcDG = localcWk.getBlockUnderMouse();
    if ((localcDG != null) && (localcDG.czB() == cUE.kHp)) {
      ddB localddB = localcDG.aOi();
      if (localddB.cOJ() == bY.QP) {
        String str1 = ((ckA)localddB).getId();
        if ((str1 != null) && (str1.length() > 0)) {
          String[] arrayOfString = str1.split("_");
          if (arrayOfString.length == 2) {
            String str2 = arrayOfString[0];
            String str3 = arrayOfString[1];

            if ((str2 == null) || (str2.length() == 0)) {
              return;
            }
            if (paramcSx.mp() == CH.bGw)
              a((dMr)paramcSx, paramdnp, str2, str3, localddB.getData());
            else if (paramcSx.mp() == CH.bGs)
              a(paramcSx, paramdnp, str2, str3, localddB.getData());
          }
        }
      }
    }
  }

  private static void a(dMr paramdMr, dnp paramdnp, String paramString1, String paramString2, String paramString3)
  {
    if (paramString1.equals("item")) {
      gA localgA = fromLogRepresentation(paramString2);
      if (paramdMr.getButton() == 3)
        eX.sendOpenCloseItemDetailMessage(null, localgA);
    }
    else
    {
      int j;
      Object localObject1;
      if (paramString1.equals("state")) {
        int i = Integer.parseInt(paramString2);
        j = bCO.sg(i);
        short s = bCO.sh(i);

        bXU localbXU = (bXU)cNO.cFX().yF(j);
        if (localbXU.nU() != s) {
          localbXU = localbXU.cT(s);
        }

        localObject1 = new cjZ();
        ((cjZ)localObject1).a(localbXU);
        ((cjZ)localObject1).a(paramdMr.cIl().getElementMap().getId());
        cjO.clE().j((cWG)localObject1);
      } else if (paramString1.equals("characterName")) {
        byz localbyz = byv.bFN().bFO();
        j = 0;
        long l = -1L;
        try {
          l = Long.parseLong(paramString2);

          if (bQK.bXG().gY(l) == null)
            localObject1 = CA.Lv().bt(paramString3);
          else {
            localObject1 = CA.Lv().bj(l);
          }
          j = l < 0L ? 1 : 0;
        } catch (Exception localException) {
        }
        if ((paramString3 == null) || (paramString3.equals(localbyz.getName())))
          return;
        Object localObject2;
        if (paramdMr.getButton() == 3) {
          localObject2 = cBQ.cxL().cxY();
          ((cxO)localObject2).a(paramString3, null);

          if (j == 0) {
            ((cxO)localObject2).a(bU.fH().getString("desc.mru.createPrivateChat", new Object[] { paramString3 }), null, new dOO(paramString3), true);
          }

          if ((j == 0) && 
            (dmY.cUs().cUu().ky(l) == null)) {
            ((cxO)localObject2).a(bU.fH().getString("chat.addToFriendList"), null, new dOM(paramString3), true);
          }

          if ((j == 0) && 
            (dmY.cUs().cUv().ky(l) == null)) {
            ((cxO)localObject2).a(bU.fH().getString("chat.addToIgnoreList"), null, new dON(paramString3), true);
          }

          if (j == 0) {
            int k = 1;
            if (localbyz.bHj().Td()) {
              Fs localFs = localbyz.bHj().Ta();
              if (localFs.contains(paramString3)) {
                k = 0;
              }
            }
            if (k != 0) {
              ((cxO)localObject2).a(bU.fH().getString("desc.mru.invitToJoinGroup", new Object[] { paramString3 }), null, new dOK(localbyz, paramString3), true);
            }

          }

          Su localSu = CA.Lv().bt(paramString3);
          if (localSu != null)
          {
            ((cxO)localObject2).a(bU.fH().getString("desc.show"), null, new dOL(paramString3), true);
          }

          ((cxO)localObject2).ea(cyb.cvg().getX() + 50, cyb.cvg().getY() + 10);
        }
        else if (paramdMr.getButton() == 1)
        {
          if (paramdMr.eA()) {
            localObject2 = new bzu();
            ((bzu)localObject2).d(19061);
            ((bzu)localObject2).a(paramString3);
            cjO.clE().j((cWG)localObject2);
            return;
          }

          paramdnp.a("input", "/w \"" + paramString3 + "\" ");
          dLE.doY().a(paramdnp, new String[] { "input" });
          localObject2 = (aTp)ceb.cgG().cgH().getElementMap().fi("textEditorRenderableContainer.chatInput");
          if (localObject2 == null)
            return;
          if (!localObject2.equals(zC.Ip().Iq()))
            zC.Ip().e((dOc)localObject2); 
        }
      }
    }
  }

  private static void a(cSx paramcSx, dnp paramdnp, String paramString1, String paramString2, String paramString3) { if (paramString1.equals("item")) {
      cUL = fromLogRepresentation(paramString2);
      cDS.showPopup(cUL, 500);
    } }

  public static void onMouseExitSelectableText(cSx paramcSx)
  {
    if (cUL != null) {
      cDS.hidePopup(paramcSx, cUL);
      cUL = null;
    }
  }

  public static void setPrivateName(cSx paramcSx, dju paramdju) {
    if (((paramcSx instanceof Gy)) && (paramdju.cUR() != null)) {
      Gy localGy = (Gy)paramcSx;
      aTp localaTp = (aTp)paramcSx.cIl();
      if ((localGy.cIl() == localGy.cIk()) && (!localGy.getFocused()))
        paramdju.pF(dju.pk(localaTp.getText()));
      else if ((localGy.getFocused()) && (localaTp.getText().contains("<")))
        paramdju.pF(dju.pk(""));
    }
  }

  public static void selectView(cSx paramcSx, ahB paramahB, dju paramdju, aTp paramaTp)
  {
    if (paramahB != null) {
      bzu localbzu = new bzu();
      localbzu.d(19025);
      localbzu.e(paramahB.auq());
      cjO.clE().j(localbzu);
    }
    if (((dMr)paramcSx).getButton() == 3) {
      if ((paramdju.cSo()) || (paramdju.cSr()))
        return;
      dLE.doY().t("chat.editedView", paramdju);
      zC.Ip().e(paramaTp);
    } else {
      paramahB.a(paramdju);
      dLE.doY().b("chat", "currentView", paramcSx.cIl().getElementMap());
    }
  }

  public static void dropView(Qa paramQa, ahB paramahB, dju paramdju)
  {
  }

  public static void dragView(bvN parambvN, ahB paramahB)
  {
    bzu localbzu = new bzu();
    localbzu.d(19025);
    localbzu.e(paramahB.auq());
    cjO.clE().j(localbzu);
  }

  public static void dropView(cTo paramcTo, ahB paramahB) {
    dropView((dju)paramcTo.getValue(), paramcTo, paramahB);
  }

  public static void dropView(Qa paramQa) {
    dju localdju = (dju)paramQa.sq();
    dropView(localdju, paramQa, aAx.aMd().c(localdju));
  }

  public static void dropView(dju paramdju, dMr paramdMr, ahB paramahB)
  {
    int i = paramdMr.getScreenX();
    int j = paramdMr.getScreenY();
    ahB localahB = ceb.cgG().h(paramdMr);

    if ((localahB != null) && (cUM != null)) {
      cUM.setColor(bNa.gRu);
    }

    int k = paramahB.auq();
    if (localahB == paramahB) {
      localObject1 = ceb.cgG().j(paramdMr);
      if ((paramdju != localObject1) && (localObject1 != null)) {
        paramahB.a(paramdju, false);
        paramahB.a(paramdju, ((dju)localObject1).cUQ() + 1);
        paramahB.a(paramdju);
        aAx.aMd().aMv();
        aAx.aMd().aMt();
        return;
      }

    }
    else if ((localahB != null) && (localahB.auA() < 4)) {
      aAx.aMd().a(paramdju, k, localahB.auq());
      localObject1 = ceb.cgG().uX(localahB.auq());
      ((bpn)localObject1).a(new dOI((bpn)localObject1, localahB));

      aAx.aMd().aMt();
      localObject2 = new bzu();
      ((bzu)localObject2).d(19025);
      ((bzu)localObject2).e(localahB.auq());
      cjO.clE().j((cWG)localObject2);

      localObject2 = new bzu();
      ((bzu)localObject2).d(19026);
      ((bzu)localObject2).e(localahB.auq());
      ((bzu)localObject2).c(5000L);
      cjO.clE().j((cWG)localObject2);

      localObject2 = new bzu();
      ((bzu)localObject2).d(19026);
      ((bzu)localObject2).e(k);
      ((bzu)localObject2).c(5000L);
      cjO.clE().j((cWG)localObject2);
      return;
    }

    if (paramahB.auA() == 1)
    {
      localObject1 = ceb.cgG().uX(paramahB.auq());
      ((bpn)localObject1).setPosition(i - 50, j + 10 - ((bpn)localObject1).getHeight());

      localObject2 = new bzu();
      ((bzu)localObject2).d(19026);
      ((bzu)localObject2).e(k);
      ((bzu)localObject2).c(5000L);
      cjO.clE().j((cWG)localObject2);
      return;
    }

    if (localahB == paramahB) {
      return;
    }
    Object localObject1 = aAx.aMd().a(paramdju, k, -1);
    Object localObject2 = (bpn)ceb.cgG().b((ahB)localObject1, null);
    ((bpn)localObject2).a(new dOJ((bpn)localObject2, i, j, (ahB)localObject1));

    bpn localbpn = ceb.cgG().uX(k);
    localbpn.a(new dOD(localbpn, paramahB));

    aAx.aMd().aMt();

    bzu localbzu = new bzu();
    localbzu.d(19026);
    localbzu.e(k);
    localbzu.c(5000L);
    cjO.clE().j(localbzu);

    localbzu = new bzu();
    localbzu.d(19026);
    localbzu.e(((ahB)localObject1).auq());
    localbzu.c(5000L);
    cjO.clE().j(localbzu);
  }

  public static void createView(cSx paramcSx, ahB paramahB) {
    paramahB.aur();
    aAx.aMd().aMt();
  }

  public static void openChatOptions(cSx paramcSx) {
    byv.bFN().a(dGH.dhB());
  }

  public static void deleteView(dju paramdju) {
    ahB localahB = aAx.aMd().lu(aAx.aMd().d(paramdju));
    aAx.aMd().a(localahB, paramdju, -1);
    dLE.doY().a(aAx.aMd(), aAx.bF);
    dLE.doY().a(aAx.aMd(), aAx.bF);
    dLE.doY().a(localahB, ahB.bF);
    aAx.aMd().aMt();
    dLE.doY().t("chat.editedView", null);
  }

  public static void setViewName(cSx paramcSx, aTp paramaTp, ahB paramahB) {
    dju localdju = (dju)dLE.doY().rv("chat.editedView");
    if (localdju == null)
      return;
    localdju.setName(paramaTp.getText());
    localdju.ju(true);
    dLE.doY().a(localdju, dju.bF);
    dLE.doY().a(paramahB, ahB.bF);
    aAx.aMd().aMt();
    if ((((paramcSx instanceof Gy)) && (!((Gy)paramcSx).getFocused())) || (((paramcSx instanceof ctH)) && (((ctH)paramcSx).getKeyCode() == 10)))
    {
      dLE.doY().t("chat.editedView", null);
      zC.Ip().e(null);
    }
  }

  public static void activateDisactivateFilter(cSx paramcSx, dju paramdju, String paramString) {
    ahB localahB = aAx.aMd().c(paramdju);
    if (localahB != null) {
      localObject = new bzu();
      ((bzu)localObject).d(19026);
      ((bzu)localObject).e(localahB.auq());
      ((bzu)localObject).c(5000L);
      cjO.clE().j((cWG)localObject);
    }
    Object localObject = (br)paramcSx.cIk();
    paramdju.F(CM.LV().bw(paramString).getId(), ((br)localObject).getSelected());
    paramdju.cSn();
    aAx.aMd().aMt();
  }

  public static void deleteView(cSx paramcSx, dju paramdju) {
    deleteView(paramdju);
  }

  public static void onMouseEnterChat(cSx paramcSx)
  {
  }

  public static void onMouseExitChat(cSx paramcSx)
  {
  }

  public static void onMouseEnterIntersection(cSx paramcSx)
  {
  }

  public static void onMouseExitIntersection(cSx paramcSx)
  {
  }

  public static void setOverIntersection(aNL paramaNL, boolean paramBoolean)
  {
  }

  public static void goDownText(cSx paramcSx, bbp parambbp)
  {
    goDownText(paramcSx, parambbp, true);
  }

  public static void goDownText(cSx paramcSx, bbp parambbp, boolean paramBoolean) {
    if ((paramBoolean) && (cUP.isRunning()))
      return;
    cUP.t(parambbp);
    cUP.c(Boolean.valueOf(false));
    cUP.av(true);
    cUP.run();
    if (paramBoolean) {
      dka.cSF().a(cUP, 100L);
      bsP.getInstance().a(CH.bGv, cGQ, true);
    }
  }

  public static void goUpText(cSx paramcSx, bbp parambbp) {
    goUpText(paramcSx, parambbp, true);
  }

  public static void goUpText(cSx paramcSx, bbp parambbp, boolean paramBoolean) {
    if ((paramBoolean) && (cUP.isRunning()))
      return;
    cUP.t(parambbp);
    cUP.c(Boolean.valueOf(true));
    cUP.av(true);
    cUP.run();

    if (paramBoolean) {
      dka.cSF().a(cUP, 100L);
      bsP.getInstance().a(CH.bGv, cGQ, true);
    }
  }

  public static void goDownBundaryText(cSx paramcSx, bbp parambbp) {
    float f = 0.0F;
    parambbp.setVerticalScrollBarPosition(0.0F);
    dLE.doY().a("chat.scrollOffset", Float.valueOf(parambbp.getVerticalScrollBar().getValue()), paramcSx.cIk().getElementMap().getId());
  }

  private static final void apS()
  {
    dka.cSF().j(cUP);
    cUP.av(false);
    bsP.getInstance().b(CH.bGv, cGQ, true);
  }

  public static gA fromLogRepresentation(String paramString) {
    return bQF.a(bQF.kn(paramString));
  }
}