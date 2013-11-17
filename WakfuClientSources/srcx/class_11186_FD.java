import java.util.Iterator;

public class FD extends cGj
{
  public static final String bMU = "categories";
  public static final String bMV = "selectedCategory";
  public static final String bMW = "hasChallenges";
  private final bFg bMX;
  private final Xg bMY = new Xg();
  private aF bMZ = null;

  public FD(bFg parambFg) {
    this.bMX = parambFg;

    for (aF localaF : aF.values()) {
      this.bMY.put(localaF.bJ(), new bko(localaF));
    }

    update();
  }

  public void a(aF paramaF) {
    this.bMZ = paramaF;
    dLE.doY().a(this, new String[] { "selectedCategory" });
  }

  public void update() {
    int i = 0; for (int j = this.bMY.size(); i < j; i++) {
      localObject1 = (bko)this.bMY.hc(i);
      ((bko)localObject1).clear();
    }

    Iterator localIterator = this.bMX.iterator();
    Object localObject2;
    while (localIterator.hasNext()) {
      localld = (ld)localIterator.next();

      if (localld.ccG() == -1L)
      {
        localObject1 = (cod)localld.sE();

        ceQ localceQ = aUi.eUP.nW(localld.sD());
        dDU localdDU = qn.xw().cl(localceQ.yC());
        localObject2 = localdDU.EH();
        bko localbko = (bko)this.bMY.get(((aF)localObject2).bJ());
        localbko.a((cod)localObject1);
      }
    }
    ld localld = this.bMZ != null ? (bko)this.bMY.get(this.bMZ.bJ()) : null;
    Object localObject1 = this.bMZ;
    this.bMZ = null;
    if ((localld != null) && (localld.isEnabled())) {
      this.bMZ = ((aF)localObject1);
      dLE.doY().a(localld, new String[] { "items" });
    } else {
      int k = 0; for (int m = this.bMY.size(); k < m; k++) {
        localObject2 = (bko)this.bMY.hc(k);
        if (((bko)localObject2).isEnabled()) {
          this.bMZ = ((bko)localObject2).EH();
          break;
        }
      }
    }

    dLE.doY().a(this, new String[] { "categories", "selectedCategory" });
  }

  public void Pp()
  {
    Iterator localIterator = this.bMY.iterator();
    while (localIterator.hasNext()) {
      bko localbko = (bko)localIterator.next();
      localbko.Pp();
    }
  }

  public void Pq() {
    int i = 0; for (int j = this.bMY.size(); i < j; i++)
      ((bko)this.bMY.hc(i)).Pq();
  }

  public String[] getFields()
  {
    return null;
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("selectedCategory"))
      return this.bMZ != null ? (bko)this.bMY.get(this.bMZ.bJ()) : null;
    if (paramString.equals("categories"))
      return this.bMY;
    if (paramString.equals("hasChallenges")) {
      return Boolean.valueOf(this.bMX.size() != 0);
    }
    return null;
  }
}