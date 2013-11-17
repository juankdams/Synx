import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.HashMap;
import org.apache.log4j.Logger;

public class dmY
  implements dBv
{
  private static final Logger K = Logger.getLogger(dmY.class);
  public static final String lml = "categories";
  public static final String lmm = "friendsList";
  public static final String lmn = "ignoreList";
  public static final String[] bF = { "categories", "friendsList", "ignoreList" };

  private EnumMap lmo = new EnumMap(qe.class);

  private static dmY lmp = new dmY();

  private HashMap lmq = new HashMap();

  private boolean lmr = true;

  private dmY() {
    init();
  }

  public static dmY cUs()
  {
    return lmp;
  }

  private void init() {
    this.lmo.put(qe.aWR, new dEh(qe.aWR));
    this.lmo.put(qe.aWS, new dEh(qe.aWS));
  }

  public void clear() {
    this.lmq.clear();
    for (dEh localdEh : this.lmo.values()) {
      localdEh.clear();
    }
    this.lmr = true;
  }

  public void a(short paramShort, dbV paramdbV)
  {
    if (!this.lmq.containsKey(paramdbV.getName().toLowerCase())) {
      paramdbV.dX(paramShort);
      this.lmq.put(paramdbV.getName().toLowerCase(), paramdbV);
    } else {
      paramdbV = (dbV)this.lmq.get(paramdbV.getName().toLowerCase());
      paramdbV.dX(paramShort);
    }

    dEh localdEh = (dEh)this.lmo.get(qe.s(paramShort));
    if (localdEh != null) {
      localdEh.c(paramdbV);
      dLE.doY().a(this, new String[] { "categories" });
    }
  }

  public void a(short paramShort, Iterable paramIterable)
  {
    for (dbV localdbV : paramIterable) {
      a(paramShort, localdbV);
    }
    dLE.doY().a(this, new String[] { "categories" });
  }

  public boolean a(short paramShort, String paramString)
  {
    dEh localdEh = (dEh)this.lmo.get(qe.s(paramShort));
    if (localdEh != null) {
      localdEh.qQ(paramString);
      dLE.doY().a(this, new String[] { "categories" });
    }

    if (this.lmq.containsKey(paramString.toLowerCase())) {
      dbV localdbV = (dbV)this.lmq.get(paramString.toLowerCase());
      localdbV.dY(paramShort);
      if (paramShort == 1) {
        localdbV.G(false);
      }
      if (localdbV.cNA()) {
        this.lmq.remove(paramString.toLowerCase());
      }
      return true;
    }
    return false;
  }

  public void b(short paramShort, Iterable paramIterable)
  {
    for (dbV localdbV : paramIterable) {
      a(paramShort, localdbV.getName());
    }
    dLE.doY().a(this, new String[] { "categories" });
  }

  public void b(short paramShort, dbV paramdbV)
  {
    if (this.lmq.containsKey(paramdbV.getName().toLowerCase())) {
      if (paramdbV.dZ(paramShort))
        c(paramShort, paramdbV.getName());
      else
        b(paramShort, paramdbV.getName());
    }
    else
      b(paramShort, paramdbV.getName());
  }

  public void c(short paramShort, Iterable paramIterable)
  {
    for (dbV localdbV : paramIterable)
      b(paramShort, localdbV);
  }

  public Collection cUt()
  {
    return this.lmq.values();
  }

  public dEh cUu()
  {
    return (dEh)this.lmo.get(qe.aWR);
  }

  public dEh cUv()
  {
    return (dEh)this.lmo.get(qe.aWS);
  }

  public dbV px(String paramString) {
    return (dbV)this.lmq.get(paramString.toLowerCase());
  }

  public dbV py(String paramString) {
    if (paramString == null)
      return null;
    for (dbV localdbV : this.lmq.values()) {
      if (paramString.equals(localdbV.aJm()))
        return localdbV;
    }
    return null;
  }

  public boolean cUw() {
    return this.lmr;
  }

  public void jC(boolean paramBoolean) {
    this.lmr = paramBoolean;
    dLE.doY().a(cUu(), new String[] { "contentList" });
    dLE.doY().a(cUv(), new String[] { "contentList" });
  }

  public String[] getFields() {
    return bF;
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("categories")) {
      ArrayList localArrayList = cUx();
      return localArrayList.size() > 0 ? localArrayList : null;
    }if (paramString.equals("friendsList"))
      return cUu();
    if (paramString.equals("ignoreList")) {
      return cUv();
    }

    return null;
  }

  private ArrayList cUx() {
    ArrayList localArrayList = new ArrayList();
    for (dEh localdEh : this.lmo.values()) {
      if ((localdEh != null) && (localdEh.dfZ() > 0))
        localArrayList.add(localdEh);
    }
    return localArrayList;
  }

  public void b(short paramShort, String paramString) {
    switch (paramShort) {
    case 1:
      pz(paramString);
      break;
    case 2:
      pB(paramString);
    }
  }

  public void c(short paramShort, String paramString)
  {
    switch (paramShort) {
    case 1:
      pA(paramString);
      break;
    case 2:
      pC(paramString);
    }
  }

  public void pz(String paramString)
  {
    dqv localdqv = new dqv();
    localdqv.mA(paramString);
    byv.bFN().aJK().d(localdqv);
  }

  public void pA(String paramString)
  {
    cyZ localcyZ = new cyZ();
    localcyZ.mA(paramString);
    byv.bFN().aJK().d(localcyZ);
  }

  public void pB(String paramString)
  {
    dnu localdnu = new dnu();
    localdnu.pG(paramString);
    byv.bFN().aJK().d(localdnu);
  }

  public void pC(String paramString)
  {
    dOG localdOG = new dOG();
    localdOG.pG(paramString);
    byv.bFN().aJK().d(localdOG);
  }

  public void a(String paramString, Object paramObject) {
  }

  public void b(String paramString, Object paramObject) {
  }

  public void c(String paramString, Object paramObject) {
  }

  public boolean l(String paramString) {
    return false;
  }
}