import com.ankamagames.wakfu.client.WakfuClientInstance;
import org.apache.log4j.Logger;

public class cFe
{
  public static final String PACKAGE = "wakfu.dragoMap";
  private static final Logger K = Logger.getLogger(cFe.class);

  private static cDB fDy = null;
  private static boa izf = null;
  private static dRn fDA;
  private static dwn fDB;
  private static boolean fDC;
  private static boolean fDD;
  private static boolean fDE;
  private static aFG fDF;
  public static final int NONE = 0;
  public static final int fDG = 1;
  public static final int fDH = 2;
  public static final int fDI = 3;
  public static int aHa = 0;
  private static String fDK;
  private static dwn fDL;
  private static long bkH = 0L;

  private static dPT fDM = null;

  public static void switchToAddNote(cSx paramcSx)
  {
    aHa = 1;
    dGx.dhr().a(duv.lyt, true);
  }

  public static void switchToAddPositionMarker(cSx paramcSx) {
    aHa = 2;
    dGx.dhr().a(duv.lyt, true);
  }

  public static void mapZoomIn(cSx paramcSx) {
    cCZ.cyZ().b(dGc.lQD);
  }

  public static void mapZoomOut(cSx paramcSx) {
    cCZ.cyZ().b(dGc.lQC);
  }

  public static void adminTP(cVW paramcVW) {
    if ((!paramcVW.ey()) && (!paramcVW.ex()) && (!paramcVW.eA()) && (!paramcVW.eB()))
    {
      new bpB(new Cs(Integer.valueOf((int)paramcVW.cKl()), Integer.valueOf((int)paramcVW.cKm()))).execute();
    }
  }

  public static void onMapClick(cVW paramcVW, acq paramacq) {
    if ((!paramcVW.ey()) && (!paramcVW.ex()) && (!paramcVW.eA()) && (!paramcVW.eB()))
    {
      Object localObject;
      switch (aHa) {
      case 1:
        if ((paramcVW.getButton() == 1) && 
          (fDM != null)) {
          localObject = cCZ.cyZ().K((int)paramcVW.cKl(), (int)paramcVW.cKm(), fDM.oc());
          bSH.bZs().a((cDB)localObject);
          setCurrentNote((cDB)localObject);
          aWc.blo().eO(600119L);
        }

        fDM = null;
        aHa = 0;

        bWx.cbz().hide();
        dGx.dhr().unlock();
        break;
      case 2:
        if (fDM != null) {
          localObject = new boa(null);
          String str = bU.fH().getString("map.worldPositionMarker.destination", new Object[] { Integer.valueOf((int)paramcVW.cKl()), Integer.valueOf((int)paramcVW.cKm()) });
          cCZ.cyZ().b(boa.a((boa)localObject), 2, paramcVW.cKl(), paramcVW.cKm(), 0.0F, str, localObject, dSP.mpb, clP.hOS);

          aWc.blo().eO(600119L);
          bWx.cbz().hide();

          dGx.dhr().unlock();
        }
        aHa = 0;
        break;
      case 0:
      }
    }
  }

  public static void switchDisplayType(cSx paramcSx)
  {
    dGc localdGc = (dGc)boR.a(dGc.class, cCZ.cyZ().bMj());
    cCZ.cyZ().b(localdGc);
  }

  public static void setTypeFilter(dbi paramdbi, Byte paramByte) {
    bzu localbzu = new bzu();
    localbzu.d(16584);
    localbzu.c(paramdbi.isSelected());
    localbzu.a(paramByte.byteValue());
    cjO.clE().j(localbzu);
  }

  public static void setCurrentNote(cDB paramcDB) {
    fDy = paramcDB;
    dLE.doY().t("landMark.currentNote", paramcDB);
    dLE.doY().t("landMark.currentNote.text", paramcDB != null ? paramcDB.getNote() : null);
  }

  public static void setCurrentWorldPositionMarker(boa paramboa) {
    izf = paramboa;
    dLE.doY().t("landMark.currentWorldPositionMarker", paramboa);
  }

  public static void onMapMove(cVW paramcVW) {
    cCZ.cyZ().eb((int)(paramcVW.cKl() / 18.0F), (int)(paramcVW.cKm() / 18.0F));
    aka localaka = (aka)paramcVW.cIl();

    int i = localaka.getWidth();
    int j = localaka.getHeight();
    int k = paramcVW.y(localaka);
    int m = paramcVW.z(localaka);

    if (k < i / 2) {
      if (m < j / 2)
        fDF = aFG.ecm;
      else {
        fDF = aFG.ecg;
      }
    }
    else if (m < j / 2)
      fDF = aFG.eco;
    else {
      fDF = aFG.eci;
    }

    acq localacq = (acq)paramcVW.cIl();
    fDA = localacq.getSelectedMapZone();

    updateCursor();
  }

  public static void onMousePress(cSx paramcSx)
  {
    if ((fDB != null) && (fDB.dby())) {
      fDC = true;
      updateCursor();
    }
  }

  public static void onMouseRelease(cSx paramcSx) {
    fDC = false;
    updateCursor();
  }

  public static void onMouseExit(cSx paramcSx) {
    fDA = null;
    fDB = null;
    fDD = false;

    updateCursor();
  }

  public static void onMouseEnter(cSx paramcSx) {
    fDD = true;
    updateCursor();
  }

  private static void updateCursor() {
    dGx.dhr().unlock();
  }

  public static void onMapItemClick(sV paramsV) {
    coX.coM().hidePopup();

    dwn localdwn = paramsV.AB();
    if (!(localdwn.getValue() instanceof brS)) {
      return;
    }

    brS localbrS = (brS)localdwn.getValue();
    if (localbrS.dYr == 47) {
      bzu localbzu = new bzu();
      localbzu.d(19312);
      localbzu.c(localbrS.aTz);
      cjO.clE().j(localbzu);
    }
  }

  public static void onMapItemOver(sV paramsV) {
    coX.coM().b(paramsV);

    if (cCZ.cyZ().bMk() == dGc.lQC) {
      return;
    }

    fDB = paramsV.AB();
    updateCursor();
  }

  public static void onMapItemOut(sV paramsV) {
    coX.coM().hidePopup();

    fDB = null;
    updateCursor();
  }

  public static void setDisplayTerritories(dbi paramdbi) {
    WakfuClientInstance.awy().awB().a(bmz.fEI, paramdbi.isSelected());
    cCZ.cyZ().hU(paramdbi.isSelected());
  }

  public static void openNoteContainer(cSx paramcSx, dRq paramdRq) {
    paramdRq.setVisible(true);
    reset();
  }

  private static void a(int paramInt1, int paramInt2, cDB paramcDB)
  {
    paramcDB.setX(paramInt1);
    paramcDB.setY(paramInt2);
    cCZ.cyZ().a(paramcDB);
    bSH.bZs().a(paramcDB);

    fDy = null;

    aHa = 0;
  }

  public static void onLandMarkItemOver(cEv paramcEv)
  {
    Object localObject = paramcEv.getItemValue();
    if (localObject != null) {
      fDE = true;
      updateCursor();
    }
  }

  public static void onLandMarkItemOut(cEv paramcEv) {
    fDE = false;
    updateCursor();
  }

  public static void reset() {
    aHa = 0;
    bWx.cbz().hide();
    if (fDL != null) {
      fDL.kI(false);
    }
    fDB = null;
    fDA = null;
    fDD = false;
    fDC = false;
    fDE = false;
    dGx.dhr().unlock();
  }
}