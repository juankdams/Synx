import org.apache.log4j.Logger;

public class cgf
  implements cvW
{
  private static cgf hDw = new cgf();
  protected static Logger K = Logger.getLogger(cgf.class);
  private bnm N;

  public static cgf ciu()
  {
    return hDw;
  }

  public boolean a(cWG paramcWG) {
    switch (paramcWG.getId()) {
    case 17351:
      afk localafk = (afk)paramcWG;
      int i = localafk.getIntValue();
      diO localdiO = azM.dRs.lg(i);
      if (localdiO != null)
      {
        Object localObject;
        if (localdiO == blK.fCS) {
          localObject = bU.fH().getString("error.chat.krosmozFigureBound");
          aEe localaEe = new aEe((String)localObject);
          localaEe.mm(3);
          CM.LV().a(localaEe);
        } else {
          localObject = new SQ(localdiO.aSq());
          byv.bFN().aJK().d((cWG)localObject);
        }
      }
      return false;
    case 17352:
      azM.dRs.aLE();
      return false;
    case 17353:
      azM.dRs.aLD();
      return false;
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
      this.N = new cbn(this);

      dLE.doY().t("krosmozCollection", azM.dRs);

      cBQ.cxL().a(this.N);

      cBQ.cxL().a("krosmozCollectionDialog", VV.dJ("krosmozCollectionDialog"), 0L, (short)30000);

      cBQ.cxL().j("wakfu.krosmozCollection", adM.class);
    }
  }

  public void b(aqv paramaqv, boolean paramBoolean) {
    if (!paramBoolean) {
      cBQ.cxL().b(this.N);

      cBQ.cxL().mW("krosmozCollectionDialog");

      cBQ.cxL().mN("wakfu.krosmozCollection");
    }
  }
}