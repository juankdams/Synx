import java.util.ArrayList;
import org.apache.log4j.Logger;

public class dxm
  implements bPj
{
  private static final Logger K = Logger.getLogger(dxm.class);
  private static final String lDp = "CategoriesListResponse";
  private static final String T = "result";
  private static final String bMU = "categories";
  private static final String ID = "id";
  private static final String NAME = "name";
  private static final String aLh = "description";
  private static final String cTx = "image";
  private static final String lDq = "child";

  public void a(ccy paramccy, ft paramft)
  {
    cVe localcVe = paramccy.cfJ().hX("CategoriesListResponse");
    ds localds1 = (ds)localcVe.cJW();

    if (!localds1.e("result").getBooleanValue()) {
      paramft.mv().bw();
      return;
    }
    try
    {
      ArrayList localArrayList = new ArrayList();
      dEb localdEb = (dEb)localds1.e("categories");

      int i = 0; for (int j = localdEb.size(); i < j; i++) {
        ds localds2 = (ds)localdEb.Cz(i);
        localArrayList.add(f(localds2));
      }
      paramft.mv().b(localArrayList);
    } catch (Exception localException) {
      K.warn("Problème à la désérialisation des données de liste de categories", localException);
    }
  }

  private acM f(ds paramds)
  {
    int i = bUD.aR(paramds.h("id"));
    String str1 = paramds.h("name");
    String str2 = paramds.h("description");
    bjf localbjf = paramds.e("image");
    String str3 = localbjf.hm() == clq.hNf ? null : localbjf.getStringValue();
    acM localacM = new acM(i, str1, str2, str3);
    dEb localdEb = (dEb)paramds.e("child");
    if (localdEb != null) {
      int j = 0; for (int k = localdEb.size(); j < k; j++) {
        ds localds = (ds)localdEb.Cz(j);
        localacM.a(f(localds));
      }
    }

    return localacM;
  }

  public void a(ft paramft) {
    paramft.mv().bw();
  }
}