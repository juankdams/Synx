import org.apache.log4j.Logger;

public class oh
{
  protected static final Logger K = Logger.getLogger(oh.class);
  public static final String PACKAGE = "wakfu.nationSelectionPanel";

  public static void chooseNation(cSx paramcSx, byd parambyd)
  {
    bzu localbzu = new bzu();
    localbzu.e(parambyd.bP());
    localbzu.d(19007);
    cjO.clE().j(localbzu);
  }

  public static void onMouseOverElement(cSx paramcSx, byd parambyd) {
    if (!(paramcSx instanceof dMr))
      return;
    if (byv.bFN().bFO().cJf().UI() != aYr.feh)
      return;
    dMr localdMr = (dMr)paramcSx;
    aNL localaNL = paramcSx.cIl();
    ccG localccG = (ccG)localaNL.getElementMap().fi("list");
    byd localbyd = (byd)dLE.doY().rv("selectedNation");
    if (localbyd != null) {
      axU localaxU = localccG.getRenderableByOffset(localccG.getSelectedOffsetByValue(localbyd));
      if ((localaxU.getScreenX() > localdMr.getScreenX()) || (localaxU.getScreenX() + localaxU.getWidth() < localdMr.getScreenX()) || (localaxU.getScreenY() > localdMr.getScreenY()) || (localaxU.getScreenY() + localaxU.getHeight() < localdMr.getScreenY()))
      {
        return;
      }
    }
    dLE.doY().t("selectedNation", parambyd);
  }

  public static void onMouseOutElement(cSx paramcSx) {
    if (!(paramcSx instanceof dMr))
      return;
    if (byv.bFN().bFO().cJf().UI() != aYr.feh)
      return;
    dMr localdMr = (dMr)paramcSx;
    aNL localaNL = paramcSx.cIl();
    ccG localccG = (ccG)localaNL.getElementMap().fi("list");
    byd localbyd = (byd)dLE.doY().rv("selectedNation");
    if (localbyd != null) {
      axU localaxU = localccG.getRenderableByOffset(localccG.getSelectedOffsetByValue(localbyd));
      if ((localaxU.getScreenX() <= localdMr.getScreenX()) && (localaxU.getScreenX() + localaxU.getWidth() >= localdMr.getScreenX()) && (localaxU.getScreenY() <= localdMr.getScreenY()) && (localaxU.getScreenY() + localaxU.getHeight() >= localdMr.getScreenY()))
      {
        return;
      }
    }
    dLE.doY().t("selectedNation", null);
  }
}