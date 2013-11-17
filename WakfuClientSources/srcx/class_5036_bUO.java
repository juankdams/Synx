import java.awt.Point;
import org.apache.log4j.Logger;

public class bUO extends jT
{
  private static final Logger K = Logger.getLogger(bUO.class);
  public static final String PACKAGE = "wakfu.worldEditor";
  private static final int hgQ = 30;
  private static final int hgR = 30;
  private static final int hgS = 5;
  private static MD hgT;
  private static int hgU;
  private static boolean gJs;
  private static boolean hgV;
  private static dEd hgW;
  private static int hgX;
  private static int hgY;
  private static cbR hgZ;

  public static void close(dMr paramdMr)
  {
    if (bZv.cdR().cea().isDirty()) {
      String str = bU.fH().getString("question.havenWorldEditorClose");
      NW localNW = new NW(102, 0, str, null, Cn.et(8), 24L);

      cKX localcKX = cBQ.cxL().a(localNW);
      localcKX.a(new hY());
    }
    else
    {
      sG();
    }
  }

  private static void sG() {
    cBQ.cxL().mW("worldEditorDialog");
  }

  public static void keyPressed(ctH paramctH, aLD paramaLD) {
    switch (paramctH.getKeyCode()) {
    case 39:
      paramaLD.translate(30.0F, 0.0F);
      break;
    case 37:
      paramaLD.translate(-30.0F, 0.0F);
      break;
    case 38:
      paramaLD.translate(0.0F, 30.0F);
      break;
    case 40:
      paramaLD.translate(0.0F, -30.0F);
      break;
    case 27:
    case 28:
    case 29:
    case 30:
    case 31:
    case 32:
    case 33:
    case 34:
    case 35:
    case 36: }  } 
  public static void onMouseOut(dMr paramdMr, aLD paramaLD) { dGx.dhr().unlock();
    bWx.cbz().hide();
    dLE.doY().t("havenWorldOverCatalogEntry", null);
    resetDrag(paramdMr, paramaLD); }

  public static void onMapDrag(dMr paramdMr, aLD paramaLD)
  {
    if ((hgT == null) || (hgZ != null)) {
      return;
    }
    gJs = true;
    int i = paramdMr.y(paramaLD);
    int j = paramdMr.z(paramaLD);
    int k = i - hgT.getX();
    int m = j - hgT.getY();
    if ((Math.abs(k) > hgU) || (Math.abs(m) > hgU)) {
      hgU = 0;
      paramaLD.translate(k / paramaLD.getZoomFactor(), m / paramaLD.getZoomFactor());
      hgT.set(i, j);
    }
  }

  public static void onMouseWheel(dMr paramdMr, aLD paramaLD) {
    if (paramdMr.dpj() < 0)
      paramaLD.bdf();
    else
      paramaLD.bdg();
  }

  public static void onClick(dMr paramdMr, aLD paramaLD, dRq paramdRq)
  {
    if (gJs) {
      gJs = false;
      return;
    }
    byz localbyz = byv.bFN().bFO();
    bMG localbMG = localbyz.bSt();
    aCl localaCl = localbMG.ay(localbyz.getId());
    if (localaCl == null) {
      return;
    }

    aUJ localaUJ = localbMG.az(localaCl.aOC());
    if (localaUJ == null) {
      return;
    }

    if (!localaUJ.a(cnm.hTn)) {
      return;
    }
    hgX = paramdMr.y(paramaLD);
    hgY = paramdMr.z(paramaLD);
    paramdRq.setVisible(false);
    hgZ = null;
    if (paramdMr.getButton() == 3) {
      paramaLD.setCurrentLayer(bZv.cdR().cea().ug());
      paramaLD.setSelectTool();

      if (paramaLD.getCurrentLayer() != dmh.ljT) {
        return;
      }

      cbR localcbR1 = paramaLD.getBuildingUnderMouse(hgX, hgY);
      if (localcbR1 == null) {
        hgV = false;
        dGx.dhr().unlock();
        bWx.cbz().hide();
        return;
      }

      cbR localcbR2 = (cbR)localcbR1;

      ju localju = bZv.cdR().b(localcbR2);
      if ((localju != null) && (localju.rj().pI() == dtv.lwi)) {
        return;
      }

      hgZ = localcbR2;
      String str;
      bZw localbZw;
      if (localju != null) {
        str = localju.getName();
        localbZw = localju.ri();
        dLE.doY().t("selectedBuilding", localbZw);
      } else {
        localObject = dfX.laF.jG(hgZ.EN());
        if (localObject != null) {
          str = ((boU)localObject).getName();
          localbZw = ((boU)localObject).ri();
          dLE.doY().t("selectedBuilding", localObject);
        } else {
          hgZ = null;
        }
      }
      Object localObject = (bpn)paramdRq.getElementMap().fi("worldEditorDialog");
      ((bpn)localObject).a(new hZ(paramdRq, paramaLD, (bpn)localObject));

      ((bpn)localObject).setNeedsToPostProcess();
      bsP.getInstance().a(CH.bGw, new hV(paramdRq), true);
    }

    if (paramdMr.getButton() == 1) {
      paramaLD.bH(hgX, hgY);
      int i = bZv.cdR().cea().uh();

      if ((i != bUj.hgb.getId()) && (i != bUj.hfZ.getId()))
      {
        paramaLD.setSelectTool();
        hgV = false;
      }
    }
  }

  public static void evolveBuilding(cSx paramcSx, aLD paramaLD, dRq paramdRq) {
    paramdRq.setVisible(false);
    evolveBuilding(paramcSx, dfX.laF.jG(hgZ.EN()));
  }

  public static void removeBuilding(dMr paramdMr, aLD paramaLD, dRq paramdRq) {
    paramdRq.setVisible(false);
    if (hgZ == null) {
      return;
    }

    if (hgZ.EN() < 0L) {
      ju localju = bZv.cdR().b(hgZ);
      djt localdjt = new djt(localju);
      localdjt.d(19361);
      cjO.clE().j(localdjt);
    } else {
      paramaLD.setTool(new MR());
      paramaLD.bH(hgX, hgY);
      paramaLD.setSelectTool();
    }
  }

  public static void moveBuilding(dMr paramdMr, aLD paramaLD, dRq paramdRq) {
    paramdRq.setVisible(false);
    if (hgZ == null) {
      return;
    }

    dGx.dhr().a(duv.lyz, true);
    hgV = true;
    dLE.doY().t("havenWorldCatalogPlacingMode", Boolean.valueOf(hgV));

    paramaLD.setTool(new Bi(hgZ));
    paramaLD.getTool().ef(paramdMr.y(paramaLD), paramdMr.z(paramaLD));
  }

  public static void resetDrag(dMr paramdMr, aLD paramaLD) {
    hgT = null;
    hgU = 5;
    paramaLD.bdh();
    paramaLD.c(null);
  }

  public static void onMousePress(dMr paramdMr, aLD paramaLD) {
    if ((hgT == null) && (paramdMr.getButton() == 3)) {
      hgT = new MD(paramdMr.y(paramaLD), paramdMr.z(paramaLD));
      hgU = 5;
    }
  }

  public static void onMouseMove(dMr paramdMr, aLD paramaLD, dRq paramdRq) {
    int i = paramdMr.y(paramaLD);
    int j = paramdMr.z(paramaLD);
    boolean bool = b(paramaLD, i, j);
    if ((bool) && 
      (d(paramaLD))) {
      return;
    }

    if (!hgV) {
      if ((bool) || ((paramaLD.getTool() instanceof cck))) {
        dGx.dhr().a(duv.lyz, true);
        bWx.cbz().a(null, paramaLD.getWorkingHavenWorld().La() + " §", 30, 0, aFG.ecj);
      }
      else {
        dGx.dhr().unlock();
        bWx.cbz().hide();
      }
    }
    else dGx.dhr().a(duv.lyz, true);

    paramaLD.bG(i, j);
    paramdRq.setVisible(false);
    cbR localcbR = paramaLD.getBuildingUnderMouse(i, j);

    if ((hgV) || (gJs) || (paramaLD.getCurrentLayer() != dmh.ljT) || (localcbR == hgZ))
    {
      return;
    }
    if (localcbR == null) {
      dLE.doY().t("havenWorldOverCatalogEntry", null);
      return;
    }

    long l = localcbR.EN();
    boU localboU = dfX.laF.jG(l);
    if (localboU == null) {
      ju localju = bZv.cdR().b(localcbR);
      dLE.doY().t("havenWorldOverCatalogEntry", localju);
    } else {
      dLE.doY().t("havenWorldOverCatalogEntry", localboU);
    }
    paramdRq.setPosition(new Point(i, j + 15));
    paramdRq.setVisible(true);
  }

  private static boolean d(aLD paramaLD) {
    cGt localcGt = paramaLD.getTool();
    if (!(localcGt instanceof cck)) {
      try {
        paramaLD.setTool(new cck(localcGt, paramaLD.getWorkingHavenWorld().La()));
      } catch (Exception localException) {
        K.error("", localException);
        return true;
      }
    }
    return false;
  }

  private static boolean b(aLD paramaLD, int paramInt1, int paramInt2) {
    MD localMD = paramaLD.getPatchCoordFromMouse(paramInt1, paramInt2);
    int i = BX.eh(localMD.getX());
    int j = BX.ei(localMD.getY());
    return cck.c(paramaLD, i, j);
  }

  public static void zoomIn(dMr paramdMr, aLD paramaLD) {
    paramaLD.bdf();
  }

  public static void zoomOut(dMr paramdMr, aLD paramaLD) {
    paramaLD.bdg();
  }

  public static void validate(dMr paramdMr, aLD paramaLD) {
    bzu.cf((short)17804);
  }

  public static void onMouseOverElement(cSx paramcSx, bZw parambZw, anG paramanG) {
    ayw.popup(paramcSx, paramanG);
    dOc localdOc = (dOc)paramcSx.cIl();
    localdOc.getAppearance().setModulationColor(clP.hOw);
    dLE.doY().t("havenWorldOverCatalogEntry", parambZw);

    if (parambZw.bvn())
      aWc.blo().eO(600193L);
    else
      aWc.blo().eO(600010L);
  }

  public static void onMouseOutElement(cSx paramcSx, bZw parambZw, anG paramanG)
  {
    ayw.closePopup(paramcSx, paramanG);
    dOc localdOc = (dOc)paramcSx.cIl();
    if (parambZw.equals(dLE.doY().rv("havenWorldSelectedCatalogEntry")))
      localdOc.getAppearance().setModulationColor(clP.hOw);
    else {
      localdOc.getAppearance().setModulationColor(bNa.gRx);
    }
    dLE.doY().t("havenWorldOverCatalogEntry", null);
  }

  public static void toggleQuotationsMode(cSx paramcSx) {
    boolean bool = dLE.doY().getBooleanProperty("havenWorldCatalogQuotationMode");
    dLE.doY().t("havenWorldCatalogQuotationMode", Boolean.valueOf(!bool));
    unloadConflictContainer(paramcSx);
  }

  public static void removeEntryFromQuotation(cSx paramcSx, ju paramju) {
    djt localdjt = new djt(paramju);
    localdjt.d(19361);
    cjO.clE().j(localdjt);
  }

  public static void onMouseOverQuotationElement(cEv paramcEv, aLD paramaLD) {
    ju localju = (ju)paramcEv.getItemValue();
    dDO localdDO = localju.rj();
    if (localdDO != null)
      paramaLD.c(localdDO.Qw());
  }

  public static void onMouseOutQuotationElement(cEv paramcEv, aLD paramaLD)
  {
    paramaLD.c(null);
  }

  public static void selectElementFromCatalog(cEv paramcEv) {
    byz localbyz = byv.bFN().bFO();
    bMG localbMG = localbyz.bSt();
    aCl localaCl = localbMG.ay(localbyz.getId());
    if (localaCl == null) {
      return;
    }

    aUJ localaUJ = localbMG.az(localaCl.aOC());
    if (localaUJ == null) {
      return;
    }

    if (!localaUJ.a(cnm.hTn)) {
      cBQ.cxL().a(bU.fH().getString("error.noRightToManageHavenWorld"), Cn.et(8), 3L, 7, 1);

      return;
    }

    bZw localbZw = (bZw)paramcEv.getItemValue();
    if (!localbZw.bvn()) {
      return;
    }
    djw localdjw = new djw(localbZw);
    localdjw.d(19360);
    cjO.clE().j(localdjw);
    dGx.dhr().a(duv.lyz, true);
    hgV = true;
    dLE.doY().t("havenWorldCatalogPlacingMode", Boolean.valueOf(hgV));
    bsP.getInstance().a(CH.bGw, new hW(), true);
  }

  public static void cancelAction()
  {
    hgV = false;
    dLE.doY().t("havenWorldCatalogPlacingMode", Boolean.valueOf(hgV));
    dGx.dhr().unlock();
    dLE.doY().t("havenWorldSelectedCatalogEntry", null);
  }

  public static void selectCategory(cEv paramcEv) {
    bzu localbzu = new bzu();
    localbzu.d(17805);
    localbzu.a(((dTk)paramcEv.getItemValue()).bJ());
    cjO.clE().j(localbzu);
  }

  public static void selectSubCategoryFromCatalog(cSx paramcSx, bhZ parambhZ) {
    parambhZ.ub();
  }

  public static void unloadConflictContainer(cSx paramcSx) {
    bZv.cdR().ceb();
  }

  public static void onConflictTextClick(cSx paramcSx, aLD paramaLD) {
    cWk localcWk = (cWk)paramcSx.cIl();
    cDG localcDG = localcWk.getBlockUnderMouse();
    if ((localcDG == null) || (localcDG.czB() != cUE.kHp)) {
      return;
    }
    ddB localddB = localcDG.aOi();
    if (localddB.cOJ() != bY.QP) {
      return;
    }
    String str = ((ckA)localddB).getId();
    if ((str != null) && (str.length() > 0))
      try {
        String[] arrayOfString = str.split(";");
        int i = bUD.aR(arrayOfString[0]);
        int j = bUD.aR(arrayOfString[1]);
        paramaLD.bF(i, j);
      } catch (Exception localException) {
        K.error("", localException);
      }
  }

  public static void scrollUp(cSx paramcSx, aLD paramaLD)
  {
    stopScroll(paramcSx);
    CG localCG = CG.bFL;
    a(((dMr)paramcSx).getScreenY(), paramaLD, localCG);
  }

  public static void scrollDown(cSx paramcSx, aLD paramaLD) {
    stopScroll(paramcSx);
    a(((dMr)paramcSx).getScreenY(), paramaLD, CG.bFH);
  }

  public static void scrollLeft(cSx paramcSx, aLD paramaLD) {
    stopScroll(paramcSx);
    a(((dMr)paramcSx).getScreenX(), paramaLD, CG.bFJ);
  }

  public static void scrollRight(cSx paramcSx, aLD paramaLD) {
    stopScroll(paramcSx);
    a(((dMr)paramcSx).getScreenX(), paramaLD, CG.bFF);
  }

  private static void a(int paramInt, aLD paramaLD, CG paramCG)
  {
  }

  public static void stopScroll(cSx paramcSx)
  {
    if (hgW != null) {
      if ((paramcSx != null) && (paramcSx.mp() == CH.bGt) && (hgW.k((dMr)paramcSx))) {
        return;
      }
      dka.cSF().j(hgW);
      hgW = null;
    }
  }
}