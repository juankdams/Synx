public class dbj
{
  public static final String PACKAGE = "wakfu.fightCreationOrPlacement";

  public static void lockFight()
  {
    bpn localbpn = Bf.Kk().getWindow();
    if (localbpn != null) {
      br localbr = (br)localbpn.getElementMap().fi("lockFightBtn");
      localbr.setSelected(!localbr.getSelected());
      lockFight(null, localbr);
    }
  }

  public static void lockFight(cSx paramcSx, br parambr)
  {
    bzu localbzu = new bzu();
    localbzu.c(parambr.getSelected());
    localbzu.d(18014);
    cjO.clE().j(localbzu);
  }
}