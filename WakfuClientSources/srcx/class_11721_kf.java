import org.apache.log4j.Logger;

public class kf
  implements cvW
{
  private static final kf aNA = new kf();
  protected static final Logger K = Logger.getLogger(kf.class);
  private NC aNB;
  private bnm N;

  public static kf rX()
  {
    return aNA;
  }

  public boolean a(cWG paramcWG)
  {
    afk localafk;
    switch (paramcWG.getId()) {
    case 16540:
      localafk = (afk)paramcWG;
      this.aNB.ga(localafk.getIntValue());
      return false;
    case 16541:
      localafk = (afk)paramcWG;
      this.aNB.ai(localafk.af());
      return false;
    }

    return true;
  }

  public void a(aqv paramaqv, boolean paramBoolean) {
    if (!paramBoolean)
    {
      this.N = new ch(this);

      this.aNB = new NC();

      dLE.doY().t("dungeonList", this.aNB);

      cBQ.cxL().a(this.N);

      cBQ.cxL().a("dungeonDialog", VV.dJ("dungeonDialog"), 32768L, (short)10000);

      cBQ.cxL().j("wakfu.dungeon", crj.class);
    }
  }

  public void b(aqv paramaqv, boolean paramBoolean) {
    if (!paramBoolean) {
      cBQ.cxL().b(this.N);

      cBQ.cxL().mW("dungeonDialog");

      cBQ.cxL().mN("wakfu.dungeon");

      dLE.doY().removeProperty("dungeonList");
    }
  }

  public long getId() {
    return 0L;
  }

  public void a(long paramLong)
  {
  }
}