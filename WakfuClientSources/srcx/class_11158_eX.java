import com.ankamagames.wakfu.client.WakfuClientInstance;
import java.util.Locale;
import org.apache.log4j.Logger;

public class eX
{
  protected static final Logger K = Logger.getLogger(eX.class);
  public static final String PACKAGE = "wakfu";
  private static dRq aBV;

  public static void quit(cSx paramcSx)
  {
    bzu.cf((short)16387);
  }

  public static void onLanguageSelected(arS paramarS) {
    if (paramarS.getSelected()) {
      XO localXO = (XO)paramarS.getValue();

      aii localaii = new aii();
      localaii.b(localXO.ajJ());
      cjO.clE().j(localaii);

      WakfuClientInstance.awy().awB().c(yR.bsz, localXO.ajJ().cAZ().getLanguage());
    }
  }

  public static void setLanguage(cSx paramcSx, String paramString)
  {
    aii localaii = new aii();
    localaii.b(cFI.no(paramString));
    cjO.clE().j(localaii);

    WakfuClientInstance.awy().awB().c(yR.bsz, paramString);
  }

  public static boolean validateLoginForm(dso paramdso)
  {
    paramdso.cYU();

    if (!ay.bd().bt()) {
      str1 = paramdso.getProperty("account.name").getString();
      String str2 = paramdso.getProperty("account.password").getString();
      return (str1 != null) && (str2 != null) && (!str1.equals("")) && (!str2.equals(""));
    }
    String str1 = paramdso.getProperty("account.password").getString();
    return (str1 != null) && (!str1.equals(""));
  }

  public static void selectProxy(arS paramarS)
  {
    if (paramarS.getSelected())
      dLE.doY().t("proxy.selected", paramarS.getValue());
  }

  public static void logon(cSx paramcSx, dso paramdso)
  {
    if (((paramcSx instanceof ctH)) && (((ctH)paramcSx).getKeyCode() != 10)) {
      return;
    }

    if (paramdso.isValid())
    {
      doh localdoh = (doh)paramdso.getProperty("proxy.selected").getValue();

      String str1 = paramdso.getProperty("account.name").getString();
      String str2 = paramdso.getProperty("account.password").getString();
      boolean bool = paramdso.getProperty("account.remember").getBoolean();

      dDD localdDD = dDD.dfr();
      localdDD.a(localdoh);
      localdDD.hY(str1);
      localdDD.setPassword(str2);
      localdDD.b(Boolean.valueOf(bool));
      cjO.clE().j(localdDD);

      aWc.blo().eO(600002L);
    }
    else
    {
      cBQ.cxL().a(bU.fH().getString("logon.invalidForm"), Cn.et(1), 1027L, 1, 2);
    }
  }

  public static void logon(cSx paramcSx, dso paramdso, aTp paramaTp)
  {
    if (((paramcSx instanceof ctH)) && (((ctH)paramcSx).getKeyCode() != 10)) {
      return;
    }

    login(paramdso, paramaTp.getText());
  }

  public static void skip(cSx paramcSx, dso paramdso) {
    login(paramdso, null);
  }

  public static void login(dso paramdso, String paramString) {
    if (paramdso.isValid())
    {
      doh localdoh = (doh)paramdso.getProperty("proxy.selected").getValue();

      String str = paramdso.getProperty("account.password").getString();
      boolean bool = paramdso.getProperty("account.remember").getBoolean();

      dDD localdDD = dDD.dfr();
      localdDD.a(localdoh);
      localdDD.hY("test" + Math.abs(bCO.bLh()));
      localdDD.setPassword("pass");
      localdDD.b(Boolean.valueOf(bool));
      localdDD.setEmail(paramString);
      cjO.clE().j(localdDD);
    }
    else
    {
      cBQ.cxL().a(bU.fH().getString("logon.invalidForm"), 1027L, 1, 2);
    }
  }

  public static void openMenuDialog(cSx paramcSx)
  {
    bzu.cf((short)16400);
  }

  public static void openReportBugDialog(cSx paramcSx)
  {
    bzu.cf((short)16427);
  }

  public static void openAdminMonitorPanel(cSx paramcSx) {
    bzu.cf((short)17721);
  }

  public static void openAdminCharacterEditor(cSx paramcSx) {
    bzu.cf((short)17724);
  }

  public static void hackClientRights(cSx paramcSx) {
    bHj localbHj = byv.bFN().bFO().bSu();
    boolean bool = !localbHj.bOT();
    localbHj.gb(bool);
    dLE.doY().t("rightsHackMode", Boolean.valueOf(bool));
  }

  public static void moderation(cSx paramcSx) {
    bsz localbsz = WakfuClientInstance.awy().awZ();
    if (localbsz == null) {
      byv.bFN().a(aRO.eOP);
      WakfuClientInstance.awy().awY();
    } else {
      localbsz.setVisible(!localbsz.isVisible());
    }
  }

  public static void closePrivateMessageDialog(cSx paramcSx)
  {
    bzu.cf((short)19004);
  }

  public static boolean checkNameValidity(String paramString)
  {
    String str;
    switch (bSN.bRh[bXy.kG(paramString).ordinal()]) {
    case 1:
      str = bU.fH().getString("error.characterCreation.forbiddenName");
      break;
    case 2:
      str = bU.fH().getString("error.characterCreation.invalidDashPosition");
      break;
    case 3:
      str = bU.fH().getString("error.characterCreation.tooManyConsonant");
      break;
    case 4:
      str = bU.fH().getString("error.characterCreation.tooManyVowel");
      break;
    case 5:
      str = bU.fH().getString("error.characterCreation.nameTooLong");
      break;
    case 6:
      str = bU.fH().getString("error.characterCreation.nameTooShort");
      break;
    case 7:
      str = bU.fH().getString("error.characterCreation.badChar");
      break;
    case 8:
      str = bU.fH().getString("error.characterCreation.tooManyConsecutiveIdentical");
      break;
    case 9:
      str = bU.fH().getString("error.characterCreation.tooFewVowelInPart");
      break;
    case 10:
      str = bU.fH().getString("error.characterCreation.tooFewConsonantInPart");
      break;
    case 11:
      str = bU.fH().getString("error.characterCreation.tooManySpecialInPart");
      break;
    case 12:
      str = bU.fH().getString("error.characterCreation.parTooLong");
      break;
    case 13:
      str = bU.fH().getString("error.characterCreation.tooManySpecial");
      break;
    case 14:
      str = bU.fH().getString("error.characterCreation.nameWithBadCase");
      break;
    default:
      return true;
    }
    cBQ.cxL().a(str, Cn.et(1), 1027L, 1, 2);

    return false;
  }

  public static String formatNumber(String paramString) {
    String str = "";
    if ((paramString != null) && (paramString.length() > 0)) {
      int i = 1;
      while (paramString.length() > 3 * i) {
        str = "." + paramString.substring(paramString.length() - 3 * i, paramString.length() - 3 * (i - 1)) + str;
        i++;
      }
      str = paramString.substring(0, paramString.length() - 3 * (i - 1)) + str;
    }

    return str;
  }

  public static int parseStringNumber(String paramString) {
    paramString = paramString.replaceAll("\\.", "");
    try {
      return Integer.parseInt(paramString);
    } catch (Exception localException) {
      K.error("Exception", localException);
    }return 2147483647;
  }

  public static void openItemDetailWindow(cEv paramcEv, bpn parambpn)
  {
    if (paramcEv.getButton() == 3) {
      gA localgA = null;
      Object localObject = paramcEv.getItemValue();
      if ((localObject instanceof BG))
        localgA = ((BG)localObject).getItem();
      else if ((localObject instanceof cDm)) {
        localgA = Hh.QM().eO(((cDm)localObject).Hu().getId());
      }

      if (!byv.bFN().c(dGW.dhM())) {
        byv.bFN().a(dGW.dhM());
      }

      sendOpenCloseItemDetailMessage(parambpn == null ? null : parambpn.getElementMap().getId(), localgA);
    }
  }

  public static void sendOpenCloseItemDetailMessage(String paramString, bVw parambVw) {
    gA localgA = new gA(parambVw.getId());
    localgA.b(parambVw);

    localgA.l((short)1);
    sendOpenCloseItemDetailMessage(paramString, localgA);
  }

  public static void sendOpenCloseItemDetailMessage(String paramString, gA paramgA)
  {
    Object localObject;
    if (paramgA.nI()) {
      localObject = new dkW(new ckV(paramgA));
      ((ace)localObject).d(16430);
    } else {
      localObject = new cER();
      ((ace)localObject).d(16415);
      ((ace)localObject).a(paramgA);
    }
    ((ace)localObject).dX(paramString);
    cjO.clE().j((cWG)localObject);
  }

  public static void openItemDetailWindow(cEv paramcEv)
  {
    openItemDetailWindow(paramcEv, null);
  }

  public static boolean openLinkInBrowser(cSx paramcSx, dgA paramdgA) {
    if (!openLinkInBrowser(paramcSx)) {
      N(paramdgA.cPU().getLink());
    }

    return true;
  }

  public static boolean openLinkInBrowser(cSx paramcSx, bnC parambnC) {
    if (!openLinkInBrowser(paramcSx)) {
      N(parambnC.BX().getLink());
    }

    return true;
  }

  public static boolean openLinkInBrowser(cSx paramcSx, avJ paramavJ) {
    if (!openLinkInBrowser(paramcSx)) {
      N(paramavJ.aHA().getLink());
    }

    return true;
  }

  public static boolean openLinkInBrowser(cSx paramcSx) {
    if ((paramcSx.cIl() instanceof cWk)) {
      cWk localcWk = (cWk)paramcSx.cIl();
      cDG localcDG = localcWk.getBlockUnderMouse();
      if ((localcDG != null) && (localcDG.czB() == cUE.kHp)) {
        ddB localddB = localcDG.aOi();
        if (localddB == null) {
          return false;
        }
        if (localddB.cOJ() == bY.QP) {
          String str = ((ckA)localddB).getId();
          if (str != null) {
            N(str);
            return true;
          }
        }
      }
    }
    return false;
  }

  private static void N(String paramString) {
    dQI.rN(paramString);
  }

  public static void createAccount(cSx paramcSx) {
    String str = String.format("http://www.wakfu.com/%s/account-creation", new Object[] { bU.fE().getName() });
    N(str);
  }

  public static void validateNickname(cSx paramcSx, aTp paramaTp) {
    String str = paramaTp.getText();

    if (str.length() < 3) {
      cBQ.cxL().a(bU.fH().getString("error.connection.nicknameTooShort"), Cn.et(1), 1027L, 1, 2);
    }
    else if (str.equalsIgnoreCase(byv.bFN().brr())) {
      cBQ.cxL().a(bU.fH().getString("error.connection.nicknameEqualsLogin"), Cn.et(1), 1027L, 1, 2);
    }
    else
    {
      bzu localbzu = new bzu();
      localbzu.d(16392);
      localbzu.a(str);
      cjO.clE().j(localbzu);

      cBQ.cxL().mW("nicknameChoiceDialog");
    }
  }

  public static void setLeftArrowVisible(cSx paramcSx) {
    if (!dAE.ddW().dee().bOc()) {
      return;
    }
    cpa localcpa = cBQ.cxL().coO().nf("logonDialog");
    dOc localdOc1 = (dOc)localcpa.fi("leftArrowContainer");
    dOc localdOc2 = (dOc)localcpa.fi("leftArrowImage");
    localdOc1.setVisible(true);
    localdOc2.setVisible(true);
    a(true, localdOc1);
    a(true, localdOc2);
  }

  public static void setLeftArrowInvisible(cSx paramcSx)
  {
    setLeftArrowInvisible(paramcSx, false);
  }

  public static void setLeftArrowInvisible(cSx paramcSx, boolean paramBoolean) {
    if ((!paramBoolean) && (!dAE.ddW().dee().bOc())) {
      return;
    }
    cpa localcpa = cBQ.cxL().coO().nf("logonDialog");
    dOc localdOc1 = (dOc)localcpa.fi("leftArrowContainer");
    dOc localdOc2 = (dOc)localcpa.fi("leftArrowImage");
    localdOc1.setVisible(true);
    localdOc2.setVisible(true);
    a(false, localdOc1);
    a(false, localdOc2);
  }

  public static void setRightArrowVisible(cSx paramcSx) {
    if (!dAE.ddW().dee().bOb()) {
      return;
    }
    cpa localcpa = cBQ.cxL().coO().nf("logonDialog");
    dOc localdOc1 = (dOc)localcpa.fi("rightArrowContainer");
    dOc localdOc2 = (dOc)localcpa.fi("rightArrowImage");
    localdOc1.setVisible(true);
    localdOc2.setVisible(true);
    a(true, localdOc1);
    a(true, localdOc2);
  }

  public static void setRightArrowInvisible(cSx paramcSx)
  {
    setRightArrowInvisible(paramcSx, false);
  }

  public static void setRightArrowInvisible(cSx paramcSx, boolean paramBoolean) {
    if ((!paramBoolean) && (!dAE.ddW().dee().bOb())) {
      return;
    }
    cpa localcpa = cBQ.cxL().coO().nf("logonDialog");
    dOc localdOc1 = (dOc)localcpa.fi("rightArrowContainer");
    dOc localdOc2 = (dOc)localcpa.fi("rightArrowImage");
    localdOc1.setVisible(true);
    localdOc2.setVisible(true);
    a(false, localdOc1);
    a(false, localdOc2);
  }

  private static void a(boolean paramBoolean, dOc paramdOc)
  {
    int i;
    int j;
    if (paramBoolean) {
      i = bNa.gRu.get();
      j = bNa.gRx.get();
    } else {
      i = bNa.gRx.get();
      j = bNa.gRu.get();
    }

    if (paramBoolean)
      aWc.blo().blC();
    else {
      aWc.blo().blD();
    }

    bNa localbNa1 = new bNa(i);
    bNa localbNa2 = new bNa(j);

    paramdOc.getAppearance().J(gm.class);
    gm localgm = new gm(localbNa1, localbNa2, paramdOc.getAppearance(), 0, 500, 1, false, ddp.kWG);
    paramdOc.getAppearance().a(localgm);
  }

  public static void togglePlayPauseVideo(cSx paramcSx) {
    bzu.cf((short)16111);
  }

  public static void selectNew(cSx paramcSx, ajz paramajz) {
    ahZ localahZ = new ahZ(paramajz);
    cjO.clE().j(localahZ);
  }

  public static void selectNextNew(cSx paramcSx) {
    bzu.cf((short)16114);
  }

  public static void selectPreviousNew(cSx paramcSx) {
    bzu.cf((short)16113);
  }

  public static void setVideoVolume(bXo parambXo, bZh parambZh) {
    bzu localbzu = new bzu();
    localbzu.d(16115);
    localbzu.a(parambXo.getValue());
    cjO.clE().j(localbzu);
  }

  public static void setVideoProgression(dMr paramdMr) {
    bzu localbzu = new bzu();
    if (!(paramdMr.cIl() instanceof alP))
      return;
    alP localalP = (alP)paramdMr.cIl();
    int i = localalP.getWidth();
    if (i == 0)
      return;
    float f = paramdMr.y(localalP) / i;
    localbzu.d(16119);
    localbzu.a(f);
    cjO.clE().j(localbzu);
  }

  public static void seek(cSx paramcSx, alP paramalP) {
    dMr localdMr = (dMr)paramcSx;
    int i = localdMr.y(paramalP);
    int j = localdMr.z(paramalP);

    paramalP.setValue(i / paramalP.getWidth());
  }

  public static void mouseOverQuality(cSx paramcSx, dRq paramdRq)
  {
    paramdRq.setVisible(true);
    aBV = paramdRq;
  }

  public static void mouseOutQuality(cSx paramcSx, dRq paramdRq) {
    paramdRq.setVisible(false);
  }

  public static void mouseOverNew(cEv paramcEv) {
    dLE.doY().t("overNew", paramcEv.getItemValue());
  }

  public static void mouseOutNew(cEv paramcEv) {
    dLE.doY().t("overNew", null);
  }

  public static void selectQuality(cEv paramcEv) {
    if (aBV != null) {
      aBV.setVisible(false);
      aBV = null;
    }
    tj localtj = (tj)paramcEv.getItemValue();
    bzu localbzu = new bzu();
    localbzu.d(16116);
    localbzu.e(localtj.AI());
    cjO.clE().j(localbzu);
  }

  public static void muteVideo(cSx paramcSx) {
    bzu.cf((short)16117);
  }

  public static void onMouseOutDrawer(dMr paramdMr, bZh parambZh, dOc paramdOc, dRq paramdRq) {
    if (!parambZh.isPopupIsBeingDisplayed()) {
      return;
    }
    dOc localdOc = bsP.getInstance().getWidget(paramdMr.getScreenX(), paramdMr.getScreenY());
    if (paramdOc.equals(localdOc)) {
      return;
    }
    if ((localdOc == paramdRq) || (localdOc.j(paramdRq))) {
      return;
    }
    ayw.switchDrawer(paramdMr, parambZh);
  }

  public static void displayQuests(cSx paramcSx) {
    cpa localcpa = cBQ.cxL().coO().nf("verticalFollowedAchievementsDialog");
    if (localcpa == null) {
      localcpa = cBQ.cxL().coO().nf("followedAchievementsDialog");
    }
    if (localcpa == null) {
      return;
    }

    bpn localbpn = (bpn)localcpa.fi("window");
    int i = localbpn.getY() + localbpn.getHeight();
    localbpn.setVisible(false);
    aIH localaIH = WakfuClientInstance.awy().awB();
    boolean bool = !dLE.doY().getBooleanProperty("followedQuestsDisplay");
    localaIH.a(bmz.fEW, bool);
    asv.aEL();

    localbpn.a(new bSQ(localbpn, i));
  }

  public static void setVideoToFullScreen(cSx paramcSx)
  {
    bzu.cf((short)16118);
  }

  public static void browser(cSx paramcSx) {
    hx.aGS.b(El.bIW);
  }

  public static void shop(cSx paramcSx) {
    if (byv.bFN().c(bvY.bDM()))
      byv.bFN().b(bvY.bDM());
    else
      byv.bFN().a(bvY.bDM());
  }
}