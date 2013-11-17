import com.ankamagames.wakfu.client.WakfuClientInstance;
import org.apache.log4j.Logger;

public class lj
{
  protected static final Logger K = Logger.getLogger(lj.class);
  public static final String PACKAGE = "wakfu.havenWorldResourcesCollector";
  private static long aPe = -1L;

  public static void closeWindow(cSx paramcSx) {
    if (!aOy.bfr().bfs().isEmpty()) {
      String str = bU.fH().getString("question.havenWorldResourcesCollectorClose");
      NW localNW = new NW(102, 0, str, null, Cn.et(8), 24L);

      cKX localcKX = cBQ.cxL().a(localNW);
      localcKX.a(new cHk());
    }
    else
    {
      sG();
    }
  }

  private static void sG() {
    cBQ.cxL().mW("havenWorldResourcesCollectorDialog");
  }

  public static void validCollect(cSx paramcSx) {
    bzu.cf((short)19363);
  }

  public static void removeItem(cSx paramcSx) {
    if (((paramcSx instanceof cTo)) && ((((cTo)paramcSx).getValue() instanceof cGm)))
      removeItem((cGm)((cTo)paramcSx).getValue());
  }

  public static void onItemDoubleClick(cEv paramcEv)
  {
    if (!(paramcEv.getItemValue() instanceof cGm))
      return;
    removeItem((cGm)paramcEv.getItemValue());
  }

  public static void removeItem(cGm paramcGm) {
    dGe localdGe = new dGe(paramcGm);
    localdGe.d(19365);
    cjO.clE().j(localdGe);
  }

  public static void dropItem(Qa paramQa) {
    if (!(paramQa.getValue() instanceof gA)) {
      return;
    }
    gA localgA = (gA)paramQa.getValue();

    int i = byv.bFN().bFO().bGP().o(localgA) != null ? 1 : 0;
    if (i == 0) {
      return;
    }
    byA.onDropItem();
    boolean bool1 = paramQa.eA();
    boolean bool2 = WakfuClientInstance.awy().awB().a(bmz.fEE);

    int j = 19364;
    czW localczW;
    if ((localgA.nP() > 1) && (((bool1) && (!bool2)) || ((!bool1) && (bool2))))
    {
      aTs.setMaxQuantity(localgA.nP());
      aTs.setItem(localgA);
      aTs.setMessageType((short)19364);
      localczW = new czW();
      localczW.setItem(localgA);
      localczW.W((short)paramQa.getScreenX());
      localczW.X((short)paramQa.getScreenY());
      localczW.d(16821);
      cjO.clE().j(localczW);
    } else {
      localczW = new czW();
      localczW.c(localgA.oj());
      localczW.l(localgA.nP());
      localczW.d(19364);
      cjO.clE().j(localczW);
    }
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
        str = "itemBackground";
      }
      localdOc.setStyle(str);
    }
    if (paramanG != null)
      if (paramdMr.mp() == CH.bGs)
        cDS.showPopup(paramdMr, paramgA, paramanG, localdOc);
      else
        cDS.closePopup(paramdMr);
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