public class Fc
{
  public static final String PACKAGE = "wakfu.guildImprovement";

  public static void incrementLevel(cSx paramcSx)
  {
    bzu.cf((short)18222);
  }

  public static void activateBonus(cSx paramcSx, dvQ paramdvQ) {
    bzu localbzu = new bzu();
    localbzu.e(paramdvQ.getId());
    localbzu.d(18224);
    cjO.clE().j(localbzu);
  }

  public static void buyBonus(cSx paramcSx, dvQ paramdvQ) {
    bzu localbzu = new bzu();
    localbzu.e(paramdvQ.getId());
    localbzu.d(18223);
    cjO.clE().j(localbzu);
  }
}