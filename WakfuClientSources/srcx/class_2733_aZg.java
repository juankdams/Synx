public class aZg
{
  public static final String PACKAGE = "wakfu.almanach";

  public static void previousMonth(cSx paramcSx)
  {
    dBW.lJB.deP();
  }

  public static void nextMonth(cSx paramcSx) {
    dBW.lJB.deQ();
  }

  public static void displayRewardMachine(cSx paramcSx) {
    ql localql = (ql)aKY.epr.a(cdc.hwd, 53);
    String str = bU.fH().b(107, 53, new Object[0]);

    zJ.IC().a(localql, str);
  }

  public static void selectDate(cEv paramcEv) {
    aAz localaAz = (aAz)paramcEv.getItemValue();
    if (localaAz != null)
      dBW.lJB.Y(localaAz.VN());
  }
}