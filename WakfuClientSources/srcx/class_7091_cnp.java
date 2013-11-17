import com.ankamagames.wakfu.client.WakfuClientInstance;

public class cnp
{
  public static final String PACKAGE = "wakfu.recycle";

  public static void openItemDetailWindow(cEv paramcEv, bpn parambpn)
  {
    byA.openItemDetailWindow(paramcEv, parambpn);
  }

  public static void inventoryDragItem(cSx paramcSx, dsj paramdsj) {
    bzu localbzu = new bzu();
    localbzu.d(16846);
    localbzu.c(paramdsj.oj());
    cjO.clE().j(localbzu);
  }

  public static void inventoryDropOutItem(cSx paramcSx) {
    dhC.cQm().cS(false);
  }

  public static void dropIngredient(Qa paramQa) {
    Object localObject = paramQa.getValue();
    if ((localObject instanceof agi))
      a((agi)localObject);
  }

  public static void dropItem(Qa paramQa)
  {
    Object localObject = paramQa.getValue();
    if ((localObject instanceof agi)) {
      a((agi)localObject);
    }
    boolean bool1 = paramQa.eA();
    boolean bool2 = WakfuClientInstance.awy().awB().a(bmz.fEE);
    gA localgA = (gA)localObject;
    czW localczW;
    if ((localgA.nP() > 1) && (((bool1) && (!bool2)) || ((!bool1) && (bool2))))
    {
      aTs.setMaxQuantity(localgA.nP());
      aTs.setMessageType((short)16844);
      aTs.setItem(localgA);
      localczW = new czW();
      localczW.setItem(localgA);
      localczW.W((short)paramQa.getScreenX());
      localczW.X((short)paramQa.getScreenY());
      localczW.d(16821);
      cjO.clE().j(localczW);
    } else {
      localczW = new czW();
      localczW.setItem(localgA);
      localczW.l((short)-1);
      localczW.d(16844);
      cjO.clE().j(localczW);
    }
  }

  public static void itemDropOut(cTo paramcTo) {
    a((agi)paramcTo.getValue());
  }

  private static void a(agi paramagi) {
    a(paramagi, (short)-1);
  }

  private static void a(agi paramagi, short paramShort) {
    aoU localaoU = new aoU(paramagi);
    localaoU.ar(paramShort);
    cjO.clE().j(localaoU);
  }

  public static void removeIngredient(cEv paramcEv) {
    a((agi)paramcEv.getItemValue(), (short)1);
  }

  public static void addIngredient(cEv paramcEv) {
    czW localczW = new czW();
    localczW.setItem((gA)paramcEv.getItemValue());
    localczW.l((short)1);
    localczW.d(16844);
    cjO.clE().j(localczW);
  }

  public static void startCraft(cSx paramcSx, alP paramalP) {
    if (!dLE.doY().getBooleanProperty("craftRunning"))
      cjO.clE().j(new bKY(paramalP, (br)paramcSx.cIk()));
  }

  public static void changeItemBackground(dMr paramdMr, gA paramgA)
  {
    changeItemBackground(paramdMr, paramgA, null);
  }

  public static void changeItemBackground(dMr paramdMr) {
    String str = "";
    dOc localdOc = (dOc)paramdMr.cIl();

    if (paramdMr.mp() == CH.bGs)
      str = "itemSelectedBackground";
    else if (paramdMr.mp() == CH.bGt) {
      str = "itemBackground";
    }
    localdOc.setStyle(str);
  }

  public static void changeItemBackground(dMr paramdMr, gA paramgA, anG paramanG) {
    String str = "";
    dOc localdOc = (dOc)paramdMr.cIl();

    if (paramgA != null) {
      if (paramdMr.mp() == CH.bGs)
        str = "itemSelectedBackground";
      else if (paramdMr.mp() == CH.bGt) {
        if (dhC.cQm().cV(paramgA.oj()))
          str = "itemSetSelectedBackground";
        else {
          str = "itemBackground";
        }
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