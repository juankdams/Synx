import java.util.ArrayList;
import org.apache.log4j.Logger;

public class biD
  implements bPj
{
  private static final Logger K = Logger.getLogger(biD.class);
  private static final String fze = "ArticlesSearchResponse";
  private static final String T = "result";
  private static final String dVJ = "articles";
  private static final String dVK = "count";

  public void a(ccy paramccy, bXA parambXA)
  {
    cVe localcVe = paramccy.cfJ().hX("ArticlesSearchResponse");
    ds localds1 = (ds)localcVe.cJW();

    if (!localds1.e("result").getBooleanValue()) {
      parambXA.ccU().bw();
      return;
    }
    try
    {
      ArrayList localArrayList = new ArrayList();
      dEb localdEb = (dEb)localds1.e("articles");

      int i = localds1.g("count");

      int j = 0; for (int k = localdEb.size(); j < k; j++) {
        ds localds2 = (ds)localdEb.Cz(j);
        localArrayList.add(dlE.d(localds2));
      }

      parambXA.ccU().b(localArrayList, i);
    } catch (Exception localException) {
      K.warn("Problème à la désérialisation des données de liste d'articles", localException);
    }
  }

  public void a(bXA parambXA) {
    parambXA.ccU().bw();
  }
}