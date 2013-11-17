public class dHD extends cNB
{
  public static final String PACKAGE = "wakfu.stuffPreview";
  private static long aPe = -1L;

  public static void equipItem(gA paramgA, String paramString) {
    czW localczW = new czW();
    localczW.setItem(paramgA);
    localczW.a(Byte.valueOf(paramString).byteValue());
    localczW.d(19368);
    cjO.clE().j(localczW);
  }

  public static void unequipItem(byte paramByte) {
    czW localczW = new czW();
    localczW.a(paramByte);
    localczW.d(19369);
    cjO.clE().j(localczW);
    setDraggedItemId(-1L);
  }

  public static void unequip(cEv paramcEv, String paramString) {
    unequipItem(Byte.parseByte(paramString));
  }

  public static void itemDropOut(cTo paramcTo, String paramString) {
    unequipItem(Byte.parseByte(paramString));
  }

  public static void equipmentDropItem(Qa paramQa, String paramString) {
    if (!(paramQa.getValue() instanceof gA))
      return;
    gA localgA = (gA)paramQa.getValue();

    byA.onDropItem();

    equipItem(localgA, paramString);
  }

  public static void dragItem(bvN parambvN) {
    gA localgA = (gA)parambvN.getValue();
    setDraggedItemId(localgA.ok());
  }

  public static long getDraggedItemId() {
    return aPe;
  }

  public static void setDraggedItemId(long paramLong) {
    aPe = paramLong;
  }

  public static void changeItemBackground(dMr paramdMr, String paramString, bpn parambpn) {
    changeItemBackground(paramdMr, null, null, paramString, parambpn, null);
  }

  public static void changeItemBackground(dMr paramdMr, dBv paramdBv, gA paramgA, String paramString, bpn parambpn, anG paramanG)
  {
    String str = "";
    dOc localdOc = (dOc)paramdMr.cIl();

    if ((aYP.feK.bnR() != null) && ((dLE.doY().rv("exchange.sourceBag") instanceof bCJ)))
    {
      return;
    }

    if (paramString != null) {
      paramgA = csf.ibS.cqD().aO(Byte.parseByte(paramString));
    }
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
        str = cQI.c(paramgA, localdOc.getElementMap().getId());
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