public abstract class dKd
{
  private static dwN lWG;
  protected static aua lWH;

  public static dwN dji()
  {
    return lWG;
  }

  public static void d(dwN paramdwN) {
    lWG = paramdwN;
  }

  public void init()
  {
    if (lWG == null)
      return;
    lWG.dcb().clear();

    dLE.doY().t("flea", lWG);
    dLE.doY().t("fleaSelectedGood", null);
    dLE.doY().t("fleaTitle", bU.fH().getString("flea.of", new Object[] { lWG.bhX() }));

    cBQ.cxL().j("wakfu.flea", dHp.class);
  }

  public void clean()
  {
    if (lWG == null)
      return;
    lWG.c(null);

    dLE.doY().removeProperty("flea");
    dLE.doY().removeProperty("fleaSelectedGood");
    dLE.doY().removeProperty("currentItemQuantity");
    dLE.doY().removeProperty("currentItemTotalPrice");
    dLE.doY().removeProperty("currentItemFormatedTotalPrice");
    dLE.doY().removeProperty("fleaTitle");

    if (cBQ.cxL().mZ("confirmFleaPurchaseDialog")) {
      cBQ.cxL().mW("confirmFleaPurchaseDialog");
    }

    cBQ.cxL().mN("wakfu.flea");

    bVl.caZ().c(lWH);
  }

  public abstract void a(Object paramObject, dKc paramdKc);
}