import com.ankamagames.wakfu.client.WakfuClientInstance;

public class eS
{
  public static final String PACKAGE = "wakfu.craftTable";

  public static void openItemDetailWindow(cEv paramcEv, bpn parambpn)
  {
    byA.openItemDetailWindow(paramcEv, parambpn);
  }

  public static void inventoryDragItem(cSx paramcSx, gA paramgA) {
    aRr localaRr = new aRr(paramgA.ok());
    cjO.clE().j(localaRr);
  }

  public static void inventoryDropOutItem(cSx paramcSx) {
    duO.dax().cS(false);
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

  public static void selectRecipe(dMr paramdMr, bpn parambpn, cfm paramcfm)
  {
    if (!"recipeBackground".equals(paramdMr.cIl().getId())) {
      return;
    }

    if (paramdMr.getButton() == 3) {
      Rn.openProducedItemDescription(paramdMr, paramcfm, parambpn);
      return;
    }
    aKh localaKh = new aKh(paramcfm);
    cjO.clE().j(localaKh);
  }

  public static void startCraft(dMr paramdMr, alP paramalP) {
    boolean bool = dLE.doY().getBooleanProperty("craftRunning");
    if (paramdMr.getButton() != 1) {
      br localbr = (br)paramdMr.cIl();
      localbr.setSelected(bool);
      return;
    }
    if (bool)
      bzu.cf((short)16850);
    else
      cjO.clE().j(new bKY(paramalP, (br)paramdMr.cIk()));
  }

  public static boolean setCurrentCraftNumber(cSx paramcSx, aTp paramaTp)
  {
    String str = paramaTp.getText();
    if (str.length() == 0) {
      return true;
    }
    int i = Integer.parseInt(str);
    bzu localbzu = new bzu();
    localbzu.e(i);
    localbzu.d(16848);
    cjO.clE().j(localbzu);

    return true;
  }

  public static boolean setCurrentCraftMaxNumber(cSx paramcSx) {
    bzu.cf((short)16849);
    return true;
  }

  public static void changeItemBackground(dMr paramdMr, gA paramgA) {
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
        if (((bVw)paramgA.oi()).cbi())
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