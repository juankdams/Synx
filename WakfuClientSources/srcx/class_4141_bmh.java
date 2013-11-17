import com.ankamagames.wakfu.client.WakfuClientInstance;
import org.apache.log4j.Logger;

public class bmh
{
  public static final String PACKAGE = "wakfu.map";
  private static final Logger K = Logger.getLogger(bmh.class);

  private static cDB fDy = null;
  private static os fDz = null;
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
  public static final int fDJ = 4;
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

  public static void radarZoom(cSx paramcSx)
  {
  }

  public static void radarZoomIn(cSx paramcSx)
  {
    bzu.cf((short)16581);
  }

  public static void radarZoomOut(cSx paramcSx)
  {
    bzu.cf((short)16582);
  }

  public static void mapZoomIn(cSx paramcSx) {
    dGc localdGc = cCZ.cyZ().bMl();
    if (localdGc != null)
      cCZ.cyZ().b(localdGc);
  }

  public static void mapZoomOut(cSx paramcSx)
  {
    dGc localdGc = cCZ.cyZ().bMm();
    if (localdGc != null)
      cCZ.cyZ().b(localdGc);
  }

  public static void adminTP(cVW paramcVW)
  {
    if ((!paramcVW.ey()) && (!paramcVW.ex()) && (!paramcVW.eB()) && (!paramcVW.eA()))
    {
      new zB(new Cs(Integer.valueOf((int)paramcVW.cKl()), Integer.valueOf((int)paramcVW.cKm())), cCZ.cyZ().bMt()).execute();
    }
  }

  public static void onMapClick(cVW paramcVW, acq paramacq) {
    if ((!paramcVW.ey()) && (!paramcVW.ex()) && (!paramcVW.eB()) && (!paramcVW.eA()))
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
          localObject = new os(null);
          String str = bU.fH().getString("map.worldPositionMarker.destination", new Object[] { Integer.valueOf((int)paramcVW.cKl()), Integer.valueOf((int)paramcVW.cKm()) });
          cCZ.cyZ().b(os.a((os)localObject), 2, paramcVW.cKl(), paramcVW.cKm(), 0.0F, str, localObject, dSP.mpb, clP.hOS);

          aWc.blo().eO(600119L);
          bWx.cbz().hide();

          dGx.dhr().unlock();
        }
        aHa = 0;
        break;
      case 3:
        if (paramcVW.getButton() == 1)
          a((int)paramcVW.cKl(), (int)paramcVW.cKm(), fDy);
        else {
          deleteNote(fDy);
        }

        bWx.cbz().hide();
        dGx.dhr().unlock();
        break;
      case 0:
        if (((paramcVW.getValue() instanceof cDB)) && (paramcVW.getButton() == 3)) {
          return;
        }
        if (paramcVW.getButton() == 3)
          mapZoomOut(paramcVW);
        else if (paramcVW.getButton() == 1) {
          cCZ.cyZ().cze();
        }

        cancelNoteModification(paramcVW);
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
  }

  public static void setCurrentWorldPositionMarker(os paramos) {
    fDz = paramos;
    dLE.doY().t("landMark.currentWorldPositionMarker", paramos);
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

    dCr.deY().a(paramcVW);

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

  private static boolean bxc() {
    return (!bxd()) && (cCZ.cyZ().bMu());
  }

  private static boolean bxd() {
    return cCZ.cyZ().bMl() != null;
  }

  private static void updateCursor() {
    boolean bool1 = bxd();
    boolean bool2 = bxc();
    duv localduv = null;

    if ((fDC) || (aHa == 1) || (aHa == 3) || (aHa == 4)) {
      if ((!bool2) || (!fDD))
        localduv = duv.lyF;
      else
        localduv = duv.lyE;
    }
    else if ((fDE) || ((fDB != null) && (bool2) && (fDB.dby())))
      localduv = duv.lyD;
    else if (fDA != null) {
      if (bool1)
      {
        localduv = duv.lyC;
      }
      else
      {
        Object localObject;
        if ((fDA.dsj() instanceof cwE)) {
          localObject = (cwE)fDA.dsj();
          int i = ((cwE)localObject).qv().getId();

          if (i != cCZ.cyZ().czd())
          {
            switch (caf.dlz[fDF.ordinal()]) {
            case 1:
              localduv = duv.lyG;
              break;
            case 2:
              localduv = duv.lyH;
              break;
            case 3:
              localduv = duv.lyI;
              break;
            case 4:
              localduv = duv.lyJ;
            }
          }
        }
        else if ((fDA.dsj() instanceof azm)) {
          localObject = (azm)fDA.dsj();
        }
      }
    }

    if (localduv != null)
      dGx.dhr().a(localduv, true);
    else
      dGx.dhr().unlock();
  }

  public static void onMapItemClick(sV paramsV)
  {
    if ((bxd()) || (paramsV.getButton() != 3)) {
      dCr.deY().hidePopup();
      return;
    }

    dwn localdwn = paramsV.AB();
    if ((localdwn.getValue() instanceof gA))
    {
      gA localgA = (gA)localdwn.getValue();
      cCZ.cyZ().z(4, localgA.ok());
      return;
    }

    if (!localdwn.isEditable()) {
      return;
    }

    dCr.deY().b(paramsV);
    fDL = localdwn;
    fDL.kI(true);
    fDy = (cDB)localdwn.getValue();
    fDK = dLE.doY().getStringProperty("mapPopupDescription");
    dCr.deY().kP(true);
  }

  public static void onMapItemOver(sV paramsV) {
    if (!dCr.deY().deZ()) {
      dCr.deY().b(paramsV);
    }
    if (bxd()) {
      return;
    }

    fDB = paramsV.AB();
    updateCursor();
  }

  public static void onMapItemOut(sV paramsV) {
    if (!dCr.deY().deZ()) {
      dCr.deY().hidePopup();
    }
    fDB = null;
    updateCursor();
  }

  public static void onKeyPress(ctH paramctH) {
    if (paramctH.getKeyCode() == 127) {
      deleteNote(paramctH);
      deleteWorldPositionMarker(paramctH);
    }
  }

  public static void onTextEditorChange(ctH paramctH) {
    aTp localaTp = (aTp)paramctH.cIl();
    fDK = localaTp.getText();
  }

  public static void onTextEditorKeyPress(ctH paramctH) {
    if (paramctH.getKeyCode() == 10)
      applyNote(paramctH);
  }

  public static void applyNote(cSx paramcSx)
  {
    if (fDy == null) {
      return;
    }
    String str = aYD.hD(fDK);
    if ((str.length() == 0) && (fDK.length() != 0)) {
      cBQ.cxL().a(bU.fH().getString("error.censoredSentence"), Cn.et(1), 1027L, 102, 1);

      setCurrentNote(null);
      bxe();
      return;
    }

    fDy.setNote(str);
    dlw.cTl().cTn();
    cCZ.cyZ().c(fDy);
    bSH.bZs().c(fDy);
    setCurrentNote(null);
    bxe();
  }

  public static boolean deleteNote(cSx paramcSx) {
    if (fDy == null) {
      return true;
    }

    deleteNote(fDy);
    bxe();
    return true;
  }

  private static void bxe() {
    if (fDL != null) {
      fDL.kI(false);
      fDL = null;
    }
    dCr.deY().kP(false);
    dCr.deY().hidePopup();
  }

  public static boolean cancelNoteModification(cSx paramcSx) {
    bxe();
    return true;
  }

  public static void deleteNote(cDB paramcDB) {
    cCZ.cyZ().b(paramcDB);
    bSH.bZs().a(paramcDB, true);
    setCurrentNote(null);
    aHa = 0;
  }

  public static void deleteWorldPositionMarker(cSx paramcSx) {
    if (fDz != null) {
      cCZ.cyZ().z(2, os.a(fDz));
      setCurrentWorldPositionMarker(null);
    }
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

  public static void onMapDrag(bvN parambvN)
  {
    dwn localdwn = (dwn)parambvN.getValue();
    if ((localdwn.getValue() instanceof cDB)) {
      fDy = (cDB)localdwn.getValue();

      cCZ.cyZ().a(fDy, true);
      bSH.bZs().a(fDy, true);

      aHa = 3;
    } else {
      aHa = 4;
      cCZ.cyZ().czb();
    }
  }

  public static void onLandMarkMousePress(cSx paramcSx) {
    if (fDE) {
      fDC = true;
      updateCursor();
    }
  }

  public static void onLandMarkMouseRelease(cSx paramcSx) {
    fDC = false;
    updateCursor();
  }

  public static void onLandMarkDrag(bvN parambvN) {
    fDM = (dPT)parambvN.getValue();
    aHa = 1;

    updateCursor();
  }

  public static void onLandMarkDropOut(cSx paramcSx) {
    aHa = 0;
    fDC = false;

    updateCursor();
  }

  public static void onLandMarkItemOver(cEv paramcEv) {
    Object localObject = paramcEv.getItemValue();
    if (localObject != null) {
      fDE = true;
      updateCursor();
    }
  }

  public static void onCompassMousePress(cSx paramcSx) {
    if (fDE) {
      fDC = true;
      updateCursor();
    }
  }

  public static void onCompassMouseRelease(cSx paramcSx) {
    fDC = false;
    updateCursor();
  }

  public static void onCompassItemOut(cEv paramcEv) {
    fDE = false;
    updateCursor();
  }

  public static void onCompassDrag(bvN parambvN) {
    fDM = (dPT)parambvN.getValue();
    aHa = 2;

    updateCursor();
  }

  public static void onCompassDropOut(cSx paramcSx) {
    aHa = 0;
    fDC = false;

    updateCursor();
  }

  public static void onCompassItemOver(cEv paramcEv) {
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

  public static void onDropOut(cTo paramcTo) {
    dwn localdwn = (dwn)paramcTo.getValue();
    if ((localdwn.getValue() instanceof cDB)) {
      deleteNote((cDB)localdwn.getValue());
    }

    aHa = 0;
    fDC = false;
    updateCursor();
  }

  public static void onDrop(Qa paramQa) {
    aka localaka = (aka)paramQa.abO();
    MD localMD = localaka.getIsoMousePosition();
    switch (aHa) {
    case 1:
      cDB localcDB = cCZ.cyZ().K(localMD.getX(), localMD.getY(), fDM.oc());
      bSH.bZs().a(localcDB);
      setCurrentNote(localcDB);
      aWc.blo().eO(600119L);
      cCZ.cyZ().cze();
      break;
    case 3:
      a(localMD.getX(), localMD.getY(), fDy);
      break;
    case 2:
      cCZ.cyZ().a(localMD.getX(), localMD.getY(), 0.0F, null);
      break;
    case 4:
      cCZ.cyZ().a(localMD.getX(), localMD.getY(), 0.0F, null);
    }

    aHa = 0;
  }

  public static boolean mapDropValidate(bXx parambXx1, Object paramObject1, bXx parambXx2, Object paramObject2, Object paramObject3)
  {
    return bxc();
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