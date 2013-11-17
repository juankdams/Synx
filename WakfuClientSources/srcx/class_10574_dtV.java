import com.ankamagames.wakfu.client.WakfuClientInstance;
import com.ankamagames.wakfu.client.console.command.display.AlphaMaskCommand;
import com.ankamagames.wakfu.client.console.command.display.DisplayHpBarCommand;
import com.ankamagames.wakfu.client.console.command.display.HideFightOccluders;
import org.apache.log4j.Logger;

public class dtV
{
  public static final String PACKAGE = "wakfu.options";
  private static final Logger K = Logger.getLogger(dtV.class);
  private static boolean lxw;
  private static boolean lxx;
  private static int lxy = -1;

  public static cSR lxz = new cSR();

  private static int lxA = -1;

  private static ZG lxB = null;

  public static void setSelectedTabIndex(int paramInt)
  {
    if (lxA == paramInt) {
      return;
    }

    if (paramInt != 2) {
      aWc.blo().e(0.2F, 1000);
      aWc.blo().f(0.2F, 1000);
    } else {
      aWc.blo().e(1.0F, 1000);
      aWc.blo().f(1.0F, 1000);
    }

    lxA = paramInt;
  }

  public static void tabClick(dMr paramdMr, dad paramdad) {
    setSelectedTabIndex(paramdad.getSelectedTabIndex());
  }

  public static void setMusicVolume(bXo parambXo)
  {
    aIH localaIH = WakfuClientInstance.awy().awB();
    yR localyR = yR.bsB;
    float f = parambXo.getValue();
    aWc.blo().aY(f);
    lxz.put(localyR.hashCode(), new Yt(localaIH, localyR, f));
  }

  public static void setAmbianceSoundsVolume(bXo parambXo)
  {
    aIH localaIH = WakfuClientInstance.awy().awB();
    yR localyR = yR.bsC;
    float f = parambXo.getValue();
    aWc.blo().ba(f);
    lxz.put(localyR.hashCode(), new YY(localaIH, localyR, f));
  }

  public static void setUiSoundsVolume(bXo parambXo)
  {
    aIH localaIH = WakfuClientInstance.awy().awB();
    yR localyR = yR.bsD;
    float f = parambXo.getValue();
    aWc.blo().aZ(f);
    lxz.put(localyR.hashCode(), new Za(localaIH, localyR, f));
  }

  public static void setMusicMute(dbi paramdbi)
  {
    yR localyR = yR.bsE;
    int i = localyR.hashCode();
    boolean bool = paramdbi.isSelected();
    aWc.blo().eo(bool);

    lxz.put(i, new YW(localyR, bool));
  }

  public static void setMusicContinuousMode(dbi paramdbi)
  {
    yR localyR = yR.bsH;
    int i = localyR.hashCode();
    boolean bool = paramdbi.isSelected();
    aWc.blo().ej(bool);

    lxz.put(i, new YX(localyR, bool));
  }

  public static void setAmbianceSoundsMute(dbi paramdbi)
  {
    yR localyR = yR.bsF;
    int i = localyR.hashCode();
    boolean bool = paramdbi.isSelected();
    aWc.blo().eq(bool);

    lxz.put(i, new Ze(localyR, bool));
  }

  public static void setUiSoundsMute(dbi paramdbi)
  {
    yR localyR = yR.bsG;
    int i = localyR.hashCode();
    boolean bool = paramdbi.isSelected();
    aWc.blo().ep(bool);

    lxz.put(i, new Zf(localyR, bool));
  }

  public static void startAmbianceSoundTest(cSx paramcSx)
  {
    lxB = aWc.blo().h(600025L, true);
  }

  public static void startUiSoundTest(cSx paramcSx) {
    lxB = aWc.blo().g(600025L, true);
  }

  public static void stopSoundTest(cSx paramcSx) {
    if (lxB != null) {
      lxB.an(0.2F);
      lxB = null;
    }
  }

  public static void closeOptionsDialog(cSx paramcSx)
  {
    bzu.cf((short)16403);
  }

  public static void closeOptionsAndMenuDialogs(cSx paramcSx)
  {
    bzu.cf((short)16403);
    bzu.cf((short)16401);
  }

  public static void onScreenModeChanged(arS paramarS) {
    lxx = true;
    c.b().c().a((dgj)paramarS.getValue());
  }

  public static void onScreenSizeChanged(arS paramarS) {
    lxx = true;
    c.b().c().aq(paramarS.getValue());
  }

  public static void onGraphicalPresetsChanged(arS paramarS) {
    if (!paramarS.getSelected()) {
      return;
    }

    bmz localbmz = bmz.fEp;
    aFp localaFp1 = aFp.bH((byte)WakfuClientInstance.awy().awB().d(localbmz));
    aFp localaFp2 = (aFp)paramarS.getValue();
    if (localaFp1 == localaFp2) {
      return;
    }

    switch (byy.gkG[localaFp2.ordinal()])
    {
    case 1:
      break;
    case 2:
      setLODLevel((byte)0);
      setFightLODLevel((byte)0);
      activateVSync(true);
      enableRunningRadius(false);
      kx(false);
      kz(false);
      break;
    case 3:
      setLODLevel((byte)1);
      setFightLODLevel((byte)1);
      activateVSync(true);
      enableRunningRadius(false);
      kx(true);
      kz(true);
      break;
    case 4:
      setLODLevel((byte)2);
      setFightLODLevel((byte)2);
      activateVSync(true);
      enableRunningRadius(true);
      kx(true);
      kz(true);
    }

    WakfuClientInstance.awy().awB().a(localbmz, localaFp2.bJ());
  }

  public static void setLODLevel(bXo parambXo) {
    if (setLODLevel((byte)(int)parambXo.getValue()))
      WakfuClientInstance.awy().awB().a(bmz.fEp, aFp.ebr.bJ());
  }

  public static boolean setLODLevel(byte paramByte)
  {
    yR localyR = yR.bsK;
    byte b = WakfuClientInstance.awy().awB().d(localyR);

    if (b == paramByte) {
      return false;
    }

    WakfuClientInstance.awy().iS(paramByte);
    WakfuClientInstance.awy().awB().a(localyR, paramByte);

    lxz.put(localyR.hashCode(), new Zb(b, localyR));

    return true;
  }

  public static void setFightLODLevel(bXo parambXo) {
    if (setFightLODLevel((byte)(int)parambXo.getValue()))
      WakfuClientInstance.awy().awB().a(bmz.fEp, aFp.ebr.bJ());
  }

  public static boolean setFightLODLevel(byte paramByte)
  {
    yR localyR = yR.bsL;
    byte b = WakfuClientInstance.awy().awB().d(localyR);

    if (b == paramByte) {
      return false;
    }

    dmM.cUe().AP(paramByte);
    WakfuClientInstance.awy().awB().a(localyR, paramByte);

    lxz.put(localyR.hashCode(), new Zc(b, localyR));

    return true;
  }

  public static void setActivateAreaChallenges(dbi paramdbi)
  {
    bmz localbmz = bmz.fEx;
    int i = localbmz.hashCode();
    boolean bool = paramdbi.isSelected();
    lxz.put(localbmz.hashCode(), new brx(localbmz, bool));
  }

  public static void activateVSync(dbi paramdbi)
  {
    if (activateVSync(paramdbi.isSelected()))
      WakfuClientInstance.awy().awB().a(bmz.fEp, aFp.ebr.bJ());
  }

  public static boolean activateVSync(boolean paramBoolean)
  {
    bmz localbmz = bmz.fEv;
    int i = localbmz.hashCode();

    boolean bool = WakfuClientInstance.awy().awB().a(localbmz);

    if (bool == paramBoolean) {
      return false;
    }

    WakfuClientInstance.awy().awB().a(localbmz, paramBoolean);
    WakfuClientInstance.awy().rs().fM(paramBoolean);

    lxz.put(i, new bru(bool, localbmz));

    return true;
  }

  public static void enableRunningRadius(dbi paramdbi) {
    if (enableRunningRadius(paramdbi.isSelected()))
      WakfuClientInstance.awy().awB().a(bmz.fEp, aFp.ebr.bJ());
  }

  public static boolean enableRunningRadius(boolean paramBoolean)
  {
    bmz localbmz = bmz.fEw;
    int i = localbmz.hashCode();

    boolean bool = WakfuClientInstance.awy().awB().a(localbmz);
    if (bool == paramBoolean) {
      return false;
    }

    ahm.cj(paramBoolean);
    WakfuClientInstance.awy().awB().a(localbmz, paramBoolean);

    lxz.put(i, new brs(bool, localbmz));

    return true;
  }

  public static void setAutoLockFights(dbi paramdbi) {
    bmz localbmz = bmz.fEy;
    int i = localbmz.hashCode();
    boolean bool = paramdbi.isSelected();
    lxz.put(localbmz.hashCode(), new brB(localbmz));
  }

  public static void setTacticalView(dbi paramdbi)
  {
    bmz localbmz = bmz.fEz;
    int i = localbmz.hashCode();
    boolean bool1 = WakfuClientInstance.awy().awB().a(localbmz);

    boolean bool2 = paramdbi.isSelected();
    if (bool1 == bool2) {
      return;
    }
    lxz.put(localbmz.hashCode(), new brA(bool1, localbmz));

    bOq.bVv().L(bool2);
    WakfuClientInstance.awy().awB().a(localbmz, bool2);
  }

  public static void setMaskWorld(dbi paramdbi)
  {
    bmz localbmz = bmz.fEs;
    int i = localbmz.hashCode();
    boolean bool = paramdbi.isSelected();

    AlphaMaskCommand.eU(bool);

    lxz.put(localbmz.hashCode(), new brz(localbmz, bool));
  }

  public static void setDisplayHPBar(dbi paramdbi)
  {
    bmz localbmz = bmz.fEu;
    int i = localbmz.hashCode();
    boolean bool = paramdbi.isSelected();

    DisplayHpBarCommand.dh(bool);

    lxz.put(i, new bry(localbmz, bool));
  }

  public static void setHideFightOccluders(dbi paramdbi)
  {
    bmz localbmz = bmz.fEt;
    int i = localbmz.hashCode();
    boolean bool = paramdbi.isSelected();
    proceedHideFightOccluders(bool);
    lxz.put(localbmz.hashCode(), new brF(localbmz, bool));
  }

  public static void proceedHideFightOccluders(boolean paramBoolean)
  {
    float f = paramBoolean ? 0.3F : 1.0F;
    if (byv.bFN().c(axB.aIZ())) {
      axB.aIZ().cW(paramBoolean);
      if (paramBoolean)
      {
        AlphaMaskCommand.eU(true);
      }
      else {
        boolean bool = WakfuClientInstance.awy().awB().a(bmz.fEs);
        AlphaMaskCommand.eU(bool);
      }
    }
    int i = HideFightOccluders.cR(f);
    HideFightOccluders.a(i, f, 1000);
  }

  public static void activateShaders(dbi paramdbi)
  {
    if (kx(paramdbi.isSelected()))
      WakfuClientInstance.awy().awB().a(bmz.fEp, aFp.ebr.bJ());
  }

  private static boolean kx(boolean paramBoolean)
  {
    if (!aNh.eth.a(dEX.lOj)) {
      return false;
    }

    bmz localbmz = bmz.fEq;

    boolean bool = WakfuClientInstance.awy().awB().a(localbmz);

    if (bool == paramBoolean) {
      return false;
    }

    ky(paramBoolean);
    WakfuClientInstance.awy().awB().a(localbmz, paramBoolean);

    lxz.put(localbmz.hashCode(), new brE(bool, localbmz));

    return true;
  }

  private static void ky(boolean paramBoolean) {
    Pb.aaU().bg(paramBoolean);

    btL.gcv.ie();

    bQK.bXG().cMO();
    acL.apd().cMO();
    dps.cXa().cMO();
    bVl.caZ().cMO();

    aTL localaTL = (aTL)WakfuClientInstance.awy().Dg();
    if (localaTL != null) {
      btb localbtb = localaTL.cLc();
      if (localbtb != null)
        localbtb.bBi();
    }
  }

  public static void activateMeteoEffect(dbi paramdbi)
  {
    if (kz(paramdbi.isSelected()))
      WakfuClientInstance.awy().awB().a(bmz.fEp, aFp.ebr.bJ());
  }

  private static boolean kz(boolean paramBoolean)
  {
    bmz localbmz = bmz.fEr;

    boolean bool = WakfuClientInstance.awy().awB().a(localbmz);

    if (bool == paramBoolean) {
      return false;
    }

    anK.drx.cz(paramBoolean);
    WakfuClientInstance.awy().awB().a(localbmz, paramBoolean);

    lxz.put(localbmz.hashCode(), new brD(bool, localbmz));

    return true;
  }

  public static void bindKey(cEv paramcEv) {
    if (lxw) {
      return;
    }
    bindKey((bln)paramcEv.getItemValue(), 17731);
  }

  public static void bindKey(cSx paramcSx, aTp paramaTp) {
    String str = paramaTp.getText();
    if ((str == null) || (str.length() == 0)) {
      cBQ.cxL().a(bU.fH().getString("notification.emptyField"), Cn.et(1), 4099L, 102, 1);

      return;
    }
    ckW localckW = bqJ.bzC().iL(str);
    bindKey(new bln(localckW), 17738);
  }

  public static void bindKey(bln parambln, int paramInt) {
    nd localnd = new nd(parambln);
    localnd.d(paramInt);
    cjO.clE().j(localnd);
  }

  public static void selectCurrentBind(arS paramarS, aTp paramaTp) {
    bln localbln = (bln)paramarS.aEv().getItemValue();
    paramaTp.setText(localbln.getText());
    bqJ.bzC().b(localbln);
  }

  public static void changeBindText(cSx paramcSx, aTp paramaTp, bln parambln) {
    String str = paramaTp.getText();
    if ((str == null) || (str.length() == 0)) {
      cBQ.cxL().a(bU.fH().getString("notification.emptyField"), Cn.et(1), 4099L, 102, 1);

      return;
    }
    if (!str.equals(parambln.getText())) {
      nd localnd = new nd(parambln);
      localnd.a(str);
      localnd.d(17732);
      cjO.clE().j(localnd);
    }
  }

  public static void activateBindTextEdition(cSx paramcSx) {
    br localbr = (br)paramcSx.cIk();
    if (localbr.getSelected())
      bqJ.bzC().fc(false);
    else
      bqJ.bzC().fc(true);
  }

  public static void deleteCurrentBind(cSx paramcSx)
  {
    bzu.cf((short)17739);
  }

  public static void onShortcutOver(cEv paramcEv) {
    dLE.doY().t("shortcutOver", paramcEv.getItemValue());
  }

  public static void onShortcutOut(cEv paramcEv) {
    dLE.doY().t("shortcutOver", null);
  }

  public static void restore(cSx paramcSx)
  {
    bzu.cf((short)17733);
  }

  public static void setInteractionOnLeftClick(dbi paramdbi) {
    bmz localbmz = bmz.fEB;
    int i = localbmz.hashCode();
    boolean bool = paramdbi.isSelected();
    lxz.put(localbmz.hashCode(), new byh(localbmz, bool));
  }

  public static void setDefaultSplitMode(dbi paramdbi)
  {
    bmz localbmz = bmz.fEE;
    int i = localbmz.hashCode();
    boolean bool = paramdbi.isSelected();
    lxz.put(localbmz.hashCode(), new byi(localbmz, bool));
  }

  public static void setOverHeadDelay(cSx paramcSx)
  {
    if ((paramcSx != null) && ((paramcSx instanceof bXo))) {
      bmz localbmz = bmz.fEF;
      lxz.put(localbmz.hashCode(), new byf(paramcSx, localbmz));
    }
  }

  public static void setAutoSwitchBarsMode(dbi paramdbi)
  {
    bmz localbmz = bmz.fEH;
    int i = localbmz.hashCode();
    boolean bool = paramdbi.isSelected();
    lxz.put(localbmz.hashCode(), new byg(localbmz, bool));
  }

  public static void setEmoteIconsActivated(dbi paramdbi)
  {
    bmz localbmz = bmz.fEM;
    int i = localbmz.hashCode();
    boolean bool = paramdbi.isSelected();
    lxz.put(localbmz.hashCode(), new byl(localbmz, bool));
  }

  public static void setDisplayXPBar(dbi paramdbi)
  {
    bmz localbmz = bmz.fET;
    int i = localbmz.hashCode();
    boolean bool = paramdbi.isSelected();

    Nw.ZC().aZ(bool);
    lxz.put(localbmz.hashCode(), new bym(localbmz, bool));
  }

  public static void setCensorActivated(dbi paramdbi)
  {
    bmz localbmz = bmz.fEN;
    int i = localbmz.hashCode();
    boolean bool = paramdbi.isSelected();
    lxz.put(localbmz.hashCode(), new byj(localbmz, bool));
  }

  public static void setTipsActivated(dbi paramdbi)
  {
    bmz localbmz = bmz.fEP;
    int i = localbmz.hashCode();
    boolean bool = paramdbi.isSelected();
    lxz.put(localbmz.hashCode(), new byk(localbmz, bool));
  }

  public static void setAddSeedsToShortcutBar(dbi paramdbi)
  {
    bmz localbmz = bmz.fFa;
    int i = localbmz.hashCode();
    boolean bool = paramdbi.isSelected();
    lxz.put(localbmz.hashCode(), new bya(localbmz, bool));
  }

  public static void setChatAutomaticDisactivation(dbi paramdbi)
  {
    bmz localbmz = bmz.fEK;
    int i = localbmz.hashCode();
    boolean bool = paramdbi.isSelected();
    lxz.put(localbmz.hashCode(), new byb(localbmz, bool));
  }

  public static void setChatLockFade(dbi paramdbi)
  {
    bmz localbmz = bmz.fEA;
    int i = localbmz.hashCode();
    boolean bool = paramdbi.isSelected();
    kA(bool);
    lxz.put(localbmz.hashCode(), new byB(localbmz, bool));
  }

  public static void setChatTime(dbi paramdbi)
  {
    bmz localbmz = bmz.fES;
    int i = localbmz.hashCode();
    boolean bool = paramdbi.isSelected();
    lxz.put(localbmz.hashCode(), new byt(localbmz, bool));
  }

  private static void kA(boolean paramBoolean)
  {
    for (Object localObject = aAx.aMd().aMk(); ((dmn)localObject).hasNext(); ) {
      ((dmn)localObject).fl();
      int i = ((ahB)((dmn)localObject).value()).auq();
      bzu localbzu;
      if (paramBoolean) {
        localbzu = new bzu();
        localbzu.d(19026);
        localbzu.c(true);
        localbzu.e(i);
        localbzu.c(5000L);
        cjO.clE().j(localbzu);
      } else {
        localbzu = new bzu();
        localbzu.d(19025);
        localbzu.e(i);
        localbzu.c(true);
        cjO.clE().j(localbzu);
      }
    }

    localObject = new bzu();
    ((bzu)localObject).d(19027);
    ((bzu)localObject).c(!paramBoolean);
    cjO.clE().j((cWG)localObject);
  }

  public static void setFontSize(bXo parambXo) {
    bmz localbmz = bmz.fEL;
    int i = (int)parambXo.getValue();
    if (lxy == -1) {
      lxy = WakfuClientInstance.awy().awB().d(localbmz);
    }
    setFontSize(i);
    lxz.put(localbmz.hashCode(), new byw());
  }

  private static void setFontSize(int paramInt)
  {
    bmz localbmz = bmz.fEL;
    bha localbha = bha.values()[paramInt];
    WakfuClientInstance.awy().awB().a(localbmz, localbha.ordinal());
    dLE.doY().a(aAx.aMd(), new String[] { "chatTextStyle" });
    dWe.dvA().a(WakfuClientInstance.awy().awB(), new String[] { localbmz.getKey() });
    for (dju localdju : aAx.aMd().aMq())
      dLE.doY().a(localdju, new String[] { "history" });
  }

  public static void cancel(cSx paramcSx)
  {
    if (lxz.isEmpty()) {
      closeOptionsDialog(paramcSx);
      return;
    }
    cKX localcKX = cBQ.cxL().a(bU.fH().getString("question.confirmCloseOptionsWithChanges"), Cn.et(0), 2073L, 102, 1);

    localcKX.a(new byx(paramcSx));
  }

  public static void cancel()
  {
    for (dmn localdmn = lxz.yF(); localdmn.hasNext(); ) {
      localdmn.fl();
      ((dLo)localdmn.value()).cancel();
    }
    lxz.clear();

    for (localdmn = c.b().e(); localdmn.hasNext(); ) {
      localdmn.fl();
      ckW localckW1 = (ckW)localdmn.value();

      ckW localckW2 = bEs.bMK().bA(localckW1.getId());
      try
      {
        c.b().a(localckW1.getId(), localckW1.getKeyCode(), localckW1.cmO());

        String str = localckW1.cmP();
        c.b().a(localckW2, str);
      } catch (Exception localException) {
        K.error("Exception", localException);
      }
    }
  }

  public static void apply(cSx paramcSx)
  {
    for (Object localObject = lxz.yF(); ((dmn)localObject).hasNext(); ) {
      ((dmn)localObject).fl();
      ((dLo)((dmn)localObject).value()).valid();
    }
    lxz.clear();
    if (lxx) {
      localObject = c.b().c();
      ((aPy)localObject).c(((aPy)localObject).bgn(), ((aPy)localObject).bgo(), ((aPy)localObject).bgp());
      lxx = false;
    }
    closeOptionsDialog(paramcSx);
  }

  public static void setBindText(cSx paramcSx, aTp paramaTp, bln parambln) {
    if (((paramcSx instanceof Gy)) && (((Gy)paramcSx).getFocused())) {
      lxw = true;
      return;
    }
    if ((((paramcSx instanceof Gy)) && (!((Gy)paramcSx).getFocused())) || (((paramcSx instanceof ctH)) && (((ctH)paramcSx).getKeyCode() == 10)))
    {
      String str = paramaTp.getText();
      if (str == null) {
        cBQ.cxL().a(bU.fH().getString("notification.emptyField"), Cn.et(1), 4099L, 102, 1);

        return;
      }
      if (!str.equals(parambln.getText())) {
        nd localnd = new nd(parambln);
        localnd.a(str);
        localnd.d(17732);
        cjO.clE().j(localnd);
      }
      zC.Ip().e(null);
      lxw = false;
    }
  }
}