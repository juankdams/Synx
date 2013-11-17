import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.log4j.Logger;

public class bQK extends IT
  implements cnk
{
  protected static final Logger K = Logger.getLogger(bQK.class);
  private static final bQK gZg = new bQK();
  protected final ConcurrentHashMap gZh;
  protected final List gZi;
  private final List gZj = new ArrayList();
  private final ArrayList cSU;
  private final ArrayList cSV;
  private final ArrayList cSW;
  private final ArrayList cSX;

  private bQK()
  {
    this.gZh = new ConcurrentHashMap();
    this.gZi = new ArrayList();

    this.cSU = new ArrayList();
    this.cSV = new ArrayList();
    this.cSW = new ArrayList();
    this.cSX = new ArrayList();
  }

  public static bQK bXG()
  {
    return gZg;
  }

  protected Collection bXH() {
    return this.gZh.values();
  }

  public void d(cUo paramcUo)
  {
    ArrayList localArrayList = paramcUo.cJF();
    if (localArrayList != null) {
      int i = 0; for (int j = localArrayList.size(); i < j; i++) {
        cUo localcUo = (cUo)localArrayList.get(i);
        if (localcUo.cJz())
          d(localcUo);
      }
    }
    this.gZh.put(Long.valueOf(paramcUo.getId()), paramcUo);
    this.gZi.remove(paramcUo);

    e(paramcUo);
  }

  private void e(cUo paramcUo) {
    int i = 0; for (int j = this.cSW.size(); i < j; i++)
      ((bxM)this.cSW.get(i)).a(paramcUo);
  }

  public cUo gX(long paramLong)
  {
    cUo localcUo = (cUo)this.gZh.remove(Long.valueOf(paramLong));
    if (localcUo != null) {
      this.gZi.add(localcUo);
      f(localcUo);
    }
    return localcUo;
  }

  private void f(cUo paramcUo) {
    int i = 0; for (int j = this.cSX.size(); i < j; i++)
      ((aZL)this.cSX.get(i)).b(paramcUo);
  }

  public cUo g(cUo paramcUo)
  {
    return gX(paramcUo.getId());
  }

  public cUo h(cUo paramcUo)
  {
    ArrayList localArrayList = paramcUo.cJF();
    if (localArrayList != null) {
      int i = 0; for (int j = localArrayList.size(); i < j; i++) {
        cUo localcUo2 = (cUo)localArrayList.get(i);
        if (localcUo2.cJz()) {
          h(localcUo2);
        }
      }
    }
    cUo localcUo1 = (cUo)this.gZh.remove(Long.valueOf(paramcUo.getId()));
    f(paramcUo);
    return localcUo1;
  }

  public void bXI()
  {
    for (Iterator localIterator = this.gZh.values().iterator(); localIterator.hasNext(); ) { localcUo = (cUo)localIterator.next();
      f(localcUo);
    }
    cUo localcUo;
    for (localIterator = this.gZi.iterator(); localIterator.hasNext(); ) { localcUo = (cUo)localIterator.next();
      f(localcUo);
    }
    for (localIterator = this.gZh.values().iterator(); localIterator.hasNext(); ) { localcUo = (cUo)localIterator.next();
      localcUo.dispose();
    }
    this.gZh.clear();

    for (localIterator = this.gZi.iterator(); localIterator.hasNext(); ) { localcUo = (cUo)localIterator.next();
      localcUo.dispose();
    }
    this.gZi.clear();
    this.kSP.clear();
    this.gZj.clear();

    this.cSW.clear();
    this.cSW.addAll(this.cSU);
    this.cSX.clear();
    this.cSX.addAll(this.cSV);
  }

  public cUo gY(long paramLong)
  {
    return (cUo)this.gZh.get(Long.valueOf(paramLong));
  }

  public Collection bXJ()
  {
    return this.gZh.values();
  }

  public int bXK()
  {
    return this.gZh.size();
  }

  public void bXL()
  {
    this.gZi.addAll(this.gZh.values());
    for (int i = this.gZi.size(); i <= 0; i--)
      ((cUo)this.gZi.get(i)).asZ();
  }

  public void a(cXf paramcXf, int paramInt)
  {
    int i = this.gZi.size();
    for (int j = 0; j < i; j++) {
      cUo localcUo = (cUo)this.gZi.get(j);
      if (localcUo.Vj()) {
        localcUo.cJB().cJD();
      }
      if (localcUo.cJC()) {
        localcUo.cJD();
      }

      if (localcUo.cJF() != null) {
        localcUo.cJE();
      }
      if (localcUo.cJG() != null) {
        localcUo.cJG().o(localcUo);
      }

      this.kSP.remove(localcUo);
      localcUo.dispose();
    }

    this.gZi.clear();

    bXM();

    j = this.gZj.size();
    for (int k = 0; k < j; k++) {
      ((cUo)this.gZj.get(k)).a(paramcXf, paramInt);
    }

    for (k = 0; k < j; k++)
      ((cUo)this.gZj.get(k)).b(paramcXf, paramInt);
  }

  private List bXM()
  {
    Collection localCollection = this.gZh.values();
    this.gZj.clear();

    for (cUo localcUo1 : localCollection) {
      int i = -1;
      cUo localcUo2 = localcUo1.cJB();

      if (localcUo2 != null) {
        i = this.gZj.indexOf(localcUo2);
        if (i != -1) {
          this.gZj.add(i + 1, localcUo1);
        }
      }
      else
      {
        cUo localcUo3 = localcUo1.cJA();
        if (localcUo3 != null) {
          i = this.gZj.indexOf(localcUo3);
          if (i != -1) {
            this.gZj.add(i, localcUo1);
          }

        }
        else
        {
          cUo localcUo4 = localcUo1.cJG();
          if ((localcUo4 != null) && 
            (!this.gZj.contains(localcUo1))) {
            i = this.gZj.indexOf(localcUo4);
            if (i != -1) {
              this.gZj.add(i + 1, localcUo1);
            }

          }
          else
          {
            this.gZj.add(localcUo1);

            ArrayList localArrayList = localcUo1.cJF();
            if (localArrayList != null) {
              int j = 0; for (int k = localArrayList.size(); j < k; j++) {
                cUo localcUo5 = (cUo)localArrayList.get(j);
                if (this.gZj.remove(localcUo5))
                  this.gZj.add(localcUo5); 
              }
            }
          }
        }
      }
    }
    return this.gZj;
  }

  public void a(cXf paramcXf, float paramFloat1, float paramFloat2)
  {
    this.kSP.clear();
    for (int i = 0; i < this.gZj.size(); i++) {
      cUo localcUo = (cUo)this.gZj.get(i);
      if (localcUo.a(paramcXf)) {
        localcUo.ch(false);
        a(localcUo, paramcXf);

        this.kSP.add(localcUo);
      } else {
        localcUo.ch(true);
      }
    }
  }

  public void a(bxM parambxM) {
    if (!this.cSU.contains(parambxM))
      this.cSU.add(parambxM);
  }

  public void a(aZL paramaZL) {
    if (!this.cSV.contains(paramaZL))
      this.cSV.add(paramaZL);
  }

  public void b(bxM parambxM) {
    if (!this.cSW.contains(parambxM))
      this.cSW.add(parambxM);
  }

  public void c(bxM parambxM) {
    this.cSW.remove(parambxM);
  }

  public void b(aZL paramaZL) {
    if (!this.cSX.contains(paramaZL))
      this.cSX.add(paramaZL);
  }

  public void c(aZL paramaZL) {
    this.cSX.remove(paramaZL);
  }

  public void ape()
  {
    for (cUo localcUo : this.gZh.values())
      bdB.b(localcUo);
  }
}