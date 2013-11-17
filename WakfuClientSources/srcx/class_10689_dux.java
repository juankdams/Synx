public class dux
{
  public static final String PACKAGE = "wakfu.fightAction";
  private static boolean dml;

  public static void endPlacement(cSx paramcSx)
  {
    bzu.cf((short)18007);
  }

  public static void fighterEndsTurn(cSx paramcSx)
  {
    if (dLE.doY().getBooleanProperty("isInFightPlacement"))
      bzu.cf((short)18007);
    else
      bzu.cf((short)18001);
  }

  public static void giveUpFight(cSx paramcSx)
  {
    bzu.cf((short)18000);
  }

  public static void fighterSetSouthEastDirection(cSx paramcSx)
  {
    bzu.cf((short)18004);
  }

  public static void fighterSetSouthWestDirection(cSx paramcSx)
  {
    bzu.cf((short)18005);
  }

  public static void fighterSetNorthWestDirection(cSx paramcSx)
  {
    bzu.cf((short)18003);
  }

  public static void fighterSetNorthEastDirection(cSx paramcSx)
  {
    bzu.cf((short)18006);
  }

  public static void callHelp(cSx paramcSx) {
    bpn localbpn = Bf.Kk().getWindow();
    if (localbpn != null)
      callHelp(paramcSx, (biy)localbpn.getElementMap().fi("callHelpBtn"));
  }

  public static void callHelp(cSx paramcSx, biy parambiy)
  {
    if (dml) {
      return;
    }
    bzu.cf((short)18011);

    parambiy.setEnabled(false);
    dml = true;
    dka.cSF().a(new Lk(parambiy), 5000L, 1);
  }

  public static void reportCell(cSx paramcSx)
  {
    bpn localbpn = Bf.Kk().getWindow();
    if (localbpn != null)
      reportCell(paramcSx, (biy)localbpn.getElementMap().fi("reportCellBtn"));
  }

  public static void reportCell(cSx paramcSx, biy parambiy)
  {
    bzu.cf((short)18013);

    parambiy.setEnabled(false);
    dka.cSF().a(new Lg(parambiy), 5000L, 1);
  }

  public static void hideFighters(dMr paramdMr)
  {
    bzu.cf((short)16713);
  }

  public static void openSpellsPage(cSx paramcSx) {
    dPm.dqv().dqw();
  }
}