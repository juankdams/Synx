import org.apache.log4j.Logger;

public class bvY
  implements cvW
{
  private static final bvY ggH = new bvY();
  protected static final Logger K = Logger.getLogger(bvY.class);
  private bnm N;

  public static bvY bDM()
  {
    return ggH;
  }

  public boolean a(cWG paramcWG)
  {
    return true;
  }

  public void a(aqv paramaqv, boolean paramBoolean) {
    if (!paramBoolean)
    {
      this.N = new bdr(this);

      dPS localdPS = new dPS();
      localdPS.a(new bdu(this));

      dLE.doY().t("webShop", localdPS);

      cBQ.cxL().a(this.N);

      cBQ.cxL().a("webShopDialog", VV.dJ("webShopDialog"), 32768L, (short)10000);

      cBQ.cxL().j("wakfu.webShop", gt.class);
    }
  }

  public void b(aqv paramaqv, boolean paramBoolean) {
    if (!paramBoolean) {
      cBQ.cxL().b(this.N);

      cBQ.cxL().mW("webShopDialog");
      cBQ.cxL().mW("webShopArticleDialog");

      cBQ.cxL().mN("wakfu.webShop");

      dLE.doY().removeProperty("webShop");

      aiw localaiw = new aiw();
      localaiw.setLocale(bU.fH().ajJ().cAZ());
      byv.bFN().aJK().d(localaiw);

      dcy.kVz.clear();
    }
  }

  public long getId() {
    return 0L;
  }

  public void a(long paramLong)
  {
  }
}