import org.apache.log4j.Logger;

public class d
  implements bPj
{
  private static final Logger K = Logger.getLogger(d.class);
  private static final String S = "MoneyResponse";
  private static final String T = "result";
  private static final String U = "ogrins";
  private static final String V = "krozs";

  public void a(ccy paramccy, cUK paramcUK)
  {
    cVe localcVe = paramccy.cfJ().hX("MoneyResponse");
    ds localds = (ds)localcVe.cJW();

    if (!localds.e("result").getBooleanValue()) {
      return;
    }
    try
    {
      int i = localds.e("ogrins").getIntValue();
      int j = localds.e("krozs").getIntValue();

      paramcUK.cJR().dc(i, j);
    } catch (Exception localException) {
      K.warn("Problème à la désérialisation des données d'argent", localException);
    }
  }

  public void a(cUK paramcUK)
  {
  }
}