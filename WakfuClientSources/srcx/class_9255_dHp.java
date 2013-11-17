import java.text.DecimalFormat;
import java.text.NumberFormat;
import org.apache.log4j.Logger;

public class dHp
{
  private static final Logger K = Logger.getLogger(dHp.class);
  public static final String PACKAGE = "wakfu.flea";
  private static BG lSs;
  private static short ivA;
  private static int kxm;
  private static dUd das;
  public static String lSt = "fleaControlGroup";

  public static void selectItem(cEv paramcEv, bpn parambpn) {
    if ((paramcEv.getItemValue() != null) && ((paramcEv.getItemValue() instanceof BG)) && 
      (paramcEv.getButton() == 3))
      eX.openItemDetailWindow(paramcEv, parambpn);
  }

  public static void purchaseItem(cSx paramcSx, BG paramBG, bpn parambpn)
  {
    if (!dKd.dji().dcb().isLocked())
      if ((lSs == paramBG) && (cBQ.cxL().mZ("confirmFleaPurchaseDialog"))) {
        cBQ.cxL().mW("confirmFleaPurchaseDialog");
      } else {
        lSs = paramBG;
        ivA = 1;
        kxm = lSs.Hv();

        dLE.doY().t("fleaSelectedGood", lSs);
        dLE.doY().t("currentItemQuantity", Short.valueOf(ivA));
        dLE.doY().t("currentItemTotalPrice", Integer.valueOf(kxm));
        dLE.doY().t("currentItemFormatedTotalPrice", DecimalFormat.getIntegerInstance().format(kxm) + " §");

        dLE.doY().t("currentItemStackQtyPlusTotal", aPU.c(lSs.Hy()) + " = " + ivA * lSs.Hy().goO);

        String str = parambpn.getElementMap().getId();
        bpn localbpn = (bpn)cBQ.cxL().a("confirmFleaPurchaseDialog", VV.dJ("confirmFleaPurchaseDialog"), str, str, lSt, 145L, (short)10000);
      }
  }

  public static void cancelPurchase(cSx paramcSx)
  {
    cBQ.cxL().mW("confirmFleaPurchaseDialog");
  }

  public static void confirmPurchase(cSx paramcSx) {
    bbo localbbo = dLE.doY().getProperty("fleaSelectedGood");
    if (localbbo != null) {
      BG localBG = (BG)localbbo.getValue();
      Object localObject;
      if (byv.bFN().c(dtN.cZR()))
      {
        localObject = new yh();
        ((yh)localObject).aW(localBG.oj());
        ((yh)localObject).l(ivA);
        byv.bFN().aJK().d((cWG)localObject);
      } else {
        localObject = new anJ();
        ((anJ)localObject).aW(localBG.oj());
        ((anJ)localObject).l(ivA);
        byv.bFN().aJK().d((cWG)localObject);
      }
      cBQ.cxL().M("confirmFleaPurchaseDialog", false);
    }
  }

  public static void confirmOutsidePurchase(cSx paramcSx) {
    bbo localbbo = dLE.doY().getProperty("fleaSelectedGood");
    if (localbbo != null) {
      BG localBG = (BG)localbbo.getValue();

      cBQ.cxL().M("confirmFleaPurchaseDialog", false);
    }
  }

  public static void decreaseQuantity(cSx paramcSx) {
    if (ivA > 1) {
      ivA = (short)(ivA - 1);
      applyQuantity();
    }
  }

  public static void increaseQuantity(cSx paramcSx) {
    if (ivA * lSs.Hy().goO < lSs.nP()) {
      long l = (ivA + 1) * lSs.Hv();
      if (l > 2147483647L) {
        return;
      }
      ivA = (short)(ivA + 1);
      applyQuantity();
    }
  }

  public static void validQuantity(cSx paramcSx, aTp paramaTp) {
    short s = bUD.getShort(paramaTp.getText());
    int i = s * lSs.Hy().goO;
    if (s < 1)
      s = 1;
    else if (i > lSs.nP()) {
      s = (short)(lSs.nP() / lSs.Hy().goO);
    }

    ivA = s;
    applyQuantity();
  }

  public static void setQuantity(cSx paramcSx)
  {
    if ((paramcSx instanceof bXo)) {
      short s = (short)(int)((bXo)paramcSx).getValue();
      long l = s * lSs.Hv();
      if (l > 2147483647L) {
        return;
      }
      ivA = s;
      applyQuantity();
    }
  }

  public static void applyQuantity() {
    kxm = ivA * lSs.Hv();
    dLE.doY().t("currentItemQuantity", Short.valueOf(ivA));
    dLE.doY().t("currentItemTotalPrice", Integer.valueOf(kxm));
    dLE.doY().t("currentItemFormatedTotalPrice", DecimalFormat.getIntegerInstance().format(kxm) + " §");
    dLE.doY().t("currentItemStackQtyPlusTotal", aPU.c(lSs.Hy()) + " = " + ivA * lSs.Hy().goO);
  }

  public static void showItemDetailPopup(cEv paramcEv, bpn parambpn)
  {
    Object localObject = paramcEv.getItemValue();
    if (!(localObject instanceof BG)) {
      return;
    }
    if (paramcEv.mp() == CH.bGg) {
      anG localanG = (anG)parambpn.getElementMap().fi("itemDetailPopup");
      dLE.doY().t("itemPopupDetail", paramcEv.getItemValue());
      ayw.popup(paramcEv, localanG);
    } else if (paramcEv.mp() == CH.bGf) {
      ayw.closePopup(paramcEv);
    }
  }

  public static void selectFleaToBrowse(cEv paramcEv)
  {
    dag localdag = (dag)paramcEv.getItemValue();
    dtN.cZR().cZT();
    Cs localCs = dtN.cZR().kk(localdag.EN());
    if (localCs == null)
      return;
    if ((localdag.isLocked()) || (((Byte)localCs.getFirst()).byteValue() <= 0)) {
      return;
    }

    bn localbn = new bn();
    localbn.h(localdag.EN());
    byv.bFN().aJK().d(localbn);

    dtN.cZR().b(localdag);
  }
}