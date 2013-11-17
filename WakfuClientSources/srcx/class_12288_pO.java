import org.apache.log4j.Logger;

public class pO
  implements cvW
{
  protected static final Logger K = Logger.getLogger(pO.class);
  public static final int aWw = 260;
  public static final int aWx = 45;
  private static pO aWy = new pO();
  private bnm N;

  public static pO xc()
  {
    return aWy;
  }

  public boolean a(cWG paramcWG)
  {
    paramcWG.getId();

    return true;
  }

  public long getId()
  {
    return 0L;
  }

  public void a(long paramLong)
  {
  }

  public void a(aqv paramaqv, boolean paramBoolean)
  {
    if (!paramBoolean) {
      if ((KP.bXy.CB() == -1) && ((bWW.ccf().FB() == null) || (!dLE.doY().getBooleanProperty("wakfuEcosystemEnabled"))))
      {
        return;
      }

      this.N = new bBG(this);

      cBQ.cxL().a(this.N);

      dLE.doY().t("wakfuMonsterZoneManager", blo.bws());
      dLE.doY().t("wakfuResourceZoneManager", dcK.cOf());
      dLE.doY().t("wakfuGlobalZoneManager", acn.aoA());

      dLE.doY().t("wakfuEcosystemGaugeSize", new Or(260, 30));

      cBQ.cxL().a("ecosystemEquilibriumDialog", VV.dJ("ecosystemEquilibriumDialog"), 32769L, (short)10000);

      aWc.blo().eO(600141L);
    }
  }

  public void b(aqv paramaqv, boolean paramBoolean)
  {
    if (!paramBoolean) {
      cBQ.cxL().b(this.N);

      dLE.doY().removeProperty("wakfuMonsterZoneManager");
      dLE.doY().removeProperty("wakfuResourceZoneManager");

      cBQ.cxL().mW("ecosystemEquilibriumDialog");

      aWc.blo().blD();
    }
  }
}