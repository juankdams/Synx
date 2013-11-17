import org.apache.log4j.Logger;

public class dAj
  implements cvW
{
  protected static final Logger K = Logger.getLogger(dAj.class);

  private static dAj lHc = new dAj();
  private cYG lHd;
  private bnm N;

  public static dAj ddA()
  {
    return lHc;
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
    if (!paramBoolean) {
      if (this.lHd == null) {
        K.error("World null on ne peut pas afficher le panneau !");
        return;
      }
      dLE.doY().t("havenWorld", this.lHd);

      this.N = new RR(this);

      cBQ.cxL().a(this.N);

      cBQ.cxL().a("havenWorldPanelDialog", VV.dJ("havenWorldPanelDialog"), 256L, (short)10000);

      cBQ.cxL().j("wakfu.havenWorldPanel", aQp.class);
    }
  }

  public void b(aqv paramaqv, boolean paramBoolean) {
    if (!paramBoolean) {
      this.lHd.byC();
      dLE.doY().removeProperty("havenWorld");

      cBQ.cxL().b(this.N);

      cBQ.cxL().mW("havenWorldPanelDialog");

      cBQ.cxL().mN("wakfu.havenWorldPanel");
    }
  }

  public void a(cYG paramcYG) {
    this.lHd = paramcYG;
  }
}