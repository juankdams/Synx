public class cAW
{
  public static final String PACKAGE = "wakfu.fightResult";

  public static void closeFightResultDialog(cSx paramcSx)
  {
    bzu.cf((short)17730);
  }

  public static void openSpellsDetailsDialog(cSx paramcSx) {
    if (cBQ.cxL().mZ("fightResultSpellsDetailsDialog"))
      cBQ.cxL().mW("fightResultSpellsDetailsDialog");
    else
      aPh.bgd().bge();
  }

  public static void openSummonsDetailsDialog(cSx paramcSx)
  {
    if (cBQ.cxL().mZ("fightResultSummonsDetailsDialog"))
      cBQ.cxL().mW("fightResultSummonsDetailsDialog");
    else
      aPh.bgd().bgf();
  }

  public static void openItemDetails(cEv paramcEv)
  {
    if ((paramcEv.mp() == CH.bGd) && (paramcEv.getButton() == 3)) {
      if (!byv.bFN().c(dGW.dhM())) {
        byv.bFN().a(dGW.dhM());
      }
      eX.sendOpenCloseItemDetailMessage(null, ((cDm)paramcEv.getItemValue()).Hu());
    }
  }
}