public class dlF
{
  public static final String PACKAGE = "wakfu.adminMonitor";

  public static void duplicateDialog(cSx paramcSx)
  {
  }

  public static void openCloseContainer(cSx paramcSx, ae paramae)
  {
    if (paramae != null)
      paramae.setVisible(!paramae.isVisible());
  }

  public static void changeInstancesDisplayStatus(cSx paramcSx)
  {
    bWP.hjj = !bWP.hjj;
    bWP.cbM().cbN();
    bWP.cbM().cbO();
  }

  public static void changeChallengesDisplayStatus(cSx paramcSx) {
    bWP.hjk = !bWP.hjk;
    bWP.cbM().cbN();
    bWP.cbM().cbO();
  }

  public static void changeEcozonessDisplayStatus(cSx paramcSx) {
    bWP.hjl = !bWP.hjl;
    bWP.cbM().cbN();
    bWP.cbM().cbO();
  }
}