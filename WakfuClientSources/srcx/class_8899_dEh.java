import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class dEh
  implements dBv, Iterable
{
  public static final String bC = "name";
  public static final String aIE = "type";
  public static final String lMR = "contentList";
  public static final String lMS = "onlineContentList";
  public static final String lMT = "offlineContentList";
  public static final String[] bF = { "name", "type", "contentList", "onlineContentList", "offlineContentList" };
  private final qe lMU;
  private ArrayList lMV = new ArrayList();

  public dEh(qe paramqe) {
    this.lMU = paramqe;
  }

  public void c(dbV paramdbV) {
    if (!this.lMV.contains(paramdbV)) {
      this.lMV.add(paramdbV);
      dLE.doY().a(this, new String[] { "contentList", "onlineContentList", "offlineContentList" });
    }
  }

  public boolean d(dbV paramdbV) {
    if (paramdbV != null) {
      if (this.lMU == qe.aWR) {
        paramdbV.G(false);
      }
      this.lMV.remove(paramdbV);
      dLE.doY().a(this, new String[] { "contentList", "onlineContentList", "offlineContentList" });
      return true;
    }

    return false;
  }

  public boolean qQ(String paramString) {
    return d(px(paramString));
  }

  public boolean e(dbV paramdbV) {
    return this.lMV.contains(paramdbV);
  }

  public dbV ky(long paramLong) {
    int i = this.lMV.size();
    for (int j = 0; j < i; j++) {
      dbV localdbV = (dbV)this.lMV.get(j);
      if (localdbV.getId() == paramLong) {
        return localdbV;
      }
    }
    return null;
  }

  public dbV f(dbV paramdbV) {
    if (paramdbV == null)
      return null;
    int i = this.lMV.size();
    for (int j = 0; j < i; j++) {
      dbV localdbV = (dbV)this.lMV.get(j);
      if (paramdbV.getName().equalsIgnoreCase(localdbV.getName()))
        return localdbV;
      if (paramdbV.aJm().equalsIgnoreCase(localdbV.aJm()))
        return localdbV;
      if ((paramdbV.getId() != -1L) && (paramdbV.getId() == localdbV.getId()))
        return localdbV;
    }
    return null;
  }

  public dbV px(String paramString) {
    int i = this.lMV.size();
    for (int j = 0; j < i; j++) {
      dbV localdbV = (dbV)this.lMV.get(j);
      if (localdbV.getName().equalsIgnoreCase(paramString)) {
        return localdbV;
      }
    }
    return null;
  }

  public dbV py(String paramString) {
    int i = this.lMV.size();
    for (int j = 0; j < i; j++) {
      dbV localdbV = (dbV)this.lMV.get(j);
      if (localdbV.aJm().equalsIgnoreCase(paramString)) {
        return localdbV;
      }
    }
    return null;
  }

  public String[] getFields() {
    return bF;
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("name"))
      return this.lMU.getName();
    if (paramString.equals("type"))
      return Short.valueOf(this.lMU.nc());
    if (paramString.equals("contentList")) {
      ArrayList localArrayList = new ArrayList();
      if (dmY.cUs().cUw())
        localArrayList = this.lMV;
      else {
        localArrayList = kS(true);
      }
      Collections.sort(localArrayList, new bAB(this));

      return localArrayList;
    }if (paramString.equals("onlineContentList"))
      return kS(true);
    if (paramString.equals("offlineContentList")) {
      return kS(false);
    }

    return null;
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

  public void clear() {
    this.lMV.clear();
    dLE.doY().a(this, new String[] { "contentList", "onlineContentList", "offlineContentList" });
  }

  public Iterator iterator() {
    return this.lMV.iterator();
  }

  public int dfZ() {
    return this.lMV.size();
  }

  public void dga() {
    for (dbV localdbV : this.lMV)
      localdbV.iW(false);
  }

  public ArrayList kS(boolean paramBoolean)
  {
    ArrayList localArrayList = new ArrayList();
    for (dbV localdbV : this.lMV) {
      if (((paramBoolean) && (localdbV.aJl())) || ((!paramBoolean) && (!localdbV.aJl())))
        localArrayList.add(localdbV);
    }
    Collections.sort(localArrayList, new bAC(this));

    return localArrayList;
  }
}