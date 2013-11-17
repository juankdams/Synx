import org.apache.log4j.Logger;

public class zM
  implements cvW
{
  protected static final Logger K = Logger.getLogger(zM.class);

  private static final zM buI = new zM();
  private bnm N;

  public static zM ID()
  {
    return buI;
  }

  public boolean a(cWG paramcWG)
  {
    paramcWG.getId();

    return true;
  }

  public long getId() {
    return 0L;
  }

  public void a(long paramLong)
  {
  }

  public void a(aqv paramaqv, boolean paramBoolean) {
    byz localbyz = byv.bFN().bFO();

    if (!paramBoolean) {
      dLE.doY().t("emotesInventory", localbyz.bGE());

      this.N = new Cg(this);

      cBQ.cxL().a(this.N);

      cBQ.cxL().a("emotesInventoryDialog", VV.dJ("emotesInventoryDialog"), 32769L, (short)10000);

      cBQ.cxL().j("wakfu.emotesInventory", dRA.class);

      aWc.blo().eO(600012L);
    }
  }

  public void b(aqv paramaqv, boolean paramBoolean) {
    if (!paramBoolean) {
      dLE.doY().removeProperty("emotesInventory");
      dLE.doY().removeProperty("overSmiley");

      cBQ.cxL().b(this.N);

      cBQ.cxL().mW("emotesInventoryDialog");

      cBQ.cxL().mN("wakfu.emotesInventory");

      aWc.blo().eO(600013L);
    }
  }

  public void IE() {
    if (byv.bFN().c(this)) {
      byv.bFN().b(this);
      Bf.Kk().at(false);
    } else {
      byv.bFN().a(this);
      Bf.Kk().at(true);
    }
  }
}