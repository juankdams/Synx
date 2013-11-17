import java.util.ArrayList;

public class dEb
  implements bjf
{
  private static final String TE = "item";
  private final ArrayList kHI = new ArrayList();

  public clq hm() {
    return clq.hNk;
  }

  public Object getValue() {
    return this.kHI;
  }

  public bjf Cz(int paramInt) {
    return (bjf)this.kHI.get(paramInt);
  }

  public void a(bjf parambjf) {
    this.kHI.add(parambjf);
  }

  public float ai() {
    throw new UnsupportedOperationException("getFloatValue sur ArrayData");
  }

  public int getIntValue() {
    throw new UnsupportedOperationException("getIntValue sur ArrayData");
  }

  public String getStringValue() {
    throw new UnsupportedOperationException("getStringValue sur ArrayData");
  }

  public boolean getBooleanValue() {
    throw new UnsupportedOperationException("getBooleanValue sur ArrayData");
  }

  public float getFloatValue(int paramInt) {
    bjf localbjf = (bjf)this.kHI.get(paramInt);
    return localbjf != null ? localbjf.ai() : 0.0F;
  }

  public int CA(int paramInt) {
    bjf localbjf = (bjf)this.kHI.get(paramInt);
    return localbjf != null ? localbjf.getIntValue() : 0;
  }

  public String getStringValue(int paramInt) {
    bjf localbjf = (bjf)this.kHI.get(paramInt);
    return localbjf != null ? localbjf.getStringValue() : null;
  }

  public boolean CB(int paramInt) {
    bjf localbjf = (bjf)this.kHI.get(paramInt);
    return localbjf != null ? localbjf.getBooleanValue() : false;
  }

  public int size() {
    return this.kHI.size();
  }

  public static dEb L(K paramK) {
    dEb localdEb = new dEb();

    ArrayList localArrayList = paramK.getChildren();
    int i = 0; for (int j = localArrayList.size(); i < j; i++) {
      K localK = (K)localArrayList.get(i);
      if ("item".equalsIgnoreCase(localK.getName())) {
        a(localK, localdEb);
      }
    }

    return localdEb;
  }

  private static void a(K paramK, dEb paramdEb) {
    bjf localbjf = ckx.D(paramK);
    if ((localbjf != null) && (localbjf.hm() != clq.hNe))
      paramdEb.a(localbjf);
  }

  private static K b(bjf parambjf)
  {
    K localK = parambjf.hn();
    localK.setName("item");
    return localK;
  }

  public K hn() {
    CC localCC = new CC(null, null);
    localCC.c(new dvw("xsi:type", hm().getTag()));
    int i = 0; for (int j = this.kHI.size(); i < j; i++) {
      bjf localbjf = (bjf)this.kHI.get(i);
      localCC.a(b(localbjf));
    }
    return localCC;
  }
}