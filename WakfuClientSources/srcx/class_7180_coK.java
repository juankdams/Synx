import java.util.ArrayList;

public class coK
{
  public static final String PACKAGE = "wakfu.followedAchievements";
  private static Runnable hXH = null;

  public static void fillList(axU paramaxU, int paramInt, boolean paramBoolean)
  {
    azx localazx = (azx)paramaxU.getItemValue();
    if (localazx == null)
      return;
    int i = localazx.getId();
    if ((i == paramInt) && (!paramBoolean)) {
      return;
    }
    cpa localcpa1 = paramaxU.getInnerElementMap();

    d((dOc)localcpa1.fi("environmentQuestContainer"), paramBoolean);

    at localat = (at)localcpa1.fi("goalsList");
    ArrayList localArrayList = localat.getRenderables();
    int j = 0; for (int k = localArrayList.size(); j < k; j++) {
      axU localaxU = (axU)localArrayList.get(j);
      cpa localcpa2 = localaxU.getInnerElementMap();
      d((dOc)localcpa2.fi("goalDesc"), paramBoolean);
      d((dOc)localcpa2.fi("goalValue"), paramBoolean);
    }

    d((dOc)localcpa1.fi("timeText"), paramBoolean);
    d((dOc)localcpa1.fi("timeValue"), paramBoolean);
    d((dOc)localcpa1.fi("rankingText"), paramBoolean);
    d((dOc)localcpa1.fi("rankingValue"), paramBoolean);
  }

  private static void d(dOc paramdOc, boolean paramBoolean) {
    if ((paramdOc == null) || (paramdOc.getAppearance() == null))
      return;
    bNa localbNa1 = paramdOc.getAppearance().getModulationColor();
    bNa localbNa2 = paramBoolean ? bNa.gRu : bNa.gRx;
    bNa localbNa3 = localbNa1 != null ? new bNa(localbNa1.get()) : bNa.gRx;
    bNa localbNa4 = paramBoolean ? bNa.gRx : bNa.gRu;
    gm localgm = new gm(localbNa3, localbNa4, paramdOc.getAppearance(), 0, 150, 1, false, ddp.kWG);
    paramdOc.getAppearance().J(gm.class);
    paramdOc.getAppearance().a(localgm);
  }

  public static void fadeAll(boolean paramBoolean, int paramInt)
  {
    if (paramBoolean) {
      hXH = new crC(paramBoolean, paramInt);

      dka.cSF().a(hXH, 150L, 1);
    } else {
      if (hXH != null) {
        dka.cSF().j(hXH);
        hXH = null;
      }
      doFadeAll(paramBoolean, paramInt);
    }
  }

  public static void doFadeAll(boolean paramBoolean, int paramInt) {
    String str = cBQ.cxL().mZ("followedAchievementsDialog") ? "followedAchievementsDialog" : "verticalFollowedAchievementsDialog";

    ArrayList localArrayList1 = new ArrayList();
    cpa localcpa = cBQ.cxL().coO().nf(str);
    fillList((axU)localcpa.fi("environmentRenderable"), paramInt, paramBoolean);
    fillList((axU)localcpa.fi("almanaxRenderable"), paramInt, paramBoolean);
    at localat = (at)localcpa.fi("achievementsList");
    ArrayList localArrayList2 = localat.getRenderables();
    int i = 0; for (int j = localArrayList2.size(); i < j; i++)
      fillList((axU)localArrayList2.get(i), paramInt, paramBoolean);
  }

  public static void popup(cSx paramcSx, anG paramanG, azx paramazx, dOc paramdOc)
  {
    dLE.doY().t("displayedAchievement", paramazx);
    ayw.popup(paramcSx, paramanG, paramdOc);
  }

  public static void openAchievementDialog(cSx paramcSx, ckJ paramckJ) {
    if (paramckJ == null) {
      return;
    }
    boolean bool = cHT.iDr.xT(paramckJ.getId());
    bMK.bUv().a(bool, paramckJ);
  }

  public static void onClick(dMr paramdMr, azx paramazx) {
    openQuestDescriptionDialog(paramdMr, paramazx);
  }

  public static void onMouseEnter(dMr paramdMr, azx paramazx) {
    fadeAll(false, paramazx.getId());
  }

  public static void onMouseExit(dMr paramdMr, azx paramazx) {
    fadeAll(true, paramazx.getId());
  }

  public static void openQuestDescriptionDialog(cSx paramcSx, azx paramazx) {
    if (paramazx == null) {
      return;
    }
    bMK.bUv().a(paramazx);
  }

  public static void toggleQuestOpened(cSx paramcSx, azx paramazx) {
    paramazx.cq(!paramazx.axS());
  }

  public static boolean followAchievement(dbi paramdbi, ckJ paramckJ) {
    bzu localbzu = new bzu();
    localbzu.d(16138);
    localbzu.e(paramckJ.getId());
    localbzu.c(paramdbi.isSelected());
    cjO.clE().j(localbzu);
    return true;
  }

  public static void compassObjective(dbi paramdbi, D paramD) {
    if (paramdbi.isSelected())
      cHT.iDr.xU(paramD.getId());
    else if (cHT.iDr.xW(paramD.getId()))
      cHT.iDr.xU(-1);
  }
}