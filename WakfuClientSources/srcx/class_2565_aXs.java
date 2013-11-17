import org.apache.log4j.Logger;

public class aXs
  implements cvW
{
  protected static final Logger K = Logger.getLogger(aXs.class);

  private static aXs fcx = new aXs();
  private bnm N;

  public static aXs bmH()
  {
    return fcx;
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
      if (!dLE.doY().getBooleanProperty("isInExterior"))
        return;
      this.N = new aEt(this);

      cBQ.cxL().a(this.N);

      dLE.doY().t("weather.manager", sS.Al());

      cBQ.cxL().a("weatherInfoSmallDialog", VV.dJ("weatherInfoSmallDialog"), 32769L, (short)10000);
    }
  }

  public void b(aqv paramaqv, boolean paramBoolean)
  {
    if (!paramBoolean) {
      cBQ.cxL().b(this.N);

      dLE.doY().removeProperty("weather.manager");

      cBQ.cxL().mW("weatherInfoSmallDialog");
    }
  }
}