import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import org.apache.log4j.Logger;

public class cDA
{
  private static Logger K = Logger.getLogger(cDA.class);

  private final HashMap iwS = new HashMap();

  private cpa bhy = null;

  private HashMap iwT = null;

  private ArrayList iwU = null;

  public dLE czu()
  {
    return dLE.doY();
  }

  public void b(cpa paramcpa, String paramString)
  {
    this.iwS.put(paramString, paramcpa);
  }

  public cpa nd(String paramString)
  {
    cpa localcpa = new cpa(paramString, this);

    b(localcpa, paramString);

    return localcpa;
  }

  public void aH(String paramString1, String paramString2)
  {
    if ((paramString1 != null) && (paramString2 != null)) {
      cpa localcpa = (cpa)this.iwS.remove(paramString1);
      this.iwS.put(paramString2, localcpa);
    }
  }

  public aNL fi(String paramString) {
    if (paramString == null) {
      return null;
    }
    int i = paramString.indexOf('.');
    String str = i < 0 ? paramString : paramString.substring(0, i);
    cpa localcpa = (cpa)this.iwS.get(str);
    if (localcpa != null) {
      return localcpa.fi(paramString.substring(i + 1));
    }
    return null;
  }

  public void ne(String paramString)
  {
    if (this.iwS != null) {
      cpa localcpa = (cpa)this.iwS.remove(paramString);
      if (localcpa == this.bhy) {
        this.bhy = null;
      }

      if (localcpa != null)
        localcpa.clear();
    }
  }

  public cpa nf(String paramString)
  {
    return (cpa)this.iwS.get(paramString);
  }

  public cpa czv()
  {
    return this.bhy;
  }

  public void f(cpa paramcpa)
  {
    this.bhy = paramcpa;
  }

  public dso[] czw()
  {
    if (this.iwU == null) {
      return null;
    }
    dso[] arrayOfdso = new dso[this.iwU.size()];
    return (dso[])this.iwU.toArray(arrayOfdso);
  }

  public dso czx()
  {
    if (this.iwU != null) {
      return (dso)this.iwU.get(this.iwU.size() - 1);
    }
    return null;
  }

  public dso ng(String paramString)
  {
    if (this.iwT == null) {
      return null;
    }
    return (dso)this.iwT.get(paramString);
  }

  public Collection czy()
  {
    if (this.iwT == null) {
      return null;
    }
    return this.iwT.values();
  }

  public void a(String paramString, dso paramdso)
  {
    if (this.iwT == null) {
      this.iwT = new HashMap();
      this.iwU = new ArrayList();
    }

    this.iwT.put(paramString, paramdso);
    this.iwU.add(paramdso);
  }

  public void nh(String paramString)
  {
    if (this.iwT == null) {
      return;
    }
    dso localdso = (dso)this.iwT.get(paramString);
    this.iwU.remove(localdso);
  }

  public void ni(String paramString)
  {
    dso localdso = (dso)this.iwT.remove(paramString);
    this.iwU.remove(localdso);
  }

  public void a(dso paramdso)
  {
    String str = null;
    for (Map.Entry localEntry : this.iwT.entrySet()) {
      if (localEntry.getValue() == paramdso) {
        str = (String)localEntry.getKey();
        break;
      }
    }
    this.iwT.remove(str);
    this.iwU.remove(paramdso);
  }
}