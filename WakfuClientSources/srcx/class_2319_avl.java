public class avl
{
  public static final String PACKAGE = "wakfu.equipableDummy";
  private static long aPe = -1L;

  public static void equipItem(gA paramgA) {
    czW localczW = new czW();
    localczW.setItem(paramgA);
    localczW.d(19314);
    cjO.clE().j(localczW);
  }

  public static void unequipItem(int paramInt) {
    czW localczW = new czW();
    localczW.e(paramInt);
    localczW.d(19315);
    cjO.clE().j(localczW);
  }

  public static void unequip(cEv paramcEv) {
    gA localgA = (gA)paramcEv.getItemValue();
    unequipItem(localgA.ok());
  }

  public static void dropItem(Qa paramQa) {
    if (!(paramQa.getValue() instanceof gA))
      return;
    gA localgA = (gA)paramQa.getValue();

    if (byv.bFN().bFO().bGP().o(localgA) == null) {
      return;
    }
    byA.onDropItem();

    equipItem(localgA);
  }

  public static void dragItem(bvN parambvN)
  {
    gA localgA = (gA)parambvN.getValue();
    aPe = localgA.oj();
  }

  public static long getDraggedItemId() {
    return aPe;
  }

  public static void setDraggedItemId(long paramLong) {
    aPe = paramLong;
  }
}