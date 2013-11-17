import org.apache.log4j.Logger;

public class cvC
  implements cvW
{
  private static final Logger K = Logger.getLogger(cvC.class);

  private static cvC ihd = new cvC();
  private dMb ihe;
  private bnm N;

  public static cvC ctw()
  {
    return ihd;
  }

  public void a(dMb paramdMb)
  {
    this.ihe = paramdMb;

    dLE.doY().t("saleHistory", paramdMb);
  }

  public boolean a(cWG paramcWG) {
    switch (paramcWG.getId()) {
    case 17010:
      this.ihe.dph();
      return false;
    case 17011:
      this.ihe.dpg();
      return false;
    }

    return true;
  }

  public long getId()
  {
    return 0L;
  }

  public void a(long paramLong)
  {
  }

  public void a(aqv paramaqv, boolean paramBoolean) {
    if (!paramBoolean) {
      this.N = new csS(this);

      cBQ.cxL().a(this.N);

      cBQ.cxL().a("dimensionalBagFleaHistoryDialog", VV.dJ("dimensionalBagFleaHistoryDialog"), 32769L, (short)10000);

      cBQ.cxL().j("wakfu.dimensionalBagFleaHistory", cRV.class);

      dLE.doY().t("saleHistory", this.ihe);

      aWc.blo().blC();
    }
  }

  public void b(aqv paramaqv, boolean paramBoolean) {
    if (!paramBoolean) {
      cBQ.cxL().mW("dimensionalBagFleaHistoryDialog");
      cBQ.cxL().b(this.N);

      cBQ.cxL().mN("wakfu.dimensionalBagFleaHistory");

      dLE.doY().removeProperty("saleHistory");

      aWc.blo().blD();
    }
  }
}