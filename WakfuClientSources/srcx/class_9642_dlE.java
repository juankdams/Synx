import java.util.Collection;
import java.util.Iterator;
import org.apache.log4j.Logger;

class dlE
{
  private static final Logger K = Logger.getLogger(dlE.class);

  public static aet d(ds paramds)
  {
    int i = bUD.aR(paramds.h("id"));
    String str1 = a(paramds, "name");
    String str2 = a(paramds, "subtitle");
    String str3 = a(paramds, "description");
    String str4 = e(paramds);
    float f1 = bUD.getFloat(a(paramds, "price"));
    float f2 = bUD.getFloat(a(paramds, "originalPrice"));
    dlS localdlS = pt(a(paramds, "currency"));
    int j = bUD.f(a(paramds, "stock"), -1);

    cSi localcSi = new cSi();
    dEb localdEb = (dEb)paramds.e("references");
    a(localcSi, localdEb);

    return new aet(i, str1, str3, str2, f1, f2, localdlS, j, localcSi, str4);
  }

  private static String a(ds paramds, String paramString) {
    String str = paramds.h(paramString);
    if (str == null)
      return "";
    return cwo.mq(str);
  }

  private static void a(cSi paramcSi, dEb paramdEb) {
    int i = 0; for (int j = paramdEb.size(); i < j; i++) {
      ds localds = (ds)paramdEb.Cz(i);
      bjf localbjf = localds.e("content");
      if ((localbjf != null) && (localbjf.hm() == clq.hNk))
        b(paramcSi, (dEb)localbjf);
    }
  }

  private static void b(cSi paramcSi, dEb paramdEb)
  {
    int i = 0; for (int j = paramdEb.size(); i < j; i++) {
      ds localds = (ds)paramdEb.Cz(i);
      int k = bUD.f(localds.h("id"), -1);
      if (k != -1)
        paramcSi.add(k);
    }
  }

  private static String e(ds paramds)
  {
    bjf localbjf = paramds.e("image");
    akR localakR = (akR)localbjf.getValue();
    Collection localCollection = localakR.values();
    Iterator localIterator = localCollection.iterator();
    return localIterator.hasNext() ? ((bjf)localIterator.next()).getStringValue() : null;
  }

  public static dlS pt(String paramString)
  {
    for (dlS localdlS : dlS.values()) {
      if (localdlS.cTv().equals(paramString)) {
        return localdlS;
      }
    }
    return null;
  }
}