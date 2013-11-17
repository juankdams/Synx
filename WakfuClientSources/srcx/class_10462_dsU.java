import org.apache.log4j.Logger;

public class dsU
  implements cvW
{
  private static dsU lvh = new dsU();
  protected static Logger K = Logger.getLogger(dsU.class);

  public static dsU cZd()
  {
    return lvh;
  }

  public void ko(boolean paramBoolean) {
    aig.dej.o("giftLock", paramBoolean);
  }

  public boolean a(cWG paramcWG)
  {
    Object localObject;
    switch (paramcWG.getId()) {
    case 16623:
      localObject = (cYY)paramcWG;
      gD.oL().a(((cYY)localObject).cDY());
      return false;
    case 16622:
      localObject = (bei)paramcWG;
      ddO localddO = ((bei)localObject).brY();
      boolean bool = ((bei)localObject).getBooleanValue();
      gD.oL().a(localddO, bool);
      ko(false);
      dp localdp = new dp();
      localdp.F(localddO.aSq());
      byv.bFN().aJK().d(localdp);
      return false;
    case 16620:
      if (cBQ.cxL().mZ("playerGiftDialog")) {
        cBQ.cxL().mW("playerGiftDialog");
        aig.dej.ew("giftLock");
      } else {
        aig.dej.ev("giftLock");
        cBQ.cxL().a("playerGiftDialog", VV.dJ("playerGiftDialog"), 32769L, (short)10000);
      }

      return false;
    case 16621:
    }

    return true;
  }

  public long getId() {
    return 0L;
  }

  public void a(long paramLong) {
  }

  public void a(aqv paramaqv, boolean paramBoolean) {
    if (!paramBoolean) {
      dLE.doY().t("playerGift", gD.oL());
      cBQ.cxL().j("wakfu.playerGift", aTC.class);
    }
  }

  public void b(aqv paramaqv, boolean paramBoolean) {
    if (!paramBoolean) {
      dLE.doY().t("playerGift", null);

      cBQ.cxL().mW("playerGiftDialog");
      cBQ.cxL().mN("wakfu.playerGift");
    }
  }
}