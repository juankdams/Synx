import org.apache.log4j.Logger;

public class cuo
  implements bPj
{
  private static final Logger K = Logger.getLogger(cuo.class);
  private static final String ieV = "AuthentificationResponse";

  public void a(ccy paramccy, CR paramCR)
  {
    cVe localcVe = paramccy.cfJ().hX("AuthentificationResponse");
    ds localds = (ds)localcVe.cJW();

    if (!localds.e("success").getBooleanValue()) {
      dcy.kVz.r(null);
      return;
    }
    try
    {
      dcy.kVz.r(paramccy.getHeaderFields());
    } catch (Exception localException) {
      K.warn("Problème à la désérialisation des données d'authentification", localException);
    }
  }

  public void a(CR paramCR) {
    dcy.kVz.r(null);
  }
}