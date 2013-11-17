import org.apache.log4j.Logger;

public class agB
{
  protected static final Logger K = Logger.getLogger(agB.class);
  public static final String PACKAGE = "wakfu.temporaryInventory";
  private static dUd das;
  private static long cfv;

  public static void closeTemporaryInventory(cSx paramcSx)
  {
    if (paramcSx.mp() == CH.bGw)
    {
      bzu.cf((short)16431);
    }
  }

  public static void minimizeMaximizeDialog(dMr paramdMr, bpn parambpn)
  {
    if (paramdMr.mp() == CH.bGx) {
      dOc localdOc1 = (dOc)parambpn.getElementMap().fi("contentWindow");
      if (!localdOc1.getVisible())
        parambpn.setPrefSize(new Or(0, 0));
      else {
        parambpn.setPrefSize(new Or(0, localdOc1.getHeight()));
      }
      localdOc1.setVisible(!localdOc1.getVisible());
      dOc localdOc2 = (dOc)parambpn.getElementMap().fi("barCloseButton");
      localdOc2.setVisible(!localdOc2.getVisible());
    }
  }

  public static void showItemDetailPopup(cEv paramcEv, bpn parambpn)
  {
    Object localObject = paramcEv.getItemValue();
    cDS.showPopup((dBv)localObject, 500);
  }

  public static void dropOut(cTo paramcTo) {
    if ((paramcTo.getValue() instanceof gA)) {
      gA localgA = (gA)paramcTo.getValue();
      if (bsP.getInstance().getWidget(paramcTo.getScreenX(), paramcTo.getScreenY()) == bsP.getInstance())
      {
        Object localObject;
        if ((localgA.or()) || ((localgA.oi().a(Aq.bvR) != null) && (!localgA.oi().a(Aq.bvR).i(byv.bFN().bFO(), byv.bFN().bFO().ML(), localgA, byv.bFN().bFO().bEY()))))
        {
          localObject = new aEe(bU.fH().getString("item.unDroppable", new Object[] { Short.valueOf(localgA.nP()), localgA.getName() }));
          ((aEe)localObject).mm(3);
          CM.LV().a((aEe)localObject);
          return;
        }

        if (localgA.oj() == cfv)
          if ((paramcTo.eA()) && (localgA.nP() > 1)) {
            aTs.setMaxQuantity(localgA.nP());
            aTs.setItem(localgA);
            aTs.setMessageType((short)16825);
            localObject = new czW();
            ((czW)localObject).setItem(localgA);
            ((czW)localObject).W((short)paramcTo.getScreenX());
            ((czW)localObject).X((short)paramcTo.getScreenY());
            ((czW)localObject).d(16821);
            cjO.clE().j((cWG)localObject);
          } else {
            localObject = new czW();
            ((czW)localObject).setItem(localgA);
            ((czW)localObject).l(localgA.nP());
            ((czW)localObject).d(16825);

            ((czW)localObject).setDestinationUniqueId(-1L);
            cjO.clE().j((cWG)localObject);
          }
      }
    }
  }

  public static void dragItem(bvN parambvN)
  {
    if (cBQ.cxL().mZ("splitStackDialog")) {
      cBQ.cxL().mW("splitStackDialog");
    }

    if ((parambvN.sq() instanceof gA)) {
      gA localgA = (gA)parambvN.sq();
      cfv = localgA.oj();
      dLE.doY().t("temporaryInventory.currentDragItemId", Long.valueOf(localgA.oj()));
    }
  }

  public static void onItemDoubleClick(cEv paramcEv)
  {
    if (cBQ.cxL().mZ("splitStackDialog")) {
      cBQ.cxL().mW("splitStackDialog");
    }
    gA localgA = (gA)paramcEv.getItemValue();

    czW localczW = new czW();
    localczW.d(16825);
    localczW.setItem(localgA);
    localczW.l(localgA.nP());
    bMD localbMD = byv.bFN().bFO().bGP();

    cRs localcRs = localbMD.ar(localgA);
    byte b = (byte)(localcRs == null ? -1 : localcRs.aN(localcRs.yT(localgA.ok())));
    if (localcRs == null) {
      localcRs = localbMD.ao(localgA);
      if (localcRs != null)
        b = (byte)localcRs.bQI();
    }
    if (localcRs == null) {
      return;
    }
    cfv = localgA.oj();
    dLE.doY().t("temporaryInventory.currentDragItemId", Long.valueOf(localgA.oj()));
    localczW.setDestinationUniqueId(localcRs.EN());
    localczW.cz(b);
    cjO.clE().j(localczW);
  }
}