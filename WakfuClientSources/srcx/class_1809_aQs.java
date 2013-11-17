public class aQs
{
  public static final String PACKAGE = "wakfu.removeGem";

  public static void openItemDetailWindow(cEv paramcEv, bpn parambpn)
  {
    openItemDetailWindow((gA)paramcEv.getItemValue());
  }

  public static void openItemDetailWindow(gA paramgA) {
    dLE.doY().a("itemDetail", paramgA, "removeGemDialog");
  }

  public static void inventoryDragItem(cSx paramcSx, dsj paramdsj, String paramString) {
    bzu localbzu = new bzu();
    localbzu.d(16846);
    localbzu.c(paramdsj.oj());
    localbzu.c(Boolean.valueOf(paramString).booleanValue());
    cjO.clE().j(localbzu);
  }

  public static void inventoryDropOutItem(cSx paramcSx, String paramString) {
    Pm.abk().i(Boolean.valueOf(paramString).booleanValue(), false);
  }

  public static void dropIngredient(Qa paramQa, String paramString) {
    Object localObject = paramQa.getValue();
    if ((localObject instanceof gA))
      a((gA)localObject, paramString);
  }

  public static void dropItem(Qa paramQa, String paramString)
  {
    Object localObject = paramQa.getValue();

    gA localgA = (gA)localObject;

    openItemDetailWindow(localgA);

    czW localczW = new czW();
    localczW.setItem(localgA);
    localczW.l((short)-1);
    localczW.c(Boolean.valueOf(paramString).booleanValue());
    localczW.d(16844);
    cjO.clE().j(localczW);
  }

  public static void itemDropOut(cTo paramcTo, String paramString) {
    a((gA)paramcTo.getValue(), paramString);
  }

  private static void a(gA paramgA, String paramString) {
    czW localczW = new czW();
    localczW.setItem(paramgA);
    localczW.l((short)1);
    localczW.c(Boolean.valueOf(paramString).booleanValue());
    localczW.d(16845);
    cjO.clE().j(localczW);
  }

  public static void removeIngredient(cEv paramcEv, String paramString) {
    a((gA)paramcEv.getItemValue(), paramString);
  }

  public static void addIngredient(cEv paramcEv, String paramString) {
    czW localczW = new czW();
    localczW.setItem((gA)paramcEv.getItemValue());
    localczW.l((short)1);
    localczW.c(Boolean.valueOf(paramString).booleanValue());
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