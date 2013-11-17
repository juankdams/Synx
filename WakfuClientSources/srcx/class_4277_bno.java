import com.ankamagames.wakfu.client.WakfuClientInstance;

public class bno
{
  public static final String PACKAGE = "wakfu.collectMachine";
  private static long aPe;

  public static void valid(cSx paramcSx, cZZ paramcZZ)
  {
    aie localaie = new aie(paramcZZ);
    localaie.d(19323);
    cjO.clE().j(localaie);
  }

  public static void setContentToMax(cSx paramcSx, cZZ paramcZZ) {
    aie localaie = new aie(paramcZZ);
    localaie.e(-1);
    localaie.d(19322);
    cjO.clE().j(localaie);
  }

  public static void keyType(cSx paramcSx, aTp paramaTp, cZZ paramcZZ) {
    String str = paramaTp.getText();
    if (str.length() == 0)
      return;
    int i = Integer.parseInt(str);
    aie localaie = new aie(paramcZZ);
    localaie.e(i);
    localaie.d(19322);
    cjO.clE().j(localaie);
  }

  public static void dropItem(Qa paramQa) {
    if (!(paramQa.getValue() instanceof gA))
      return;
    gA localgA = (gA)paramQa.getValue();

    if (byv.bFN().bFO().bGP().o(localgA) == null)
      return;
    byA.onDropItem();
    boolean bool1 = paramQa.eA();
    boolean bool2 = WakfuClientInstance.awy().awB().a(bmz.fEE);
    czW localczW;
    if ((localgA.nP() > 1) && (((bool1) && (!bool2)) || ((!bool1) && (bool2))))
    {
      aTs.setMaxQuantity(localgA.nP());
      aTs.setItem(localgA);
      aTs.setMessageType((short)19320);
      localczW = new czW();
      localczW.setItem(localgA);
      localczW.W((short)paramQa.getScreenX());
      localczW.X((short)paramQa.getScreenY());
      localczW.d(16821);
      cjO.clE().j(localczW);
    } else {
      localczW = new czW();
      localczW.c(localgA.oj());
      localczW.ar(localgA.nP());
      localczW.d(19320);
      cjO.clE().j(localczW);
    }
  }

  public static void dragItem(bvN parambvN) {
    gA localgA = (gA)parambvN.getValue();
    aPe = localgA.oj();
  }

  public static long getDraggedItemId() {
    return aPe;
  }

  public static void setDraggedItemId(long paramLong) {
    aPe = paramLong;
  }

  public static void giveKamas(dMr paramdMr) {
    moveKamas(paramdMr, true);
  }

  public static void takeKamas(dMr paramdMr) {
    moveKamas(paramdMr, false);
  }

  public static void moveKamas(dMr paramdMr, boolean paramBoolean) {
    if (paramdMr.getButton() == 1) {
      czW localczW = new czW();

      dOc localdOc = (dOc)cBQ.cxL().coO().nf("freeCollectMachineDialog").fi("localMoney");

      int i = 65;
      int j = 20;
      aTs.setMessageType((short)(paramBoolean ? 19324 : 19325));
      aTs.setMaxQuantity(paramBoolean ? byv.bFN().bFO().JE() : dqF.cXV().cXW().Qt());
      localczW.W((short)(localdOc.getScreenX() + i));
      localczW.X((short)(localdOc.getScreenY() + j));
      localczW.d(16821);
      cjO.clE().j(localczW);
    }
  }

  public static void onItemDoubleClick(cEv paramcEv) {
    gA localgA = (gA)paramcEv.getItemValue();
    aPe = localgA.oj();
    czW localczW = new czW();
    localczW.setItem(localgA);
    localczW.c(localgA.oj());
    localczW.l(localgA.nP());
    localczW.d(19321);
    localczW.setDestinationUniqueId(aTs.getDestinationUniqueId());
    localczW.cz(aTs.getDestinationPosition());
    cjO.clE().j(localczW);
  }

  public static void changeItemBackground(dMr paramdMr, gA paramgA, bpn parambpn, anG paramanG) {
    String str = "";
    dOc localdOc = (dOc)paramdMr.cIl();

    byz localbyz = byv.bFN().bFO();
    if (paramgA != null) {
      int i = 0;
      if (paramdMr.mp() == CH.bGs) {
        i = 1;
        if (paramgA.oi().bKk() != 0)
          str = "itemSetSelectedBackground";
        else
          str = "itemSelectedBackground";
      }
      else if (paramdMr.mp() == CH.bGt) {
        str = cQI.aH(paramgA);
      }
      localdOc.setStyle(str);
    }
    if (paramanG != null)
      if (paramdMr.mp() == CH.bGs)
        cDS.showPopup(paramdMr, paramgA, paramanG, localdOc);
      else
        cDS.closePopup(paramdMr);
  }
}