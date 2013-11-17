import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import org.apache.log4j.Logger;

public class cpa
  implements Iterable
{
  private static final Logger K = Logger.getLogger(cpa.class);
  public static final char hYa = '.';
  public static final String hYb = "~";
  private static final String hYc = 92 + '.';
  public static final String hYd = "#";
  private String bYJ;
  private HashMap hYe;
  private final HashMap hYf = new HashMap();
  private cDA hYg;
  private HashMap hYh = null;

  private cpa hYi = null;
  private ArrayList bFw = null;

  public cpa(String paramString, cDA paramcDA)
  {
    this.bYJ = paramString;
    this.hYg = paramcDA;
  }

  public void a(String paramString, aNL paramaNL)
  {
    if (this.hYe == null) {
      this.hYe = new HashMap();
    }
    if ((paramaNL != null) && (paramString != null) && (this.hYe.get(paramString) != paramaNL)) {
      paramaNL.setId(paramString);
      this.hYe.put(paramString, paramaNL);
    }
  }

  public aNL fi(String paramString)
  {
    String[] arrayOfString = cOg.e(paramString, hYc, 2);
    String str1 = paramString;
    String str2 = null;
    String str3 = null;
    int i = -1;

    if (arrayOfString.length >= 1) {
      str1 = arrayOfString[0];
    }

    if (arrayOfString.length >= 2) {
      str3 = arrayOfString[1];
    }

    arrayOfString = cOg.e(str1, "#", 2);

    if (arrayOfString.length >= 1) {
      str1 = arrayOfString[0];
    }

    if (arrayOfString.length >= 2) {
      i = bUD.f(arrayOfString[1], -1);
    }

    arrayOfString = cOg.e(str1, "~", 2);

    if (arrayOfString.length >= 1) {
      str1 = arrayOfString[0];
    }

    if (arrayOfString.length >= 2) {
      str2 = arrayOfString[1];
    }

    Object localObject = this.hYe != null ? (aNL)this.hYe.get(str1) : null;
    if ((localObject == null) && (this.hYi != null)) {
      localObject = this.hYi.fi(str1);
    }

    if (((localObject instanceof el)) && (i != -1)) {
      localObject = ((el)localObject).getWidget(str2, i);
    }

    if ((str3 != null) && ((localObject instanceof axU))) {
      cpa localcpa = ((axU)localObject).getInnerElementMap();
      if (localcpa != null) {
        localObject = localcpa.fi(str3);
      }
    }

    return localObject;
  }

  public cDA coO()
  {
    return this.hYg;
  }

  public void a(cDA paramcDA)
  {
    if (paramcDA != this.hYg) {
      this.hYg = paramcDA;
      for (int i = this.bFw.size() - 1; i >= 0; i--)
        ((cpa)this.bFw.get(i)).a(this.hYg);
    }
  }

  public String coP()
  {
    if (this.hYi != null) {
      return this.hYi.coP();
    }

    return this.bYJ;
  }

  public String getId()
  {
    return this.bYJ;
  }

  public boolean lD(String paramString)
  {
    if (paramString == null) {
      return false;
    }

    if ((paramString.equalsIgnoreCase(this.bYJ)) || (cBQ.cxL().aG(this.bYJ, paramString))) {
      lE(paramString);
      return true;
    }

    return false;
  }

  private void lE(String paramString)
  {
    String str1 = this.bYJ;
    this.hYg.aH(this.bYJ, paramString);
    this.bYJ = paramString;

    if (this.bFw != null)
      for (int i = this.bFw.size() - 1; i >= 0; i--) {
        cpa localcpa = (cpa)this.bFw.get(i);
        if (localcpa.getId() != null) {
          String str2 = this.bYJ + localcpa.getId().substring(str1.length());
          localcpa.lE(str2);
        }
      }
  }

  public boolean lF(String paramString)
  {
    if (paramString == null) {
      return false;
    }
    return fi(paramString) != null;
  }

  public boolean aw(String paramString1, String paramString2)
  {
    if (((paramString1 == null) && (paramString2 == null)) || ((paramString1 != null) && (paramString1.equalsIgnoreCase(paramString2))))
    {
      return true;
    }

    if ((this.hYe == null) || (this.hYe.containsKey(paramString2)) || (!this.hYe.containsKey(paramString1))) {
      return false;
    }

    aNL localaNL = (aNL)this.hYe.remove(paramString1);

    if (paramString2 != null) {
      this.hYe.put(paramString2, localaNL);
    }

    return true;
  }

  public Iterator iterator()
  {
    return this.hYe.values().iterator();
  }

  public void removeElement(String paramString) {
    if (this.hYe != null)
      this.hYe.remove(paramString);
  }

  public void f(aNL paramaNL)
  {
    if ((paramaNL == null) || (this.hYe == null)) {
      return;
    }

    String str = paramaNL.getId();
    if (str == null) {
      for (Map.Entry localEntry : this.hYe.entrySet()) {
        if (localEntry.getValue() == paramaNL) {
          str = (String)localEntry.getKey();
          break;
        }
      }
    }

    if (str != null)
      this.hYe.remove(str);
  }

  private void b(cpa paramcpa)
  {
    if (this.bFw == null) {
      this.bFw = new ArrayList(5);
    }
    this.bFw.add(paramcpa);
  }

  private void c(cpa paramcpa)
  {
    if (this.bFw == null) {
      return;
    }
    this.bFw.remove(paramcpa);
  }

  public ArrayList coQ() {
    return this.bFw;
  }

  public void d(cpa paramcpa)
  {
    if (this.hYi != null) {
      this.hYi.c(this);
    }

    this.hYi = paramcpa;

    if (this.hYi != null)
      this.hYi.b(this);
  }

  public cpa coR()
  {
    return this.hYi;
  }

  public void c(bbo parambbo)
  {
    this.hYf.put(parambbo.getName(), parambbo);
  }

  public bbo getProperty(String paramString)
  {
    bbo localbbo = (bbo)this.hYf.get(paramString);
    if ((localbbo == null) && (this.hYi != null)) {
      localbbo = this.hYi.getProperty(paramString);
    }
    return localbbo;
  }

  public Collection getProperties()
  {
    return this.hYf.values();
  }

  public void clear()
  {
    if (this.hYe != null) {
      this.hYe.clear();
      this.hYe = null;
    }
    if (this.hYh != null) {
      this.hYh.clear();
    }
    for (bbo localbbo : this.hYf.values()) {
      dLE.doY().d(localbbo);
    }

    if (this.bFw != null) {
      for (int i = this.bFw.size() - 1; i >= 0; i--) {
        ((cpa)this.bFw.get(i)).clear();
      }
      this.bFw.clear();
      this.bFw = null;
    }

    this.hYf.clear();
    this.bYJ = null;
    this.hYi = null;
  }

  public void a(String paramString, bmG parambmG)
  {
    if (this.hYh == null) {
      this.hYh = new HashMap();
    }

    this.hYh.put(paramString, parambmG);
  }

  public bmG lG(String paramString)
  {
    bmG localbmG = null;
    if (this.hYh != null) {
      localbmG = (bmG)this.hYh.get(paramString);
    }

    if ((localbmG == null) && (this.hYi != null)) {
      localbmG = this.hYi.lG(paramString);
    }

    return localbmG;
  }

  public boolean lH(String paramString)
  {
    boolean bool = false;
    if (this.hYh != null) {
      bool = this.hYh.containsKey(paramString);
    }

    if ((!bool) && (this.hYi != null)) {
      bool = this.hYi.lH(paramString);
    }

    return bool;
  }

  public void lI(String paramString) {
    bmG localbmG = null;
    if (this.hYh != null) {
      localbmG = (bmG)this.hYh.remove(paramString);
    }

    if ((this.hYi != null) && (localbmG == null))
      this.hYi.lI(paramString);
  }
}