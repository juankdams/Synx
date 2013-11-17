import com.ankamagames.wakfu.client.WakfuClientInstance;

public class cCM
{
  public static final String PACKAGE = "wakfu.storageBox";
  private static long aPe;
  private static czv fyP;

  public static void selectCompartment(cSx paramcSx, Lh paramLh)
  {
    bzu localbzu = new bzu();
    localbzu.d(19328);
    localbzu.a(paramLh.VH());
    cjO.clE().j(localbzu);
  }

  public static void unlockCompartment(cSx paramcSx) {
    bzu.cf((short)19330);
  }

  public static void dropItem(Qa paramQa) {
    if (!(paramQa.getValue() instanceof gA)) {
      return;
    }
    gA localgA = (gA)paramQa.getValue();

    boolean bool1 = Nj.Xh().Xi().bdX().j(localgA);
    int i = byv.bFN().bFO().bGP().o(localgA) != null ? 1 : 0;
    if ((i == 0) && (!bool1)) {
      return;
    }
    byA.onDropItem();
    boolean bool2 = paramQa.eA();
    boolean bool3 = WakfuClientInstance.awy().awB().a(bmz.fEE);

    axU localaxU = paramQa.abO().getRenderableParent();
    byte b = (byte)localaxU.getCollection().getTableIndex(localaxU);

    int j = localgA.oj() == aPe ? 1 : 0;
    short s;
    if (j != 0)
      s = 19329;
    else
      s = 19326;
    czW localczW;
    if ((j == 0) && (localgA.nP() > 1) && (((bool2) && (!bool3)) || ((!bool2) && (bool3))))
    {
      aTs.setMaxQuantity(localgA.nP());
      aTs.setItem(localgA);
      aTs.setMessageType(s);
      aTs.setDestinationPosition(Byte.valueOf(b));
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
      localczW.cz(b);
      localczW.d(s);
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

  public static void onMouseOverFilter(cEv paramcEv) {
    if (paramcEv.getItemValue().equals(Nj.Xh().Xi().bdX())) {
      return;
    }
    fyP = (czv)((axU)paramcEv.cIk()).getInnerElementMap().fi("image");
    ((cwP)fyP.getLayoutData()).setYOffset(-1);
    fyP.getContainer().cfM();
  }

  public static void onMouseOutFilter(cEv paramcEv) {
    if (fyP == null) {
      return;
    }
    ((cwP)fyP.getLayoutData()).setYOffset(-3);
    fyP.getContainer().cfM();
    fyP = null;
  }

  public static void seeItemDetails(cSx paramcSx) {
    bVw localbVw = ((afa)Nj.Xh().Xi().bdX()).aqC();
    eX.sendOpenCloseItemDetailMessage("storageBoxDialog", localbVw);
  }

  public static void onItemDoubleClick(cEv paramcEv) {
    gA localgA = (gA)paramcEv.getItemValue();
    czW localczW = new czW();
    localczW.d(19327);
    localczW.setItem(localgA);
    localczW.l(localgA.nP());
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

  public static void showItemDetails(cEv paramcEv)
  {
    if (paramcEv.getButton() != 3) {
      return;
    }
    if ((paramcEv.getItemValue() instanceof bCL)) {
      gA localgA = ((bCL)paramcEv.getItemValue()).getItem();
      eX.sendOpenCloseItemDetailMessage("storageBoxDialog", localgA);
    } else {
      eX.sendOpenCloseItemDetailMessage("storageBoxDialog", (gA)paramcEv.getItemValue());
    }
  }

  public static void depositMoney(cSx paramcSx, duS paramduS)
  {
    int i = bUD.aR(paramduS.getText());
    paramduS.setText("");
    bzu localbzu = new bzu();
    localbzu.d(19331);
    localbzu.e(i);
    cjO.clE().j(localbzu);
  }

  public static void withdrawMoney(cSx paramcSx, duS paramduS) {
    int i = bUD.aR(paramduS.getText());
    paramduS.setText("");
    bzu localbzu = new bzu();
    localbzu.d(19332);
    localbzu.e(i);
    cjO.clE().j(localbzu);
  }
}