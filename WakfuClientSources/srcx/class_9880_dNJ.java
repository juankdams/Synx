public class dNJ
{
  public static final String PACKAGE = "wakfu.passport";

  public static void selectTitle(arS paramarS)
  {
    if (paramarS.getSelected()) {
      bkd localbkd = (bkd)paramarS.getValue();
      bzu localbzu = new bzu();
      localbzu.d(17684);
      localbzu.ar(localbkd.nc());
      cjO.clE().j(localbzu);
    }
  }

  public static void setViewMode(cSx paramcSx, String paramString) {
    int i = bUD.f(paramString, 0);
    dLE.doY().t("passportViewMode", Integer.valueOf(i));
  }
}