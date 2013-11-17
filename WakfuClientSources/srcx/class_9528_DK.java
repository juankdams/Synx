public class DK
{
  public static final String PACKAGE = "wakfu.guildBannerCreator";

  public static void selectColor(cEv paramcEv)
  {
    auc localauc = new auc();
    localauc.d(18200);
    localauc.setColor((bNa)paramcEv.getItemValue());
    cjO.clE().j(localauc);
  }

  private static void a(dxx paramdxx, dRq paramdRq1, dRq paramdRq2) {
    paramdRq1.setVisible(false);
    paramdRq2.setVisible(true);

    auc localauc = new auc();
    localauc.d(18203);
    localauc.a(paramdxx);
    cjO.clE().j(localauc);
  }

  public static void setFirstPartBackgroundColorType(cSx paramcSx, dRq paramdRq1, dRq paramdRq2) {
    a(dxx.lDL, paramdRq1, paramdRq2);
  }

  public static void setFirstPartForegroundColorType(cSx paramcSx, dRq paramdRq1, dRq paramdRq2) {
    a(dxx.lDK, paramdRq1, paramdRq2);
  }

  public static void closeColorPicker(cSx paramcSx, dRq paramdRq1, dRq paramdRq2) {
    paramdRq1.setVisible(true);
    paramdRq2.setVisible(false);
  }

  public static void nextBackground(cSx paramcSx) {
    bzu localbzu = new bzu();
    localbzu.d(18201);
    localbzu.e(1);
    cjO.clE().j(localbzu);
  }

  public static void previousBackground(cSx paramcSx) {
    bzu localbzu = new bzu();
    localbzu.d(18201);
    localbzu.e(-1);
    cjO.clE().j(localbzu);
  }

  public static void nextForeground(cSx paramcSx) {
    bzu localbzu = new bzu();
    localbzu.d(18202);
    localbzu.e(1);
    cjO.clE().j(localbzu);
  }

  public static void previousForeground(cSx paramcSx) {
    bzu localbzu = new bzu();
    localbzu.d(18202);
    localbzu.e(-1);
    cjO.clE().j(localbzu);
  }

  public static void createGuild(cSx paramcSx, aTp paramaTp, String paramString) {
    boolean bool = Boolean.parseBoolean(paramString);

    String str1 = paramaTp.getText();
    Zv localZv = new Zv();
    String str2 = dzp.qD(str1).replaceAll("[?]", "");

    if (!str2.equals(str1)) {
      paramaTp.setTextImmediate(str2);
    }
    localZv.setName(str2);
    localZv.c(bool);
    cjO.clE().j(localZv);
  }

  public static void closeDialog(cSx paramcSx) {
    byv.bFN().b(dKb.djg());
  }
}