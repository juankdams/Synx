public class ayw
{
  public static final String PACKAGE = "xulor";
  private static Hd dOH = new Hd(null);

  public static boolean unloadDialog(cSx paramcSx)
  {
    aNL localaNL = paramcSx.cIl();
    if (localaNL != null) {
      String str = localaNL.getElementMap().getId();
      cBQ.cxL().M(str, false);
    }

    return false;
  }

  public static void switchDrawer(cSx paramcSx, bZh parambZh) {
    parambZh.cdM();
  }

  private static boolean a(dOc paramdOc, anG paramanG, float paramFloat, duS paramduS) {
    if ((paramduS != null) && (!paramduS.isTextReduced())) {
      return false;
    }

    if ((paramdOc != null) && (paramanG != null) && (!bsP.getInstance().isDragging())) {
      cAo.cxf().b(dOH);
      dOH.setPopup(paramanG);
      dOH.setWidget(paramdOc);
      if (paramFloat == 0.0F) {
        paramanG.b(paramdOc);
      }
      else {
        cAo.cxf().a(dOH, ()(1000.0F * paramFloat), -1, 1);
      }
    }

    return false;
  }

  public static boolean popup(cSx paramcSx, anG paramanG, String paramString) {
    return a(paramcSx, paramanG, Float.valueOf(paramString).floatValue());
  }

  private static Cs a(cSx paramcSx, anG paramanG) {
    aNL localaNL = paramcSx.cIl();
    if (!(localaNL instanceof dOc)) {
      return null;
    }

    dOc localdOc = (dOc)localaNL;

    Cs localCs = new Cs();

    if (localdOc.getPopup() != null) {
      localCs.w(localdOc.getPopup());
      localCs.x(localdOc);
    } else if (paramanG != null) {
      localCs.w(paramanG);
      localCs.x(paramanG.getParentOfType(dOc.class));
    }

    return localCs;
  }

  private static boolean a(cSx paramcSx, anG paramanG, float paramFloat) {
    Cs localCs = a(paramcSx, paramanG);
    if (localCs == null) {
      return false;
    }

    popup((anG)localCs.getFirst(), (dOc)localCs.Lp(), paramFloat);

    return false;
  }

  public static boolean popup(cSx paramcSx)
  {
    aNL localaNL = paramcSx.cIl();
    if (!(localaNL instanceof dOc)) {
      return false;
    }
    anG localanG = ((dOc)localaNL).getPopup();

    if (localanG != null) {
      popup(paramcSx, localanG);
    }

    return false;
  }

  public static boolean popup(cSx paramcSx, anG paramanG)
  {
    return a(paramcSx, paramanG, 0.0F);
  }

  public static boolean popup(anG paramanG, dOc paramdOc, float paramFloat) {
    return a(paramdOc, paramanG, paramFloat, null);
  }

  public static boolean popup(anG paramanG, dOc paramdOc) {
    return popup(paramanG, paramdOc, 0.0F);
  }

  public static boolean popup(cSx paramcSx, anG paramanG, dOc paramdOc) {
    return popup(paramanG, paramdOc);
  }

  public static boolean popupIfReduced(cSx paramcSx, anG paramanG, dOc paramdOc, duS paramduS) {
    return a(paramdOc, paramanG, 0.0F, paramduS);
  }

  public static boolean popupIfReduced(cSx paramcSx, anG paramanG, duS paramduS) {
    Cs localCs = a(paramcSx, paramanG);
    if (localCs == null) {
      return false;
    }

    return a((dOc)localCs.Lp(), (anG)localCs.getFirst(), 0.0F, paramduS);
  }

  public static boolean popupIfReduced(cSx paramcSx, anG paramanG, duS paramduS, String paramString) {
    Cs localCs = a(paramcSx, paramanG);
    if (localCs == null) {
      return false;
    }

    return a((dOc)localCs.Lp(), (anG)localCs.getFirst(), bUD.e(paramString, 0.0F), paramduS);
  }

  public static boolean popupIfReduced(cSx paramcSx, anG paramanG, dOc paramdOc, duS paramduS, String paramString) {
    return a(paramdOc, paramanG, bUD.e(paramString, 0.0F), paramduS);
  }

  public static boolean popup(cSx paramcSx, anG paramanG, dOc paramdOc, String paramString) {
    return a(paramdOc, paramanG, bUD.e(paramString, 0.0F), null);
  }

  public static boolean closePopup(cSx paramcSx) {
    cAo.cxf().b(dOH);
    bsP.getInstance().getPopupContainer().hide();
    return false;
  }

  public static boolean closePopup(cSx paramcSx, anG paramanG)
  {
    cAo.cxf().b(dOH);
    bsP.getInstance().getPopupContainer().hide();
    return false;
  }

  public static boolean openClosePopup(cSx paramcSx, anG paramanG)
  {
    if (bsP.getInstance().isDragging()) {
      return false;
    }

    aNL localaNL = paramcSx.cIl();
    if (!(localaNL instanceof dOc)) {
      return false;
    }
    anG localanG = ((dOc)localaNL).getPopup();
    if (localanG == null) {
      localanG = paramanG;
    }

    localanG.a((dOc)localaNL);

    return false;
  }

  public static void playSound(cSx paramcSx, String paramString) {
    int i = bUD.f(paramString, -1);
    if (i != -1)
      MQ.WK().fN(i);
  }

  public static boolean toggleVisible(cSx paramcSx, dOc paramdOc)
  {
    return toggleVisible(paramdOc);
  }

  public static boolean toggleVisible(dOc paramdOc)
  {
    if (paramdOc != null) {
      paramdOc.setVisible(!paramdOc.getVisible());
    }

    return false;
  }

  public static boolean setupLook(cSx paramcSx, bpn parambpn, String paramString)
  {
    return false;
  }

  public static boolean foldUnfold(cSx paramcSx)
  {
    dTd localdTd = (dTd)paramcSx.cIl().getParentOfType(dTd.class);

    if (localdTd != null) {
      if (localdTd.isFolded())
        localdTd.dth();
      else {
        localdTd.dtg();
      }
    }
    return false;
  }

  public static boolean unfold(cSx paramcSx)
  {
    dTd localdTd = (dTd)paramcSx.cIl().getParentOfType(dTd.class);

    if ((localdTd != null) && 
      (localdTd.isFolded())) {
      localdTd.dth();
    }

    return false;
  }

  public static boolean fold(cSx paramcSx)
  {
    dTd localdTd = (dTd)paramcSx.cIl().getParentOfType(dTd.class);

    if ((localdTd != null) && 
      (!localdTd.isFolded())) {
      localdTd.dtg();
    }

    return false;
  }
}