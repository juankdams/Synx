public class adM
{
  public static final String PACKAGE = "wakfu.krosmozCollection";

  public static void previousSeason(cSx paramcSx)
  {
    bzu.cf((short)17352);
  }

  public static void nextSeason(cSx paramcSx) {
    bzu.cf((short)17353);
  }

  public static void deleteFigure(cEv paramcEv) {
    auG localauG = (auG)paramcEv.getItemValue();
    dED localdED = localauG.aGR();

    bzu localbzu = new bzu();
    localbzu.d(17351);
    localbzu.e(localdED.dge());
    cjO.clE().j(localbzu);
  }
}