import org.apache.log4j.Logger;

public class hv
  implements bPj
{
  private static final Logger K = Logger.getLogger(hv.class);
  private static final String aGL = "GetEventResponse";
  private static final String aGM = "month";
  private static final String aGN = "zodiac";
  private static final String aGO = "event";

  public void a(ccy paramccy, bMC parambMC)
  {
    cVe localcVe = paramccy.cfJ().hX("GetEventResponse");
    ds localds = (ds)localcVe.cJW();

    if (!localds.e("result").getBooleanValue()) {
      return;
    }

    if (localds.e("event") == kE.aOu) {
      return;
    }
    try
    {
      boi localboi = boi.a((ds)localds.e("event"));
      dic localdic = dic.c((ds)localds.e("zodiac"));
      cYh localcYh = cYh.b((ds)localds.e("month"));

      dxL localdxL = parambMC.VN();

      xS.bqG.a(localboi, localdxL);
      xS.bqG.a(localdic, localdxL);
      xS.bqG.a(localcYh, localdxL);
    }
    catch (Exception localException) {
      K.warn("Problème à la désérialisation des données d'almanach", localException);
    }
  }

  public void a(bMC parambMC)
  {
  }
}