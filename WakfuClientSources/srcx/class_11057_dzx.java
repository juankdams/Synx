import org.apache.log4j.Logger;

public class dzx
  implements cvW
{
  private static dzx lGk = new dzx();

  private static final Logger K = Logger.getLogger(dzx.class);

  public static dzx dcY()
  {
    return lGk;
  }

  public boolean a(cWG paramcWG)
  {
    switch (paramcWG.getId())
    {
    case 16002:
      if (KP.bXy.CB() != -1) {
        K.info("On a pushé un protecteur statique, on ne l'enlève pas à l'entrée du territoire (retiré manuelllement)");
        return false;
      }
      bWW.ccf().f(null);
      KP.bXy.aM(-1);
      return false;
    }

    return true;
  }

  public long getId() {
    return 3L;
  }

  public void a(long paramLong) {
  }

  public void a(aqv paramaqv, boolean paramBoolean) {
    if (!paramBoolean) {
      dLE.doY().t("weather.manager", sS.Al());
      dLE.doY().t("protector", KP.bXy.CB() != -1 ? KP.bXy : bWW.ccf());
    }
  }

  public void b(aqv paramaqv, boolean paramBoolean)
  {
    if (!paramBoolean) {
      dLE.doY().removeProperty("protector");
      bWW.ccf().f(null);
      KP.bXy.aM(-1);
    }
  }

  public void dcZ() {
    if (byv.bFN().c(brL.bzT()))
      byv.bFN().b(brL.bzT());
    if (byv.bFN().c(pO.xc()))
      byv.bFN().b(pO.xc());
    dLE.doY().t("challengeDetailsVisible", Boolean.valueOf(false));
  }
}