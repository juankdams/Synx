import java.util.ArrayList;
import java.util.Iterator;

public class cPR extends cGj
{
  public static final String bC = "name";
  public static final String kzb = "results";
  public static final String kzc = "history";
  public static final String kzd = "moneyStocked";
  public static final String kze = "hasMoneyStocked";
  public static final String kzf = "hasUnsoldStocked";
  public static final String kzg = "requestSortTypes";
  public static final String kzh = "numResults";
  public static final String kzi = "hasPreviousResults";
  public static final String kzj = "hasNextResults";
  public static final String kzk = "currentSearchCategory1";
  public static final String kzl = "currentSearchCategory2";
  public static final String kzm = "currentSearchCategory3";
  public static final String kzn = "marketSellsFullText";
  public static String[] bF = { "name", "results", "history", "moneyStocked", "hasMoneyStocked", "requestSortTypes", "numResults", "hasPreviousResults", "hasNextResults", "currentSearchCategory1", "currentSearchCategory2", "currentSearchCategory3", "marketSellsFullText" };

  public static final cPR kzo = new cPR();

  private cGZ kzp = new cGZ(0);
  private daZ kzq = new daZ(null, null);
  private daZ kzr = null;
  private daZ kzs = null;
  private cbQ kzt = new cbQ();
  private cbQ kzu = new cbQ();
  private cbQ kzv = new cbQ();
  private int kzw;
  private int kzx;

  public String[] getFields()
  {
    return bF;
  }

  public Object getFieldValue(String paramString)
  {
    Object localObject1;
    int j;
    Object localObject2;
    if (paramString.equals("results")) {
      if (this.kzp == null) {
        return null;
      }
      localObject1 = new ArrayList();
      for (j = 0; j < this.kzt.size(); j++) {
        aVw localaVw = cGN().iC(this.kzt.get(j));
        if (Hh.QM().dh(localaVw.aFY()) != null)
        {
          localObject2 = new yS(localaVw);
          ((ArrayList)localObject1).add(localObject2);
        }
      }
      return localObject1;
    }if (paramString.equals("name")) {
      localObject1 = bAO.bJl().bJr();
      return ((ajO)localObject1).axe();
    }if (paramString.equals("hasMoneyStocked"))
      return Boolean.valueOf(this.kzu.size() > 0);
    if (paramString.equals("hasUnsoldStocked"))
      return Boolean.valueOf(this.kzv.size() > 0);
    Object localObject3;
    if (paramString.equals("moneyStocked")) {
      if (this.kzp == null) {
        return null;
      }
      long l1 = 0L;
      for (int k = 0; k < this.kzu.size(); k++) {
        localObject2 = byv.bFN().bFO();
        localObject3 = cGN().c(((byz)localObject2).getId(), this.kzu.get(k));
        l1 += ((dhL)localObject3).cRt();
      }
      return bU.fH().getString("bigNumberWithSeparator", new Object[] { Long.valueOf(l1) });
    }if (paramString.equals("history")) {
      if (this.kzp == null) {
        return null;
      }
      aoL localaoL = new aoL();
      Object localObject4;
      for (j = 0; j < this.kzu.size(); j++) {
        byz localbyz = byv.bFN().bFO();
        long l3 = this.kzu.get(j);
        localObject4 = cGN().c(localbyz.getId(), l3);
        if (Hh.QM().dh(((dhL)localObject4).aFY()) != null)
        {
          aJr localaJr = new aJr((dhL)localObject4);
          localaoL.put(l3, localaJr);
        }
      }
      for (j = 0; j < this.kzv.size(); j++) {
        long l2 = this.kzv.get(j);
        localObject3 = cGN().iC(l2);
        if (Hh.QM().dh(((aVw)localObject3).aFY()) != null)
        {
          localObject4 = (aJr)localaoL.get(l2);
          if (localObject4 != null)
            ((aJr)localObject4).bh(((aVw)localObject3).bdI());
          else {
            localObject4 = new aJr((aVw)localObject3);
          }

          localaoL.put(l2, localObject4);
        }
      }
      return localaoL.getValues();
    }if (!paramString.equals("requestSortTypes")) {
      if (paramString.equals("numResults")) {
        if ((this.kzt == null) || (this.kzt.size() == 0)) {
          return bU.fH().getString("marketBoard.noResults");
        }
        int i = bAO.bJl().bJq();
        return bU.fH().getString("marketBoard.numResults", new Object[] { Integer.valueOf(i + 1), Integer.valueOf(Math.min(i + 10, this.kzw)), Integer.valueOf(this.kzw) });
      }
      if (paramString.equals("hasNextResults"))
        return Boolean.valueOf(bAO.bJl().bJq() + 10 < this.kzw);
      if (paramString.equals("hasPreviousResults"))
        return Boolean.valueOf(bAO.bJl().bJq() > 0);
      if (paramString.equals("currentSearchCategory1"))
        return this.kzq;
      if (paramString.equals("currentSearchCategory2"))
        return this.kzr;
      if (paramString.equals("currentSearchCategory3"))
        return this.kzs;
      if (paramString.equals("marketSellsFullText")) {
        return this.kzx + this.kzt.size() < 10 ? null : bU.fH().getString("desc.cantDropItemToSell", new Object[] { Integer.valueOf(this.kzx) });
      }
    }
    return null;
  }

  public cGZ cGN() {
    return this.kzp;
  }

  public void cGO() {
    dLE.doY().a(this, new String[] { "history", "results", "numResults", "hasNextResults", "hasPreviousResults", "hasMoneyStocked", "moneyStocked", "hasUnsoldStocked", "marketSellsFullText" });
  }

  private void cGP() {
    dLE.doY().a(this, new String[] { "currentSearchCategory1" });
    if (this.kzq != null) {
      dLE.doY().a(this.kzq, this.kzq.getFields());
    }
    dLE.doY().a(this, new String[] { "currentSearchCategory2" });
    if (this.kzr != null) {
      dLE.doY().a(this.kzr, this.kzr.getFields());
    }
    dLE.doY().a(this, new String[] { "currentSearchCategory3" });
    if (this.kzs != null)
      dLE.doY().a(this.kzs, this.kzs.getFields());
  }

  public void a(ya paramya)
  {
    if (this.kzq.cMV() == paramya) {
      return;
    }
    this.kzq = new daZ(paramya, null);
    this.kzr = (paramya == null ? null : new daZ(null, paramya));
    this.kzs = null;
    cGP();
  }

  public void b(ya paramya) {
    if ((this.kzr == null) || (this.kzr.cMV() == paramya)) {
      return;
    }
    this.kzr = new daZ(paramya, this.kzq.cMV());
    this.kzs = (paramya == null ? null : new daZ(null, paramya));
    cGP();
  }

  public void c(ya paramya) {
    if ((this.kzs == null) || (this.kzs.cMV() == paramya)) {
      return;
    }
    this.kzs = new daZ(paramya, this.kzr.cMV());

    cGP();
  }

  public void clean() {
    clearAll();
  }

  public void cGQ() {
    this.kzq = new daZ(null, null);
    this.kzr = null;
    this.kzs = null;
  }

  private void clearAll() {
    this.kzt.clear();
    this.kzu.clear();
    this.kzv.clear();
    this.kzp.clear();
  }

  public void yO(int paramInt) {
    if ((bAO.bJl().bJs() == 0) && (paramInt == 0)) {
      dLE.doY().t("marketBoard.SearchError", bU.fH().getString("marketBoard.noResult"));
      bAO.bJl().bJm();
    }
    this.kzw = paramInt;
  }

  public int cGR() {
    return this.kzw;
  }

  public boolean p(long paramLong, short paramShort) {
    aVw localaVw = this.kzp.iC(paramLong);
    localaVw.bj(paramShort);
    if (localaVw.bdI() == 0) {
      iZ(paramLong);
      return true;
    }
    cGO();
    return false;
  }

  public void iY(long paramLong)
  {
    Cu.b(this.kzv, paramLong);
    this.kzp.ix(paramLong);
    cGO();
  }

  public void iZ(long paramLong) {
    this.kzp.ix(paramLong);
    Cu.b(this.kzt, paramLong);
    cGO();
  }

  private void g(aVw paramaVw) {
    this.kzt.add(paramaVw.getId());
    this.kzp.g(paramaVw);
  }

  public void f(Iterator paramIterator) {
    clearAll();
    while (paramIterator.hasNext())
      g((aVw)paramIterator.next());
  }

  public void d(ArrayList paramArrayList1, ArrayList paramArrayList2)
  {
    clearAll();
    for (Iterator localIterator = paramArrayList1.iterator(); localIterator.hasNext(); ) { localObject = (dhL)localIterator.next();
      this.kzu.add(((dhL)localObject).getId());
      this.kzp.a(byv.bFN().bFO().getId(), (dhL)localObject);
    }
    Object localObject;
    for (localIterator = paramArrayList2.iterator(); localIterator.hasNext(); ) { localObject = (aVw)localIterator.next();
      this.kzv.add(((aVw)localObject).getId());
      this.kzp.g((aVw)localObject); }
  }

  public void cGS()
  {
    this.kzt.clear();
  }

  public void cGT() {
    this.kzu.clear();
  }

  public void cGU() {
    this.kzv.clear();
  }

  public ya cGV() {
    if (this.kzq.cMV() == null) {
      return null;
    }
    if ((this.kzr == null) || (this.kzr.cMV() == null)) {
      return this.kzq.cMV();
    }
    if ((this.kzs == null) || (this.kzs.cMV() == null)) {
      return this.kzr.cMV();
    }
    return this.kzs.cMV();
  }

  public void yP(int paramInt) {
    this.kzx = paramInt;
  }
}