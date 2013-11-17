public class cPX
{
  public static final String PACKAGE = "wakfu.protectorView";

  public static void setViewMode(cSx paramcSx, String paramString)
  {
    int i = bUD.f(paramString, 0);

    dLE.doY().t("protectorViewMode", Integer.valueOf(i));
  }
}