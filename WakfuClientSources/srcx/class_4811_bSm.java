import org.apache.log4j.Logger;

public class bSm
  implements cvW
{
  protected static final Logger K = Logger.getLogger(bSm.class);

  private static bSm hcS = new bSm();
  private bpp hcT;
  private bnm N;

  public static bSm bZg()
  {
    return hcS;
  }

  public boolean a(cWG paramcWG)
  {
    switch (paramcWG.getId()) {
    case 19362:
      String str = bU.fH().getString("question.havenWorldBidConfirm", new Object[] { Integer.valueOf(this.hcT.byK()) });
      NW localNW = new NW(102, 0, str, null, Cn.et(8), 24L);

      cKX localcKX = cBQ.cxL().a(localNW);
      localcKX.a(new bcs(this));

      return false;
    }

    return true;
  }

  public long getId() {
    return 0L;
  }

  public void a(long paramLong)
  {
  }

  public void a(aqv paramaqv, boolean paramBoolean) {
    if (!paramBoolean) {
      if (this.hcT == null) {
        K.error("AuctionView null on ne peut pas afficher le panneau d'achat !");
        return;
      }
      bpp[] arrayOfbpp = { this.hcT };
      dLE.doY().t("havenWorldAuctionList", arrayOfbpp);
      dLE.doY().t("havenWorldAuction", this.hcT);

      this.N = new bct(this);

      cBQ.cxL().a(this.N);

      cBQ.cxL().a("havenWorldBidDialog", VV.dJ("havenWorldBidDialog"), 256L, (short)10000);

      cBQ.cxL().j("wakfu.havenWorldBid", dwJ.class);

      byv.bFN().a(bcC.fmO);
    }
  }

  public void b(aqv paramaqv, boolean paramBoolean) {
    if (!paramBoolean)
    {
      dLE.doY().removeProperty("havenWorldAuction");
      dLE.doY().removeProperty("havenWorldAuctionList");

      cBQ.cxL().b(this.N);

      cBQ.cxL().mW("havenWorldBidDialog");

      cBQ.cxL().mN("wakfu.havenWorldBid");

      byv.bFN().b(bcC.fmO);
    }
  }

  public void a(bpp parambpp) {
    this.hcT = parambpp;
  }

  public void a(long paramLong, String paramString, int paramInt) {
    this.hcT.eC(paramLong);
    this.hcT.ix(paramString);
    this.hcT.qz(paramInt);
    dLE.doY().a(this.hcT, new String[] { "currentBid", "nextBid", "guildName", "hasRightToBid" });
  }
}