public class cff
{
  public static final String PACKAGE = "wakfu.mergeGem";

  public static void openItemDetailWindow(cEv paramcEv, bpn parambpn)
  {
    openItemDetailWindow(paramcEv.getItemValue());
  }

  public static void openItemDetailWindow(Object paramObject) {
    dLE.doY().a("itemDetail", paramObject, avV.aIa().MK());
  }

  public static void inventoryDragItem(cSx paramcSx, dsj paramdsj, String paramString) {
    bzu localbzu = new bzu();
    localbzu.d(16846);
    localbzu.c(paramdsj.oj());
    localbzu.c(Boolean.valueOf(paramString).booleanValue());
    cjO.clE().j(localbzu);
  }

  public static void inventoryDropOutItem(cSx paramcSx, String paramString) {
    avV.aIa().cS(false);
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

  public static void startCraft(cSx paramcSx, alP paramalP, String paramString) {
    byte b = Byte.parseByte(paramString);
    if (!dLE.doY().getBooleanProperty("mergeGem.running")) {
      bKY localbKY = new bKY(paramalP, (br)paramcSx.cIk());
      localbKY.a(b);
      cjO.clE().j(localbKY);
    }
  }

  public static boolean setCurrentCraftNumber(cSx paramcSx, aTp paramaTp, String paramString) {
    byte b = Byte.parseByte(paramString);

    String str = paramaTp.getText();
    if (str.length() == 0) {
      return true;
    }
    int i = Integer.parseInt(str);
    bzu localbzu = new bzu();
    localbzu.e(i);
    localbzu.a(b);
    localbzu.d(16848);
    cjO.clE().j(localbzu);

    return true;
  }

  public static boolean setCurrentCraftMaxNumber(cSx paramcSx, String paramString) {
    byte b = Byte.parseByte(paramString);
    bzu localbzu = new bzu();
    localbzu.d(16849);
    localbzu.a(b);
    cjO.clE().j(localbzu);
    return true;
  }
}