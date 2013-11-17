import com.ankamagames.wakfu.client.WakfuClientInstance;

public class aoT
  implements cvW
{
  private static aoT duy = new aoT();
  private bnm N;

  public static aoT aBl()
  {
    return duy;
  }

  public boolean a(cWG paramcWG) {
    switch (paramcWG.getId())
    {
    case 16402:
      byv.bFN().a(c.b());
      return false;
    case 16386:
      byv.bFN().brw();
      return false;
    case 16387:
      byv.bFN().quit();
      return false;
    case 16401:
      byv.bFN().b(this);
      return false;
    case 16388:
      cKX localcKX = cBQ.cxL().a(bU.fH().getString("question.changeCharacter"), Cn.et(0), 2073L, 102, 1);

      localcKX.a(new dPz(this));

      return false;
    }

    return true;
  }

  public static void aBm() {
    byz localbyz = byv.bFN().bFO();
    if (localbyz != null) {
      localbyz.bGD().cWO();
    }

    WakfuClientInstance.awy().awO();
    byv.bFN().a(aFi.aRF());
    byv.bFN().a(rS.ys());
    byv.bFN().a(aTd.biu());

    ckU.cmE().ak(true).g(bU.fH().getString("charactersLoading.progress"), 0);

    cgG.ciL().gV(true);
    byv.bFN().a(cgG.ciL());

    byv.bFN().aJK().d(new cEL());
  }

  public long getId() {
    return 0L;
  }

  public void a(long paramLong) {
  }

  public void a(aqv paramaqv, boolean paramBoolean) {
    if (!paramBoolean)
    {
      if (byv.bFN().c(dAE.ddW())) {
        bFT localbFT = dAE.ddW().dee();
        if (localbFT != null) {
          ajz localajz = localbFT.bOe();
          if ((localajz != null) && (localajz.awn())) {
            bji localbji = localajz.awm();
            if (localbji.buK()) {
              bzu.cf((short)16111);
            }
          }
        }

      }

      this.N = new dPu(this);

      cBQ.cxL().a(this.N);

      dLE.doY().t("isConnected", Boolean.valueOf(byv.bFN().brt()));

      cBQ.cxL().a("menuDialog", VV.dJ("menuDialog"), 256L, (short)26000);

      cBQ.cxL().j("wakfu.menu", bKp.class);

      aWc.blo().eO(600023L);

      dtV.setSelectedTabIndex(0);
    }
  }

  public void b(aqv paramaqv, boolean paramBoolean)
  {
    if (!paramBoolean)
    {
      dLE.doY().removeProperty("isConnected");

      cBQ.cxL().mW("menuDialog");

      cBQ.cxL().mN("wakfu.menu");

      cBQ.cxL().b(this.N);

      aWc.blo().eO(600024L);

      dtV.setSelectedTabIndex(2);
    }
  }
}