public class dxt
{
  public static final String PACKAGE = "wakfu.itemDetails";

  public static void mergeSet(cSx paramcSx, Object paramObject)
  {
    if ((paramObject instanceof gA)) {
      bKu localbKu = (bKu)paramObject;
      bzu localbzu = new bzu();
      localbzu.d(16715);
      localbzu.c(localbKu.oj());
      cjO.clE().j(localbzu);

      biy localbiy = (biy)paramcSx.cIl();
      dFr localdFr = localbiy.getAppearance();
      localdFr.exit();
    }
  }

  public static void openSetDetailWindow(cSx paramcSx, aNL paramaNL, Object paramObject)
  {
    if (paramcSx.mp() == CH.bGw)
    {
      dLB localdLB;
      if ((paramObject instanceof gA))
        localdLB = bCc.bKN().cm(((gA)paramObject).oi().bKk());
      else if ((paramObject instanceof bVw))
        localdLB = bCc.bKN().cm(((bVw)paramObject).bKk());
      else if ((paramObject instanceof cfm))
        localdLB = bCc.bKN().cm(((cfm)paramObject).cij().bKk());
      else {
        return;
      }

      brp localbrp = new brp();
      localbrp.dX(paramaNL.getElementMap().getId());
      localbrp.a(localdLB);
      cjO.clE().j(localbrp);
    }
  }

  public static void openStuffPreviewWindow(cSx paramcSx, aNL paramaNL, Object paramObject)
  {
    if (paramcSx.mp() == CH.bGw)
      if (byv.bFN().c(csf.ibS)) {
        csf.ibS.cqD().Y((gA)paramObject);
      } else {
        csf.ibS.am((gA)paramObject);
        byv.bFN().a(csf.ibS);
      }
  }

  public static void processText(cSx paramcSx, dOc paramdOc, anG paramanG)
  {
    aTo.processText(paramcSx, paramdOc, paramanG);
  }

  public static void openLinkedCraft(cSx paramcSx, Object paramObject) {
    if (paramcSx.mp() == CH.bGw)
    {
      bVw localbVw;
      if ((paramObject instanceof gA))
        localbVw = (bVw)((gA)paramObject).oi();
      else if ((paramObject instanceof bVw))
        localbVw = (bVw)paramObject;
      else if ((paramObject instanceof cfm))
        localbVw = (bVw)((cfm)paramObject).cij();
      else {
        return;
      }

      bzu localbzu = new bzu();
      localbzu.d(16832);
      localbzu.e(localbVw.getId());
      cjO.clE().j(localbzu);
    }
  }

  public static void closeWindow(cSx paramcSx, aNL paramaNL)
  {
    if (paramcSx.mp() == CH.bGw) {
      cER localcER = new cER();
      localcER.d(16415);
      localcER.dX(paramaNL.getElementMap().getId());
      cjO.clE().j(localcER);
    }
  }

  public static void setItemLevel(bXo parambXo) {
    cpa localcpa = parambXo.cIl().getElementMap();
    if (localcpa == null) {
      return;
    }

    Object localObject = dLE.doY().br("itemDetail", localcpa.getId());
    if (localObject == null) {
      return;
    }

    if ((localObject instanceof bVw)) {
      return;
    }

    gA localgA = (gA)localObject;
    if (!localgA.nK()) {
      return;
    }

    dHJ localdHJ = localgA.nL();

    short s = (short)(int)parambXo.getValue();
    if (s > localdHJ.ble().nV()) {
      s = localdHJ.ble().nV();
    }

    c(s, localcpa);
  }

  public static void keyType(cSx paramcSx, duS paramduS) {
    cpa localcpa = paramcSx.cIl().getElementMap();
    if (localcpa == null) {
      return;
    }

    gA localgA = (gA)dLE.doY().br("itemDetail", localcpa.getId());
    if (localgA == null) {
      return;
    }

    if (!localgA.nK()) {
      return;
    }

    dHJ localdHJ = localgA.nL();

    if (paramduS.getText().length() == 0) {
      return;
    }

    short s = bUD.getShort(paramduS.getText());
    if (s > localdHJ.ble().nV()) {
      s = localdHJ.ble().nV();
    }

    c(s, localcpa);
  }

  public static void restore(cSx paramcSx) {
    cpa localcpa = paramcSx.cIl().getElementMap();
    if (localcpa == null) {
      return;
    }

    arY localarY = (arY)dLE.doY().br("itemLevelController", localcpa.getId());
    localarY.restore();
  }

  private static void c(short paramShort, cpa paramcpa) {
    arY localarY = (arY)dLE.doY().br("itemLevelController", paramcpa.getId());
    localarY.aQ(paramShort);
  }

  public static void openGemsDialog(cEv paramcEv, Object paramObject) {
    if (!byv.bFN().c(akm.axz())) {
      byv.bFN().a(akm.axz());
    }

    akm.axz().p((gA)paramObject);
  }

  public static void drop(Qa paramQa, bfk parambfk) {
    gA localgA = (gA)paramQa.sq();
    bRA localbRA = new bRA();
    localbRA.ae(localgA);
    localbRA.a(parambfk.bsG());
    localbRA.a(parambfk.VH());
    cjO.clE().j(localbRA);

    byA.onDropItem();
  }

  public static void changeItemBackground(dMr paramdMr, gA paramgA) {
    changeItemBackground(paramdMr, paramgA, null);
  }

  public static void changeItemBackground(dMr paramdMr) {
    String str = "";
    dOc localdOc = (dOc)paramdMr.cIl();

    if (paramdMr.mp() == CH.bGs)
      str = "itemSelectedBackground";
    else if (paramdMr.mp() == CH.bGt) {
      str = "itemBackground";
    }
    localdOc.setStyle(str);
  }

  public static void changeItemBackground(dMr paramdMr, gA paramgA, anG paramanG) {
    String str = "";
    dOc localdOc = (dOc)paramdMr.cIl();

    if (paramgA != null) {
      if (paramdMr.mp() == CH.bGs)
        str = "itemSelectedBackground";
      else if (paramdMr.mp() == CH.bGt) {
        if (dhC.cQm().cV(paramgA.oj()))
          str = "itemSetSelectedBackground";
        else {
          str = "itemBackground";
        }
      }
      localdOc.setStyle(str);
    }
    if (paramanG != null)
      if (paramdMr.mp() == CH.bGs)
        cDS.showPopup(paramdMr, paramgA, paramanG, localdOc);
      else
        cDS.closePopup(paramdMr);
  }
}