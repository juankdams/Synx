public class jT
{
  public static final String PACKAGE = "wakfu.havenWorld";

  public static void evolveBuilding(cSx paramcSx)
  {
    evolveBuilding(paramcSx, (boU)dLE.doY().rv("selectedBuilding"));
  }

  public static void evolveBuilding(cSx paramcSx, boU paramboU) {
    cUh localcUh1 = paramboU.byD().bdb();
    dAi localdAi = ars.dzL.aN(localcUh1.nc());
    if (localdAi != null) {
      cUh localcUh2 = ars.dzL.aM(localdAi.ddx());
      bOB localbOB = ars.dzL.aO(localcUh2.bVJ());
      cyo localcyo = new cyo(paramboU.oj(), localcUh1, localbOB, bZv.cdR().uj());
      dLE.doY().t("buildingEvolution", localcyo);
      loadEvolveBuildingDialog(paramcSx);
    }
  }

  public static void loadEvolveBuildingDialog(cSx paramcSx) {
    cBQ.cxL().a("buildingEvolutionDialog", VV.dJ("buildingEvolutionDialog"), 256L, (short)10005);
  }

  public static void payEvolution(cSx paramcSx)
  {
    dKc localdKc = byv.bFN().bFO().bSe();
    if (!(localdKc instanceof bXu)) {
      return;
    }

    cyo localcyo = (cyo)dLE.doY().rv("buildingEvolution");
    if (localcyo == null) {
      return;
    }

    long l = localcyo.cvs();
    bvK localbvK = new bvK();

    azN localazN = new azN(l);
    localbvK.a(localazN);

    byv.bFN().aJK().d(localbvK);
    if (byv.bFN().c(aQw.bhd()))
      byv.bFN().b(aQw.bhd());
    else
      cBQ.cxL().mW("buildingEvolutionDialog");
  }
}