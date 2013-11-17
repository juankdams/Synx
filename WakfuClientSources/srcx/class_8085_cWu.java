public class cWu
{
  public static final String PACKAGE = "wakfu.bookcase";
  private static long aPe = -1L;

  public static void swapPosition(byte paramByte1, byte paramByte2) {
    bzu localbzu = new bzu();
    localbzu.d(19318);
    localbzu.a(paramByte1);
    localbzu.ar((short)paramByte2);
    cjO.clE().j(localbzu);
  }

  public static void displayBook(cEv paramcEv) {
    gA localgA = (gA)paramcEv.getItemValue();
    czW localczW = new czW();
    localczW.setItem(localgA);
    localczW.d(19319);
    cjO.clE().j(localczW);
  }

  public static void addBook(gA paramgA, short paramShort) {
    czW localczW = new czW();
    localczW.setItem(paramgA);
    localczW.ar(paramShort);
    localczW.d(19316);
    cjO.clE().j(localczW);
  }

  public static void removeBook(short paramShort) {
    czW localczW = new czW();
    localczW.ar(paramShort);
    localczW.d(19317);
    cjO.clE().j(localczW);
  }

  public static void removeBook(cEv paramcEv) {
    axU localaxU = (axU)paramcEv.cIl();
    short s = (short)localaxU.getCollection().getTableIndex(localaxU);

    removeBook(s);
  }

  public static void dropItem(Qa paramQa, aGP paramaGP) {
    if (!(paramQa.getValue() instanceof gA))
      return;
    gA localgA = (gA)paramQa.getValue();
    axU localaxU1;
    int i;
    if (byv.bFN().bFO().bGP().o(localgA) != null) {
      byA.onDropItem();

      localaxU1 = paramQa.abO().getRenderableParent();
      i = (short)localaxU1.getCollection().getTableIndex(localaxU1);

      addBook(localgA, i);
    } else if (paramaGP.aSS().aQC().j(localgA))
    {
      localaxU1 = paramQa.abO().getRenderableParent();
      i = (byte)localaxU1.getCollection().getTableIndex(localaxU1);
      axU localaxU2 = paramQa.abN().getRenderableParent();
      byte b = (byte)localaxU2.getCollection().getTableIndex(localaxU2);

      swapPosition(i, b);
    }
  }

  public static void dragItem(bvN parambvN, aGP paramaGP)
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