public class cey
{
  public static final String PACKAGE = "wakfu.exchangeMachine";

  public static void selectExchange(dMr paramdMr, bpn parambpn, ayK paramayK)
  {
    if (!"exchangeBackground".equals(paramdMr.cIl().getId())) {
      return;
    }

    if (paramdMr.getButton() == 3) {
      a(paramdMr, paramayK, parambpn);
      return;
    }
  }

  private static void a(dMr paramdMr, ayK paramayK, bpn parambpn) {
    if (paramdMr.getButton() != 3) {
      return;
    }

    if (!byv.bFN().c(dGW.dhM())) {
      byv.bFN().a(dGW.dhM());
    }

    agi localagi = paramayK.aKP();
    if (localagi == null) {
      return;
    }
    bVw localbVw = localagi.Hu();

    gA localgA = gA.a(localbVw);
    localgA.b(localbVw);
    Object localObject;
    if (localgA.nI()) {
      localObject = new dkW(new ckV(localgA));
      ((ace)localObject).d(16430);
    } else {
      localObject = new cER();
      ((ace)localObject).a(localgA);
      ((ace)localObject).d(16415);
    }

    ((ace)localObject).setX(cyb.cvg().getX());
    dOc localdOc = (dOc)paramdMr.cIl();
    ((ace)localObject).setY(paramdMr.getScreenY() + localdOc.getHeight());
    cjO.clE().j((cWG)localObject);
  }

  public static void purchase(cSx paramcSx, ayK paramayK) {
    QV localQV = new QV();
    localQV.a(paramayK);
    cjO.clE().j(localQV);
  }

  public static void outExchange(cSx paramcSx, czv paramczv) {
    outExchange(paramcSx, paramczv, null);
  }

  public static void overExchange(cSx paramcSx, czv paramczv) {
    overExchange(paramcSx, paramczv, null);
  }

  public static void outExchange(cSx paramcSx, czv paramczv, dOc paramdOc) {
    paramczv.setDisplaySize(new Or(46, 46));
    if (paramdOc != null)
      paramdOc.setVisible(false);
  }

  public static void overExchange(cSx paramcSx, czv paramczv, dOc paramdOc)
  {
    paramczv.setDisplaySize(new Or(50, 50));
    if (paramdOc != null)
      paramdOc.setVisible(true);
  }
}