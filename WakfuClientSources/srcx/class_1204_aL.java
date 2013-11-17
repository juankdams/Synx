import org.apache.log4j.Logger;

public class aL
  implements bPj
{
  private static final Logger K = Logger.getLogger(aL.class);
  private static final String ii = "QuickBuyResponse";
  private static final String U = "ogrins";
  private static final String ij = "krozs";
  private static final String ERROR = "error";
  private static final String T = "result";

  public void a(ccy paramccy, gs paramgs)
  {
    cVe localcVe = paramccy.cfJ().hX("QuickBuyResponse");
    ds localds = (ds)localcVe.cJW();

    if (!localds.e("result").getBooleanValue()) {
      paramgs.nC().a(EH.bD(localds.e("error").getStringValue()));
      return;
    }
    try
    {
      int i = localds.e("ogrins").getIntValue();
      int j = localds.e("krozs").getIntValue();

      paramgs.nC().fs(i, j);
    } catch (Exception localException) {
      K.warn("Problème à la désérialisation des données d'un achat rapide", localException);
    }
  }

  public void a(gs paramgs)
  {
    paramgs.nC().a(EH.bKq);
  }
}