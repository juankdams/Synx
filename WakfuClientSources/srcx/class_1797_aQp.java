import org.apache.log4j.Logger;

public class aQp
{
  protected static final Logger K = Logger.getLogger(aQp.class);
  public static final String PACKAGE = "wakfu.havenWorldPanel";

  public static void toggleOpenBuildingList(cSx paramcSx)
  {
    cYG localcYG = (cYG)dLE.doY().rv("havenWorld");
    localcYG.iQ(!localcYG.cLW());
  }

  public static void toggleOpenEvolutingBuildingList(cSx paramcSx) {
    cYG localcYG = (cYG)dLE.doY().rv("havenWorld");
    localcYG.iR(!localcYG.cLX());
  }

  public static void onMouseOverElement(cSx paramcSx, boU paramboU, anG paramanG) {
    ayw.popup(paramcSx, paramanG);
    dOc localdOc = (dOc)paramcSx.cIl();
    localdOc.getAppearance().setModulationColor(clP.hOw);
    dLE.doY().t("havenWorldOverCatalogEntry", paramboU.ri());
  }

  public static void onMouseOutElement(cSx paramcSx, boU paramboU, anG paramanG) {
    ayw.closePopup(paramcSx, paramanG);
    dOc localdOc = (dOc)paramcSx.cIl();
    if (paramboU.equals(dLE.doY().rv("havenWorldSelectedCatalogEntry")))
      localdOc.getAppearance().setModulationColor(clP.hOw);
    else {
      localdOc.getAppearance().setModulationColor(bNa.gRx);
    }
    dLE.doY().t("havenWorldOverCatalogEntry", null);
  }
}