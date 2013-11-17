public class bEW
{
  public static final String PACKAGE = "wakfu.roomAdministration";

  public static void changeGuildPerms(cSx paramcSx, aui paramaui)
  {
    cHV localcHV = new cHV();
    localcHV.d(17002);
    localcHV.e(paramaui.xj());
    localcHV.c(!paramaui.a(cuU.ifD));
    localcHV.c(paramaui);
    cjO.clE().j(localcHV);
  }

  public static void changeAnonymousPerms(cSx paramcSx, aui paramaui) {
    cHV localcHV = new cHV();
    localcHV.d(17004);
    localcHV.e(paramaui.xj());
    localcHV.c(!paramaui.a(cuU.ifC));
    localcHV.c(paramaui);
    cjO.clE().j(localcHV);
  }

  public static void addPermission(cSx paramcSx, aTp paramaTp) {
    if ((paramcSx.mp() == CH.bGw) || ((paramcSx.mp() == CH.bGh) && (((ctH)paramcSx).getKeyCode() == 10))) {
      bzu localbzu = new bzu();
      localbzu.d(17000);
      localbzu.a(paramaTp.getText());
      cjO.clE().j(localbzu);
      paramaTp.setText("");
    }
  }

  public static void removePermission(cSx paramcSx, Long paramLong) {
    bzu localbzu = new bzu();
    localbzu.d(17001);
    localbzu.c(paramLong.longValue());
    cjO.clE().j(localbzu);
  }

  public static void changeIndividualPerms(dbi paramdbi, Long paramLong, aui paramaui) {
    cHV localcHV = new cHV();
    localcHV.d(17005);
    localcHV.e(paramaui.xj());
    localcHV.c(paramLong.longValue());
    localcHV.c(paramdbi.isSelected());
    localcHV.c(paramaui);
    cjO.clE().j(localcHV);
  }
}