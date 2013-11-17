import com.ankamagames.wakfu.client.WakfuClientInstance;
import com.ankamagames.wakfu.client.console.command.commonIn.MapCommand;
import com.ankamagames.wakfu.client.console.command.world.EnterLeaveDimensionalBagCommand;
import org.apache.log4j.Logger;

public class aep
{
  public static final String PACKAGE = "wakfu.controlCenter";
  private static final Logger K = Logger.getLogger(aep.class);
  private static dHx cVp;
  private static int cVq = 0;

  public static void radarZoom(cSx paramcSx)
  {
    if (paramcSx.mp().equals(CH.bGy))
      if (((dMr)paramcSx).dpj() > 0)
        radarZoomOut(paramcSx);
      else
        radarZoomIn(paramcSx);
  }

  public static void radarZoomIn(cSx paramcSx)
  {
    bzu.cf((short)16600);
  }

  public static void radarZoomOut(cSx paramcSx)
  {
    bzu.cf((short)16601);
  }

  public static void setRadarZoom(cSx paramcSx)
  {
    if ((paramcSx != null) && ((paramcSx instanceof bXo))) {
      double d = ((bXo)paramcSx).getValue();

      bzu localbzu = new bzu();
      localbzu.d(16602);
      localbzu.setDoubleValue(d);
      cjO.clE().j(localbzu);
    }
  }

  public static void openCloseShortcutBar(cSx paramcSx)
  {
    bzu.cf((short)16404);
  }

  public static void openCloseStateBar(cSx paramcSx)
  {
    bzu.cf((short)16407);
  }

  public static void openCloseEventsCalendarDialog(cSx paramcSx)
  {
    if (byv.bFN().c(dSG.dsZ()))
      byv.bFN().b(dSG.dsZ());
    else
      byv.bFN().a(dSG.dsZ());
  }

  public static void setMode(cSx paramcSx, String paramString)
  {
    dLE.doY().t("controlCenterDisplayMode", paramString);
  }

  public static void dropCommand(cSx paramcSx, String paramString) {
    if ((paramcSx instanceof Qa))
      Qa localQa = (Qa)paramcSx;
  }

  public static void openInventory(cSx paramcSx)
  {
    if (byv.bFN().c(dGW.dhM())) {
      dGW.dhM().dhP();
      byv.bFN().b(dGW.dhM());
    } else {
      dGW.dhM().dhN();
    }
  }

  public static void openCharacterSheet(cSx paramcSx) {
    pY localpY = pY.xl();
    if (!byv.bFN().c(localpY))
      byv.bFN().a(localpY);
    else
      byv.bFN().b(localpY);
  }

  public static void openSpellsPage(cSx paramcSx)
  {
    dPm.dqv().dqw();
  }

  public static void openCloseGuildManagement(cSx paramcSx)
  {
    if (!byv.bFN().c(vt.Ek()))
      byv.bFN().a(vt.Ek());
    else
      byv.bFN().b(vt.Ek());
  }

  public static void openCloseDimensionBagRoomManager(cSx paramcSx)
  {
    if (!byv.bFN().c(dFk.dgK()))
      byv.bFN().a(dFk.dgK());
    else
      byv.bFN().b(dFk.dgK());
  }

  public static void openCloseMiniMap(cSx paramcSx)
  {
    throw new UnsupportedOperationException("il n'y a plus de minimap.");
  }

  public static void openCloseGlobalMap(cSx paramcSx)
  {
    MapCommand.xt();
  }

  public static void openCloseCraftDialog(cSx paramcSx) {
    if (!byv.bFN().c(bcN.bqJ()))
      byv.bFN().a(bcN.bqJ());
    else
      byv.bFN().b(bcN.bqJ());
  }

  public static void openOptionsDialog(cSx paramcSx)
  {
    bzu.cf((short)16400);
  }

  public static void cycleProgressBarDisplayMode(cSx paramcSx, cOq paramcOq)
  {
    a(paramcOq, false);
  }

  public static void cycleProgressBarDisplayModeFull(cSx paramcSx, cOq paramcOq)
  {
    a(paramcOq, true);
  }

  private static void a(cOq paramcOq, boolean paramBoolean) { int i = paramcOq.getDisplayValue().ordinal();
    dwA[] arrayOfdwA = dwA.values();
    dwA localdwA;
    do {
      localdwA = arrayOfdwA[((i + 1) % arrayOfdwA.length)];
      i++;
    }while ((!paramBoolean) && (localdwA == dwA.lBZ));

    WakfuClientInstance.awy().awB().a(bmz.fED, localdwA.ordinal());

    aWc.blo().eO(600004L); }

  public static void clickHp(dMr paramdMr, cOq paramcOq)
  {
    if (paramdMr.getButton() == 1)
      a(paramcOq, true);
  }

  public static void openCloseSmallWeatherDialog(cSx paramcSx)
  {
    if (byv.bFN().c(aXs.bmH()))
      byv.bFN().b(aXs.bmH());
    else
      byv.bFN().a(aXs.bmH());
  }

  public static void openCloseWeatherDialog(cSx paramcSx)
  {
    if (byv.bFN().c(brL.bzT()))
      byv.bFN().b(brL.bzT());
    else
      byv.bFN().a(brL.bzT());
  }

  public static void openCloseEcosystemEquilibriumDialog(cSx paramcSx)
  {
    if (byv.bFN().c(pO.xc()))
      byv.bFN().b(pO.xc());
    else
      byv.bFN().a(pO.xc());
  }

  public static void openAchievementsDialog(cSx paramcSx, ckJ paramckJ)
  {
    boolean bool = cHT.iDr.xT(paramckJ.getId());
    bMK.bUv().a(bool, paramckJ);
  }

  public static void openCloseAchievementsDialog(cSx paramcSx) {
    bMK.bUv().gr(false);
  }

  public static void openCloseAlmanach(cSx paramcSx) {
    if (!byv.bFN().c(bQO.bXN()))
      byv.bFN().a(bQO.bXN());
    else
      byv.bFN().b(bQO.bXN());
  }

  public static void openCloseQuestsDialog(cSx paramcSx)
  {
    bMK.bUv().gr(true);
  }

  public static void openCloseProtectorView(cSx paramcSx) {
    if (!byv.bFN().c(dFF.dgY()))
      byv.bFN().a(dFF.dgY());
    else
      byv.bFN().b(dFF.dgY());
  }

  public static void openClosePassport(cSx paramcSx)
  {
    if (!byv.bFN().c(bNu.bVe()))
      byv.bFN().a(bNu.bVe());
    else
      byv.bFN().b(bNu.bVe());
  }

  public static void openCloseCitizen(cSx paramcSx)
  {
    if (!byv.bFN().c(bTX.cah()))
      byv.bFN().a(bTX.cah());
    else
      byv.bFN().b(bTX.cah());
  }

  public static void onMiniMapItemOver(sV paramsV)
  {
    Bf.Kk().a(paramsV);
  }

  public static void onMiniMapItemOut(sV paramsV) {
    bsP.getInstance().getPopupContainer().hide();
  }

  public static void openRunningEffectDescription(cEv paramcEv)
  {
    brO localbrO1 = (brO)paramcEv.getItemValue();
    if (localbrO1 == null) {
      return;
    }
    brO localbrO2 = localbrO1.bzY();

    String str = "runningEffectDetailDialog" + localbrO1.bzX().nT();
    if (cBQ.cxL().mZ(str)) {
      cBQ.cxL().mW(str);
    } else {
      cBQ.cxL().a(str, VV.dJ("runningEffectDetailDialog"), 16L, (short)10000);
      dLE.doY().a("describedRunningEffect", localbrO2, str);
    }
  }

  public static void openCloseOsamodasSymbiotDialog(cSx paramcSx)
  {
    bzu.cf((short)16422);
  }

  public static void openCloseDimensionalBag(cSx paramcSx)
  {
    EnterLeaveDimensionalBagCommand.GD();
  }

  public static void openCloseGazette(cSx paramcSx) {
    if (byv.bFN().c(ciO.ckK()))
      byv.bFN().b(ciO.ckK());
    else
      byv.bFN().a(ciO.ckK());
  }

  public static void openCloseDungeonListDialog(cSx paramcSx)
  {
    if (byv.bFN().c(kf.rX()))
      byv.bFN().b(kf.rX());
    else
      byv.bFN().a(kf.rX());
  }

  public static void openCloseTutorialBookDialog(cSx paramcSx)
  {
    if (byv.bFN().c(Dm.bHF))
      byv.bFN().b(Dm.bHF);
    else
      byv.bFN().a(Dm.bHF);
  }

  public static void openHavenWorldCatalog(cSx paramcSx)
  {
  }

  public static void leaveHavenWorld(cSx paramcSx)
  {
    bQc localbQc = new bQc();
    byv.bFN().aJK().d(localbQc);
  }
}