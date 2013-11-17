public class aQu
{
  public static final String PACKAGE = "wakfu.worldChoice";

  public static void selectWorld(cSx paramcSx, dHb paramdHb)
  {
    if ((paramcSx != null) && (paramdHb != null)) {
      dCZ localdCZ = new dCZ();
      localdCZ.b(paramdHb);
      localdCZ.d(16500);
      cjO.clE().j(localdCZ);
    }
  }

  public static void validWorld(cSx paramcSx, dHb paramdHb)
  {
    dCZ localdCZ = new dCZ();
    localdCZ.b(paramdHb);
    localdCZ.d(16501);
    cjO.clE().j(localdCZ);
  }

  public static void validWorldDoubleClick(cSx paramcSx, dHb paramdHb)
  {
    if ((paramcSx != null) && (paramdHb != null)) {
      dCZ localdCZ = new dCZ();
      localdCZ.b(paramdHb);
      localdCZ.d(16501);
      cjO.clE().j(localdCZ);
    }
  }

  public static void mouseEnterOnWorld(cSx paramcSx, dHb paramdHb)
  {
    cBQ.cxL().coO().czu().t("worldChoice.overWorldReference", paramdHb);
  }

  public static void mouseExitOffWorld(cSx paramcSx)
  {
    cBQ.cxL().coO().czu().t("worldChoice.overWorldReference", null);
  }
}