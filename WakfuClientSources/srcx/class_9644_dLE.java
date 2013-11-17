import java.util.ArrayList;
import java.util.HashMap;
import org.apache.log4j.Logger;

public class dLE
  implements bPz
{
  private static final Logger K = Logger.getLogger(dLE.class);

  private static final dLE mbS = new dLE();

  private final HashMap mbT = new HashMap();
  private final ArrayList aBe = new ArrayList();

  private final ArrayList mbU = new ArrayList();
  private final ArrayList mbV = new ArrayList();

  private final ArrayList aBf = new ArrayList();

  public static dLE doY()
  {
    return mbS;
  }

  public void a(caS paramcaS)
  {
    if (paramcaS != null)
      this.aBf.add(paramcaS);
  }

  public void b(caS paramcaS)
  {
    if (paramcaS != null)
      this.aBf.remove(paramcaS);
  }

  public void c(bbo parambbo)
  {
    if (!parambbo.isLocal()) {
      this.mbT.put(parambbo.getName(), parambbo);
    }

    synchronized (this.aBe) {
      this.aBe.add(parambbo);
    }

    a(cwZ.ijL, parambbo);
  }

  public boolean doZ()
  {
    Object localObject1 = this.mbV.size();
    if (localObject1 == 0) {
      return false;
    }

    synchronized (this.mbV) {
      this.mbU.addAll(this.mbV);
      this.mbV.clear();
    }
    for (??? = 0; ??? < localObject1; ???++) {
      ((bbo)this.mbU.get(???)).bpD();
    }
    this.mbU.clear();

    return true;
  }

  public void g(bbo parambbo) {
    synchronized (this.mbV) {
      if ((parambbo != null) && (!this.mbV.contains(parambbo)))
        this.mbV.add(parambbo);
    }
  }

  public void removeProperty(String paramString)
  {
    d((bbo)this.mbT.get(paramString));
  }

  public void d(bbo parambbo)
  {
    if (parambbo == null) {
      return;
    }

    if (!parambbo.isLocal()) {
      this.mbT.remove(parambbo.getName());
    }
    synchronized (this.aBe) {
      this.aBe.remove(parambbo);
    }

    a(cwZ.ijM, parambbo);
  }

  public void t(String paramString, Object paramObject)
  {
    c(paramString, paramObject, false);
  }

  public void c(String paramString, Object paramObject, boolean paramBoolean) {
    bbo localbbo = (bbo)this.mbT.get(paramString);
    if (localbbo == null) {
      localbbo = new bbo(paramString, null);
      c(localbbo);
    }
    localbbo.setValue(paramObject, paramBoolean);
  }

  public void a(String paramString1, Object paramObject, String paramString2)
  {
    cpa localcpa = cBQ.cxL().coO().nf(paramString2);
    if (localcpa != null)
      a(paramString1, paramObject, localcpa);
  }

  public void a(String paramString, Object paramObject, cpa paramcpa)
  {
    a(paramString, paramObject, paramcpa, false);
  }

  public void a(String paramString, Object paramObject, cpa paramcpa, boolean paramBoolean) {
    if (paramcpa == null) {
      t(paramString, paramObject);
    } else {
      bbo localbbo = paramcpa.getProperty(paramString);
      if (localbbo == null) {
        localbbo = new bbo(paramString, paramcpa);
        c(localbbo);
        paramcpa.c(localbbo);
      }
      localbbo.setValue(paramObject, paramBoolean);
    }
  }

  public void x(String paramString, Object paramObject)
  {
    bbo localbbo = (bbo)this.mbT.get(paramString);
    if (localbbo == null)
      t(paramString, paramObject);
    else
      localbbo.aA(paramObject);
  }

  public void b(String paramString1, Object paramObject, String paramString2)
  {
    cpa localcpa = cBQ.cxL().coO().nf(paramString2);
    b(paramString1, paramObject, localcpa);
  }

  public void b(String paramString, Object paramObject, cpa paramcpa)
  {
    if (paramcpa == null) {
      x(paramString, paramObject);
    } else {
      bbo localbbo = paramcpa.getProperty(paramString);
      if (localbbo == null)
        a(paramString, paramObject, paramcpa);
      else
        localbbo.aA(paramObject);
    }
  }

  public void y(String paramString, Object paramObject)
  {
    bbo localbbo = (bbo)this.mbT.get(paramString);
    if (localbbo == null)
      t(paramString, paramObject);
    else
      localbbo.aB(paramObject);
  }

  public void c(String paramString1, Object paramObject, String paramString2)
  {
    cpa localcpa = cBQ.cxL().coO().nf(paramString2);
    c(paramString1, paramObject, localcpa);
  }

  public void c(String paramString, Object paramObject, cpa paramcpa)
  {
    if (paramcpa == null) {
      y(paramString, paramObject);
    } else {
      bbo localbbo = paramcpa.getProperty(paramString);
      if (localbbo == null)
        a(paramString, paramObject, paramcpa);
      else
        localbbo.aB(paramObject);
    }
  }

  public void e(String paramString1, String paramString2, Object paramObject)
  {
    bbo localbbo = (bbo)this.mbT.get(paramString1);
    if (localbbo != null)
      localbbo.a(paramString2, paramObject);
    else
      K.error("La définition d'une valeur de champ est impossible sur la propriété " + paramString1);
  }

  public void a(String paramString1, String paramString2, Object paramObject, String paramString3)
  {
    a(paramString1, paramString2, paramObject, cBQ.cxL().coO().nf(paramString3));
  }

  public void a(String paramString1, String paramString2, Object paramObject, cpa paramcpa)
  {
    if (paramcpa == null) {
      e(paramString1, paramString2, paramObject);
    } else {
      bbo localbbo = paramcpa.getProperty(paramString1);
      if (localbbo != null)
        localbbo.a(paramString2, paramObject);
      else
        K.error("La définition d'une valeur de champ est impossible sur la propriété " + paramString1);
    }
  }

  public void f(String paramString1, String paramString2, Object paramObject)
  {
    bbo localbbo = (bbo)this.mbT.get(paramString1);
    if (localbbo == null)
      t(paramString1, paramObject);
    else
      localbbo.aA(paramObject);
  }

  public void b(String paramString1, String paramString2, Object paramObject, String paramString3)
  {
    b(paramString1, paramString2, paramObject, cBQ.cxL().coO().nf(paramString3));
  }

  public void b(String paramString1, String paramString2, Object paramObject, cpa paramcpa)
  {
    if (paramcpa == null) {
      f(paramString1, paramString2, paramObject);
    } else {
      bbo localbbo = paramcpa.getProperty(paramString1);
      if (localbbo != null)
        localbbo.b(paramString2, paramObject);
      else
        K.error("La définition d'une valeur de champ est impossible sur la propriété " + paramString1);
    }
  }

  public void g(String paramString1, String paramString2, Object paramObject)
  {
    bbo localbbo = (bbo)this.mbT.get(paramString1);
    if (localbbo != null)
      localbbo.c(paramString2, paramObject);
    else
      K.error("La définition d'une valeur de champ est impossible sur la propriété " + paramString1);
  }

  public void c(String paramString1, String paramString2, Object paramObject, String paramString3)
  {
    c(paramString1, paramString2, paramObject, cBQ.cxL().coO().nf(paramString3));
  }

  public void c(String paramString1, String paramString2, Object paramObject, cpa paramcpa)
  {
    if (paramcpa == null) {
      g(paramString1, paramString2, paramObject);
    } else {
      bbo localbbo = paramcpa.getProperty(paramString1);
      if (localbbo != null)
        localbbo.c(paramString2, paramObject);
      else
        K.error("La définition d'une valeur de champ est impossible sur la propriété " + paramString1);
    }
  }

  public void a(dBv paramdBv, String[] paramArrayOfString)
  {
    Xg localXg = new Xg();
    synchronized (this.aBe) {
      int i = this.aBe.size();
      for (int j = 0; j < i; j++) {
        bbo localbbo = (bbo)this.aBe.get(j);
        Object localObject1 = localbbo.getValue();
        if ((localObject1 != null) && (localObject1.equals(paramdBv)))
          localbbo.a(paramArrayOfString, localXg);
      }
    }
  }

  public void bk(String paramString1, String paramString2)
  {
    bbo localbbo = (bbo)this.mbT.get(paramString1);
    if (localbbo != null)
      localbbo.hS(paramString2);
    else
      K.error("La définition d'une valeur de champ " + paramString2 + " est impossible sur la propriété " + paramString1);
  }

  public void b(String paramString1, String paramString2, cpa paramcpa)
  {
    if (paramcpa == null) {
      bk(paramString1, paramString2);
    } else {
      bbo localbbo = paramcpa.getProperty(paramString1);
      if (localbbo != null)
        localbbo.hS(paramString2);
      else
        K.error("La définition d'une valeur de champ est impossible sur la propriété " + paramString1);
    }
  }

  public String getStringProperty(String paramString)
  {
    bbo localbbo = (bbo)this.mbT.get(paramString);

    if (localbbo != null) {
      return localbbo.getString();
    }

    return null;
  }

  public String bl(String paramString1, String paramString2)
  {
    return e(paramString1, cBQ.cxL().coO().nf(paramString2));
  }

  public String e(String paramString, cpa paramcpa)
  {
    bbo localbbo;
    if (paramcpa == null)
      localbbo = (bbo)this.mbT.get(paramString);
    else {
      localbbo = paramcpa.getProperty(paramString);
    }

    if (localbbo != null) {
      return localbbo.getString();
    }

    return null;
  }

  public boolean getBooleanProperty(String paramString)
  {
    bbo localbbo = (bbo)this.mbT.get(paramString);

    if (localbbo != null) {
      return localbbo.getBoolean();
    }
    return false;
  }

  public boolean bm(String paramString1, String paramString2)
  {
    return f(paramString1, cBQ.cxL().coO().nf(paramString2));
  }

  public boolean f(String paramString, cpa paramcpa)
  {
    bbo localbbo;
    if (paramcpa == null)
      localbbo = (bbo)this.mbT.get(paramString);
    else {
      localbbo = paramcpa.getProperty(paramString);
    }

    return (localbbo != null) && (localbbo.getBoolean());
  }

  public int rr(String paramString)
  {
    bbo localbbo = (bbo)this.mbT.get(paramString);

    return localbbo != null ? localbbo.getInt() : 0;
  }

  public int bn(String paramString1, String paramString2)
  {
    return g(paramString1, cBQ.cxL().coO().nf(paramString2));
  }

  public int g(String paramString, cpa paramcpa)
  {
    bbo localbbo;
    if (paramcpa == null)
      localbbo = (bbo)this.mbT.get(paramString);
    else {
      localbbo = paramcpa.getProperty(paramString);
    }

    return localbbo != null ? localbbo.getInt() : 0;
  }

  public float rs(String paramString)
  {
    bbo localbbo = (bbo)this.mbT.get(paramString);

    return localbbo != null ? localbbo.getFloat() : 0.0F;
  }

  public float bo(String paramString1, String paramString2)
  {
    return h(paramString1, cBQ.cxL().coO().nf(paramString2));
  }

  public float h(String paramString, cpa paramcpa)
  {
    bbo localbbo;
    if (paramcpa == null)
      localbbo = (bbo)this.mbT.get(paramString);
    else {
      localbbo = paramcpa.getProperty(paramString);
    }

    return localbbo != null ? localbbo.getFloat() : 0.0F;
  }

  public double rt(String paramString)
  {
    bbo localbbo = (bbo)this.mbT.get(paramString);

    return localbbo != null ? localbbo.getDouble() : 0.0D;
  }

  public double bp(String paramString1, String paramString2)
  {
    return i(paramString1, cBQ.cxL().coO().nf(paramString2));
  }

  public double i(String paramString, cpa paramcpa)
  {
    bbo localbbo;
    if (paramcpa == null)
      localbbo = (bbo)this.mbT.get(paramString);
    else {
      localbbo = paramcpa.getProperty(paramString);
    }

    if (localbbo != null) {
      return localbbo.getDouble();
    }
    return 0.0D;
  }

  public long ru(String paramString)
  {
    bbo localbbo = (bbo)this.mbT.get(paramString);

    if (localbbo != null) {
      return localbbo.getLong();
    }

    return 0L;
  }

  public long bq(String paramString1, String paramString2)
  {
    return j(paramString1, cBQ.cxL().coO().nf(paramString2));
  }

  public long j(String paramString, cpa paramcpa)
  {
    bbo localbbo;
    if (paramcpa == null)
      localbbo = (bbo)this.mbT.get(paramString);
    else {
      localbbo = paramcpa.getProperty(paramString);
    }

    if (localbbo != null) {
      return localbbo.getLong();
    }

    return 0L;
  }

  public Object rv(String paramString)
  {
    bbo localbbo = (bbo)this.mbT.get(paramString);

    if (localbbo != null) {
      return localbbo.getValue();
    }

    return null;
  }

  public Object br(String paramString1, String paramString2)
  {
    return k(paramString1, cBQ.cxL().coO().nf(paramString2));
  }

  public Object k(String paramString, cpa paramcpa)
  {
    bbo localbbo;
    if (paramcpa == null)
      localbbo = (bbo)this.mbT.get(paramString);
    else {
      localbbo = paramcpa.getProperty(paramString);
    }

    if (localbbo != null) {
      return localbbo.getValue();
    }

    return null;
  }

  public bbo getProperty(String paramString)
  {
    return (bbo)this.mbT.get(paramString);
  }

  public bbo bs(String paramString1, String paramString2)
  {
    return l(paramString1, cBQ.cxL().coO().nf(paramString2));
  }

  public bbo a(dBv paramdBv, cpa paramcpa)
  {
    synchronized (this.aBe) {
      int i = 0; for (int j = this.aBe.size(); i < j; i++) {
        bbo localbbo = (bbo)this.aBe.get(i);
        if ((localbbo.getValue() == paramdBv) && (localbbo.getElementMap() == paramcpa)) {
          return localbbo;
        }
      }
    }

    return null;
  }

  public bbo l(String paramString, cpa paramcpa)
  {
    if (paramcpa == null) {
      return getProperty(paramString);
    }
    return paramcpa.getProperty(paramString);
  }

  public void a(cwZ paramcwZ, bbo parambbo) {
    if (this.aBf.size() != 0) {
      baJ localbaJ = new baJ(paramcwZ, parambbo);
      for (int i = this.aBf.size() - 1; i >= 0; i--)
        ((caS)this.aBf.get(i)).a(localbaJ);
    }
  }

  public void ac(dGy paramdGy)
  {
    synchronized (this.aBe) {
      int i = 0; for (int j = this.aBe.size(); i < j; i++)
        paramdGy.d(this.aBe.get(i));
    }
  }
}