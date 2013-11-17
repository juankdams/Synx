public class crj
{
  public static final String PACKAGE = "wakfu.dungeon";

  public static void selectDungeon(cEv paramcEv)
  {
    aiA localaiA = (aiA)paramcEv.getItemValue();
    bzu localbzu = new bzu();
    localbzu.d(16540);
    localbzu.e(localaiA.getId());
    cjO.clE().j(localbzu);
  }

  public static void setFilter(cSx paramcSx, ddX paramddX) {
    bzu localbzu = new bzu();
    localbzu.d(16541);
    localbzu.a(paramddX.cOR().bJ());
    cjO.clE().j(localbzu);
  }
}