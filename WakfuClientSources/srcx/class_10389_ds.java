import java.util.ArrayList;
import java.util.Map.Entry;

public class ds
  implements bjf
{
  private static final String TE = "item";
  private static final String TF = "key";
  private static final String TG = "value";
  private final akR TH = new akR();

  public clq hm() {
    return clq.hNj;
  }

  public Object getValue() {
    return this.TH;
  }

  public bjf e(Object paramObject) {
    return (bjf)this.TH.get(paramObject);
  }

  public boolean a(bZs parambZs) {
    return this.TH.b(parambZs);
  }

  void a(String paramString, bjf parambjf) {
    this.TH.put(paramString, parambjf);
  }

  public float ai() {
    throw new UnsupportedOperationException("getFloatValue sur MapData");
  }

  public int getIntValue() {
    throw new UnsupportedOperationException("getIntValue sur MapData");
  }

  public String getStringValue() {
    throw new UnsupportedOperationException("getStringValue sur MapData");
  }

  public boolean getBooleanValue() {
    throw new UnsupportedOperationException("getBooleanValue sur MapData");
  }

  public float f(Object paramObject) {
    bjf localbjf = (bjf)this.TH.get(paramObject);
    return localbjf != null ? localbjf.ai() : 0.0F;
  }

  public int g(Object paramObject) {
    bjf localbjf = (bjf)this.TH.get(paramObject);
    return localbjf != null ? localbjf.getIntValue() : 0;
  }

  public String h(Object paramObject) {
    bjf localbjf = (bjf)this.TH.get(paramObject);
    return localbjf != null ? localbjf.getStringValue() : null;
  }

  public boolean i(Object paramObject) {
    bjf localbjf = (bjf)this.TH.get(paramObject);
    return localbjf != null ? localbjf.getBooleanValue() : false;
  }

  public static ds e(K paramK) {
    ds localds = new ds();

    ArrayList localArrayList = paramK.getChildren();
    int i = 0; for (int j = localArrayList.size(); i < j; i++) {
      K localK = (K)localArrayList.get(i);
      if ("item".equalsIgnoreCase(localK.getName())) {
        a(localK, localds);
      }
    }

    return localds;
  }

  private static void a(K paramK, ds paramds) {
    K localK1 = paramK.b("key");
    K localK2 = paramK.b("value");

    if ((localK1 != null) && (localK2 != null)) {
      bjf localbjf1 = ckx.D(localK1);
      bjf localbjf2 = ckx.D(localK2);
      if ((localbjf1 != null) && (localbjf1.hm() != clq.hNe))
        paramds.a(localbjf1.getStringValue(), localbjf2);
    }
  }

  private static K b(String paramString, bjf parambjf)
  {
    CC localCC = new CC("item", null);

    Pi localPi = new Pi(paramString);
    K localK1 = localPi.hn();
    localK1.setName("key");
    localCC.a(localK1);

    K localK2 = parambjf.hn();
    localK2.setName("value");
    localCC.a(localK2);

    return localCC;
  }

  public K hn() {
    CC localCC = new CC(null, null);
    localCC.c(new dvw("xsi:type", hm().getTag()));
    for (Map.Entry localEntry : this.TH.entrySet()) {
      localCC.a(b((String)localEntry.getKey(), (bjf)localEntry.getValue()));
    }
    return localCC;
  }
}