import com.ankamagames.wakfu.client.WakfuClientInstance;

public class cZj
{
  public static final String PACKAGE = "wakfu.characterSheet";
  private static boolean kMT = false;

  public static void closeCharacterSheetDialog(cSx paramcSx)
  {
    bzu.cf((short)17682);
  }

  public static void selectAptitude(cSx paramcSx, bWG parambWG)
  {
    if (((paramcSx instanceof dMr)) && (((dMr)paramcSx).getButton() == 3)) {
      int i = parambWG.cbI().atR();
      if (i == 0)
        return;
      apX localapX = (apX)byv.bFN().bFO().auK().hh(i);
      if (localapX == null) {
        dSR localdSR = Be.Kj().ea(i);
        if (localdSR != null)
          localapX = new apX(localdSR, (short)0, -1L);
      }
      if (localapX != null)
        sw.openSpellDescription(3, localapX, "characterSheetAptitudesDialog");
    }
  }

  public static void validateCommonAptitudePoints(cSx paramcSx, dRq paramdRq, biy parambiy) {
    cyO localcyO = new cyO();
    localcyO.d(17688);
    localcyO.g(paramdRq);
    localcyO.a(parambiy);
    localcyO.a(qE.aXQ.bJ());
    cjO.clE().j(localcyO);
  }

  public static void cancelCommonAptitudePoints(cSx paramcSx, dRq paramdRq, biy parambiy) {
    cyO localcyO = new cyO();
    localcyO.d(17689);
    localcyO.g(paramdRq);
    localcyO.a(parambiy);
    localcyO.a(qE.aXQ.bJ());
    cjO.clE().j(localcyO);
  }

  public static void validateSpellAptitudePoints(cSx paramcSx, dRq paramdRq, biy parambiy) {
    cyO localcyO = new cyO();
    localcyO.d(17688);
    localcyO.g(paramdRq);
    localcyO.a(parambiy);
    localcyO.a(qE.aXR.bJ());
    cjO.clE().j(localcyO);
  }

  public static void cancelSpellAptitudePoints(cSx paramcSx, dRq paramdRq, biy parambiy) {
    cyO localcyO = new cyO();
    localcyO.d(17689);
    localcyO.g(paramdRq);
    localcyO.a(parambiy);
    localcyO.a(qE.aXR.bJ());
    cjO.clE().j(localcyO);
  }

  public static void overAptitude(cEv paramcEv) {
    overAptitude(paramcEv, (bWG)paramcEv.getItemValue());
  }

  public static void overAptitude(cSx paramcSx, bWG parambWG) {
    dLE.doY().t("describedAptitude", parambWG);
  }

  public static void switchToCharacteristicsMode(cSx paramcSx) {
    boolean bool = dLE.doY().getBooleanProperty("characterSheetSecondMode");
    dLE.doY().t("characterSheetSecondMode", Boolean.valueOf(!bool));
    WakfuClientInstance.awy().awB().a(bmz.fEC, !bool);
  }

  public static void openCloseAptitudes(cSx paramcSx) {
    bzu.cf((short)17690);
  }

  public static void improveAptitude(cSx paramcSx, bWG parambWG, dRq paramdRq, biy parambiy) {
    launchAptitudeModification(paramcSx, parambWG, paramdRq, parambiy, true);
  }

  public static void decreaseAptitude(cSx paramcSx, bWG parambWG, dRq paramdRq, biy parambiy) {
    launchAptitudeModification(paramcSx, parambWG, paramdRq, parambiy, false);
  }

  public static void launchAptitudeModification(cSx paramcSx, bWG parambWG, dRq paramdRq, biy parambiy, boolean paramBoolean) {
    if (dmO.lli.isRunning()) {
      return;
    }
    cpN localcpN = new cpN();
    localcpN.r(parambWG);
    localcpN.g(paramdRq);
    localcpN.a(parambiy);
    localcpN.d(paramBoolean ? 17686 : 17687);

    dmO.lli.a(localcpN, (biy)paramcSx.cIl());
  }

  public static void highlightCharacteristic(dbi paramdbi, tM paramtM) {
    cdz localcdz = byv.bFN().bFO().afs();
    localcdz.a(paramtM.Ce(), paramdbi.isSelected());
  }

  public static void displayAllCharacteristics(dbi paramdbi) {
    pY.xl().P(paramdbi.isSelected());
  }
}