import com.ankamagames.wakfu.client.WakfuClientInstance;
import org.apache.log4j.Logger;

public class bSy extends jT
{
  private static final Logger K = Logger.getLogger(bSy.class);
  public static final String PACKAGE = "wakfu.seedSpreader";
  private static cGm hdr;

  public static void dropSeed(Qa paramQa)
  {
    if (!(paramQa.getValue() instanceof gA))
      return;
    aFx.aRI().aRK();
    gA localgA = (gA)paramQa.getValue();

    int i = byv.bFN().bFO().bGP().o(localgA) != null ? 1 : 0;
    if (i == 0) {
      return;
    }
    byA.onDropItem();
    boolean bool1 = paramQa.eA();
    boolean bool2 = WakfuClientInstance.awy().awB().a(bmz.fEE);

    int j = 19342;
    czW localczW;
    if ((localgA.nP() > 1) && (((bool1) && (!bool2)) || ((!bool1) && (bool2))))
    {
      aTs.setMaxQuantity(localgA.nP());
      aTs.setItem(localgA);
      aTs.setMessageType((short)19342);
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
      localczW.d(19342);
      cjO.clE().j(localczW);
    }
  }

  public static cGm getDraggedItem() {
    return hdr;
  }

  public static void setDraggedItem(cGm paramcGm) {
    hdr = paramcGm;
  }

  public static void removeSeed(bvN parambvN) {
    hdr = (cGm)parambvN.getValue();
    bzu.cf((short)19343);
  }

  public static void closeWindow(cSx paramcSx) {
    if (aFx.aRI().aRL()) {
      String str = bU.fH().getString("question.seedSpreaderClose");
      NW localNW = new NW(102, 0, str, null, Cn.et(8), 24L);

      cKX localcKX = cBQ.cxL().a(localNW);
      localcKX.a(new cUu());
    }
    else
    {
      sG();
    }
  }

  private static void sG() {
    cBQ.cxL().mW("seedSpreaderDialog");
  }

  public static void valid(cSx paramcSx) {
    bzu.cf((short)19344);
  }
}