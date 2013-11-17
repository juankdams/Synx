import org.apache.log4j.Logger;

public class dfq extends jT
{
  private static final Logger K = Logger.getLogger(dfq.class);
  public static final String PACKAGE = "wakfu.buildingPanel";

  public static void evolveBuilding(cSx paramcSx)
  {
    evolveBuilding(paramcSx, (boU)dLE.doY().rv("selectedBuilding"));
  }

  public static void deleteBuilding(cSx paramcSx) {
    cKX localcKX = createDeleteMessageBox();
    localcKX.a(new dhR());
  }

  public static cKX createDeleteMessageBox()
  {
    String str = bU.fH().getString("question.havenWorldDeleteBuilding");
    NW localNW = new NW(102, 0, str, null, Cn.et(8), 24L);

    return cBQ.cxL().a(localNW);
  }

  public static void deleteBuilding(long paramLong) {
    clB localclB = new clB(paramLong);
    bvK localbvK = new bvK();
    localbvK.a(localclB);
    byv.bFN().aJK().d(localbvK);
  }

  public static void dropFrontManual(Qa paramQa) {
    if (!(paramQa.getValue() instanceof gA))
      return;
    aQw.bhd().aRK();
    gA localgA = (gA)paramQa.getValue();
    czW localczW = new czW();
    localczW.setItem(localgA);
    localczW.d(19366);
    cjO.clE().j(localczW);
  }

  public static void removeFrontManual(bvN parambvN) {
    bzu.cf((short)19367);
  }
}